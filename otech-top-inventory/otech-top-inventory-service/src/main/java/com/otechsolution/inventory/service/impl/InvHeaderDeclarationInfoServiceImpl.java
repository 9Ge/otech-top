package com.otechsolution.inventory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.inventory.dto.InvHeaderDeclarationInfoDTO;
import com.otechsolution.inventory.entity.InvHeaderDeclarationInfo;
import com.otechsolution.inventory.mapper.InvHeaderDeclarationInfoMapper;
import com.otechsolution.inventory.service.InvHeaderDeclarationInfoService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class InvHeaderDeclarationInfoServiceImpl extends ServiceImpl<InvHeaderDeclarationInfoMapper, InvHeaderDeclarationInfo> implements InvHeaderDeclarationInfoService {

    @Override
    public int insert(Long headerId, Long clientId, InvHeaderDeclarationInfoDTO record) {
        InvHeaderDeclarationInfo obj = record.toEntity(InvHeaderDeclarationInfo.class);
        obj.setInvHeaderId(headerId);
        obj.setClientId(clientId);
        return getBaseMapper().insert(obj);
    }
}