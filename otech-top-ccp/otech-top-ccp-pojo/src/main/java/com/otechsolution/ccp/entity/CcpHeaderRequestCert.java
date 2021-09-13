package com.otechsolution.ccp.entity;

import java.util.Date;

public class CcpHeaderRequestCert {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer seqNo;

    private String applyCertificateCode;

    private String applyCertificateNumber;

    private String applyCertificateCopyNumber;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Integer deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

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

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getApplyCertificateCode() {
        return applyCertificateCode;
    }

    public void setApplyCertificateCode(String applyCertificateCode) {
        this.applyCertificateCode = applyCertificateCode == null ? null : applyCertificateCode.trim();
    }

    public String getApplyCertificateNumber() {
        return applyCertificateNumber;
    }

    public void setApplyCertificateNumber(String applyCertificateNumber) {
        this.applyCertificateNumber = applyCertificateNumber == null ? null : applyCertificateNumber.trim();
    }

    public String getApplyCertificateCopyNumber() {
        return applyCertificateCopyNumber;
    }

    public void setApplyCertificateCopyNumber(String applyCertificateCopyNumber) {
        this.applyCertificateCopyNumber = applyCertificateCopyNumber == null ? null : applyCertificateCopyNumber.trim();
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
}