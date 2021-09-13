package com.otechsolution.forex.biz;

import com.otechsolution.forex.dto.DeclarationDocumentDTO;
import com.otechsolution.forex.dto.ForeignExchangeDTO;
import com.otechsolution.forex.dto.ForexPaymentDTO;
import com.otechsolution.forex.dto.PaymentDocumentDTO;
import com.otechsolution.forex.entity.ForeignExchange;
import com.otechsolution.forex.service.DeclarationDocumentService;
import com.otechsolution.forex.service.ForeignExchangeService;
import com.otechsolution.forex.service.ForexPaymentService;
import com.otechsolution.forex.service.PaymentDocumentService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * 应用业务服务
 *
 * @author yuandongfei
 */
@Service
public class ForeignExchangeBiz {
    private final ForeignExchangeService foreignExchangeService;
    private final ForexPaymentService forexPaymentService;
    private final DeclarationDocumentService declarationDocumentService;
    private final PaymentDocumentService paymentDocumentService;

    public ForeignExchangeBiz(ForeignExchangeService foreignExchangeService,
                              ForexPaymentService forexPaymentService,
                              DeclarationDocumentService declarationDocumentService,
                              PaymentDocumentService paymentDocumentService) {
        this.foreignExchangeService = foreignExchangeService;
        this.forexPaymentService = forexPaymentService;
        this.declarationDocumentService = declarationDocumentService;
        this.paymentDocumentService = paymentDocumentService;
    }

    /**
     * 新增外汇数据
     *
     * @param record
     * @param paymentList             外汇支付信息
     * @param declarationDocumentList 报关信息
     * @param paymentDocumentList     凭证信息
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public boolean insert(ForeignExchangeDTO record,
                          List<ForexPaymentDTO> paymentList,
                          List<DeclarationDocumentDTO> declarationDocumentList,
                          List<PaymentDocumentDTO> paymentDocumentList) {

        ForeignExchange forex = foreignExchangeService.insert(record);
        if (Objects.nonNull(forex)) {
            forexPaymentService.insertList(forex.getId(), paymentList);
            declarationDocumentService.insertList(forex.getId(), declarationDocumentList);
            paymentDocumentService.insertList(forex.getId(), paymentDocumentList);
        }
        return true;
    }
}
