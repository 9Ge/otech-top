package com.otechsolution.forex.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.forex.dto.ForexPaymentDTO;
import com.otechsolution.forex.entity.ForexPayment;

import java.util.List;

/**
 * @author yuandongfei
 */
public interface ForexPaymentService extends IService<ForexPayment> {
    void insertList(Long forexId, List<ForexPaymentDTO> list);
}