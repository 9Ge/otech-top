package com.otechsolution.out.web.controller.ccs.logistics;

import com.otechsolution.common.util.ObjectMapperUtil;
import com.otechsolution.out.entity.ccs.CCSBilling;
import com.otechsolution.out.entity.ccs.CCSLogistics;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Date 16:35
 * @ClassName: CSSLogisticsControllerTest
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class CCSLogisticsControllerTest<E> {

    @Test
    public void restTest(){
        String str = " {    \"billingNumber\": \"2286984\"}";
        MultiValueMap<String, CCSLogistics> paramMap= ObjectMapperUtil.convertTo(str,MultiValueMap.class);
        log.info("{}",paramMap);
    }

    @Test
    public void restTest12(){

        RestTemplate template = new RestTemplate();
        String url = "http://192.168.30.55:8080/api/CostManagement/BillingDetailUpdate";


        // 封装参数，千万不要替换为Map与HashMap，否则参数无法传递
        String str = "{}";
        HashMap<String, String> map= ObjectMapperUtil.convertTo(str, HashMap.class);
        Set<String> set = map.keySet();

        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        for (String key:set) {
            paramMap.add(key, map.get(key));
        }


        HttpHeaders headers = new HttpHeaders();
        String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6IlFVZ1Y0MEkxRDRoTXVMMXZ0N0drRWciLCJ0eXAiOiJhdCtqd3QifQ.eyJuYmYiOjE2MTE1NTU4OTQsImV4cCI6MTY0MzA5MTg5NCwiaXNzIjoiaHR0cDovLzE5Mi4xNjguMzAuNTU6NTAwMCIsImF1ZCI6WyJDY3NSZWNvcmRMaXN0U2VydmljZSIsIkNERlJlY29yZExpc3QiLCJDb21tb25NYW5hZ2UiLCJDb3N0TWFuYWdlbWVudCIsIkRlc2tUb3AiLCJIYW5kQm9vayIsIkhhbmRCb29rSHgiLCJJZGVudGl0eVNlcnZpY2UiLCJJdGVtTWFzdGVyTWFuYWdlbWVudCIsIk9yZGVyTWFuYWdlbWVudCIsIk9yaWdpbmFsRG9jdW1lbnRzTWFuYWdlbWVudCIsIk90ZWNoQXBwR2F0ZXdheSIsIlBhcnRuZXJSZWxhdGlvbnNNYW5hZ2VtZW50U2VydmljZSIsIlJlY29yZExpc3QiXSwiY2xpZW50X2lkIjoiZ29sZC1tZW1iZXItY2xpZW50Iiwic3ViIjoiMTY2ZDE4NjMtY2FmZC1lMGE0LTNjNGQtMzlmNDk5NGRmNmNmIiwiYXV0aF90aW1lIjoxNjExNTU1ODk0LCJpZHAiOiJsb2NhbCIsInRlbmFudGlkIjoiMzcxNTZiOWUtNGU3NC1jODk1LTM1YjUtMzlmNDk5NGRmNDYzIiwicm9sZSI6InFhY2huMSIsIm5hbWUiOiJ0ZXN0QHR0c3Rtcy5jb20iLCJlbWFpbCI6InRlc3RAdHRzdG1zLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicGhvbmVfbnVtYmVyIjoiMTgwNDk5Mzc3MTkiLCJwaG9uZV9udW1iZXJfdmVyaWZpZWQiOmZhbHNlLCJzY29wZSI6WyJhZGRyZXNzIiwiZW1haWwiLCJvcGVuaWQiLCJwaG9uZSIsInByb2ZpbGUiLCJyb2xlIiwiQ2NzUmVjb3JkTGlzdFNlcnZpY2UiLCJDREZSZWNvcmRMaXN0IiwiQ29tbW9uTWFuYWdlIiwiQ29zdE1hbmFnZW1lbnQiLCJEZXNrVG9wIiwiSGFuZEJvb2siLCJIYW5kQm9va0h4IiwiSWRlbnRpdHlTZXJ2aWNlIiwiSXRlbU1hc3Rlck1hbmFnZW1lbnQiLCJPcmRlck1hbmFnZW1lbnQiLCJPcmlnaW5hbERvY3VtZW50c01hbmFnZW1lbnQiLCJPdGVjaEFwcEdhdGV3YXkiLCJQYXJ0bmVyUmVsYXRpb25zTWFuYWdlbWVudFNlcnZpY2UiLCJSZWNvcmRMaXN0Iiwib2ZmbGluZV9hY2Nlc3MiXSwiYW1yIjpbInB3ZCJdfQ.sjUCzFaALfl_sy90saHGKHLlrQyqta7pDfagM74KQNFh0sP3Phgj7sJc4w-fJK2bXHIfXwKhhLlI2LOPwRLd2XiqBCe7G_-9HkHIfVLdA_2OIjRvRysRoM_5IPYY3pH_gtmhxuJvdt3ZGYkgES5ky3NdCEbeEpxO21lz7CcfX2UwOmt2oh7p-XHP4QDvCqn8JzLKzYmi7oRK4a0DGI83Pal7KvnGmhzuJUG9cuG2JbuzcTLzkf9UWU85EWctQB127DEEWv6i9qLWA6KhkI2YXNdKidAvUyKpIoW-FuRMafmHgR5vP3hM8XY85HBIXFfsd5uxlTjeBPyZ9Eye054Edg";
        headers.set("Authorization", "Bearer " + token);
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(paramMap,headers);



        // 1、使用postForObject请求接口
        String result = template.postForObject(url, httpEntity, String.class);
        System.out.println("result1==================" + result);

        // 2、使用postForEntity请求接口



        ResponseEntity<String> response2 = template.postForEntity(url, httpEntity, String.class);
        System.out.println("result2====================" + response2.getBody());

        // 3、使用exchange请求接口
        ResponseEntity<String> response3 = template.exchange(url, HttpMethod.POST, httpEntity, String.class);
        System.out.println("result3====================" + response3.getBody());

    }
    @Test
    public void restTest3(){
        try {
            String str = " {    \"billingNumber\": \"2286984\"}";
            CCSBilling ccsBilling = ObjectMapperUtil.convertTo(str,CCSBilling.class);
            // 请求地址
            String url = "http://192.168.30.55:8080/api/CostManagement/BillingDetailUpdate";

            HttpHeaders headers = new HttpHeaders();
            String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6IlFVZ1Y0MEkxRDRoTXVMMXZ0N0drRWciLCJ0eXAiOiJhdCtqd3QifQ.eyJuYmYiOjE2MTIyNDIzNTcsImV4cCI6MTY0Mzc3ODM1NywiaXNzIjoiaHR0cDovLzE5Mi4xNjguMzAuNTU6NTAwMCIsImF1ZCI6WyJDY3NSZWNvcmRMaXN0U2VydmljZSIsIkNERlJlY29yZExpc3QiLCJDb21tb25NYW5hZ2UiLCJDb3N0TWFuYWdlbWVudCIsIkRlc2tUb3AiLCJIYW5kQm9vayIsIkhhbmRCb29rSHgiLCJJZGVudGl0eVNlcnZpY2UiLCJJdGVtTWFzdGVyTWFuYWdlbWVudCIsIk9yZGVyTWFuYWdlbWVudCIsIk9yaWdpbmFsRG9jdW1lbnRzTWFuYWdlbWVudCIsIk90ZWNoQXBwR2F0ZXdheSIsIlBhcnRuZXJSZWxhdGlvbnNNYW5hZ2VtZW50U2VydmljZSIsIlJlY29yZExpc3QiXSwiY2xpZW50X2lkIjoiZ29sZC1tZW1iZXItY2xpZW50Iiwic3ViIjoiMTY2ZDE4NjMtY2FmZC1lMGE0LTNjNGQtMzlmNDk5NGRmNmNmIiwiYXV0aF90aW1lIjoxNjEyMjQyMzU3LCJpZHAiOiJsb2NhbCIsInRlbmFudGlkIjoiMzcxNTZiOWUtNGU3NC1jODk1LTM1YjUtMzlmNDk5NGRmNDYzIiwicm9sZSI6InFhY2huMSIsIm5hbWUiOiJ0ZXN0QHR0c3Rtcy5jb20iLCJlbWFpbCI6InRlc3RAdHRzdG1zLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicGhvbmVfbnVtYmVyIjoiMTgwNDk5Mzc3MTkiLCJwaG9uZV9udW1iZXJfdmVyaWZpZWQiOmZhbHNlLCJzY29wZSI6WyJhZGRyZXNzIiwiZW1haWwiLCJvcGVuaWQiLCJwaG9uZSIsInByb2ZpbGUiLCJyb2xlIiwiQ2NzUmVjb3JkTGlzdFNlcnZpY2UiLCJDREZSZWNvcmRMaXN0IiwiQ29tbW9uTWFuYWdlIiwiQ29zdE1hbmFnZW1lbnQiLCJEZXNrVG9wIiwiSGFuZEJvb2siLCJIYW5kQm9va0h4IiwiSWRlbnRpdHlTZXJ2aWNlIiwiSXRlbU1hc3Rlck1hbmFnZW1lbnQiLCJPcmRlck1hbmFnZW1lbnQiLCJPcmlnaW5hbERvY3VtZW50c01hbmFnZW1lbnQiLCJPdGVjaEFwcEdhdGV3YXkiLCJQYXJ0bmVyUmVsYXRpb25zTWFuYWdlbWVudFNlcnZpY2UiLCJSZWNvcmRMaXN0Iiwib2ZmbGluZV9hY2Nlc3MiXSwiYW1yIjpbInB3ZCJdfQ.XU1vl94WLMiaxRspoQ7htdve2v-idyeMq57YaFjtSkvKU-9UPk-IX1FtJup-lPrJnjMaIJnelHSAdr9eD3DuztzKGZizA7DnuBeYL4V4444zXFxo32STIKvjoY5FhuN0peFd5ocdD8wwiVec-61HBpu_k2izlDgfEgrpCs8EFa2Bko1Bk7_HeZ6EqGby44KMdH4bN4AlFL_-tWrXhlc2Ib-38ATCq_rR4-IJKz86MOJqxs8cpI4l4RHxGPDvZ28L547ktZgrr11dr2XNSUvbahxSdNCuvh3hTa4Pe-hBNOuFXhBBINQ-QQdi9I4qGO7S6KgoTEPjW2F0KhaVZGyz-g";
            headers.set("Authorization", "Bearer " + token);
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<CCSBilling> httpEntity = new HttpEntity<CCSBilling>(ccsBilling,headers);

            RestTemplate template = new RestTemplate();
            // 发送post请求，并输出结果
            String result = template.postForObject(url, httpEntity, String.class);
            System.out.println(result.toString());
        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode());
        }
    }
    @Test
    public void restTest4(){

        RestTemplate restTemplate = new RestTemplate();
        // 请求地址
        String url = "http://192.168.30.55:8080/api/partner_relations_management/login/token";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);//设置参数类型和编码

        Map<String,String> map1 = new HashMap<>();//建立简单的String，String的map
        map1.put("userNameOrPhoneOrEmailAddress", "test@ttstms.com");
        map1.put("password", "Otech@6666");
        map1.put("GenerId", "5301b109-2134-61b7-a0dd-83ed5fc6686e");
        HttpEntity<Map<String,String>> request1 = new HttpEntity<>(map1, headers);//包装到HttpEntity



        //postForEntity  -》 直接传递map参数
        try {/*
            ResponseEntity<Map> respo1 = restTemplate.postForEntity(url, map1, Map.class);
            log.info("{}",ObjectMapperUtil.convertTo(String.valueOf(respo1.getBody().get("data")),JSONObject.class).toString());*/
            ResponseEntity<Map> respo1 = restTemplate.postForEntity(url, map1, Map.class);
            log.info("{}",respo1.getBody());
        } catch (RestClientException e) {
            log.info("respo1 error");
        }
        //postForEntity  -》 传递httpentity参数
        try {
            ResponseEntity<String> respo2 = restTemplate.postForEntity(url,request1 , String.class);
            log.info("{}",respo2.getBody());
        } catch (RestClientException e) {
            log.info("> respo2 error");
        }
        //postForObject  -》 直接传递map参数
        try {
            String respo3= restTemplate.postForObject(url, map1, String.class);
            log.info("{}",respo3);
        } catch (RestClientException e) {
            log.info("respo3 error");
        }
        //postForObject  -》 传递httpentity参数
        try {
            String respo4= restTemplate.postForObject(url, request1, String.class);
            log.info("{}",respo4);
        } catch (RestClientException e) {
            log.info("respo4 error");
        }
    }

}
