package com.otechsolution.inventory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.inventory.dto.InvHeaderConsigneeConsignorDTO;
import com.otechsolution.inventory.entity.InvHeaderConsigneeConsignor;
import com.otechsolution.inventory.mapper.InvHeaderConsigneeConsignorMapper;
import com.otechsolution.inventory.service.InvHeaderConsigneeConsignorService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class InvHeaderConsigneeConsignorServiceImpl
        extends ServiceImpl<InvHeaderConsigneeConsignorMapper, InvHeaderConsigneeConsignor>
        implements InvHeaderConsigneeConsignorService {

    @Override
    public int insert(Long headerId, Long clientId, InvHeaderConsigneeConsignorDTO record) {
        InvHeaderConsigneeConsignor obj = record.toEntity(InvHeaderConsigneeConsignor.class);
        obj.setClientId(clientId);
        obj.setInvHeaderId(headerId);
        return getBaseMapper().insert(obj);
    }
}
