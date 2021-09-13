package com.otechsolution.forex.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ForexPayment {
    private Long id;

    private Long forexId;

    private String entryNo;

    private Integer forexType;

    private Date forexDate;

    private BigDecimal amount;

    private Date verificationDate;

    private String transactionCurrency;

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

    public Integer getForexType() {
        return forexType;
    }

    public void setForexType(Integer forexType) {
        this.forexType = forexType;
    }

    public Date getForexDate() {
        return forexDate;
    }

    public void setForexDate(Date forexDate) {
        this.forexDate = forexDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency == null ? null : transactionCurrency.trim();
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