package com.otechsolution.out.service.httplog.ccs;

import com.otechsolution.common.util.ObjectMapperUtil;
import com.otechsolution.httplog.parser.HttpLogParser;
import com.otechsolution.out.entity.ccs.CCSLogistics;
import com.otechsolution.out.entity.ccs.CCSOrder;
import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Date 18:51
 * @ClassName: CCSLogisticsHttpLogParser
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Component
public class CCSOrderHttpLogParser implements HttpLogParser {

    @Override
    public String businessNo(Object[] args) {
        try {
            if (!Arrays.isNullOrEmpty(args)) {
                Object arg = args[0];
                if (CCSOrder.class.isAssignableFrom(arg.getClass())) {
                    CCSOrder req = (CCSOrder) arg;
                    return req.getOrderNumber();
                }
            }
        } catch (Exception e) {
        }
        return "";
    }


    @Override
    public String requestData(Object[] args, HttpServletRequest request) {
        if (!Arrays.isNullOrEmpty(args)) {
            return ObjectMapperUtil.writeValueAsString(args[0]);
        }
        return null;
    }
}
