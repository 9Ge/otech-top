package com.otechsolution.inventory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.inventory.dto.InvHeaderExtendDTO;
import com.otechsolution.inventory.entity.InvHeaderExtend;
import com.otechsolution.inventory.mapper.InvHeaderExtendMapper;
import com.otechsolution.inventory.service.InvHeaderExtendService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class InvHeaderExtendServiceImpl extends ServiceImpl<InvHeaderExtendMapper, InvHeaderExtend> implements InvHeaderExtendService {

    @Override
    public int insert(Long headerId, Long clientId, InvHeaderExtendDTO record) {
        InvHeaderExtend obj = record.toEntity(InvHeaderExtend.class);
        obj.setInvHeaderId(headerId);
        obj.setClientId(clientId);
        return getBaseMapper().insert(obj);
    }
}