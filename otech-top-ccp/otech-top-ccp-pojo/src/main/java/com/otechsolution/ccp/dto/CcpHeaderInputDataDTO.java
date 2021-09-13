package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpHeaderInputDataDTO extends BaseDTO {

    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String declarerName;

    private String companyCodeScc;

    private String companyCode;

    private String companyName;

    private String inputerIcCard;

    private String inputerName;

    private String useContact;

    private String useContactTel;

    private String printDate;

    private String dataSource;

    private String approvalNumber;

    private String declarationRelationshipFlag;

    private String declarationFlag;

    private String partnerId;

    private String riskAssessmentParam;

    private String relBillNo;

    private String checkSuretyFlag;

    private String checkFlow;

    private String taxAdministrationMark;

    private String dateCompletionDischarge;

    private String ediRemark;

    private String ediRemark2;


}
