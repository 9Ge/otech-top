package com.otechsolution.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.inventory.dto.InvHeaderDTO;
import com.otechsolution.inventory.entity.InvHeader;

/**
 * @author yuandongfei
 */
public interface InvHeaderService extends IService<InvHeader> {
    /**
     * 插入Header数据
     *
     * @param record
     * @return InvHeader
     */
    InvHeader insert(InvHeaderDTO record);
}