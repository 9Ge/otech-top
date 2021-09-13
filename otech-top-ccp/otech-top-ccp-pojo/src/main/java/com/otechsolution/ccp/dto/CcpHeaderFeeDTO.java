package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CcpHeaderFeeDTO extends BaseDTO {

    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String paymentTerms;

    private String transMode;

    private String feeCurrency;

    private String feeMark;

    private BigDecimal feeRate;

    private String insuranceCurrency;

    private String insuranceMark;

    private BigDecimal insuranceRate;

    private String otherCurrency;

    private String otherFlag;

    private BigDecimal otherRate;
}
