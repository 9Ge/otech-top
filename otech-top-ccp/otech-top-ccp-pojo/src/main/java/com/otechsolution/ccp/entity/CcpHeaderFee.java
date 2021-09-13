package com.otechsolution.ccp.entity;

import java.math.BigDecimal;

public class CcpHeaderFee {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String paymentTerms;

    private String transMode;

    private String feeCurrency;

    private String feeMark;

    private BigDecimal feeRate;

    private String insuranceCurrency;

    private String insuranceMark;

    private BigDecimal insuranceRate;

    private String otherCurrency;

    private String otherFlag;

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

    public Long getCcpHeaderId() {
        return ccpHeaderId;
    }

    public void setCcpHeaderId(Long ccpHeaderId) {
        this.ccpHeaderId = ccpHeaderId;
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

    public String getOtherFlag() {
        return otherFlag;
    }

    public void setOtherFlag(String otherFlag) {
        this.otherFlag = otherFlag == null ? null : otherFlag.trim();
    }

    public BigDecimal getOtherRate() {
        return otherRate;
    }

    public void setOtherRate(BigDecimal otherRate) {
        this.otherRate = otherRate;
    }
}