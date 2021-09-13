package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CcpHeaderOtherPackageDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer seqNo;

    private BigDecimal packageQty;

    private String packageType;

}