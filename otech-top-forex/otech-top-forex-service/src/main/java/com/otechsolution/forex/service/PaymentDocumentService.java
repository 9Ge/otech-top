package com.otechsolution.forex.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.otechsolution.forex.dto.PaymentDocumentDTO;
import com.otechsolution.forex.entity.PaymentDocument;

import java.util.List;

/**
 * 凭证信息
 *
 * @author yuandongfei
 */
public interface PaymentDocumentService extends IService<PaymentDocument> {

    void insertList(Long forexId, List<PaymentDocumentDTO> list);
}