package com.otechsolution.out.web.controller.integration;

import com.otechsolution.out.dto.integration.WhMoveRequest;
import com.otechsolution.out.service.integration.WhMoveService;
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
@RequestMapping("/out/move")
@ResponseResultBody
@Api("一体化平台， 仓储出入库数据接口 -- WhMoveController")
public class WhMoveController {

    private final WhMoveService service;

    public WhMoveController(WhMoveService service) {
        this.service = service;
    }


    @PostMapping
    @ApiOperation("保存库存数据")
    public Object save(@RequestBody List<WhMoveRequest> request) {
        if (CollectionUtils.isNotEmpty(request)) {
            for (WhMoveRequest item : request) {
                service.save(item);
            }
        }

        return ApiResult.success();
    }
}
