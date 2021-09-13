package com.otechsolution.forex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.forex.dto.PaymentDocumentDTO;
import com.otechsolution.forex.entity.PaymentDocument;
import com.otechsolution.forex.mapper.PaymentDocumentMapper;
import com.otechsolution.forex.service.PaymentDocumentService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author yuandongfei
 */
@Service
public class PaymentDocumentServiceImpl extends ServiceImpl<PaymentDocumentMapper, PaymentDocument> implements PaymentDocumentService {

    @Override
    public void insertList(Long forexId, List<PaymentDocumentDTO> list) {
        if (Objects.nonNull(forexId) && CollectionUtils.isNotEmpty(list)) {
            for (PaymentDocumentDTO item : list) {
                PaymentDocument record = item.toEntity();
                record.setForexId(forexId);
                getBaseMapper().insert(record);
            }
        }
    }
}