package com.otechsolution.inventory.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class InvHeaderExtendDTO extends BaseDTO {
    private Long invHeaderId;
    private Date preVerifyDeductionTime;
    private String verifyDeductionMode;
    private String verifyDeductionFlag;
    private Date verifyDeductionTime;
    private String checkComputationCode;
    private String declarerIcCardNo;
    private String listState;
    private BigDecimal modifyNumber;
    private String declarationStatus;
    private String passportUsedTypeCode;
    private String declareType;
    private String needEntryModified;
    private String levyAmount;
}