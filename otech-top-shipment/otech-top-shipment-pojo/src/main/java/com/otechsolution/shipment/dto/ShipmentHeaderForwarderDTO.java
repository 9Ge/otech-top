package com.otechsolution.shipment.dto;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class ShipmentHeaderForwarderDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String forwarderName;

    private String forwarderCustomsCode;

    private String forwarderCodeScc;

    private String incoterms;

    private String custommaster;

    private String contractNo;

    private Long customerId;
}
