package com.otechsolution.ccp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CcpTaxDetail {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private Long ccpHeaderTaxHeaderId;

    private String taxType;

    private Integer ccpDetailSeqNo;

    private String specificRateDuty;

    private BigDecimal adValoremRateDuty;

    private BigDecimal estimatedTax;

    private Integer typeProtocol;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Integer deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

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

    public Long getCcpHeaderTaxHeaderId() {
        return ccpHeaderTaxHeaderId;
    }

    public void setCcpHeaderTaxHeaderId(Long ccpHeaderTaxHeaderId) {
        this.ccpHeaderTaxHeaderId = ccpHeaderTaxHeaderId;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType == null ? null : taxType.trim();
    }

    public Integer getCcpDetailSeqNo() {
        return ccpDetailSeqNo;
    }

    public void setCcpDetailSeqNo(Integer ccpDetailSeqNo) {
        this.ccpDetailSeqNo = ccpDetailSeqNo;
    }

    public String getSpecificRateDuty() {
        return specificRateDuty;
    }

    public void setSpecificRateDuty(String specificRateDuty) {
        this.specificRateDuty = specificRateDuty == null ? null : specificRateDuty.trim();
    }

    public BigDecimal getAdValoremRateDuty() {
        return adValoremRateDuty;
    }

    public void setAdValoremRateDuty(BigDecimal adValoremRateDuty) {
        this.adValoremRateDuty = adValoremRateDuty;
    }

    public BigDecimal getEstimatedTax() {
        return estimatedTax;
    }

    public void setEstimatedTax(BigDecimal estimatedTax) {
        this.estimatedTax = estimatedTax;
    }

    public Integer getTypeProtocol() {
        return typeProtocol;
    }

    public void setTypeProtocol(Integer typeProtocol) {
        this.typeProtocol = typeProtocol;
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

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Long getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(Long deleteUserId) {
        this.deleteUserId = deleteUserId;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}