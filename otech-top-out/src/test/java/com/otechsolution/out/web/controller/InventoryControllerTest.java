package com.otechsolution.out.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.otechsolution.out.entity.OpenAppInfo;
import com.otechsolution.out.entity.integration.Inventory;
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
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.DigestUtils;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class InventoryControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Autowired
    private SignatureComponent signatureComponent;

    @Autowired
    private OpenAppInfoService openAppInfoService;

    private OpenAppInfo openAppInfo;
    private static final String APP_ID = "68562b471aab1380ddf74814dffe99a7";

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

        Inventory req = getInventory();


        String content = new ObjectMapper().writeValueAsString(Arrays.asList(req));
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

        log.info("request header:[{}]", headers);
        // when / then
        MockHttpServletResponse response = mockMvc.perform(
                post("/out/inventory")
                        .contentType(MediaType.APPLICATION_JSON)
                        .headers(headers)
                        .content(encryptContent))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse();
        String resNonce = (String) response.getHeaderValue("nonce");
        String contentAsString = response.getContentAsString();
        byte[] decrypt = AesEncryptUtils.decrypt(contentAsString, openAppInfo.getAppSecret(), resNonce);
        log.info("接口响应：[{}]", new String(decrypt));
    }

    private Inventory getInventory() {
        Inventory req = new Inventory();
        req.setLimitDate("2018-02-02 18:00:00");
        req.setStockDate("2018-02-02 18:00:00");
        req.setCiqCode("1");
        req.setContrItem(BigDecimal.ZERO);
        req.setCopGNo("2");
        req.setGModel("3");
        req.setGName("4");
        req.setGrossWt(BigDecimal.ZERO);
        req.setGUnit("5");
        req.setHsCode("6");
        req.setNetWt(BigDecimal.ZERO);
        req.setOriginCountryCode("9");
        req.setProductType(0);
        req.setQty(BigDecimal.ZERO);
        req.setQty1(BigDecimal.ZERO);
        req.setQty2(BigDecimal.ZERO);
        req.setStockType(0);
        req.setTradeCurr("10");
        req.setTradeTotal(BigDecimal.ZERO);
        req.setUnit1("11");
        req.setUnit2("12");
        req.setUnitPrice(BigDecimal.ZERO);
        req.setWhLoc("13");
        req.setWhLoc("14");
        return req;
    }
}
