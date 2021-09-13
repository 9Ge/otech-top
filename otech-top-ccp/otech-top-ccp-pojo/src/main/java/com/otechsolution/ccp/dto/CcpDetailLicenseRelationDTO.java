package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpDetailLicenseRelationDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private Long licenseId;

    private Integer licenseSeqNo;

    private Integer seqNo;

    private Integer declareGoodsNo;

    private Integer originCertGoodsNo;

    private String billType;

    private String billCertNo;

    private String extendFiled;
}
