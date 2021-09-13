package com.otechsolution.shipment.dto;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.otechsolution.common.dto.BaseDTO;
import com.otechsolution.shipment.entity.ShipmentHeaderFee;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShipmentHeaderFeeDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String paymentTerms;

    private String transMode;

    private String feeCurrency;

    private String feeMark;

    private BigDecimal feeRate;

    private String insuranceCurrency;

    private String insuranceMark;

    private BigDecimal insuranceRate;

    private String otherCurrency;

    private String otherMark;

    private BigDecimal otherRate;

}
