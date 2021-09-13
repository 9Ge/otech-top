package com.otechsolution.forex.dto;

import com.otechsolution.forex.entity.DeclarationDocument;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Data
public class DeclarationDocumentDTO {
    private Long id;

    private Long forexId;

    private String entryNo;

    private Byte paymentStatus;

    private String tradeMode;

    private String importDate;

    private BigDecimal paidAmountForex;

    private BigDecimal unpaidAmountForex;

    private String planPaymentDate;

    private BigDecimal totalAmount;

    private String transactionCurrency;

    private Integer needForex;

    private Integer status;

    private String remark;

    public DeclarationDocument toEntity() {
        DeclarationDocument target = new DeclarationDocument();
        BeanUtils.copyProperties(this, target);
        return target;
    }
}
