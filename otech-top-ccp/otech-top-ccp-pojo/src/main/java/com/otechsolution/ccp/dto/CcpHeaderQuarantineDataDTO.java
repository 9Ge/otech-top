package com.otechsolution.ccp.dto;

import com.otechsolution.ccp.entity.CcpHeaderQuarantineData;
import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpHeaderQuarantineDataDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String ciqOrgCode;

    private String vsaOrgCode;

    private String portOrgCode;

    private String departureDate;

    private String blNo;

    private String destinationCiqOrgCode;

    private String relNo;

    private String relReasonFlag;

    private String originalBoxFlag;

    private String specialDeclareFlag;
}
