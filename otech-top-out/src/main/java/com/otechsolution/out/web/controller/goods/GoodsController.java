package com.otechsolution.out.web.controller.goods;

import com.otechsolution.common.exception.ResultCode;
import com.otechsolution.common.util.ObjectMapperUtil;
import com.otechsolution.out.dto.goods.Goods;
import com.otechsolution.web.result.ApiResult;
import com.otechsolution.web.result.ResponseResultBody;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
//import org.apache.http.HttpStatus;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
//import com.alibaba.fastjson.JSON;

/**
 * 商品管理接口
 *
 */
@Slf4j
@RestController
@RequestMapping("/out/itemmaster1")
@ResponseResultBody
@Api("商品管理接口 -- GoodsController")
public class GoodsController {

    private static final    String  url="";
    private static final    String  url_test="http://192.168.30.55:8080/api/ItemMaster/SaveItemMaster";
    private static final    String  Authorization="Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IlFVZ1Y0MEkxRDRoTXVMMXZ0N0drRWciLCJ0eXAiOiJhdCtqd3QifQ.eyJuYmYiOjE2MTExMjYzNzcsImV4cCI6MTY0MjY2MjM3NywiaXNzIjoiaHR0cDovLzE5Mi4xNjguMzAuNTU6NTAwMCIsImF1ZCI6WyJCYWNrZW5kQWRtaW5BcHBHYXRld2F5IiwiQ2NzUmVjb3JkTGlzdFNlcnZpY2UiLCJDREZSZWNvcmRMaXN0IiwiQ29tbW9uTWFuYWdlIiwiRGVza1RvcCIsIkhhbmRCb29rIiwiSGFuZEJvb2tIeCIsIklkZW50aXR5U2VydmljZSIsIkl0ZW1NYXN0ZXJNYW5hZ2VtZW50IiwiT3JkZXJNYW5hZ2VtZW50IiwiT3JpZ2luYWxEb2N1bWVudHNNYW5hZ2VtZW50IiwiT3RlY2hBcHBHYXRld2F5IiwiUGFydG5lclJlbGF0aW9uc01hbmFnZW1lbnRTZXJ2aWNlIiwiUmVjb3JkTGlzdCJdLCJjbGllbnRfaWQiOiJiYWNrZW5kLWFkbWluLWFwcC1jbGllbnQiLCJzdWIiOiI1ZTk0MTEyNi0wZTM0LWU5OTItYmI3MC0zOWZhMTY0ODM0MjQiLCJhdXRoX3RpbWUiOjE2MTExMjYzNzcsImlkcCI6ImxvY2FsIiwidGVuYW50aWQiOiI1ODA0NWY2Yi0zMGQ2LTQzZGYtOGUyMi0zOWZhMTY0ODM2MjMiLCJyb2xlIjoiU3VwZXJBZG1pbiIsIm5hbWUiOiIxOTUyODg2MzkxMCIsImVtYWlsIjoiandtYXR3QGp3bWF0dy5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsInBob25lX251bWJlciI6IjE5NTI4ODYzOTEwIiwicGhvbmVfbnVtYmVyX3ZlcmlmaWVkIjpmYWxzZSwic2NvcGUiOlsiYWRkcmVzcyIsImVtYWlsIiwib3BlbmlkIiwicGhvbmUiLCJwcm9maWxlIiwicm9sZSIsIkJhY2tlbmRBZG1pbkFwcEdhdGV3YXkiLCJDY3NSZWNvcmRMaXN0U2VydmljZSIsIkNERlJlY29yZExpc3QiLCJDb21tb25NYW5hZ2UiLCJEZXNrVG9wIiwiSGFuZEJvb2siLCJIYW5kQm9va0h4IiwiSWRlbnRpdHlTZXJ2aWNlIiwiSXRlbU1hc3Rlck1hbmFnZW1lbnQiLCJPcmRlck1hbmFnZW1lbnQiLCJPcmlnaW5hbERvY3VtZW50c01hbmFnZW1lbnQiLCJPdGVjaEFwcEdhdGV3YXkiLCJQYXJ0bmVyUmVsYXRpb25zTWFuYWdlbWVudFNlcnZpY2UiLCJSZWNvcmRMaXN0Iiwib2ZmbGluZV9hY2Nlc3MiXSwiYW1yIjpbInB3ZCJdfQ.W9Ysu9L068-ePEnMch-Xdqb3oVBu90lyN_T5-XSnu-r84PjGa2R2Dcdt2debhQrFU0sqZcmYYpig-_moMnBsVW63PxfGCr3YLovAZSlIHjcBsjEzv8C7TxuggsdMUvlnU0QHnB1fzT_EJHl7bl_3acd4EFFBwVo8Yg5Ppoj-9lNyo3sU2WPM1sn0jgZ0AlnzGBWBbalADjSqmQ2csLOp81zRzY7_UF-7KfRpl-_mt4_pS6cFoe2mRboIJ4UaxuRPp_6FqKQkLNcyK3nYEHQus7KOQxselBhjRtsqtZzmgv7X7d6PSO-TY2lB1TacV75he7zG814QEvoKWt-ePCMGxw";


