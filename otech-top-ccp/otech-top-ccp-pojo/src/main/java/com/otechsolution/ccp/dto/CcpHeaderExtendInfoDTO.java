package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpHeaderExtendInfoDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String entryNo;

    private String relRecordNo;

    private String supervisedWearehouseNo;

    private String goodsYardCode;

    private String promiseItemsRelation;

    private String promiseItemsPriceImpact;

    private String promiseItemsRoyalty;

    private String declarationMaterialCode;

    private Integer inspectionRelated;

    private Integer licenseRelated;

    private Integer dutyRelated;
}
