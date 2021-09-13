package com.otechsolution.ccp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CcpDetail {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String partNo;

    private String goodsNo;

    private String goodsName;

    private String goodsNameEn;

    private String ciqCode;

    private String quarantineName;

    private String exgVersion;

    private String exgNo;

    private Integer seqNo;

    private String goodsModel;

    private BigDecimal workUsd;

    private String tradeCurrency;

    private BigDecimal declarePrice;

    private BigDecimal declareTotalPrice;

    private String dutyMode;

    private String manufacturer;

    private BigDecimal dutiablePrice;

    private BigDecimal exchangeRate;

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

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo == null ? null : partNo.trim();
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsNameEn() {
        return goodsNameEn;
    }

    public void setGoodsNameEn(String goodsNameEn) {
        this.goodsNameEn = goodsNameEn == null ? null : goodsNameEn.trim();
    }

    public String getCiqCode() {
        return ciqCode;
    }

    public void setCiqCode(String ciqCode) {
        this.ciqCode = ciqCode == null ? null : ciqCode.trim();
    }

    public String getQuarantineName() {
        return quarantineName;
    }

    public void setQuarantineName(String quarantineName) {
        this.quarantineName = quarantineName == null ? null : quarantineName.trim();
    }

    public String getExgVersion() {
        return exgVersion;
    }

    public void setExgVersion(String exgVersion) {
        this.exgVersion = exgVersion == null ? null : exgVersion.trim();
    }

    public String getExgNo() {
        return exgNo;
    }

    public void setExgNo(String exgNo) {
        this.exgNo = exgNo == null ? null : exgNo.trim();
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel == null ? null : goodsModel.trim();
    }

    public BigDecimal getWorkUsd() {
        return workUsd;
    }

    public void setWorkUsd(BigDecimal workUsd) {
        this.workUsd = workUsd;
    }

    public String getTradeCurrency() {
        return tradeCurrency;
    }

    public void setTradeCurrency(String tradeCurrency) {
        this.tradeCurrency = tradeCurrency == null ? null : tradeCurrency.trim();
    }

    public BigDecimal getDeclarePrice() {
        return declarePrice;
    }

    public void setDeclarePrice(BigDecimal declarePrice) {
        this.declarePrice = declarePrice;
    }

    public BigDecimal getDeclareTotalPrice() {
        return declareTotalPrice;
    }

    public void setDeclareTotalPrice(BigDecimal declareTotalPrice) {
        this.declareTotalPrice = declareTotalPrice;
    }

    public String getDutyMode() {
        return dutyMode;
    }

    public void setDutyMode(String dutyMode) {
        this.dutyMode = dutyMode == null ? null : dutyMode.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public BigDecimal getDutiablePrice() {
        return dutiablePrice;
    }

    public void setDutiablePrice(BigDecimal dutiablePrice) {
        this.dutiablePrice = dutiablePrice;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
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