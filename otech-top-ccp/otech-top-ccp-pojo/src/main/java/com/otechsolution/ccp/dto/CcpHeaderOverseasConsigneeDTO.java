package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpHeaderOverseasConsigneeDTO extends BaseDTO{
    private Long id;

    private Long clientId;

    private String overseasConsignorCode;

    private String overseasConsignorNameCn;

    private String overseasConsignorAddress;

    private String overseasConsignorNameEn;

}