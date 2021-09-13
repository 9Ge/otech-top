package com.otechsolution.inventory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.inventory.dto.InvDetailOtherDTO;
import com.otechsolution.inventory.entity.InvDetailOther;
import com.otechsolution.inventory.mapper.InvDetailOtherMapper;
import com.otechsolution.inventory.service.InvDetailOtherService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class InvDetailOtherServiceImpl extends ServiceImpl<InvDetailOtherMapper, InvDetailOther> implements InvDetailOtherService {

    @Override
    public int insert(Long detailId, Long clientId, InvDetailOtherDTO record) {
        InvDetailOther obj = record.toEntity(InvDetailOther.class);
        obj.setInvDetailId(detailId);
        obj.setClientId(clientId);
        return getBaseMapper().insert(obj);
    }
}