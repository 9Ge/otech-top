package com.otechsolution.inventory.entity;

import java.util.Date;

public class InvHeaderCompany {
    private Long id;

    private Long clientId;

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

    public Long getInvHeaderId() {
        return invHeaderId;
    }

    public void setInvHeaderId(Long invHeaderId) {
        this.invHeaderId = invHeaderId;
    }

    public String getInputCompanyCode() {
        return inputCompanyCode;
    }

    public void setInputCompanyCode(String inputCompanyCode) {
        this.inputCompanyCode = inputCompanyCode == null ? null : inputCompanyCode.trim();
    }

    public String getInputCompanyName() {
        return inputCompanyName;
    }

    public void setInputCompanyName(String inputCompanyName) {
        this.inputCompanyName = inputCompanyName == null ? null : inputCompanyName.trim();
    }

    public String getInputCompanyCodeScc() {
        return inputCompanyCodeScc;
    }

    public void setInputCompanyCodeScc(String inputCompanyCodeScc) {
        this.inputCompanyCodeScc = inputCompanyCodeScc == null ? null : inputCompanyCodeScc.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getDeclareCompanyCodeScc() {
        return declareCompanyCodeScc;
    }

    public void setDeclareCompanyCodeScc(String declareCompanyCodeScc) {
        this.declareCompanyCodeScc = declareCompanyCodeScc == null ? null : declareCompanyCodeScc.trim();
    }

    public String getDeclareCompanyCode() {
        return declareCompanyCode;
    }

    public void setDeclareCompanyCode(String declareCompanyCode) {
        this.declareCompanyCode = declareCompanyCode == null ? null : declareCompanyCode.trim();
    }

    public String getDeclareCompanyName() {
        return declareCompanyName;
    }

    public void setDeclareCompanyName(String declareCompanyName) {
        this.declareCompanyName = declareCompanyName == null ? null : declareCompanyName.trim();
    }

    public String getCcpEntryId() {
        return ccpEntryId;
    }

    public void setCcpEntryId(String ccpEntryId) {
        this.ccpEntryId = ccpEntryId == null ? null : ccpEntryId.trim();
    }

    public String getCcpCurrDeclareCompanyCode() {
        return ccpCurrDeclareCompanyCode;
    }

    public void setCcpCurrDeclareCompanyCode(String ccpCurrDeclareCompanyCode) {
        this.ccpCurrDeclareCompanyCode = ccpCurrDeclareCompanyCode == null ? null : ccpCurrDeclareCompanyCode.trim();
    }

    public String getCcpCurrDeclareCompanyCodeScc() {
        return ccpCurrDeclareCompanyCodeScc;
    }

    public void setCcpCurrDeclareCompanyCodeScc(String ccpCurrDeclareCompanyCodeScc) {
        this.ccpCurrDeclareCompanyCodeScc = ccpCurrDeclareCompanyCodeScc == null ? null : ccpCurrDeclareCompanyCodeScc.trim();
    }

    public String getCcpCurrDeclareCompanyName() {
        return ccpCurrDeclareCompanyName;
    }

    public void setCcpCurrDeclareCompanyName(String ccpCurrDeclareCompanyName) {
        this.ccpCurrDeclareCompanyName = ccpCurrDeclareCompanyName == null ? null : ccpCurrDeclareCompanyName.trim();
    }

    public String getCcpOrgCode() {
        return ccpOrgCode;
    }

    public void setCcpOrgCode(String ccpOrgCode) {
        this.ccpOrgCode = ccpOrgCode == null ? null : ccpOrgCode.trim();
    }

    public String getCcpOrgName() {
        return ccpOrgName;
    }

    public void setCcpOrgName(String ccpOrgName) {
        this.ccpOrgName = ccpOrgName == null ? null : ccpOrgName.trim();
    }

    public String getCcpOrgCodeScc() {
        return ccpOrgCodeScc;
    }

    public void setCcpOrgCodeScc(String ccpOrgCodeScc) {
        this.ccpOrgCodeScc = ccpOrgCodeScc == null ? null : ccpOrgCodeScc.trim();
    }

    public String getCcpDeclareCompanyCode() {
        return ccpDeclareCompanyCode;
    }

    public void setCcpDeclareCompanyCode(String ccpDeclareCompanyCode) {
        this.ccpDeclareCompanyCode = ccpDeclareCompanyCode == null ? null : ccpDeclareCompanyCode.trim();
    }

    public String getCcpDeclareCompanyName() {
        return ccpDeclareCompanyName;
    }

    public void setCcpDeclareCompanyName(String ccpDeclareCompanyName) {
        this.ccpDeclareCompanyName = ccpDeclareCompanyName == null ? null : ccpDeclareCompanyName.trim();
    }

    public String getCcpDeclareCompanyCodeScc() {
        return ccpDeclareCompanyCodeScc;
    }

    public void setCcpDeclareCompanyCodeScc(String ccpDeclareCompanyCodeScc) {
        this.ccpDeclareCompanyCodeScc = ccpDeclareCompanyCodeScc == null ? null : ccpDeclareCompanyCodeScc.trim();
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

    public String getCcpDomesticConsignorCodeScc() {
        return ccpDomesticConsignorCodeScc;
    }

    public void setCcpDomesticConsignorCodeScc(String ccpDomesticConsignorCodeScc) {
        this.ccpDomesticConsignorCodeScc = ccpDomesticConsignorCodeScc == null ? null : ccpDomesticConsignorCodeScc.trim();
    }

    public String getCcpDomesticConsignorCode() {
        return ccpDomesticConsignorCode;
    }

    public void setCcpDomesticConsignorCode(String ccpDomesticConsignorCode) {
        this.ccpDomesticConsignorCode = ccpDomesticConsignorCode == null ? null : ccpDomesticConsignorCode.trim();
    }

    public String getCcpDomesticConsignorName() {
        return ccpDomesticConsignorName;
    }

    public void setCcpDomesticConsignorName(String ccpDomesticConsignorName) {
        this.ccpDomesticConsignorName = ccpDomesticConsignorName == null ? null : ccpDomesticConsignorName.trim();
    }

    public String getUseCompanyCode() {
        return useCompanyCode;
    }

    public void setUseCompanyCode(String useCompanyCode) {
        this.useCompanyCode = useCompanyCode == null ? null : useCompanyCode.trim();
    }

    public String getUseCompanyCodeScc() {
        return useCompanyCodeScc;
    }

    public void setUseCompanyCodeScc(String useCompanyCodeScc) {
        this.useCompanyCodeScc = useCompanyCodeScc == null ? null : useCompanyCodeScc.trim();
    }

    public String getUseCompanyCodeName() {
        return useCompanyCodeName;
    }

    public void setUseCompanyCodeName(String useCompanyCodeName) {
        this.useCompanyCodeName = useCompanyCodeName == null ? null : useCompanyCodeName.trim();
    }
}