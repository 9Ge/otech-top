package com.otechsolution.ccp.entity;

public class CcpHeaderCustomsDeclaration {
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

    public String getDeclarePlace() {
        return declarePlace;
    }

    public void setDeclarePlace(String declarePlace) {
        this.declarePlace = declarePlace == null ? null : declarePlace.trim();
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

    public String getCompanyCiqCode() {
        return companyCiqCode;
    }

    public void setCompanyCiqCode(String companyCiqCode) {
        this.companyCiqCode = companyCiqCode == null ? null : companyCiqCode.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getUseCompanyCodeScc() {
        return useCompanyCodeScc;
    }

    public void setUseCompanyCodeScc(String useCompanyCodeScc) {
        this.useCompanyCodeScc = useCompanyCodeScc == null ? null : useCompanyCodeScc.trim();
    }

    public String getUseCompanyCode() {
        return useCompanyCode;
    }

    public void setUseCompanyCode(String useCompanyCode) {
        this.useCompanyCode = useCompanyCode == null ? null : useCompanyCode.trim();
    }

    public String getUseCiqCode() {
        return useCiqCode;
    }

    public void setUseCiqCode(String useCiqCode) {
        this.useCiqCode = useCiqCode == null ? null : useCiqCode.trim();
    }

    public String getUseCompanyName() {
        return useCompanyName;
    }

    public void setUseCompanyName(String useCompanyName) {
        this.useCompanyName = useCompanyName == null ? null : useCompanyName.trim();
    }

    public String getDomesticConsignorCode() {
        return domesticConsignorCode;
    }

    public void setDomesticConsignorCode(String domesticConsignorCode) {
        this.domesticConsignorCode = domesticConsignorCode == null ? null : domesticConsignorCode.trim();
    }

    public String getDomesticConsignorNameCn() {
        return domesticConsignorNameCn;
    }

    public void setDomesticConsignorNameCn(String domesticConsignorNameCn) {
        this.domesticConsignorNameCn = domesticConsignorNameCn == null ? null : domesticConsignorNameCn.trim();
    }

    public String getDomesticConsignorCiqCode() {
        return domesticConsignorCiqCode;
    }

    public void setDomesticConsignorCiqCode(String domesticConsignorCiqCode) {
        this.domesticConsignorCiqCode = domesticConsignorCiqCode == null ? null : domesticConsignorCiqCode.trim();
    }

    public String getDomesticConsignorNameEn() {
        return domesticConsignorNameEn;
    }

    public void setDomesticConsignorNameEn(String domesticConsignorNameEn) {
        this.domesticConsignorNameEn = domesticConsignorNameEn == null ? null : domesticConsignorNameEn.trim();
    }
}