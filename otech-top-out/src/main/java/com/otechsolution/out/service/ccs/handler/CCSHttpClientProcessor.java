package com.otechsolution.out.service.ccs.handler;

import com.otechsolution.common.exception.OtechException;
import com.otechsolution.common.util.ObjectMapperUtil;
import com.otechsolution.out.dto.ccs.CCSServiceResultVO;
import com.otechsolution.out.entity.ccs.CssUserEntity;
import com.otechsolution.out.properties.CcsProperties;
import com.otechsolution.out.properties.OtechTopOutProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2021/1/27 15:16
 * @ClassName: CCSHttpClientProcessor
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Slf4j
@Component
public class CCSHttpClientProcessor<T extends CssUserEntity> {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RestTemplate restTemplate;

    private final String tokenRedisKey = "ccs_http_token";

    private final CcsProperties properties;

    public CCSHttpClientProcessor(OtechTopOutProperties properties) {
        this.properties = properties.getCcs();
    }

    private Map getTokenMap() {
        Map<String, String> map = new HashMap<>();
        map.put("userNameOrPhoneOrEmailAddress", properties.getUserNameOrPhoneOrEmailAddress());
        map.put("password", properties.getPassword());
        return map;
    }

    /**
     * 初始化token,放入redis
     */
    private synchronized void initTokenRedis() {
        String url = properties.getHost().concat(properties.getTopUrl().getToken());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);//设置参数类型和编码
        try {
            ResponseEntity<Map> resp = restTemplate.postForEntity(url, getTokenMap(), Map.class);
            this.saveTokenRedis(this.getTokenByResult(resp));
        } catch (RestClientException e) {
            log.info("token Get failed ,Exception :" + e.getMessage());
        }
    }

    /**
     * 从redis中得到token字符串
     *
     * @return
     */
    private String tokenByRedis() {
        if (!stringRedisTemplate.hasKey(tokenRedisKey)) {
            initTokenRedis();
        }
        return stringRedisTemplate.opsForValue().get(tokenRedisKey);
    }

    /**
     * 保存token,默认有效期为2天
     *
     * @param lmap
     */
    private void saveTokenRedis(LinkedHashMap lmap) {
        Assert.notNull(lmap, "token map is null ,Please confirm whether the token account is valid and the return value");
        stringRedisTemplate.opsForValue().set(tokenRedisKey, String.valueOf(lmap.get("access_token")), 2, TimeUnit.DAYS);
    }

    /**
     * 解析token结果,并返回
     *
     * @param resp
     * @return
     * @throws OtechException
     */
    private LinkedHashMap getTokenByResult(ResponseEntity<Map> resp) throws OtechException {
        Map map = resp.getBody();
        Integer code = Integer.valueOf(String.valueOf(map.get("code")));
        if (code != 20000) {
            log.info("Failed to obtain token, please confirm whether the token obtaining function is normal.");
            throw new OtechException("Failed to obtain token, please confirm whether the token obtaining function is normal.");
        }
        return (LinkedHashMap) map.get("data");
    }

    /**
     * 请求.net接口
     *
     * @param url
     * @param t
     * @return
     */
    private int num;

    public CCSServiceResultVO postT2Url(@NotNull String url, @NotNull T t) throws OtechException {
        Assert.notNull(url, "request url  must have value,can't null.");
        Assert.notNull(t, "request object[T] not null,must have value.");
        try {
            return post2UrlStint(url, t);
        } catch (Exception e) {
            log.info("postT2Url error：" + e.getMessage());
            throw new OtechException("postT2Url error：" + e.getMessage());
        }

    }


    private CCSServiceResultVO post2UrlStint(String url, T t) throws OtechException {

        String result = null;
        try {
            result = doPost(url, t, 0);
        } catch (HttpClientErrorException e) {
            if (e.getRawStatusCode() == 401) {
                this.initTokenRedis();
                result = doPost(url, t, num + 1);
            } else {
                log.info("HttpClientErrorException confirm url is true");
                throw new OtechException("接口调用失败,失败原因:" + e.getMessage());
            }
        } catch (Exception e) {
            log.info("第三方接口失败，失败原因：" + e.getMessage());
            throw new OtechException("第三方接口失败，失败原因：" + e.getMessage());
        }
        return this.result2Api(result, t);
    }

    private String doPost(String url, T t, int num) {
        if (num >= 2) {
            throw new OtechException("Token invalid");
        }
        String result;
        this.setUserInfo(t);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + this.tokenByRedis());
        log.info("token:{}", stringRedisTemplate.opsForValue().get(tokenRedisKey));
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<T> httpEntity = new HttpEntity<T>(t, headers);
        log.info("url:{},请求的数据：{}", url, t);
        result = restTemplate.postForObject(properties.getHost() + url, httpEntity, String.class);
        log.info("响应的数据：{}", result);
        return result;
    }


    /**
     * 通过Url批量提交集合对象，并返回集合对象的处理接口。
     * return object中的list包含的每一个对象的保存结果信息以及整个对象信息<br/>
     * 对象中会存在成功失败，需要单独处理的,自己解析对象。
     *
     * @param url
     * @param ts
     * @return
     */
    public List<CCSServiceResultVO> postListT2Url(@NotNull String url, @NotNull List<T> ts) {
        Assert.notNull(ts, "request submission objects cannot be empty, not null.");
        List<CCSServiceResultVO> list = new ArrayList<>(ts.size());
        for (T t : ts) {
            list.add(this.oneSelfData2Url(url, t));
        }
        return list;
    }

    /**
     * 设置用户信息
     *
     * @param t
     */
    private void setUserInfo(T t) {
        t.setClinetId(properties.getClientId());
        t.setUserId(properties.getUserId());
    }

    /**
     * 得到URL、结果接收对象、需要保存的t对象<br/>
     * 通过.net接口保存t对象<br/>
     * 返回当前t对象的保存结果<br/>
     *
     * @param url
     * @param t
     */
    private CCSServiceResultVO oneSelfData2Url(String url, T t) {
        CCSServiceResultVO result = null;
        try {
            result = this.postT2Url(url, t);
        } catch (Exception e) {
            log.info("RestTemplate Service Error, Error Cause:" + e.getMessage());
            throw new OtechException("RestTemplate Service Error, Error Cause:" + e.getMessage());
        }
        return result;
    }


    /**
     * .net 接口返回的接口统一处理成项目内部接口对象
     *
     * @param result
     * @param t
     * @return
     */
    private CCSServiceResultVO result2Api(@NotNull String result, T t) {
        if (StringUtils.isEmpty(result.trim())) {
            return new CCSServiceResultVO();
        }

        CCSServiceResultVO resultDto = ObjectMapperUtil.convertTo(result, CCSServiceResultVO.class);
        resultDto.setResult(this.result2Entity(t, resultDto));
        return resultDto;
    }

    /**
     * 通过.net接口响应的接口 放入到处理方法中中<br/>
     * 解析到内部对象，具体业务等待，外部Service处理<br/>
     *
     * @param t
     * @param result
     */
    private CCSServiceResultVO.Result<T> result2Entity(T t, CCSServiceResultVO result) {
        CCSServiceResultVO.Result<T> bean = new CCSServiceResultVO.Result<T>();
        bean.setDataObject(t);
        bean.setSuccess(result.getSuccess());
        bean.setMessage(result.getData());
        return bean;
    }


}
