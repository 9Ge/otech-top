package com.otechsolution.out.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.otechsolution.common.spring.SpringContextHolder;
import com.otechsolution.out.properties.OtechTopOutProperties;
import com.otechsolution.out.service.OpenAppInfoService;
import com.otechsolution.sqlserver.OtechDataServer;
import com.otechsolution.web.config.WebConfig;
import com.otechsolution.web.filter.RequestInterceptor;
import com.otechsolution.web.signer.filter.SignatureComponent;
import com.otechsolution.web.signer.filter.SignatureFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 * @author yuandongfei
 */
@Slf4j
@Configuration
public class WebMvcConfig extends WebConfig {

    private final OtechTopOutProperties properties;
    private final OpenAppInfoService openAppInfoService;

    public WebMvcConfig(OtechTopOutProperties properties, OpenAppInfoService openAppInfoService) {
        this.properties = properties;
        this.openAppInfoService = openAppInfoService;
    }

    @Bean
    public OtechDataServer otechDataServer() {
        return new OtechDataServer(properties.getDataSource(), restTemplate(clientHttpRequestFactory()));
    }

    @Bean
    public SignatureComponent signatureComponent() {
        return new SignatureComponent(openAppInfoService, properties.getSignature());
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }

    @Bean
    public FilterRegistrationBean signatureFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SignatureFilter(signatureComponent()));
        // /* 是全部的请求拦截，和Interceptor的拦截地址/**区别开
        registration.addUrlPatterns("/*");
        registration.setName("signatureFilter");
        registration.setOrder(0);
        return registration;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor()).order(1);
        //使用拦截器注册表进行添加 自定义拦截器
    }
}
