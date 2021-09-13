package com.otechsolution.forex.entity;

import java.util.Date;

public class ForeignExchange {
    private Long id;

    private Long clientId;

    private String customerName;

    private Long shipmentId;

    private String jobNo;

    private String internalId;

    private String billNo;

    private Integer paymentStatus;

    private Integer needForex;

    private Integer paymentType;

    private String importExportPort;

    private String importExportDate;

    private String overseasConsignorNameEn;

    private Integer status;

    private String remark;

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo == null ? null : jobNo.trim();
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId == null ? null : internalId.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getNeedForex() {
        return needForex;
    }

    public void setNeedForex(Integer needForex) {
        this.needForex = needForex;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
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

    public String getOverseasConsignorNameEn() {
        return overseasConsignorNameEn;
    }

    public void setOverseasConsignorNameEn(String overseasConsignorNameEn) {
        this.overseasConsignorNameEn = overseasConsignorNameEn == null ? null : overseasConsignorNameEn.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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