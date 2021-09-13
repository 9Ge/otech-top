package com.otechsolution.inventory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.inventory.dto.InvDetailCalculateDTO;
import com.otechsolution.inventory.entity.InvDetailCalculate;
import com.otechsolution.inventory.mapper.InvDetailCalculateMapper;
import com.otechsolution.inventory.service.InvDetailCalculateService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class InvDetailCalculateServiceImpl extends ServiceImpl<InvDetailCalculateMapper, InvDetailCalculate> implements InvDetailCalculateService {

    @Override
    public int insert(Long detailId, Long clientId, InvDetailCalculateDTO record) {
        InvDetailCalculate obj = record.toEntity(InvDetailCalculate.class);
        obj.setInvDetailId(detailId);
        obj.setClientId(clientId);
        return getBaseMapper().insert(obj);
    }
}