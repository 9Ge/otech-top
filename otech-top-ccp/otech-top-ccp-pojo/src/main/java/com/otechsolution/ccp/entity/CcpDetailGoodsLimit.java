package com.otechsolution.ccp.entity;

import java.util.Date;

public class CcpDetailGoodsLimit {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private Integer ccpDetailSeqNo;

    private Integer seqNo;

    private Integer goodsSeq;

    private String licenseTypeCode;

    private String licenceNo;

    private String licenseWrtofDetailNo;

    private String licenseWriteOffQty;

    private String licenseWriteOffQtyUnit;

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

    public Integer getCcpDetailSeqNo() {
        return ccpDetailSeqNo;
    }

    public void setCcpDetailSeqNo(Integer ccpDetailSeqNo) {
        this.ccpDetailSeqNo = ccpDetailSeqNo;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public Integer getGoodsSeq() {
        return goodsSeq;
    }

    public void setGoodsSeq(Integer goodsSeq) {
        this.goodsSeq = goodsSeq;
    }

    public String getLicenseTypeCode() {
        return licenseTypeCode;
    }

    public void setLicenseTypeCode(String licenseTypeCode) {
        this.licenseTypeCode = licenseTypeCode == null ? null : licenseTypeCode.trim();
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo == null ? null : licenceNo.trim();
    }

    public String getLicenseWrtofDetailNo() {
        return licenseWrtofDetailNo;
    }

    public void setLicenseWrtofDetailNo(String licenseWrtofDetailNo) {
        this.licenseWrtofDetailNo = licenseWrtofDetailNo == null ? null : licenseWrtofDetailNo.trim();
    }

    public String getLicenseWriteOffQty() {
        return licenseWriteOffQty;
    }

    public void setLicenseWriteOffQty(String licenseWriteOffQty) {
        this.licenseWriteOffQty = licenseWriteOffQty == null ? null : licenseWriteOffQty.trim();
    }

    public String getLicenseWriteOffQtyUnit() {
        return licenseWriteOffQtyUnit;
    }

    public void setLicenseWriteOffQtyUnit(String licenseWriteOffQtyUnit) {
        this.licenseWriteOffQtyUnit = licenseWriteOffQtyUnit == null ? null : licenseWriteOffQtyUnit.trim();
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