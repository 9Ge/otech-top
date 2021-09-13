package com.otechsolution.inventory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.inventory.dto.InvHeaderCompanyDTO;
import com.otechsolution.inventory.entity.InvHeaderCompany;
import com.otechsolution.inventory.mapper.InvHeaderCompanyMapper;
import com.otechsolution.inventory.service.InvHeaderCompanyService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class InvHeaderCompanyServiceImpl extends ServiceImpl<InvHeaderCompanyMapper, InvHeaderCompany> implements InvHeaderCompanyService {

    @Override
    public int insert(Long headerId, Long clientId, InvHeaderCompanyDTO record) {
        InvHeaderCompany obj = record.toEntity(InvHeaderCompany.class);
        obj.setInvHeaderId(headerId);
        obj.setClientId(clientId);
        return getBaseMapper().insert(obj);
    }
}