package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpDetailGoodsLimitDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private Integer ccpDetailSeqNo;

    private Integer seqNo;

    private Integer goodsSeq;

    private String licenseTypeCode;

    private String licenceNo;

    private String licenseWrtofDetailNo;

    private String licenseWriteOffQty;

    private String licenseWriteOffQtyUnit;
}
