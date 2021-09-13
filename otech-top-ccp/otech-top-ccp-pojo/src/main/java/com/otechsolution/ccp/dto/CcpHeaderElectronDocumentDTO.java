package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpHeaderElectronDocumentDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer seqNo;

    private String attachedDocNo;

    private String attachedDocType;

    private String attachedDocFormatType;

    private String attachedDocFileSize;

    private String operationNotice;

    private String attachedDocCompany;

    private String affiliatedOrgNo;

    private String signatureOrg;

    private String signatureTime;

    private String affiliatedOrgName;

    private Long basFileId;

    private String basFileName;

    private String fileName;
}
