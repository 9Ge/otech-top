package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class CcpTaxDetailDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private Long ccpHeaderTaxHeaderId;

    private String taxType;

    private Integer ccpDetailSeqNo;

    private String specificRateDuty;

    private BigDecimal adValoremRateDuty;

    private BigDecimal estimatedTax;

    private Integer typeProtocol;
    
}