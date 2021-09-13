package com.otechsolution.out.web.controller.integration;

import com.otechsolution.out.dto.integration.PreWhMoveRequest;
import com.otechsolution.out.service.integration.PreWhMoveService;
import com.otechsolution.web.result.ApiResult;
import com.otechsolution.web.result.ResponseResultBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 预入库（预增预减）数据接口
 *
 * @author yuandongfei
 */
@RestController
@RequestMapping("/out/pre/move")
@ResponseResultBody
@Api("一体化平台， 预入库数据接口 -- PreWhMoveController")
public class PreWhMoveController {

    private final PreWhMoveService service;

    public PreWhMoveController(PreWhMoveService service) {
        this.service = service;
    }

    @PostMapping
    @ApiOperation("保存库存数据")
    public Object save(@RequestBody List<PreWhMoveRequest> request) {
        if (CollectionUtils.isNotEmpty(request)) {
            for (PreWhMoveRequest item : request) {
                service.save(item);
            }
        }
        return ApiResult.success();
    }
}
