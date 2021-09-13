package com.otechsolution.shipment.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShipmentDetailDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String serialNumber;

    private String partNumber;

    private String customer;

    private String goodsNo;

    private String goodsName;

    private String goodsNameEn;

    private String goodsModel;

    private String ciqCode;

    private String ciqName;

    private String currency;

    private BigDecimal declarePrice;

    private BigDecimal declareTotalPrice;

    private String workUsd;

    private String exgVersion;

    private Integer seqNo;
}
