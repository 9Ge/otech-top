package com.otechsolution.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.inventory.dto.InvHeaderDeclarationInfoDTO;
import com.otechsolution.inventory.entity.InvHeaderDeclarationInfo;

/**
 * @author yuandongfei
 */
public interface InvHeaderDeclarationInfoService extends IService<InvHeaderDeclarationInfo> {
    /**
     * 插入数据
     *  @param headerId
     * @param clientId
     * @param record
     */
    int insert(Long headerId, Long clientId, InvHeaderDeclarationInfoDTO record);
}