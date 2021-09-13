package com.otechsolution.out.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.otechsolution.out.entity.integration.Inventory;
import com.otechsolution.web.signer.util.AesEncryptUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Slf4j
public class Demo {
    public static void main(String[] args) throws Exception {
        String appId = "68562b471aab1380ddf74814dffe99a7";
        String appSecret = "b2a4f197ebe38a2b9dccdd119c1ce738";
        long timeMillis = System.currentTimeMillis();
        String nonce = RandomStringUtils.randomAlphanumeric(16);
        Inventory req = getInventory();


        String content = new ObjectMapper().writeValueAsString(Arrays.asList(req));
        log.info("请求对象：[{}]", content);
        String encryptContent = AesEncryptUtils.encrypt(content, appSecret, nonce);
        log.info("AES加密串：[{}]", encryptContent);


        // appId+nonce+timestamp+secret
        StringBuilder builder = new StringBuilder();
        builder.append("appId=").append(appId).append("&")
                .append("nonce=").append(nonce).append("&")
                .append("timestamp=").append(timeMillis).append("&")
                .append(appSecret);
        log.info("MD5源串：[{}]", builder);
        String sign = DigestUtils.md5DigestAsHex(builder.toString().getBytes(StandardCharsets.UTF_8));
        log.info("MD5目标串：[{}]", sign);

        HttpHeaders headers = new HttpHeaders();
        headers.add("appId", appId);
        headers.add("nonce", nonce);
        headers.add("timestamp", String.valueOf(timeMillis));
        headers.add("sign", sign);
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);

        log.info("request header:[{}]", headers);
        // 转义加密串中的特殊字符
        String encode = URLEncoder.encode(encryptContent, "utf-8");
        HttpEntity<String> httpEntity = new HttpEntity<>(encode, headers);

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://apistage.otechsolution.com/out/inventory";
        ResponseEntity<String> response = restTemplate.postForEntity(url, httpEntity, String.class);
        String body = response.getBody();
        String resNonce = response.getHeaders().get("nonce").get(0);
        byte[] decrypt = AesEncryptUtils.decrypt(body, appSecret, resNonce);
        log.info("接口响应：[{}]", new String(decrypt));
    }

    private static Inventory getInventory() {
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
