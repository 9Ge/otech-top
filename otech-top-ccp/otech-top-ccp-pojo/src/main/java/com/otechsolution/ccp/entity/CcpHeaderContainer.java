package com.otechsolution.ccp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CcpHeaderContainer {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer seqNo;

    private String containerNo;

    private String containerSpec;

    private String goodsNo;

    private String lclFlag;

    private BigDecimal goodsContainerWeight;

    private BigDecimal deadWeight;

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

    public Long getCcpHeaderId() {
        return ccpHeaderId;
    }

    public void setCcpHeaderId(Long ccpHeaderId) {
        this.ccpHeaderId = ccpHeaderId;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getContainerSpec() {
        return containerSpec;
    }

    public void setContainerSpec(String containerSpec) {
        this.containerSpec = containerSpec == null ? null : containerSpec.trim();
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getLclFlag() {
        return lclFlag;
    }

    public void setLclFlag(String lclFlag) {
        this.lclFlag = lclFlag == null ? null : lclFlag.trim();
    }

    public BigDecimal getGoodsContainerWeight() {
        return goodsContainerWeight;
    }

    public void setGoodsContainerWeight(BigDecimal goodsContainerWeight) {
        this.goodsContainerWeight = goodsContainerWeight;
    }

    public BigDecimal getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(BigDecimal deadWeight) {
        this.deadWeight = deadWeight;
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