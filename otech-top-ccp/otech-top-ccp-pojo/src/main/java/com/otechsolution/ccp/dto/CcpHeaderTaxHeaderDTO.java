package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CcpHeaderTaxHeaderDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String taxType;

    private String taxOrderNo;

    private Integer taxOrderSeqNo;

    private BigDecimal taxAmount;

    private BigDecimal payAmount;

    private String billNo;

    private String contractNo;

    private String payStatus;

    private String payPlatform;

    private Date bankDeductionTime;

    private String operatorAccount;

    private String payType;

    private String payBank;

    private String transStatus;

    private String taxTotal;

}