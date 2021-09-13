package com.otechsolution.inventory.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class InvHeaderDeclarationInfoDTO extends BaseDTO {
    private Long invHeaderId;
    private String declareEntryType;
    private String declareType;
    private String declareFlag;
    private String billListType;
    private String transportMode;
    private String importExportPort;
    private String customMaster;
    private String relRecordNo;
    private String listType;
    private String refEntryNo;
    private String refListNo;
    private String refRecordNo;
    private Date declareDate;
    private String isGenerateDeclareFlag;
    private String remark;
}