package com.otechsolution.shipment.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class ShipmentHeaderConsigneeConsignorDTO extends BaseDTO {
    private Long id;

    private Long shipmentHeaderId;

    private Long clientId;

    private String overseasConsignorCode;

    private String overseasConsignorNameCn;

    private String overseasConsignorAddress;

    private String overseasConsignorNameEn;
}
