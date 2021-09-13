package com.otechsolution.shipment.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class ShipmentHeaderPackageDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private Integer packageQty;

    private String wrapType;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;

    private BigDecimal volume;
}
