package com.otechsolution.out.web.controller.forex;

import com.otechsolution.forex.biz.ForeignExchangeBiz;
import com.otechsolution.httplog.LoggerAnnotation;
import com.otechsolution.out.dto.forex.ForexRequest;
import com.otechsolution.out.service.httplog.ForexHttpLogParser;
import com.otechsolution.web.result.ApiResult;
import com.otechsolution.web.result.ResponseResultBody;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 外汇管理接口
 *
 * @author yuandongfei
 */
@Slf4j
@RestController
@RequestMapping("/out/forex")
@ResponseResultBody
@Api("外汇管理接口 -- InventoryController")
public class ForexController {

    private final ForeignExchangeBiz foreignExchangeBiz;

    public ForexController(ForeignExchangeBiz foreignExchangeBiz) {
        this.foreignExchangeBiz = foreignExchangeBiz;
    }

    @PostMapping
    @LoggerAnnotation(name = "外汇新增接口", method = HttpMethod.POST, url = "/out/forex", parser = ForexHttpLogParser.class)
    public Object save(@RequestBody ForexRequest request) {
        log.info("接收参数: [{}]", request);
        foreignExchangeBiz.insert(request,
                request.getPaymentList(),
                request.getDeclarationDocumentList(),
                request.getPaymentDocumentList());
        return ApiResult.success();
    }

}
