package com.otechsolution.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.inventory.dto.InvDetailCalculateDTO;
import com.otechsolution.inventory.entity.InvDetailCalculate;

/**
 * @author yuandongfei
 */
public interface InvDetailCalculateService extends IService<InvDetailCalculate> {
    /**
     * @param detailId
     * @param clientId
     * @param record
     * @return
     */
    int insert(Long detailId, Long clientId, InvDetailCalculateDTO record);
}