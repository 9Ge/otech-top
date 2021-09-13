package com.otechsolution.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.inventory.dto.InvDetailOtherDTO;
import com.otechsolution.inventory.entity.InvDetailOther;

/**
 * @author yuandongfei
 */
public interface InvDetailOtherService extends IService<InvDetailOther> {
    /**
     * 插入
     *
     * @param detailId
     * @param clientId
     * @param record
     * @return
     */
    int insert(Long detailId, Long clientId, InvDetailOtherDTO record);
}