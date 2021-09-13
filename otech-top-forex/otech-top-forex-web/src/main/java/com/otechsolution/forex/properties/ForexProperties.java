package com.otechsolution.forex.properties;

import com.otechsolution.clientinfo.ClientInfoProperties;
import com.otechsolution.web.properties.ThreadPoolProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuandongfei
 */
@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("com.otech.forex")
public class ForexProperties {
    private ThreadPoolProperties threadPool = new ThreadPoolProperties();
    private ClientInfoProperties clientInfo = new ClientInfoProperties();
}
