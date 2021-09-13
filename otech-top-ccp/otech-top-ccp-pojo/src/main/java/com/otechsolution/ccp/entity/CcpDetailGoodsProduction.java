package com.otechsolution.ccp.entity;

public class CcpDetailGoodsProduction {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private String goodsModel;

    private String goodsBrand;

    private String producerDate;

    private String producerBatchNo;

    private String producerRegisterNo;

    private String productionUnitName;

    private String countryOrigin;

    private String countryOriginCode;

    private String domesticSourceGoods;

    private String destinationCode;

    private String finalDestination;

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

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel == null ? null : goodsModel.trim();
    }

    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand == null ? null : goodsBrand.trim();
    }

    public String getProducerDate() {
        return producerDate;
    }

    public void setProducerDate(String producerDate) {
        this.producerDate = producerDate == null ? null : producerDate.trim();
    }

    public String getProducerBatchNo() {
        return producerBatchNo;
    }

    public void setProducerBatchNo(String producerBatchNo) {
        this.producerBatchNo = producerBatchNo == null ? null : producerBatchNo.trim();
    }

    public String getProducerRegisterNo() {
        return producerRegisterNo;
    }

    public void setProducerRegisterNo(String producerRegisterNo) {
        this.producerRegisterNo = producerRegisterNo == null ? null : producerRegisterNo.trim();
    }

    public String getProductionUnitName() {
        return productionUnitName;
    }

    public void setProductionUnitName(String productionUnitName) {
        this.productionUnitName = productionUnitName == null ? null : productionUnitName.trim();
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin == null ? null : countryOrigin.trim();
    }

    public String getCountryOriginCode() {
        return countryOriginCode;
    }

    public void setCountryOriginCode(String countryOriginCode) {
        this.countryOriginCode = countryOriginCode == null ? null : countryOriginCode.trim();
    }

    public String getDomesticSourceGoods() {
        return domesticSourceGoods;
    }

    public void setDomesticSourceGoods(String domesticSourceGoods) {
        this.domesticSourceGoods = domesticSourceGoods == null ? null : domesticSourceGoods.trim();
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode == null ? null : destinationCode.trim();
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination == null ? null : finalDestination.trim();
    }
}