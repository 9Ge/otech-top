package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpDetailGoodsProductionDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private String goodsModel;

    private String goodsBrand;

    private String producerDate;

    private String producerBatchNo;

    private String producerRegisterNo;

    private String productionUnitName;

    private String countryOrigin;

    private String countryOriginCode;

    private String domesticSourceGoods;

    private String destinationCode;

    private String finalDestination;
}
