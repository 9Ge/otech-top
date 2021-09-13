package com.otechsolution.inventory.entity;

import java.math.BigDecimal;

public class InvDetailCalculate {
    private Long id;

    private Long clientId;

    private Long invDetailId;

    private BigDecimal goodsQty;

    private String goodsUnit;

    private BigDecimal firstQty;

    private String firstUnit;

    private BigDecimal secondQty;

    private String secondUnit;

    private BigDecimal weightFactor;

    private BigDecimal firstFactor;

    private BigDecimal secondFactor;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;

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

    public Long getInvDetailId() {
        return invDetailId;
    }

    public void setInvDetailId(Long invDetailId) {
        this.invDetailId = invDetailId;
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

    public BigDecimal getWeightFactor() {
        return weightFactor;
    }

    public void setWeightFactor(BigDecimal weightFactor) {
        this.weightFactor = weightFactor;
    }

    public BigDecimal getFirstFactor() {
        return firstFactor;
    }

    public void setFirstFactor(BigDecimal firstFactor) {
        this.firstFactor = firstFactor;
    }

    public BigDecimal getSecondFactor() {
        return secondFactor;
    }

    public void setSecondFactor(BigDecimal secondFactor) {
        this.secondFactor = secondFactor;
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