package com.otechsolution.out.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.otechsolution.forex.dto.DeclarationDocumentDTO;
import com.otechsolution.forex.dto.ForexPaymentDTO;
import com.otechsolution.forex.dto.PaymentDocumentDTO;
import com.otechsolution.out.dto.forex.ForexRequest;
import com.otechsolution.out.entity.OpenAppInfo;
import com.otechsolution.out.service.OpenAppInfoService;
import com.otechsolution.web.signer.filter.SignatureComponent;
import com.otechsolution.web.signer.filter.SignatureFilter;
import com.otechsolution.web.signer.util.AesEncryptUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.DigestUtils;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ForexControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Autowired
    private SignatureComponent signatureComponent;

    @Autowired
    private OpenAppInfoService openAppInfoService;

    private OpenAppInfo openAppInfo;
    private static final String APP_ID = "b3ceacd9498808c6e756405fd6d40317";

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac)
                // 加入过滤器
                .addFilter(new SignatureFilter(signatureComponent))
                .build();
        openAppInfo = openAppInfoService.selectByAppId(APP_ID);
    }




    @Test
    public void save() throws Exception {
        long timeMillis = System.currentTimeMillis();
        String nonce = RandomStringUtils.randomAlphanumeric(16);
        ForexRequest req =new ForexRequest();
        req.setClientId(2L);
        req.getPaymentList().add(new ForexPaymentDTO());
        req.getPaymentDocumentList().add(new PaymentDocumentDTO());
        req.getDeclarationDocumentList().add(new DeclarationDocumentDTO());

        String content = new ObjectMapper().writeValueAsString(req);
        log.info("请求对象：[{}]", content);
        String encryptContent = AesEncryptUtils.encrypt(content, openAppInfo.getAppSecret(), nonce);
        log.info("AES加密串：[{}]", encryptContent);


        // appId+nonce+timestamp+secret
        StringBuilder builder = new StringBuilder();
        builder.append("appId=").append(openAppInfo.getAppId()).append("&")
                .append("nonce=").append(nonce).append("&")
                .append("timestamp=").append(timeMillis).append("&")
                .append(openAppInfo.getAppSecret());
        log.info("MD5源串：[{}]", builder);
        String sign = DigestUtils.md5DigestAsHex(builder.toString().getBytes(StandardCharsets.UTF_8));
        log.info("MD5目标串：[{}]", sign);

        HttpHeaders headers = new HttpHeaders();
        headers.add("appId", openAppInfo.getAppId());
        headers.add("nonce", nonce);
        headers.add("timestamp", String.valueOf(timeMillis));
        headers.add("sign", sign);
        // when / then
        String res = mockMvc.perform(
                post("/out/forex")
                        .contentType(MediaType.APPLICATION_JSON)
                        .headers(headers)
                        .content(encryptContent))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();
        log.info("接口响应：[{}]", res);
    }
}