    @PostMapping
    public Object save(@RequestBody Goods goods) throws Exception {
        log.info("接收参数: [{}]", goods);
        String  result=requestNet(goods);
        return new ApiResult(ResultCode.SUCCESS.getCode(), result, "");
    }

    public String  requestNet(Goods goods) throws Exception {
        HashMap<String,Object> postParam=transform(goods);
        String  result=myDoPost(postParam);
        return  result;
    }

    public HashMap<String,Object>   transform(Goods goods){
        HashMap<String, Object> postParam = new HashMap<>();
        postParam.put("AdjmtrMarkcd",goods.getAdjmtrMarkcd());
        postParam.put("BondedFlag",goods.getBondedFlag());
        postParam.put("BpId",goods.getBpId());
        postParam.put("ChangeReason",goods.getChangeReason());
        postParam.put("CiqCode",goods.getCiqCode());
        postParam.put("CiqName",goods.getCiqName());
        postParam.put("ClientId",goods.getClientId());
        postParam.put("CodeTS",goods.getCodeTS());
        postParam.put("Currency",goods.getCurrency());
        postParam.put("CustomerItem",goods.getCustomerItem());
        postParam.put("FirstUnit",goods.getFirstUnit());
        postParam.put("GUnit",goods.getGUnit());
        postParam.put("HBPartModel",goods.getHBPartModel());
        postParam.put("InnerPackage",goods.getInnerPackage());
        postParam.put("ItemType",goods.getItemType());
        postParam.put("LicensedCode",goods.getLicensedCode());
        postParam.put("NetWt",goods.getNetWt());
        postParam.put("OriginCountry",goods.getOriginCountry());
        postParam.put("PartCNName",goods.getPartCNName());
        postParam.put("PartDescriptionCN",goods.getPartDescriptionCN());
        postParam.put("PartDescriptionEN",goods.getPartDescriptionEN());
        postParam.put("PartENName",goods.getPartENName());
        postParam.put("PartModel",goods.getPartModel());
        postParam.put("PartNumber",goods.getPartNumber());
        postParam.put("Remark",goods.getRemark());
        postParam.put("Remark1",goods.getRemark1());
        postParam.put("Remark2",goods.getRemark2());
        postParam.put("SecondUnit",goods.getSecondUnit());
        postParam.put("StartDate",goods.getStartDate());
        postParam.put("StopDate",goods.getStopDate());
        postParam.put("UnitPrice",goods.getUnitPrice());
        postParam.put("UserId",goods.getUserId());
        return  postParam;
    }
//
//    private HashMap<String,Object> doPost(Map<String, Object> postParam) throws Exception {
//        HashMap<String,Object>  result=new HashMap<String,Object>();
//        String param = ObjectMapperUtil.writeValueAsString(postParam);
//        log.info("数据接口地址：[{}], 请求数据：[{}]",url_test, param);
//
////        CloseableHttpClient httpClient = HttpClients.createDefault();
////        HttpPost httpPost = new HttpPost(url_test);
////        httpPost.setEntity(new StringEntity(param));
////        httpPost.addHeader("Authorization",Authorization);
////        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
////        if (httpResponse != null) {
////            org.apache.http.HttpEntity resEntity = httpResponse.getEntity();
////            if (resEntity != null) {
////                String response = EntityUtils.toString(resEntity);
////                result.put("response",response);
////            }
////        }
//        return result;
//    }


    public String  myDoPost(Map<String, Object> postParam){
        //CloseableHttpClient：建立一个可以关闭的httpClient
        //这样使得创建出来的HTTP实体，可以被Java虚拟机回收掉，不至于出现一直占用资源的情况。
//        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        //设置请求超时时间
//        RequestConfig requestConfig = RequestConfig.custom()
//                .setSocketTimeout(60000)
//                .setConnectTimeout(60000)
//                .setConnectionRequestTimeout(60000)
//                .build();
        String result="";
        try {
//            HttpPost post = new HttpPost(url_test);
//            post.addHeader("Authorization",Authorization);
//            post.setConfig(requestConfig);
            //设置发送的数据
            String param = ObjectMapperUtil.writeValueAsString(postParam);
//            StringEntity s = new StringEntity(param);
//            s.setContentEncoding("UTF-8");
//            s.setContentType("application/json");//发送json数据需要设置contentType
//            post.setEntity(s);
            //获取返回值
//            CloseableHttpResponse res = closeableHttpClient.execute(post);
//            if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
//                result = EntityUtils.toString(res.getEntity());// 返回json格式：
//                log.info("POST请求返回的数据是："+result);
//            }
        } catch (Exception e){
            log.info("发生了异常："+e.getMessage());
        } finally {
//            try {                //关闭流并释放资源
////                closeableHttpClient.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
        return result;
    }





}
