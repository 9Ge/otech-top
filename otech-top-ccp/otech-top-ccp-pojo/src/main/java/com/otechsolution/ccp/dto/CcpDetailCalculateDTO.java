package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CcpDetailCalculateDTO extends BaseDTO {
    private Long id;

    private Long ccpDetailId;

    private Long clientId;

    private BigDecimal goodsQty;

    private String goodsUnit;

    private BigDecimal firstQty;

    private String firstUnit;

    private BigDecimal secondQty;

    private String secondUnit;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;
}
