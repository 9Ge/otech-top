package com.otechsolution.inventory.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class InvDetailCalculateDTO extends BaseDTO {
    private Long invDetailId;
    private BigDecimal goodsQty;
    private String goodsUnit;
    private BigDecimal firstQty;
    private String firstUnit;
    private BigDecimal secondQty;
    private String secondUnit;
    private BigDecimal weightFactor;
    private BigDecimal firstFactor;
    private BigDecimal secondFactor;
    private BigDecimal grossWeight;
    private BigDecimal netWeight;
}