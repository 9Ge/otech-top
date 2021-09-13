package com.otechsolution.forex.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DeclarationDocument {
    private Long id;

    private Long forexId;

    private String entryNo;

    private Byte paymentStatus;

    private String tradeMode;

    private String importDate;

    private BigDecimal paidAmountForex;

    private BigDecimal unpaidAmountForex;

    private String planPaymentDate;

    private BigDecimal totalAmount;

    private String transactionCurrency;

    private Integer needForex;

    private Integer status;

    private String remark;

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

    public Long getForexId() {
        return forexId;
    }

    public void setForexId(Long forexId) {
        this.forexId = forexId;
    }

    public String getEntryNo() {
        return entryNo;
    }

    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo == null ? null : entryNo.trim();
    }

    public Byte getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Byte paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode == null ? null : tradeMode.trim();
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate == null ? null : importDate.trim();
    }

    public BigDecimal getPaidAmountForex() {
        return paidAmountForex;
    }

    public void setPaidAmountForex(BigDecimal paidAmountForex) {
        this.paidAmountForex = paidAmountForex;
    }

    public BigDecimal getUnpaidAmountForex() {
        return unpaidAmountForex;
    }

    public void setUnpaidAmountForex(BigDecimal unpaidAmountForex) {
        this.unpaidAmountForex = unpaidAmountForex;
    }

    public String getPlanPaymentDate() {
        return planPaymentDate;
    }

    public void setPlanPaymentDate(String planPaymentDate) {
        this.planPaymentDate = planPaymentDate == null ? null : planPaymentDate.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency == null ? null : transactionCurrency.trim();
    }

    public Integer getNeedForex() {
        return needForex;
    }

    public void setNeedForex(Integer needForex) {
        this.needForex = needForex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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