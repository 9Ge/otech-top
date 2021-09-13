package com.otechsolution.out.service.ccs.handler;

import com.otechsolution.out.dto.ccs.CCSServiceResultVO;
import com.otechsolution.out.entity.ccs.CCSBilling;
import com.otechsolution.out.entity.ccs.CCSLogistics;
import com.otechsolution.out.entity.ccs.CCSOrder;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Date 14:30
 * @ClassName: CCSHttpResultProcessor
 * @Author: YANGCHENG.
 * @Version:1.0
 * 国药.net 接口处理类，用来处理CCSServiceResultDto的结果信息
 * 返回成功失败的数据
 * <p>
 * success、code、message、data是返回的对象信息
 * Result 是处理后的接口信息
 * 包含
 * dataObject【对象信息】
 * message【返回报文】
 * success【成功失败】
 */
public class CCSHttpResultProcessor {


    private List<CCSServiceResultVO.Result> success = new ArrayList<>();

    private List<CCSServiceResultVO.Result> failed = new ArrayList<>();

    public List<CCSServiceResultVO.Result> getSuccess() {
        return success;
    }

    public void setSuccess(List<CCSServiceResultVO.Result> success) {
        this.success = success;
    }

    public List<CCSServiceResultVO.Result> getFailed() {
        return failed;
    }

    public void setFailed(List<CCSServiceResultVO.Result> failed) {
        this.failed = failed;
    }

    /**
     * 根据批量保存结果，解析成功和失败的对象，处理并设置内部信息。
     * 处理集合的接口结果
     * @param batchResults
     * @return
     */
    public static CCSHttpResultProcessor resultHandler(List<CCSServiceResultVO> batchResults) {
        CCSHttpResultProcessor handleDto = new CCSHttpResultProcessor();
        for (CCSServiceResultVO resultDto : batchResults) {
            handleDto.handle(resultDto.getResult());
        }
        return handleDto;
    }

    /**
     * 国药接口成功失败的数据处理
     * @param result
     */
    public void handle(CCSServiceResultVO.Result result){
        Assert.notNull(result,"CCSServiceResultDto.Result not null");
        result.setDataObject(this.resultShowKey( result.getDataObject()));

        if(result.getSuccess()){
            success.add(result);
        }else {
            failed.add(result);
        }
    }

    /**
     * 设置保存失败，返回报文显示的key
     * @param dataObject
     * @return
     */
    private String resultShowKey(Object dataObject) {
        Assert.notNull(dataObject,"CCSServiceResultDto.Result.DataObject not null");
        String key = "未设置字段key,类名："+this.getClass().getName();
        if(dataObject instanceof CCSLogistics){
            key = ((CCSLogistics) dataObject).getCodeTS();
        }else if(dataObject instanceof CCSOrder){
            key = ((CCSOrder) dataObject).getOrderNumber();
        }else if(dataObject instanceof CCSOrder.OrderDetail){
            key = ((CCSOrder.OrderDetail) dataObject).getGoodsName();
        }else if(dataObject instanceof CCSBilling){
            key = ((CCSBilling) dataObject).getBillingNumber();
        }else if(dataObject instanceof CCSBilling.BillingDetail){
            key = ((CCSBilling.BillingDetail) dataObject).getElementName();
        }
        return key;
    }

   /**
     * 传入成功and失败集合
     * 返回结果map
     * @return
     */
    public Map resultMap() {
        Map map = new HashMap<>();
        map.put("成功数据", this.success);
        map.put("失败数据", this.failed);
        return map;
    }
}
