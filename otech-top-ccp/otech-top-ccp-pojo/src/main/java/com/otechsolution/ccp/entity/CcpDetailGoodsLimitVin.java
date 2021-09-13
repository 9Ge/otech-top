package com.otechsolution.ccp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CcpDetailGoodsLimitVin {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private Integer ccpDetailSeqNo;

    private Integer seqNo;

    private Integer vinLicenceSeqNo;

    private String licenceNo;

    private String licenceTypeCode;

    private String vinSeqNo;

    private Date billDate;

    private String warrantyPeriod;

    private String engineNo;

    private String vehicleIdentificationNo;

    private String chassisNo;

    private BigDecimal invoiceNum;

    private String productName;

    private String productNameEnglish;

    private String modelEn;

    private String price;

    private String invoiceNo;

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

    public Integer getCcpDetailSeqNo() {
        return ccpDetailSeqNo;
    }

    public void setCcpDetailSeqNo(Integer ccpDetailSeqNo) {
        this.ccpDetailSeqNo = ccpDetailSeqNo;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public Integer getVinLicenceSeqNo() {
        return vinLicenceSeqNo;
    }

    public void setVinLicenceSeqNo(Integer vinLicenceSeqNo) {
        this.vinLicenceSeqNo = vinLicenceSeqNo;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo == null ? null : licenceNo.trim();
    }

    public String getLicenceTypeCode() {
        return licenceTypeCode;
    }

    public void setLicenceTypeCode(String licenceTypeCode) {
        this.licenceTypeCode = licenceTypeCode == null ? null : licenceTypeCode.trim();
    }

    public String getVinSeqNo() {
        return vinSeqNo;
    }

    public void setVinSeqNo(String vinSeqNo) {
        this.vinSeqNo = vinSeqNo == null ? null : vinSeqNo.trim();
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod == null ? null : warrantyPeriod.trim();
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo == null ? null : engineNo.trim();
    }

    public String getVehicleIdentificationNo() {
        return vehicleIdentificationNo;
    }

    public void setVehicleIdentificationNo(String vehicleIdentificationNo) {
        this.vehicleIdentificationNo = vehicleIdentificationNo == null ? null : vehicleIdentificationNo.trim();
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo == null ? null : chassisNo.trim();
    }

    public BigDecimal getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(BigDecimal invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductNameEnglish() {
        return productNameEnglish;
    }

    public void setProductNameEnglish(String productNameEnglish) {
        this.productNameEnglish = productNameEnglish == null ? null : productNameEnglish.trim();
    }

    public String getModelEn() {
        return modelEn;
    }

    public void setModelEn(String modelEn) {
        this.modelEn = modelEn == null ? null : modelEn.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
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