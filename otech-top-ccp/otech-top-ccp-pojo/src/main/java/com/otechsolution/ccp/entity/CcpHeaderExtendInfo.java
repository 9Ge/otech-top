package com.otechsolution.ccp.entity;

public class CcpHeaderExtendInfo {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String entryNo;

    private String relRecordNo;

    private String supervisedWearehouseNo;

    private String goodsYardCode;

    private String promiseItemsRelation;

    private String promiseItemsPriceImpact;

    private String promiseItemsRoyalty;

    private String declarationMaterialCode;

    private Integer inspectionRelated;

    private Integer licenseRelated;

    private Integer dutyRelated;

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

    public String getEntryNo() {
        return entryNo;
    }

    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo == null ? null : entryNo.trim();
    }

    public String getRelRecordNo() {
        return relRecordNo;
    }

    public void setRelRecordNo(String relRecordNo) {
        this.relRecordNo = relRecordNo == null ? null : relRecordNo.trim();
    }

    public String getSupervisedWearehouseNo() {
        return supervisedWearehouseNo;
    }

    public void setSupervisedWearehouseNo(String supervisedWearehouseNo) {
        this.supervisedWearehouseNo = supervisedWearehouseNo == null ? null : supervisedWearehouseNo.trim();
    }

    public String getGoodsYardCode() {
        return goodsYardCode;
    }

    public void setGoodsYardCode(String goodsYardCode) {
        this.goodsYardCode = goodsYardCode == null ? null : goodsYardCode.trim();
    }

    public String getPromiseItemsRelation() {
        return promiseItemsRelation;
    }

    public void setPromiseItemsRelation(String promiseItemsRelation) {
        this.promiseItemsRelation = promiseItemsRelation == null ? null : promiseItemsRelation.trim();
    }

    public String getPromiseItemsPriceImpact() {
        return promiseItemsPriceImpact;
    }

    public void setPromiseItemsPriceImpact(String promiseItemsPriceImpact) {
        this.promiseItemsPriceImpact = promiseItemsPriceImpact == null ? null : promiseItemsPriceImpact.trim();
    }

    public String getPromiseItemsRoyalty() {
        return promiseItemsRoyalty;
    }

    public void setPromiseItemsRoyalty(String promiseItemsRoyalty) {
        this.promiseItemsRoyalty = promiseItemsRoyalty == null ? null : promiseItemsRoyalty.trim();
    }

    public String getDeclarationMaterialCode() {
        return declarationMaterialCode;
    }

    public void setDeclarationMaterialCode(String declarationMaterialCode) {
        this.declarationMaterialCode = declarationMaterialCode == null ? null : declarationMaterialCode.trim();
    }

    public Integer getInspectionRelated() {
        return inspectionRelated;
    }

    public void setInspectionRelated(Integer inspectionRelated) {
        this.inspectionRelated = inspectionRelated;
    }

    public Integer getLicenseRelated() {
        return licenseRelated;
    }

    public void setLicenseRelated(Integer licenseRelated) {
        this.licenseRelated = licenseRelated;
    }

    public Integer getDutyRelated() {
        return dutyRelated;
    }

    public void setDutyRelated(Integer dutyRelated) {
        this.dutyRelated = dutyRelated;
    }
}