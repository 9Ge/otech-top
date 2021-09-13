package com.otechsolution.inventory.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvHeaderExtend {
    private Long id;

    private Long clientId;

    private Long invHeaderId;

    private Date preVerifyDeductionTime;

    private String verifyDeductionMode;

    private String verifyDeductionFlag;

    private Date verifyDeductionTime;

    private String checkComputationCode;

    private String declarerIcCardNo;

    private String listState;

    private BigDecimal modifyNumber;

    private String declarationStatus;

    private String passportUsedTypeCode;

    private String declareType;

    private String needEntryModified;

    private String levyAmount;

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

    public Long getInvHeaderId() {
        return invHeaderId;
    }

    public void setInvHeaderId(Long invHeaderId) {
        this.invHeaderId = invHeaderId;
    }

    public Date getPreVerifyDeductionTime() {
        return preVerifyDeductionTime;
    }

    public void setPreVerifyDeductionTime(Date preVerifyDeductionTime) {
        this.preVerifyDeductionTime = preVerifyDeductionTime;
    }

    public String getVerifyDeductionMode() {
        return verifyDeductionMode;
    }

    public void setVerifyDeductionMode(String verifyDeductionMode) {
        this.verifyDeductionMode = verifyDeductionMode == null ? null : verifyDeductionMode.trim();
    }

    public String getVerifyDeductionFlag() {
        return verifyDeductionFlag;
    }

    public void setVerifyDeductionFlag(String verifyDeductionFlag) {
        this.verifyDeductionFlag = verifyDeductionFlag == null ? null : verifyDeductionFlag.trim();
    }

    public Date getVerifyDeductionTime() {
        return verifyDeductionTime;
    }

    public void setVerifyDeductionTime(Date verifyDeductionTime) {
        this.verifyDeductionTime = verifyDeductionTime;
    }

    public String getCheckComputationCode() {
        return checkComputationCode;
    }

    public void setCheckComputationCode(String checkComputationCode) {
        this.checkComputationCode = checkComputationCode == null ? null : checkComputationCode.trim();
    }

    public String getDeclarerIcCardNo() {
        return declarerIcCardNo;
    }

    public void setDeclarerIcCardNo(String declarerIcCardNo) {
        this.declarerIcCardNo = declarerIcCardNo == null ? null : declarerIcCardNo.trim();
    }

    public String getListState() {
        return listState;
    }

    public void setListState(String listState) {
        this.listState = listState == null ? null : listState.trim();
    }

    public BigDecimal getModifyNumber() {
        return modifyNumber;
    }

    public void setModifyNumber(BigDecimal modifyNumber) {
        this.modifyNumber = modifyNumber;
    }

    public String getDeclarationStatus() {
        return declarationStatus;
    }

    public void setDeclarationStatus(String declarationStatus) {
        this.declarationStatus = declarationStatus == null ? null : declarationStatus.trim();
    }

    public String getPassportUsedTypeCode() {
        return passportUsedTypeCode;
    }

    public void setPassportUsedTypeCode(String passportUsedTypeCode) {
        this.passportUsedTypeCode = passportUsedTypeCode == null ? null : passportUsedTypeCode.trim();
    }

    public String getDeclareType() {
        return declareType;
    }

    public void setDeclareType(String declareType) {
        this.declareType = declareType == null ? null : declareType.trim();
    }

    public String getNeedEntryModified() {
        return needEntryModified;
    }

    public void setNeedEntryModified(String needEntryModified) {
        this.needEntryModified = needEntryModified == null ? null : needEntryModified.trim();
    }

    public String getLevyAmount() {
        return levyAmount;
    }

    public void setLevyAmount(String levyAmount) {
        this.levyAmount = levyAmount == null ? null : levyAmount.trim();
    }
}