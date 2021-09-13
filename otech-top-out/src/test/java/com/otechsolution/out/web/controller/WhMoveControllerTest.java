package com.otechsolution.out.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.otechsolution.out.dto.integration.WhMoveRequest;
import com.otechsolution.out.entity.OpenAppInfo;
import com.otechsolution.out.entity.integration.WhMoveDetail;
import com.otechsolution.out.entity.integration.WhMoveHeader;
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
import java.util.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class WhMoveControllerTest {
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

        WhMoveHeader header = getWhMoveHeader();

        WhMoveDetail detail = getWhMoveDetail();

        WhMoveRequest request = new WhMoveRequest();
        request.setHeader(header);
        request.setDetailList(Arrays.asList(detail));
        String content = new ObjectMapper().writeValueAsString(Arrays.asList(request));

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
        MockHttpServletResponse response = mockMvc.perform(
                post("/out/move")
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

    private WhMoveDetail getWhMoveDetail() {
        WhMoveDetail detail = new WhMoveDetail();
        detail.setBillDetailSeqno("0");
        detail.setBillNo("1");
        detail.setCiqCode("2");
        detail.setCopGNo("3");
        detail.setDestinationCode("4");
        detail.setDistrictCode("5");
        detail.setEntryGdsSeqno(BigDecimal.ONE);
        detail.setGModel("6");
        detail.setGName("7");
        detail.setGrossWt(BigDecimal.ONE);
        detail.setGUnit("8");
        detail.setHsCode("9");
        detail.setLimitDate("2021-01-13 08:40:25");
        detail.setNetWt(BigDecimal.ONE);
        detail.setOrderNo("1");
        detail.setOriginCountryCode("2");
        detail.setQty(BigDecimal.ONE);
        detail.setQty1(BigDecimal.ONE);
        detail.setQty2(BigDecimal.ONE);
        detail.setStshipTrsarvCode("3");
        detail.setTradeCountryCode("4");
        detail.setTradeCurr("5");
        detail.setTradeTotal(BigDecimal.ONE);
        detail.setTransMode("6");
        detail.setUnit1("7");
        detail.setUnit2("8");
        detail.setUnitPrice(BigDecimal.ONE);
        detail.setWhLoc("9");
        detail.setWhMoveId("1");
        detail.setWhNo("1");
        return detail;
    }

    private WhMoveHeader getWhMoveHeader() {
        WhMoveHeader header = new WhMoveHeader();
        header.setActrualStockDate("2021-01-13 08:40:25");
        header.setBillStatus(0);
        header.setBillType(0);
        header.setBusinessType(0);
        header.setClassifyType("1");
        header.setCustomsCode("2");
        header.setDclcusFlag("3");
        header.setDeclStockDate("2021-01-13 08:40:25");
        header.setEntryNo("2021-01-13 08:40:25");
        header.setDeclStockDate("4");
        header.setDeclStockDate("5");
        header.setIEPort("6");
        header.setOwnerName("2021-01-13 08:40:25");
        header.setPassTime("2021-01-13 08:40:25");
        header.setProductType(0);
        header.setDclcusFlag("3");
        header.setDeclStockDate("2021-01-13 08:40:25");
        header.setEntryNo("4");
        header.setIEPort("5");
        header.setOwnerName("6");
        header.setPassTime("2021-01-13 08:40:25");
        header.setProductType(0);
        header.setRltEntryNo("7");
        header.setRltInvtNo("8");
        header.setStockBillNo("9");
        header.setStockBillType(0);
        header.setStockType(0);
        header.setSupvMode("1");

        header.setTradeCode("2");
        header.setTradeName("3");
        header.setTrafMode("4");
        header.setTransitTime("2021-01-13 08:40:25");
        header.setWhMoveId("0");
        return header;
    }
}
