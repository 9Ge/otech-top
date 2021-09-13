package com.otechsolution.inventory.entity;

import java.util.Date;

public class InvHeaderDeclarationInfo {
    private Integer id;

    private Long clientId;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDeclareEntryType() {
        return declareEntryType;
    }

    public void setDeclareEntryType(String declareEntryType) {
        this.declareEntryType = declareEntryType == null ? null : declareEntryType.trim();
    }

    public String getDeclareType() {
        return declareType;
    }

    public void setDeclareType(String declareType) {
        this.declareType = declareType == null ? null : declareType.trim();
    }

    public String getDeclareFlag() {
        return declareFlag;
    }

    public void setDeclareFlag(String declareFlag) {
        this.declareFlag = declareFlag == null ? null : declareFlag.trim();
    }

    public String getBillListType() {
        return billListType;
    }

    public void setBillListType(String billListType) {
        this.billListType = billListType == null ? null : billListType.trim();
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode == null ? null : transportMode.trim();
    }

    public String getImportExportPort() {
        return importExportPort;
    }

    public void setImportExportPort(String importExportPort) {
        this.importExportPort = importExportPort == null ? null : importExportPort.trim();
    }

    public String getCustomMaster() {
        return customMaster;
    }

    public void setCustomMaster(String customMaster) {
        this.customMaster = customMaster == null ? null : customMaster.trim();
    }

    public String getRelRecordNo() {
        return relRecordNo;
    }

    public void setRelRecordNo(String relRecordNo) {
        this.relRecordNo = relRecordNo == null ? null : relRecordNo.trim();
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType == null ? null : listType.trim();
    }

    public String getRefEntryNo() {
        return refEntryNo;
    }

    public void setRefEntryNo(String refEntryNo) {
        this.refEntryNo = refEntryNo == null ? null : refEntryNo.trim();
    }

    public String getRefListNo() {
        return refListNo;
    }

    public void setRefListNo(String refListNo) {
        this.refListNo = refListNo == null ? null : refListNo.trim();
    }

    public String getRefRecordNo() {
        return refRecordNo;
    }

    public void setRefRecordNo(String refRecordNo) {
        this.refRecordNo = refRecordNo == null ? null : refRecordNo.trim();
    }

    public Date getDeclareDate() {
        return declareDate;
    }

    public void setDeclareDate(Date declareDate) {
        this.declareDate = declareDate;
    }

    public String getIsGenerateDeclareFlag() {
        return isGenerateDeclareFlag;
    }

    public void setIsGenerateDeclareFlag(String isGenerateDeclareFlag) {
        this.isGenerateDeclareFlag = isGenerateDeclareFlag == null ? null : isGenerateDeclareFlag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}