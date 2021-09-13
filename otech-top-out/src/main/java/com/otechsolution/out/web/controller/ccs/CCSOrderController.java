package com.otechsolution.out.web.controller.ccs;

import com.otechsolution.httplog.LoggerAnnotation;
import com.otechsolution.out.entity.ccs.CCSOrder;
import com.otechsolution.out.service.ccs.CCSOrderService;
import com.otechsolution.out.service.httplog.ccs.CCSOrderHttpLogParser;
import com.otechsolution.web.result.ApiResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *  @Date 2021/1/27 15:16
 * @ClassName: CCSOrderController
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@RestController
@RequestMapping("/out")
@ResponseBody
@Validated
@Api("国药订单 CCSOrderController")
public class CCSOrderController {

    @Autowired
    private CCSOrderService ccsOrderServiceImpl;

    @PostMapping("/order")
    @LoggerAnnotation(name = "国药订单接口", method = HttpMethod.POST, url = "/out/order", parser = CCSOrderHttpLogParser.class)
    public ApiResult saveCSSLogistics(@RequestBody @Valid List<CCSOrder> ccsOrders){
        return ccsOrderServiceImpl.saveHeaderAndBody(ccsOrders);
    }



}
