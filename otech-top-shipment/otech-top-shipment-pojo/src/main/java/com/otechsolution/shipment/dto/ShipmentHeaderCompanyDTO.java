package com.otechsolution.shipment.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class ShipmentHeaderCompanyDTO extends BaseDTO {

    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String declareCompanyCodeScc;

    private String declareCompanyCode;

    private String declareCompanyCiqCode;

    private String declareCompanyName;

    private String useCompanyCodeScc;

    private String useCompanyCode;

    private String useCiqCode;

    private String useCompanyName;

    private String domesticConsignorCode;

    private String domesticConsignorNameCn;

    private String domesticConsignorCiqCode;

    private String domesticConsignorNameEn;
}
