package com.otechsolution.shipment.dto;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class ShipmentHeaderTransportDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String transportMode;

    private String transportName;

    private String voyageNo;

    private String billNo;

    private String countriesArrival;

    private String departurePortCode;

    private String stopoverPort;
}
