package com.otechsolution.shipment.entity;

import java.math.BigDecimal;

public class ShipmentHeaderFee {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String paymentTerms;

    private String transMode;

    private String feeCurrency;

    private String feeMark;

    private BigDecimal feeRate;

    private String insuranceCurrency;

    private String insuranceMark;

    private BigDecimal insuranceRate;

    private String otherCurrency;

    private String otherMark;

    private BigDecimal otherRate;

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

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms == null ? null : paymentTerms.trim();
    }

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode == null ? null : transMode.trim();
    }

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency == null ? null : feeCurrency.trim();
    }

    public String getFeeMark() {
        return feeMark;
    }

    public void setFeeMark(String feeMark) {
        this.feeMark = feeMark == null ? null : feeMark.trim();
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public String getInsuranceCurrency() {
        return insuranceCurrency;
    }

    public void setInsuranceCurrency(String insuranceCurrency) {
        this.insuranceCurrency = insuranceCurrency == null ? null : insuranceCurrency.trim();
    }

    public String getInsuranceMark() {
        return insuranceMark;
    }

    public void setInsuranceMark(String insuranceMark) {
        this.insuranceMark = insuranceMark == null ? null : insuranceMark.trim();
    }

    public BigDecimal getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(BigDecimal insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public String getOtherCurrency() {
        return otherCurrency;
    }

    public void setOtherCurrency(String otherCurrency) {
        this.otherCurrency = otherCurrency == null ? null : otherCurrency.trim();
    }

    public String getOtherMark() {
        return otherMark;
    }

    public void setOtherMark(String otherMark) {
        this.otherMark = otherMark == null ? null : otherMark.trim();
    }

    public BigDecimal getOtherRate() {
        return otherRate;
    }

    public void setOtherRate(BigDecimal otherRate) {
        this.otherRate = otherRate;
    }
}