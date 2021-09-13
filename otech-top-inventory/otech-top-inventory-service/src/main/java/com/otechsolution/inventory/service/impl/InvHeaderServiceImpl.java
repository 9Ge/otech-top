package com.otechsolution.inventory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.inventory.dto.InvHeaderDTO;
import com.otechsolution.inventory.entity.InvHeader;
import com.otechsolution.inventory.mapper.InvHeaderMapper;
import com.otechsolution.inventory.service.InvHeaderService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class InvHeaderServiceImpl extends ServiceImpl<InvHeaderMapper, InvHeader> implements InvHeaderService {

    @Override
    public InvHeader insert(InvHeaderDTO record) {
        InvHeader header = record.toEntity(InvHeader.class);
        int rInt = getBaseMapper().insert(header);
        if (rInt > 0) {
            return header;
        }
        return null;
    }
}