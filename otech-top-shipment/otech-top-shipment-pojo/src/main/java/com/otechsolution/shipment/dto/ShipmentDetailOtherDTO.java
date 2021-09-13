package com.otechsolution.shipment.dto;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class ShipmentDetailOtherDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long shipmentDetailId;

    private Integer ftaAgreement;

    private String costCenter;

    private String promisitemsRelation;

    private String promisitemsPriceImpact;

    private String promisitemsRoyalty;

    private String destinationCountry;

    private String countryOrigin;

    private String origPlaceCode;

    private String countryOriginCode;

    private String destinationCode;
}
