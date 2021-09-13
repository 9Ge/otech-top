package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpHeaderCustomsDeclarationDTO extends BaseDTO {

    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String declarePlace;

    private String companyCodeScc;

    private String companyCode;

    private String companyCiqCode;

    private String companyName;

    private String useCompanyCodeScc;

    private String useCompanyCode;

    private String useCiqCode;

    private String useCompanyName;

    private String domesticConsignorCode;

    private String domesticConsignorNameCn;

    private String domesticConsignorCiqCode;

    private String domesticConsignorNameEn;
}
