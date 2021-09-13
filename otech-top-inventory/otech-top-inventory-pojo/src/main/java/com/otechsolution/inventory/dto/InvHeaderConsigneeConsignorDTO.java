package com.otechsolution.inventory.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class InvHeaderConsigneeConsignorDTO extends BaseDTO {
    private Long invHeaderId;
    private String overseasConsignorCode;
    private String overseasConsignorNameCn;
    private String overseasConsignorAddress;
    private String overseasConsignorNameEn;
}