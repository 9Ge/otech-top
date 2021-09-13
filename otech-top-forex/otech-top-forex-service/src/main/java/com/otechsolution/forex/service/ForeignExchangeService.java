package com.otechsolution.forex.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.forex.dto.ForeignExchangeDTO;
import com.otechsolution.forex.entity.ForeignExchange;

/**
 * @author yuandongfei
 */
public interface ForeignExchangeService extends IService<ForeignExchange> {

    ForeignExchange insert(ForeignExchangeDTO record);
}
