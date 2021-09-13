package com.otechsolution.out.service.ccs.impl;

import com.otechsolution.common.exception.ResultCode;
import com.otechsolution.out.dto.ccs.CCSServiceResultVO;
import com.otechsolution.out.entity.ccs.CCSLogistics;
import com.otechsolution.out.properties.OtechTopOutProperties;
import com.otechsolution.out.service.ccs.CCSLogisticsService;
import com.otechsolution.out.service.ccs.handler.CCSHttpClientProcessor;
import com.otechsolution.out.service.ccs.handler.CCSHttpResultProcessor;
import com.otechsolution.web.result.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date 2021/1/27 15:16
 * @ClassName: CCSLogisticsServiceImpl
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Service
public class CCSLogisticsServiceImpl implements CCSLogisticsService {

    @Autowired
    CCSHttpClientProcessor<CCSLogistics> ccsRestTemplateService;
    @Autowired
    private OtechTopOutProperties properties;

    public ApiResult saveEntity(List<CCSLogistics> ccsLogistics) {
        List<CCSServiceResultVO> batchResults = ccsRestTemplateService.postListT2Url(properties.getCcs().getTopUrl().getLogistics(), ccsLogistics);
        CCSHttpResultProcessor handleDto = CCSHttpResultProcessor.resultHandler(batchResults);

        if(handleDto.getFailed().size()>0){
            return new ApiResult(ResultCode.FAILED, handleDto.resultMap());
        }
        return new ApiResult(ResultCode.SUCCESS, handleDto.resultMap());
    }



}
