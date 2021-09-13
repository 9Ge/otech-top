package com.otechsolution.forex.config;

import com.otechsolution.clientinfo.ClientInfoInterceptor;
import com.otechsolution.common.spring.SpringContextHolder;
import com.otechsolution.forex.properties.ForexProperties;
import com.otechsolution.web.config.WebConfig;
import com.otechsolution.web.filter.RequestInterceptor;
import com.otechsolution.web.properties.ThreadPoolProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 * @author yuandongfei
 */
@Configuration
public class WebMvcConfig extends WebConfig {
    private final ForexProperties properties;

    public WebMvcConfig(ForexProperties properties) {
        this.properties = properties;
    }

    @Bean
    public ThreadPoolProperties threadPoolProperties(ForexProperties properties) {
        return properties.getThreadPool();
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor()).order(1);
        //ClientInfoInterceptor clientInfoInterceptor = new ClientInfoInterceptor(properties.getClientInfo(), clientHttpRequestFactory(), springContextHolder());
        ClientInfoInterceptor clientInfoInterceptor = new ClientInfoInterceptor(properties.getClientInfo(), clientHttpRequestFactory());
        //使用拦截器注册表进行添加 自定义拦截器
        registry.addInterceptor(clientInfoInterceptor).order(3);
    }
}
