package com.otechsolution.ccp.entity;

import java.util.Date;

public class CcpHeaderStorage {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String markNo;

    private String storage;

    private Date storageTime;

    private String storageRemark;

    private Integer approvalStatus;

    private String remark;

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

    public String getMarkNo() {
        return markNo;
    }

    public void setMarkNo(String markNo) {
        this.markNo = markNo == null ? null : markNo.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    public String getStorageRemark() {
        return storageRemark;
    }

    public void setStorageRemark(String storageRemark) {
        this.storageRemark = storageRemark == null ? null : storageRemark.trim();
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}