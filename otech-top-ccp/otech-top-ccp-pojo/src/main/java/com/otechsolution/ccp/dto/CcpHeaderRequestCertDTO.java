package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.util.Date;
@Data
public class CcpHeaderRequestCertDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer seqNo;

    private String applyCertificateCode;

    private String applyCertificateNumber;

    private String applyCertificateCopyNumber;
}