package com.otechsolution.ccp.entity;

import java.util.Date;

public class CcpHeader {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private Integer documentType;

    private String importExportFlag;

    private String ccpJobNo;

    private Integer declareType;

    private String tradeMode;

    private Integer dataSource;

    private String reductionTaxMode;

    private String licenseNo;

    private String tradeAreaCode;

    private String billType;

    private String entryType;

    private String recordListType;

    private String departurePortCode;

    private String importPortCode;

    private String storagePlace;

    private String dataCenterUnifiedNo;

    private String prerecordedUniformNo;

    private String customsNo;

    private String importExportPort;

    private Integer handBooksId;

    private String recordNo;

    private String contractNo;

    private Date importExportDate;

    private Date declareDate;

    private Long verifierUserId;

    private Date verifierDate;

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

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public String getImportExportFlag() {
        return importExportFlag;
    }

    public void setImportExportFlag(String importExportFlag) {
        this.importExportFlag = importExportFlag == null ? null : importExportFlag.trim();
    }

    public String getCcpJobNo() {
        return ccpJobNo;
    }

    public void setCcpJobNo(String ccpJobNo) {
        this.ccpJobNo = ccpJobNo == null ? null : ccpJobNo.trim();
    }

    public Integer getDeclareType() {
        return declareType;
    }

    public void setDeclareType(Integer declareType) {
        this.declareType = declareType;
    }

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode == null ? null : tradeMode.trim();
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public String getReductionTaxMode() {
        return reductionTaxMode;
    }

    public void setReductionTaxMode(String reductionTaxMode) {
        this.reductionTaxMode = reductionTaxMode == null ? null : reductionTaxMode.trim();
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo == null ? null : licenseNo.trim();
    }

    public String getTradeAreaCode() {
        return tradeAreaCode;
    }

    public void setTradeAreaCode(String tradeAreaCode) {
        this.tradeAreaCode = tradeAreaCode == null ? null : tradeAreaCode.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType == null ? null : entryType.trim();
    }

    public String getRecordListType() {
        return recordListType;
    }

    public void setRecordListType(String recordListType) {
        this.recordListType = recordListType == null ? null : recordListType.trim();
    }

    public String getDeparturePortCode() {
        return departurePortCode;
    }

    public void setDeparturePortCode(String departurePortCode) {
        this.departurePortCode = departurePortCode == null ? null : departurePortCode.trim();
    }

    public String getImportPortCode() {
        return importPortCode;
    }

    public void setImportPortCode(String importPortCode) {
        this.importPortCode = importPortCode == null ? null : importPortCode.trim();
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace == null ? null : storagePlace.trim();
    }

    public String getDataCenterUnifiedNo() {
        return dataCenterUnifiedNo;
    }

    public void setDataCenterUnifiedNo(String dataCenterUnifiedNo) {
        this.dataCenterUnifiedNo = dataCenterUnifiedNo == null ? null : dataCenterUnifiedNo.trim();
    }

    public String getPrerecordedUniformNo() {
        return prerecordedUniformNo;
    }

    public void setPrerecordedUniformNo(String prerecordedUniformNo) {
        this.prerecordedUniformNo = prerecordedUniformNo == null ? null : prerecordedUniformNo.trim();
    }

    public String getCustomsNo() {
        return customsNo;
    }

    public void setCustomsNo(String customsNo) {
        this.customsNo = customsNo;
    }

    public String getImportExportPort() {
        return importExportPort;
    }

    public void setImportExportPort(String importExportPort) {
        this.importExportPort = importExportPort == null ? null : importExportPort.trim();
    }

    public Integer getHandBooksId() {
        return handBooksId;
    }

    public void setHandBooksId(Integer handBooksId) {
        this.handBooksId = handBooksId;
    }

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Date getImportExportDate() {
        return importExportDate;
    }

    public void setImportExportDate(Date importExportDate) {
        this.importExportDate = importExportDate;
    }

    public Date getDeclareDate() {
        return declareDate;
    }

    public void setDeclareDate(Date declareDate) {
        this.declareDate = declareDate;
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