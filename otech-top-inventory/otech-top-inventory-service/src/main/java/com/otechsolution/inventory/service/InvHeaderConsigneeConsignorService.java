package com.otechsolution.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.inventory.dto.InvHeaderConsigneeConsignorDTO;
import com.otechsolution.inventory.entity.InvHeaderConsigneeConsignor;

public interface InvHeaderConsigneeConsignorService extends IService<InvHeaderConsigneeConsignor> {
    /**
     * insert
     *
     * @param headerId
     * @param clientId
     * @param record
     * @return
     */
    int insert(Long headerId, Long clientId, InvHeaderConsigneeConsignorDTO record);
}