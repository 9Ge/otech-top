package com.otechsolution.ccp.entity;

import java.math.BigDecimal;

public class CcpDetailQuarantineInfo {
    private Long id;

    private Long ccpDetailId;

    private Long clientId;

    private String useCode;

    private String goodsAttrCode;

    private String ciqGoodsSpec;

    private String classFlag;

    private BigDecimal factor;

    private String goodsNameEn;

    private String productExpirationDate;

    private String productPeriod;

    private String ingredients;

    private String unCode;

    private String dangerousGoodsName;

    private String dangerousPackType;

    private String dangerousPackSpec;

    private String overseasProducerCompanyName;

    private String nonHazardousChemicals;

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

    public String getUseCode() {
        return useCode;
    }

    public void setUseCode(String useCode) {
        this.useCode = useCode == null ? null : useCode.trim();
    }

    public String getGoodsAttrCode() {
        return goodsAttrCode;
    }

    public void setGoodsAttrCode(String goodsAttrCode) {
        this.goodsAttrCode = goodsAttrCode == null ? null : goodsAttrCode.trim();
    }

    public String getCiqGoodsSpec() {
        return ciqGoodsSpec;
    }

    public void setCiqGoodsSpec(String ciqGoodsSpec) {
        this.ciqGoodsSpec = ciqGoodsSpec == null ? null : ciqGoodsSpec.trim();
    }

    public String getClassFlag() {
        return classFlag;
    }

    public void setClassFlag(String classFlag) {
        this.classFlag = classFlag == null ? null : classFlag.trim();
    }

    public BigDecimal getFactor() {
        return factor;
    }

    public void setFactor(BigDecimal factor) {
        this.factor = factor;
    }

    public String getGoodsNameEn() {
        return goodsNameEn;
    }

    public void setGoodsNameEn(String goodsNameEn) {
        this.goodsNameEn = goodsNameEn == null ? null : goodsNameEn.trim();
    }

    public String getProductExpirationDate() {
        return productExpirationDate;
    }

    public void setProductExpirationDate(String productExpirationDate) {
        this.productExpirationDate = productExpirationDate == null ? null : productExpirationDate.trim();
    }

    public String getProductPeriod() {
        return productPeriod;
    }

    public void setProductPeriod(String productPeriod) {
        this.productPeriod = productPeriod == null ? null : productPeriod.trim();
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients == null ? null : ingredients.trim();
    }

    public String getUnCode() {
        return unCode;
    }

    public void setUnCode(String unCode) {
        this.unCode = unCode == null ? null : unCode.trim();
    }

    public String getDangerousGoodsName() {
        return dangerousGoodsName;
    }

    public void setDangerousGoodsName(String dangerousGoodsName) {
        this.dangerousGoodsName = dangerousGoodsName == null ? null : dangerousGoodsName.trim();
    }

    public String getDangerousPackType() {
        return dangerousPackType;
    }

    public void setDangerousPackType(String dangerousPackType) {
        this.dangerousPackType = dangerousPackType == null ? null : dangerousPackType.trim();
    }

    public String getDangerousPackSpec() {
        return dangerousPackSpec;
    }

    public void setDangerousPackSpec(String dangerousPackSpec) {
        this.dangerousPackSpec = dangerousPackSpec == null ? null : dangerousPackSpec.trim();
    }

    public String getOverseasProducerCompanyName() {
        return overseasProducerCompanyName;
    }

    public void setOverseasProducerCompanyName(String overseasProducerCompanyName) {
        this.overseasProducerCompanyName = overseasProducerCompanyName == null ? null : overseasProducerCompanyName.trim();
    }

    public String getNonHazardousChemicals() {
        return nonHazardousChemicals;
    }

    public void setNonHazardousChemicals(String nonHazardousChemicals) {
        this.nonHazardousChemicals = nonHazardousChemicals == null ? null : nonHazardousChemicals.trim();
    }
}