package com.otechsolution.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.inventory.dto.InventoryDetailDTO;
import com.otechsolution.inventory.entity.InvDetail;

/**
 * @author yuandongfei
 */
public interface InvDetailService extends IService<InvDetail> {
    /**
     * 插入
     *
     * @param headerId
     * @param clientId
     * @param record
     * @return
     */
    InvDetail insert(Long headerId, Long clientId, InventoryDetailDTO record);
}