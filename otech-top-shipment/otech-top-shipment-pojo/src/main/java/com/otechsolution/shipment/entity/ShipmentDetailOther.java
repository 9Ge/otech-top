package com.otechsolution.shipment.entity;

public class ShipmentDetailOther {
    private Long id;

    private Long clientId;

    private Long shipmentDetailId;

    private Integer ftaAgreement;

    private String costCenter;

    private String promisitemsRelation;

    private String promisitemsPriceImpact;

    private String promisitemsRoyalty;

    private String destinationCountry;

    private String countryOrigin;

    private String origPlaceCode;

    private String countryOriginCode;

    private String destinationCode;

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

    public Long getShipmentDetailId() {
        return shipmentDetailId;
    }

    public void setShipmentDetailId(Long shipmentDetailId) {
        this.shipmentDetailId = shipmentDetailId;
    }

    public Integer getFtaAgreement() {
        return ftaAgreement;
    }

    public void setFtaAgreement(Integer ftaAgreement) {
        this.ftaAgreement = ftaAgreement;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter == null ? null : costCenter.trim();
    }

    public String getPromisitemsRelation() {
        return promisitemsRelation;
    }

    public void setPromisitemsRelation(String promisitemsRelation) {
        this.promisitemsRelation = promisitemsRelation == null ? null : promisitemsRelation.trim();
    }

    public String getPromisitemsPriceImpact() {
        return promisitemsPriceImpact;
    }

    public void setPromisitemsPriceImpact(String promisitemsPriceImpact) {
        this.promisitemsPriceImpact = promisitemsPriceImpact == null ? null : promisitemsPriceImpact.trim();
    }

    public String getPromisitemsRoyalty() {
        return promisitemsRoyalty;
    }

    public void setPromisitemsRoyalty(String promisitemsRoyalty) {
        this.promisitemsRoyalty = promisitemsRoyalty == null ? null : promisitemsRoyalty.trim();
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry == null ? null : destinationCountry.trim();
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin == null ? null : countryOrigin.trim();
    }

    public String getOrigPlaceCode() {
        return origPlaceCode;
    }

    public void setOrigPlaceCode(String origPlaceCode) {
        this.origPlaceCode = origPlaceCode == null ? null : origPlaceCode.trim();
    }

    public String getCountryOriginCode() {
        return countryOriginCode;
    }

    public void setCountryOriginCode(String countryOriginCode) {
        this.countryOriginCode = countryOriginCode == null ? null : countryOriginCode.trim();
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode == null ? null : destinationCode.trim();
    }
}