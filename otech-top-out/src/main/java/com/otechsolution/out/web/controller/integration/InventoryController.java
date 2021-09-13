package com.otechsolution.out.web.controller.integration;

import com.otechsolution.out.entity.integration.Inventory;
import com.otechsolution.out.service.integration.InventoryService;
import com.otechsolution.web.result.ApiResult;
import com.otechsolution.web.result.ResponseResultBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 库存数据接口
 *
 * @author yuandongfei
 */
@RestController
@RequestMapping("/out/inventory")
@ResponseResultBody
@Api("一体化平台， 库存数据接口 -- InventoryController")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping
    @ApiOperation("保存库存数据")
    public Object save(@RequestBody List<Inventory> request) {
        if (CollectionUtils.isNotEmpty(request)) {
            for (Inventory inventory : request) {
                inventoryService.save(inventory);
            }
        }
        return ApiResult.success();
    }
}
