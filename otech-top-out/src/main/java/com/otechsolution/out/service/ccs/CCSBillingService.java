package com.otechsolution.out.service.ccs;

import com.otechsolution.common.exception.ResultCode;
import com.otechsolution.out.dto.ccs.CCSServiceResultVO;
import com.otechsolution.out.entity.ccs.CCSBilling;
import com.otechsolution.out.entity.ccs.CCSLogistics;
import com.otechsolution.out.properties.OtechTopOutProperties;
import com.otechsolution.out.service.ccs.handler.AbstractCCSHeaderBodyHandler;
import com.otechsolution.out.service.ccs.handler.CCSHttpClientProcessor;
import com.otechsolution.out.service.ccs.handler.CCSHttpResultProcessor;
import com.otechsolution.web.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Date 2021/1/27 15:16
 * @ClassName: CCSBillingService
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Service
@Slf4j
public class CCSBillingService extends AbstractCCSHeaderBodyHandler<CCSBilling, CCSBilling.BillingDetail> {

    @Autowired
    OtechTopOutProperties properties = null;

    @Override
    public String headerUrl() {
        return properties.getCcs().getTopUrl().getBillingHeader();
    }

    @Override
    public String bodyUrl() {
        return properties.getCcs().getTopUrl().getBillingDetail();
    }

    @Override
    public List<CCSBilling.BillingDetail> bodySetIdKey(CCSBilling ccsBilling, Integer headerId) {
        List<CCSBilling.BillingDetail> details = ccsBilling.getDetail();
        for (CCSBilling.BillingDetail detail : details) {
            detail.setBillingId(headerId);
        }
        return details;
    }

    @Override
    public Integer getHeaderId(CCSServiceResultVO headerResult) {
        LinkedHashMap data = headerResult.getData();
        Double orderHeaderId = Double.valueOf(String.valueOf(data.get("BILLING_ID")));
        return BigDecimal.valueOf(orderHeaderId).intValue();
    }

    @Autowired
    CCSHttpClientProcessor<CCSBilling> ccsRestTemplateService;

    /**
     * 付费取消接口
     * @param ccsBillings
     * @return
     */
    public ApiResult cancelEntity(List<CCSBilling> ccsBillings) {

        List<CCSServiceResultVO> batchResults = ccsRestTemplateService.postListT2Url(properties.getCcs().getTopUrl().getBillingDetailUpdate(), ccsBillings);
        CCSHttpResultProcessor handleDto = CCSHttpResultProcessor.resultHandler(batchResults);

        if(handleDto.getFailed().size()>0){
            return new ApiResult(ResultCode.FAILED, handleDto.resultMap());
        }
        return new ApiResult(ResultCode.SUCCESS, handleDto.resultMap());
    }



}
