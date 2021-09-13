package com.otechsolution.ccp.entity;

public class CcpHeaderQuarantineData {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String ciqOrgCode;

    private String vsaOrgCode;

    private String portOrgCode;

    private String departureDate;

    private String blNo;

    private String destinationCiqOrgCode;

    private String relNo;

    private String relReasonFlag;

    private String originalBoxFlag;

    private String specialDeclareFlag;

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

    public String getCiqOrgCode() {
        return ciqOrgCode;
    }

    public void setCiqOrgCode(String ciqOrgCode) {
        this.ciqOrgCode = ciqOrgCode == null ? null : ciqOrgCode.trim();
    }

    public String getVsaOrgCode() {
        return vsaOrgCode;
    }

    public void setVsaOrgCode(String vsaOrgCode) {
        this.vsaOrgCode = vsaOrgCode == null ? null : vsaOrgCode.trim();
    }

    public String getPortOrgCode() {
        return portOrgCode;
    }

    public void setPortOrgCode(String portOrgCode) {
        this.portOrgCode = portOrgCode == null ? null : portOrgCode.trim();
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate == null ? null : departureDate.trim();
    }

    public String getBlNo() {
        return blNo;
    }

    public void setBlNo(String blNo) {
        this.blNo = blNo == null ? null : blNo.trim();
    }

    public String getDestinationCiqOrgCode() {
        return destinationCiqOrgCode;
    }

    public void setDestinationCiqOrgCode(String destinationCiqOrgCode) {
        this.destinationCiqOrgCode = destinationCiqOrgCode == null ? null : destinationCiqOrgCode.trim();
    }

    public String getRelNo() {
        return relNo;
    }

    public void setRelNo(String relNo) {
        this.relNo = relNo == null ? null : relNo.trim();
    }

    public String getRelReasonFlag() {
        return relReasonFlag;
    }

    public void setRelReasonFlag(String relReasonFlag) {
        this.relReasonFlag = relReasonFlag == null ? null : relReasonFlag.trim();
    }

    public String getOriginalBoxFlag() {
        return originalBoxFlag;
    }

    public void setOriginalBoxFlag(String originalBoxFlag) {
        this.originalBoxFlag = originalBoxFlag == null ? null : originalBoxFlag.trim();
    }

    public String getSpecialDeclareFlag() {
        return specialDeclareFlag;
    }

    public void setSpecialDeclareFlag(String specialDeclareFlag) {
        this.specialDeclareFlag = specialDeclareFlag == null ? null : specialDeclareFlag.trim();
    }
}