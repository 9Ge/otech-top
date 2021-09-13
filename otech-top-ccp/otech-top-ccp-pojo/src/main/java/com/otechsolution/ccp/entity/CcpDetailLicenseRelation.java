package com.otechsolution.ccp.entity;

import java.util.Date;

public class CcpDetailLicenseRelation {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private Long licenseId;

    private Integer licenseSeqNo;

    private Integer seqNo;

    private Integer declareGoodsNo;

    private Integer originCertGoodsNo;

    private String billType;

    private String billCertNo;

    private String extendFiled;

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

    public Long getCcpDetailId() {
        return ccpDetailId;
    }

    public void setCcpDetailId(Long ccpDetailId) {
        this.ccpDetailId = ccpDetailId;
    }

    public Long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
    }

    public Integer getLicenseSeqNo() {
        return licenseSeqNo;
    }

    public void setLicenseSeqNo(Integer licenseSeqNo) {
        this.licenseSeqNo = licenseSeqNo;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public Integer getDeclareGoodsNo() {
        return declareGoodsNo;
    }

    public void setDeclareGoodsNo(Integer declareGoodsNo) {
        this.declareGoodsNo = declareGoodsNo;
    }

    public Integer getOriginCertGoodsNo() {
        return originCertGoodsNo;
    }

    public void setOriginCertGoodsNo(Integer originCertGoodsNo) {
        this.originCertGoodsNo = originCertGoodsNo;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getBillCertNo() {
        return billCertNo;
    }

    public void setBillCertNo(String billCertNo) {
        this.billCertNo = billCertNo == null ? null : billCertNo.trim();
    }

    public String getExtendFiled() {
        return extendFiled;
    }

    public void setExtendFiled(String extendFiled) {
        this.extendFiled = extendFiled == null ? null : extendFiled.trim();
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