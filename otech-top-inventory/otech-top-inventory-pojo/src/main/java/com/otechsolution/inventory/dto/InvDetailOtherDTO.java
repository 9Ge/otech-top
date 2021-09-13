package com.otechsolution.inventory.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class InvDetailOtherDTO extends BaseDTO {
    private Long invDetailId;
    private Integer applyDetailId;
    private String reductionTaxMode;
    private String useCode;
    private String classifyMark;
    private String applyTableSeqNo;
    private String autoForTheRecord;
    private BigDecimal usdStatTotalAmount;
    private String isCalcInventory;
    private String modifyFlag;
    private String remark;
    private String finalDestination;
    private String countryOrigin;
    private String countryOriginCode;
    private String domesticSourceGoods;
    private String destinationCode;
}