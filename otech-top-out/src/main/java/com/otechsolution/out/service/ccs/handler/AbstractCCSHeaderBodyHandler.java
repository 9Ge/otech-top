package com.otechsolution.out.service.ccs.handler;

import com.otechsolution.common.exception.ResultCode;
import com.otechsolution.out.dto.ccs.CCSServiceResultVO;
import com.otechsolution.out.entity.ccs.CssUserEntity;
import com.otechsolution.out.properties.OtechTopOutProperties;
import com.otechsolution.web.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Date 14:41
 * @ClassName: CCSHeaderBodyService
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Slf4j
public abstract class AbstractCCSHeaderBodyHandler<H extends CssUserEntity,B extends CssUserEntity> {

     @Autowired
     CCSHttpClientProcessor<H> ccsRestTemplateService = null;

     @Autowired
     CCSHttpClientProcessor<B> detailCCSRestTemplateService = null;

      @Autowired
      OtechTopOutProperties properties = null;

    /**
     * 处理表头和表体信息
     *
     * @param headers
     * @return
     */
    public ApiResult saveHeaderAndBody(List<H> headers) {
        log.info("{}",headers);
        CCSHttpResultProcessor handleDto = new CCSHttpResultProcessor();
        for (H h : headers) {
            CCSServiceResultVO headerResult = ccsRestTemplateService.postT2Url(headerUrl(), h);
            //success deal body
            if (headerResult.getSuccess()) {
                List<B> details = this.bodySetIdKey(h, this.getHeaderId(headerResult));
                this.headerFailedBodyMessage(headerResult, this.saveBatchBody(details));
            }
            handleDto.handle(headerResult.getResult());
        }
        return this.getApiResult(handleDto);
    }



    private boolean blag = false;
    private ApiResult getApiResult(CCSHttpResultProcessor handleDto) {
        if(handleDto.getFailed().size()>0 || blag ){

           return new ApiResult(ResultCode.FAILED, handleDto.resultMap());
        }
        return new ApiResult(ResultCode.SUCCESS, handleDto.resultMap());
    }


    /**
     * 处理商品明细，设置成功失败的商品数据
     *
     * @param details
     * @return
     */
    public CCSHttpResultProcessor saveBatchBody(List<B> details) {

        CCSHttpResultProcessor detailDto = new CCSHttpResultProcessor();
        if (details == null || details.isEmpty()) {
            return detailDto;
        }
        List<CCSServiceResultVO> detailResultes = detailCCSRestTemplateService.postListT2Url(bodyUrl(), details);
        for (CCSServiceResultVO detailResult : detailResultes) {
            detailDto.handle(detailResult.getResult());
        }
        return detailDto;
    }

    /**
     * 处理商品失败商品明细，放到表头的message数据
     *
     * @param headerResult
     * @param detailDto
     */
    public void headerFailedBodyMessage(CCSServiceResultVO headerResult, CCSHttpResultProcessor detailDto) {
        if (detailDto.getFailed().size() > 0) {
            blag = true;
            LinkedHashMap message = headerResult.getResult().getMessage();
            message.put("以下从表保存失败", detailDto.getFailed());
        }
    }

    /**
     * 得到订单商品明细并且配置商品信息
     *
     * @param h
     * @param headerId
     * @return
     */
    public abstract  List<B> bodySetIdKey(H h, Integer headerId) ;

    public abstract Integer getHeaderId(CCSServiceResultVO headerResult);


    public abstract  String headerUrl();

    public abstract  String bodyUrl();
}
