package com.otechsolution.out.service.httplog;

import com.otechsolution.common.util.ObjectMapperUtil;
import com.otechsolution.httplog.parser.HttpLogParser;
import com.otechsolution.out.dto.forex.ForexRequest;
import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yuandongfei
 */
@Component
public class ForexHttpLogParser implements HttpLogParser {
    @Override
    public String businessNo(Object[] args) {
        try {
            if (!Arrays.isNullOrEmpty(args)) {
                Object arg = args[0];
                if (ForexRequest.class.isAssignableFrom(arg.getClass())) {
                    ForexRequest req = (ForexRequest) arg;
                    return req.getJobNo();
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
