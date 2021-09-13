package com.otechsolution.forex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.forex.dto.ForeignExchangeDTO;
import com.otechsolution.forex.entity.ForeignExchange;
import com.otechsolution.forex.mapper.ForeignExchangeMapper;
import com.otechsolution.forex.service.ForeignExchangeService;
import org.springframework.stereotype.Service;

/**
 * @author yuandongfei
 */
@Service
public class ForeignExchangeServiceImpl extends ServiceImpl<ForeignExchangeMapper, ForeignExchange> implements ForeignExchangeService {

    @Override
    public ForeignExchange insert(ForeignExchangeDTO record) {
        ForeignExchange obj = record.toEntity();
        int rInt = getBaseMapper().insert(obj);
        if (rInt > 0) {
            return obj;
        }
        return null;
    }
}
