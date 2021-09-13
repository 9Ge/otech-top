package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class CcpHeaderStorageDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String markNo;

    private String storage;

    private Date storageTime;

    private String storageRemark;

    private Integer approvalStatus;

    private String remark;

}