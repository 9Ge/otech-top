package com.otechsolution.out.dto.forex;

import com.otechsolution.forex.dto.DeclarationDocumentDTO;
import com.otechsolution.forex.dto.ForeignExchangeDTO;
import com.otechsolution.forex.dto.ForexPaymentDTO;
import com.otechsolution.forex.dto.PaymentDocumentDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuandongfei
 */
@Data
public class ForexRequest extends ForeignExchangeDTO {
    /**
     * 外汇支付信息
     */
    private List<ForexPaymentDTO> paymentList = new ArrayList<>();
    /**
     * 报关信息
     */
    private List<DeclarationDocumentDTO> declarationDocumentList = new ArrayList<>();
    /**
     * 凭证信息
     */
    private List<PaymentDocumentDTO> paymentDocumentList = new ArrayList<>();
}
