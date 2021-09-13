package com.otechsolution.shipment.entity;

import java.util.Date;

public class ShipmentHeader {
    private Long id;

    private Long clientId;

    private String jobNo;

    private String importExportPort;

    private String importExportDate;

    private Integer importExportFlag;

    private Integer dataSource;

    private String internalId;

    private String tradeAreaCode;

    private String importPortCode;

    private String storagePlace;

    private String markNo;

    private String remark;

    private Integer deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

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

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo == null ? null : jobNo.trim();
    }

    public String getImportExportPort() {
        return importExportPort;
    }

    public void setImportExportPort(String importExportPort) {
        this.importExportPort = importExportPort == null ? null : importExportPort.trim();
    }

    public String getImportExportDate() {
        return importExportDate;
    }

    public void setImportExportDate(String importExportDate) {
        this.importExportDate = importExportDate == null ? null : importExportDate.trim();
    }

    public Integer getImportExportFlag() {
        return importExportFlag;
    }

    public void setImportExportFlag(Integer importExportFlag) {
        this.importExportFlag = importExportFlag;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId == null ? null : internalId.trim();
    }

    public String getTradeAreaCode() {
        return tradeAreaCode;
    }

    public void setTradeAreaCode(String tradeAreaCode) {
        this.tradeAreaCode = tradeAreaCode == null ? null : tradeAreaCode.trim();
    }

    public String getImportPortCode() {
        return importPortCode;
    }

    public void setImportPortCode(String importPortCode) {
        this.importPortCode = importPortCode == null ? null : importPortCode.trim();
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace == null ? null : storagePlace.trim();
    }

    public String getMarkNo() {
        return markNo;
    }

    public void setMarkNo(String markNo) {
        this.markNo = markNo == null ? null : markNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Long getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(Long deleteUserId) {
        this.deleteUserId = deleteUserId;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}