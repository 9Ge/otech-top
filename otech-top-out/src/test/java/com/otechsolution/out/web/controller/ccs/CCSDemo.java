package com.otechsolution.out.web.controller.ccs;

import com.otechsolution.web.signer.util.AesEncryptUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.jboss.logging.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Slf4j
public class CCSDemo {
    public static void main(String[] args) throws Exception {
        String appId = "5f0ace96c81a42fabfe675a071907452";
        String appSecret = "714533887bfa75b1043c617e260d5223";
        long timeMillis = System.currentTimeMillis();
        String nonce = RandomStringUtils.randomAlphanumeric(16);
        String content = "[{\"billingDate\":\"2020-01-31\",\"billingNumber\":\"92286984\",\"billingType\":\"1\",\"bpCnName\":\"勃林格殷格翰国际贸易(上海)有限公司\",\"bpType\":\"供应商\"}]";
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

        String url = "https://api.otechsolution.com/out/billing";
        //String url = "http://localhost:8081/out/billing";
        ResponseEntity<String> response = restTemplate.postForEntity(url, httpEntity, String.class);
        String body = response.getBody();
        log.info("body：{}", body);
        String resNonce = response.getHeaders().get("nonce").get(0);
        log.info("resNonce：{}", resNonce);
        byte[] decrypt = AesEncryptUtils.decrypt(body, appSecret, resNonce);
        log.info("接口响应：[{}]", new String(decrypt));
    }


}
