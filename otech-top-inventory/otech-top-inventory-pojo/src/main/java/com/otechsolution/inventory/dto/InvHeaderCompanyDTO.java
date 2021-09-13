package com.otechsolution.inventory.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class InvHeaderCompanyDTO extends BaseDTO {
    private Long invHeaderId;
    private String inputCompanyCode;
    private String inputCompanyName;
    private String inputCompanyCodeScc;
    private Date inputTime;
    private String declareCompanyCodeScc;
    private String declareCompanyCode;
    private String declareCompanyName;
    private String ccpEntryId;
    private String ccpCurrDeclareCompanyCode;
    private String ccpCurrDeclareCompanyCodeScc;
    private String ccpCurrDeclareCompanyName;
    private String ccpOrgCode;
    private String ccpOrgName;
    private String ccpOrgCodeScc;
    private String ccpDeclareCompanyCode;
    private String ccpDeclareCompanyName;
    private String ccpDeclareCompanyCodeScc;
    private String domesticConsignorCode;
    private String domesticConsignorNameCn;
    private String domesticConsignorCiqCode;
    private String domesticConsignorNameEn;
    private String ccpDomesticConsignorCodeScc;
    private String ccpDomesticConsignorCode;
    private String ccpDomesticConsignorName;
    private String useCompanyCode;
    private String useCompanyCodeScc;
    private String useCompanyCodeName;
}