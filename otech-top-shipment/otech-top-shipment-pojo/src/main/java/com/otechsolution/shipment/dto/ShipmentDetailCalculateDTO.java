package com.otechsolution.shipment.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShipmentDetailCalculateDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long shipmentDetailId;

    private BigDecimal goodsQty;

    private String goodsUnit;

    private BigDecimal firstQty;

    private String firstUnit;

    private BigDecimal secondQty;

    private String secondUnit;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;

    private BigDecimal volume;
}
