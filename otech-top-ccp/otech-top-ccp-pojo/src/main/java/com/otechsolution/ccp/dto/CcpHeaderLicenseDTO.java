package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpHeaderLicenseDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer seqNo;

    private String documentCode;

    private String documentNo;

}
