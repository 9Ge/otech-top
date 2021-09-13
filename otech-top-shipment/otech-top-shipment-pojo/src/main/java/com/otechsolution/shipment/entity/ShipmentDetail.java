package com.otechsolution.shipment.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ShipmentDetail {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String serialNumber;

    private String partNumber;

    private String customer;

    private String goodsNo;

    private String goodsName;

    private String goodsNameEn;

    private String goodsModel;

    private String ciqCode;

    private String ciqName;

    private String currency;

    private BigDecimal declarePrice;

    private BigDecimal declareTotalPrice;

    private String workUsd;

    private String exgVersion;

    private Integer seqNo;

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

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber == null ? null : partNumber.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
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

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel == null ? null : goodsModel.trim();
    }

    public String getCiqCode() {
        return ciqCode;
    }

    public void setCiqCode(String ciqCode) {
        this.ciqCode = ciqCode == null ? null : ciqCode.trim();
    }

    public String getCiqName() {
        return ciqName;
    }

    public void setCiqName(String ciqName) {
        this.ciqName = ciqName == null ? null : ciqName.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
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

    public String getWorkUsd() {
        return workUsd;
    }

    public void setWorkUsd(String workUsd) {
        this.workUsd = workUsd == null ? null : workUsd.trim();
    }

    public String getExgVersion() {
        return exgVersion;
    }

    public void setExgVersion(String exgVersion) {
        this.exgVersion = exgVersion == null ? null : exgVersion.trim();
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
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