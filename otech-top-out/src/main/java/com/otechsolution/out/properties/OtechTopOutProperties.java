package com.otechsolution.out.properties;


import com.otechsolution.sqlserver.DataSourceProperties;
import com.otechsolution.web.properties.ThreadPoolProperties;
import com.otechsolution.web.signer.handler.SignatureProperties;
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
@ConfigurationProperties(prefix = "com.otech.out")
public class OtechTopOutProperties {
    SpringF
    private DataSourceProperties dataSource = new DataSourceProperties();
    private ThreadPoolProperties threadPool = new ThreadPoolProperties();
    private SignatureProperties signature = new SignatureProperties();
    private CcsProperties ccs = new CcsProperties();
}
