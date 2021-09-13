package com.otechsolution.ccp.entity;

import java.math.BigDecimal;

public class CcpDetailCalculate {
    private Long id;

    private Long ccpDetailId;

    private Long clientId;

    private BigDecimal goodsQty;

    private String goodsUnit;

    private BigDecimal firstQty;

    private String firstUnit;

    private BigDecimal secondQty;

    private String secondUnit;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCcpDetailId() {
        return ccpDetailId;
    }

    public void setCcpDetailId(Long ccpDetailId) {
        this.ccpDetailId = ccpDetailId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public BigDecimal getGoodsQty() {
        return goodsQty;
    }

    public void setGoodsQty(BigDecimal goodsQty) {
        this.goodsQty = goodsQty;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    public BigDecimal getFirstQty() {
        return firstQty;
    }

    public void setFirstQty(BigDecimal firstQty) {
        this.firstQty = firstQty;
    }

    public String getFirstUnit() {
        return firstUnit;
    }

    public void setFirstUnit(String firstUnit) {
        this.firstUnit = firstUnit == null ? null : firstUnit.trim();
    }

    public BigDecimal getSecondQty() {
        return secondQty;
    }

    public void setSecondQty(BigDecimal secondQty) {
        this.secondQty = secondQty;
    }

    public String getSecondUnit() {
        return secondUnit;
    }

    public void setSecondUnit(String secondUnit) {
        this.secondUnit = secondUnit == null ? null : secondUnit.trim();
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }
}