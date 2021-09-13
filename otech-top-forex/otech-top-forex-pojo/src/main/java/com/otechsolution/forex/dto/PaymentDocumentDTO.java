package com.otechsolution.forex.dto;

import com.otechsolution.forex.entity.PaymentDocument;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Data
public class PaymentDocumentDTO {
    private Long id;

    private Long forexId;

    private String docNo;

    private Byte docType;

    private String docDate;

    private BigDecimal totalAmount;

    private String transactionCurrency;

    private String ossUrl;

    private Integer status;

    private String remark;

    public PaymentDocument toEntity() {
        PaymentDocument target = new PaymentDocument();
        BeanUtils.copyProperties(this, target);
        return target;
    }
}
