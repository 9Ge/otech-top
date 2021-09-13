package com.otechsolution.inventory.entity;

import java.math.BigDecimal;

public class InvDetailOther {
    private Long id;

    private Long clientId;

    private Long invDetailId;

    private Integer applyDetailId;

    private String reductionTaxMode;

    private String useCode;

    private String classifyMark;

    private String applyTableSeqNo;

    private String autoForTheRecord;

    private BigDecimal usdStatTotalAmount;

    private String isCalcInventory;

    private String modifyFlag;

    private String remark;

    private String finalDestination;

    private String countryOrigin;

    private String countryOriginCode;

    private String domesticSourceGoods;

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

    public Long getInvDetailId() {
        return invDetailId;
    }

    public void setInvDetailId(Long invDetailId) {
        this.invDetailId = invDetailId;
    }

    public Integer getApplyDetailId() {
        return applyDetailId;
    }

    public void setApplyDetailId(Integer applyDetailId) {
        this.applyDetailId = applyDetailId;
    }

    public String getReductionTaxMode() {
        return reductionTaxMode;
    }

    public void setReductionTaxMode(String reductionTaxMode) {
        this.reductionTaxMode = reductionTaxMode == null ? null : reductionTaxMode.trim();
    }

    public String getUseCode() {
        return useCode;
    }

    public void setUseCode(String useCode) {
        this.useCode = useCode == null ? null : useCode.trim();
    }

    public String getClassifyMark() {
        return classifyMark;
    }

    public void setClassifyMark(String classifyMark) {
        this.classifyMark = classifyMark == null ? null : classifyMark.trim();
    }

    public String getApplyTableSeqNo() {
        return applyTableSeqNo;
    }

    public void setApplyTableSeqNo(String applyTableSeqNo) {
        this.applyTableSeqNo = applyTableSeqNo == null ? null : applyTableSeqNo.trim();
    }

    public String getAutoForTheRecord() {
        return autoForTheRecord;
    }

    public void setAutoForTheRecord(String autoForTheRecord) {
        this.autoForTheRecord = autoForTheRecord == null ? null : autoForTheRecord.trim();
    }

    public BigDecimal getUsdStatTotalAmount() {
        return usdStatTotalAmount;
    }

    public void setUsdStatTotalAmount(BigDecimal usdStatTotalAmount) {
        this.usdStatTotalAmount = usdStatTotalAmount;
    }

    public String getIsCalcInventory() {
        return isCalcInventory;
    }

    public void setIsCalcInventory(String isCalcInventory) {
        this.isCalcInventory = isCalcInventory == null ? null : isCalcInventory.trim();
    }

    public String getModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(String modifyFlag) {
        this.modifyFlag = modifyFlag == null ? null : modifyFlag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination == null ? null : finalDestination.trim();
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin == null ? null : countryOrigin.trim();
    }

    public String getCountryOriginCode() {
        return countryOriginCode;
    }

    public void setCountryOriginCode(String countryOriginCode) {
        this.countryOriginCode = countryOriginCode == null ? null : countryOriginCode.trim();
    }

    public String getDomesticSourceGoods() {
        return domesticSourceGoods;
    }

    public void setDomesticSourceGoods(String domesticSourceGoods) {
        this.domesticSourceGoods = domesticSourceGoods == null ? null : domesticSourceGoods.trim();
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode == null ? null : destinationCode.trim();
    }
}