package com.otechsolution.out.properties;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Date 10:02
 * @ClassName: CcsProperties
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Data
public class CcsProperties {
    private String host;
    private String userNameOrPhoneOrEmailAddress;
    private String password;
    private Integer clientId;
    private Integer userId;
    private CcsTopUrlProperties topUrl = new CcsTopUrlProperties();
}
