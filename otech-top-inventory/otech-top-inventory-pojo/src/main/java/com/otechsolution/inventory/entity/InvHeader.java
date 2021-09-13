package com.otechsolution.inventory.entity;

import java.util.Date;

public class InvHeader {
    private Long id;

    private Long clientId;

    private String importExportFlag;

    private String invJobNo;

    private Long shipmentHeaderId;

    private Long ccpHeaderId;

    private String listNo;

    private Integer dataSource;

    private String seqNo;

    private Integer handBooksId;

    private String tradeMode;

    private String recordNo;

    private String companyInnerListNo;

    private Date listDeclareTime;

    private String materielPackageEndProductFlag;

    private String countriesArrival;

    private String invInOutCheckState;

    private Long applyId;

    private String applyNo;

    private Integer businessId;

    private String businessStatus;

    private Long operatorUserId;

    private Date operateDate;

    private Long verifierUserId;

    private Date verifierDate;

    private Integer deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

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

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getImportExportFlag() {
        return importExportFlag;
    }

    public void setImportExportFlag(String importExportFlag) {
        this.importExportFlag = importExportFlag == null ? null : importExportFlag.trim();
    }

    public String getInvJobNo() {
        return invJobNo;
    }

    public void setInvJobNo(String invJobNo) {
        this.invJobNo = invJobNo == null ? null : invJobNo.trim();
    }

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
    }

    public Long getCcpHeaderId() {
        return ccpHeaderId;
    }

    public void setCcpHeaderId(Long ccpHeaderId) {
        this.ccpHeaderId = ccpHeaderId;
    }

    public String getListNo() {
        return listNo;
    }

    public void setListNo(String listNo) {
        this.listNo = listNo == null ? null : listNo.trim();
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public Integer getHandBooksId() {
        return handBooksId;
    }

    public void setHandBooksId(Integer handBooksId) {
        this.handBooksId = handBooksId;
    }

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode == null ? null : tradeMode.trim();
    }

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo == null ? null : recordNo.trim();
    }

    public String getCompanyInnerListNo() {
        return companyInnerListNo;
    }

    public void setCompanyInnerListNo(String companyInnerListNo) {
        this.companyInnerListNo = companyInnerListNo == null ? null : companyInnerListNo.trim();
    }

    public Date getListDeclareTime() {
        return listDeclareTime;
    }

    public void setListDeclareTime(Date listDeclareTime) {
        this.listDeclareTime = listDeclareTime;
    }

    public String getMaterielPackageEndProductFlag() {
        return materielPackageEndProductFlag;
    }

    public void setMaterielPackageEndProductFlag(String materielPackageEndProductFlag) {
        this.materielPackageEndProductFlag = materielPackageEndProductFlag == null ? null : materielPackageEndProductFlag.trim();
    }

    public String getCountriesArrival() {
        return countriesArrival;
    }

    public void setCountriesArrival(String countriesArrival) {
        this.countriesArrival = countriesArrival == null ? null : countriesArrival.trim();
    }

    public String getInvInOutCheckState() {
        return invInOutCheckState;
    }

    public void setInvInOutCheckState(String invInOutCheckState) {
        this.invInOutCheckState = invInOutCheckState == null ? null : invInOutCheckState.trim();
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus == null ? null : businessStatus.trim();
    }

    public Long getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(Long operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public Long getVerifierUserId() {
        return verifierUserId;
    }

    public void setVerifierUserId(Long verifierUserId) {
        this.verifierUserId = verifierUserId;
    }

    public Date getVerifierDate() {
        return verifierDate;
    }

    public void setVerifierDate(Date verifierDate) {
        this.verifierDate = verifierDate;
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