package com.otechsolution.forex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.forex.dto.ForexPaymentDTO;
import com.otechsolution.forex.entity.ForexPayment;
import com.otechsolution.forex.mapper.ForexPaymentMapper;
import com.otechsolution.forex.service.ForexPaymentService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author yuandongfei
 */
@Service
public class ForexPaymentServiceImpl extends ServiceImpl<ForexPaymentMapper, ForexPayment> implements ForexPaymentService {

    @Override
    public void insertList(Long forexId, List<ForexPaymentDTO> list) {
        if (Objects.nonNull(forexId) && CollectionUtils.isNotEmpty(list)) {
            for (ForexPaymentDTO item : list) {
                ForexPayment record = item.toEntity();
                record.setForexId(forexId);
                getBaseMapper().insert(record);
            }
        }
    }
}