package com.otechsolution.inventory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.inventory.dto.InventoryDetailDTO;
import com.otechsolution.inventory.entity.InvDetail;
import com.otechsolution.inventory.mapper.InvDetailMapper;
import com.otechsolution.inventory.service.InvDetailService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class InvDetailServiceImpl extends ServiceImpl<InvDetailMapper, InvDetail> implements InvDetailService {

    @Override
    public InvDetail insert(Long headerId, Long clientId, InventoryDetailDTO record) {
        InvDetail obj = record.toEntity(InvDetail.class);
        obj.setInvHeaderId(headerId);
        obj.setClientId(clientId);
        int rInt = getBaseMapper().insert(obj);
        if (rInt > 0) {
            return obj;
        }
        return null;
    }
}