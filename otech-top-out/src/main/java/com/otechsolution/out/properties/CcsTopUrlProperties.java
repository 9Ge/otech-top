package com.otechsolution.out.properties;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Date 10:07
 * @ClassName: CcsTopUrlProperties
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Data
public class CcsTopUrlProperties {
    private String token;
    private String logistics;
    private String orderHeader;
    private String orderDetail;
    private String billingHeader;
    private String billingDetail;
    private String billingDetailUpdate;
}
