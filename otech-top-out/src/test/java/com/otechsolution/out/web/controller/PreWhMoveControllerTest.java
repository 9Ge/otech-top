package com.otechsolution.out.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.otechsolution.out.dto.integration.PreWhMoveRequest;
import com.otechsolution.out.entity.OpenAppInfo;
import com.otechsolution.out.entity.integration.PreWhMoveDetail;
import com.otechsolution.out.entity.integration.PreWhMoveHeader;
import com.otechsolution.out.service.OpenAppInfoService;
import com.otechsolution.web.signer.filter.SignatureComponent;
import com.otechsolution.web.signer.filter.SignatureFilter;
import com.otechsolution.web.signer.util.AesEncryptUtils;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
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
public class PreWhMoveControllerTest {
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

        PreWhMoveHeader header = getPreWhMoveHeader();
        PreWhMoveDetail detail = getPreWhMoveDetail();

        PreWhMoveRequest request = new PreWhMoveRequest();
        request.setHeader(header);
        request.setDetailList(Arrays.asList(detail));

        String content = new ObjectMapper().writeValueAsString(Collections.singletonList(request));
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
                post("/out/pre/move")
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

    private PreWhMoveDetail getPreWhMoveDetail() {
        PreWhMoveDetail detail = new PreWhMoveDetail();

        detail.setPreWhMoveId("18");
        detail.setCapxaction("1");
        detail.setCiqCode("2");
        detail.setCopGNo("3");
        detail.setEntryGdsSeqno("4");
        detail.setGModel("5");
        detail.setGName("6");
        detail.setGrossWt(BigDecimal.ZERO);
        detail.setGUnit("7");
        detail.setHsCode("8");
        detail.setNetWt(BigDecimal.ZERO);
        detail.setOriginCountryCode("9");
        detail.setPreWhMoveDetailSeq("0");
        detail.setQty(BigDecimal.ZERO);
        detail.setQty1(BigDecimal.ZERO);
        detail.setQty2(BigDecimal.ZERO);
        detail.setTradeCurr("10");
        detail.setTradeTotal(BigDecimal.ZERO);
        detail.setUnit1("11");
        detail.setUnit2("12");
        detail.setUnitPrice(BigDecimal.ZERO);
        detail.setWhLoc("13");
        detail.setWhNo("14");
        return detail;
    }

    private PreWhMoveHeader getPreWhMoveHeader() {
        PreWhMoveHeader header = new PreWhMoveHeader();
        header.setPreWhMoveId("18");
        header.setLastupdateddt( "2021-01-16 08:40:25");
        header.setBillNo("1");
        header.setBillType("2");
        header.setBusinessType("3");
        header.setCapxaction("4");
        header.setClassifyType("5");
        header.setCol1("6");
        header.setCol2("7");
        header.setCol3("8");
        header.setCol4("9");
        header.setDestinationCode("10");
        header.setDistrictCode("11");
        header.setGrossWt(BigDecimal.ZERO);
        header.setIEPort("12");
        header.setMasterCuscd("13");
        header.setOrderNo("14");
        header.setOwnerName("15");
        header.setPreWhMoveType(0);
        header.setRltEntryNo("16");
        header.setRmk("17");
        header.setShipNameEn("18");
        header.setStockDate("2021-01-13 08:40:25");
        header.setStockType("19");
        header.setStshipTrsarvCode("20");
        header.setSupvMode("21");
        header.setTradeCode("22");
        header.setTradeCountryCode("23");
        header.setTradeName("24");
        header.setTradeSccd("25");
        header.setTrafMode("26");
        header.setTransMode("27");
        header.setVoyageNo("28");
        header.setWhLoc("29");
        header.setWhMoveId("0");
        header.setWhNo("30");
        return header;
    }
}
