package com.otechsolution.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.inventory.dto.InvHeaderCompanyDTO;
import com.otechsolution.inventory.entity.InvHeaderCompany;

/**
 * @author yuandongfei
 */
public interface InvHeaderCompanyService extends IService<InvHeaderCompany> {
    /**
     * 插入
     *
     * @param headerId
     * @param clientId
     * @param record
     * @return
     */
    int insert(Long headerId, Long clientId, InvHeaderCompanyDTO record);
}