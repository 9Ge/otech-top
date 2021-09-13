package com.otechsolution.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.inventory.dto.InvHeaderExtendDTO;
import com.otechsolution.inventory.entity.InvHeaderExtend;

/**
 * @author yuandongfei
 */
public interface InvHeaderExtendService extends IService<InvHeaderExtend> {
    /**
     * 插入
     *
     * @param headerId
     * @param clientId
     * @param record
     * @return
     */
    int insert(Long headerId, Long clientId, InvHeaderExtendDTO record);
}