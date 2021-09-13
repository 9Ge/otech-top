package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.prefs.BackingStoreException;

@Data
public class CcpHeaderPackageDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer packageQty;

    private String wrapType;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;

    private BigDecimal volume;

}