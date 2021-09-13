package com.otechsolution.ccp.entity;

public class CcpHeaderInputData {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getCcpHeaderId() {
        return ccpHeaderId;
    }

    public void setCcpHeaderId(Long ccpHeaderId) {
        this.ccpHeaderId = ccpHeaderId;
    }

    public String getDeclarerName() {
        return declarerName;
    }

    public void setDeclarerName(String declarerName) {
        this.declarerName = declarerName == null ? null : declarerName.trim();
    }

    public String getCompanyCodeScc() {
        return companyCodeScc;
    }

    public void setCompanyCodeScc(String companyCodeScc) {
        this.companyCodeScc = companyCodeScc == null ? null : companyCodeScc.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getInputerIcCard() {
        return inputerIcCard;
    }

    public void setInputerIcCard(String inputerIcCard) {
        this.inputerIcCard = inputerIcCard == null ? null : inputerIcCard.trim();
    }

    public String getInputerName() {
        return inputerName;
    }

    public void setInputerName(String inputerName) {
        this.inputerName = inputerName == null ? null : inputerName.trim();
    }

    public String getUseContact() {
        return useContact;
    }

    public void setUseContact(String useContact) {
        this.useContact = useContact == null ? null : useContact.trim();
    }

    public String getUseContactTel() {
        return useContactTel;
    }

    public void setUseContactTel(String useContactTel) {
        this.useContactTel = useContactTel == null ? null : useContactTel.trim();
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate == null ? null : printDate.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getDeclarationRelationshipFlag() {
        return declarationRelationshipFlag;
    }

    public void setDeclarationRelationshipFlag(String declarationRelationshipFlag) {
        this.declarationRelationshipFlag = declarationRelationshipFlag == null ? null : declarationRelationshipFlag.trim();
    }

    public String getDeclarationFlag() {
        return declarationFlag;
    }

    public void setDeclarationFlag(String declarationFlag) {
        this.declarationFlag = declarationFlag == null ? null : declarationFlag.trim();
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    public String getRiskAssessmentParam() {
        return riskAssessmentParam;
    }

    public void setRiskAssessmentParam(String riskAssessmentParam) {
        this.riskAssessmentParam = riskAssessmentParam == null ? null : riskAssessmentParam.trim();
    }

    public String getRelBillNo() {
        return relBillNo;
    }

    public void setRelBillNo(String relBillNo) {
        this.relBillNo = relBillNo == null ? null : relBillNo.trim();
    }

    public String getCheckSuretyFlag() {
        return checkSuretyFlag;
    }

    public void setCheckSuretyFlag(String checkSuretyFlag) {
        this.checkSuretyFlag = checkSuretyFlag == null ? null : checkSuretyFlag.trim();
    }

    public String getCheckFlow() {
        return checkFlow;
    }

    public void setCheckFlow(String checkFlow) {
        this.checkFlow = checkFlow == null ? null : checkFlow.trim();
    }

    public String getTaxAdministrationMark() {
        return taxAdministrationMark;
    }

    public void setTaxAdministrationMark(String taxAdministrationMark) {
        this.taxAdministrationMark = taxAdministrationMark == null ? null : taxAdministrationMark.trim();
    }

    public String getDateCompletionDischarge() {
        return dateCompletionDischarge;
    }

    public void setDateCompletionDischarge(String dateCompletionDischarge) {
        this.dateCompletionDischarge = dateCompletionDischarge == null ? null : dateCompletionDischarge.trim();
    }

    public String getEdiRemark() {
        return ediRemark;
    }

    public void setEdiRemark(String ediRemark) {
        this.ediRemark = ediRemark == null ? null : ediRemark.trim();
    }

    public String getEdiRemark2() {
        return ediRemark2;
    }

    public void setEdiRemark2(String ediRemark2) {
        this.ediRemark2 = ediRemark2 == null ? null : ediRemark2.trim();
    }
}