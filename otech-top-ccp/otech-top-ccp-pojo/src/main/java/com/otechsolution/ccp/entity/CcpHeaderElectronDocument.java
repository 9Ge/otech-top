package com.otechsolution.ccp.entity;

import java.util.Date;

public class CcpHeaderElectronDocument {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer seqNo;

    private String attachedDocNo;

    private String attachedDocType;

    private String attachedDocFormatType;

    private String attachedDocFileSize;

    private String operationNotice;

    private String attachedDocCompany;

    private String affiliatedOrgNo;

    private String signatureOrg;

    private String signatureTime;

    private String affiliatedOrgName;

    private Long basFileId;

    private String basFileName;

    private String fileName;

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

    public String getAttachedDocNo() {
        return attachedDocNo;
    }

    public void setAttachedDocNo(String attachedDocNo) {
        this.attachedDocNo = attachedDocNo == null ? null : attachedDocNo.trim();
    }

    public String getAttachedDocType() {
        return attachedDocType;
    }

    public void setAttachedDocType(String attachedDocType) {
        this.attachedDocType = attachedDocType == null ? null : attachedDocType.trim();
    }

    public String getAttachedDocFormatType() {
        return attachedDocFormatType;
    }

    public void setAttachedDocFormatType(String attachedDocFormatType) {
        this.attachedDocFormatType = attachedDocFormatType == null ? null : attachedDocFormatType.trim();
    }

    public String getAttachedDocFileSize() {
        return attachedDocFileSize;
    }

    public void setAttachedDocFileSize(String attachedDocFileSize) {
        this.attachedDocFileSize = attachedDocFileSize == null ? null : attachedDocFileSize.trim();
    }

    public String getOperationNotice() {
        return operationNotice;
    }

    public void setOperationNotice(String operationNotice) {
        this.operationNotice = operationNotice == null ? null : operationNotice.trim();
    }

    public String getAttachedDocCompany() {
        return attachedDocCompany;
    }

    public void setAttachedDocCompany(String attachedDocCompany) {
        this.attachedDocCompany = attachedDocCompany == null ? null : attachedDocCompany.trim();
    }

    public String getAffiliatedOrgNo() {
        return affiliatedOrgNo;
    }

    public void setAffiliatedOrgNo(String affiliatedOrgNo) {
        this.affiliatedOrgNo = affiliatedOrgNo == null ? null : affiliatedOrgNo.trim();
    }

    public String getSignatureOrg() {
        return signatureOrg;
    }

    public void setSignatureOrg(String signatureOrg) {
        this.signatureOrg = signatureOrg == null ? null : signatureOrg.trim();
    }

    public String getSignatureTime() {
        return signatureTime;
    }

    public void setSignatureTime(String signatureTime) {
        this.signatureTime = signatureTime == null ? null : signatureTime.trim();
    }

    public String getAffiliatedOrgName() {
        return affiliatedOrgName;
    }

    public void setAffiliatedOrgName(String affiliatedOrgName) {
        this.affiliatedOrgName = affiliatedOrgName == null ? null : affiliatedOrgName.trim();
    }

    public Long getBasFileId() {
        return basFileId;
    }

    public void setBasFileId(Long basFileId) {
        this.basFileId = basFileId;
    }

    public String getBasFileName() {
        return basFileName;
    }

    public void setBasFileName(String basFileName) {
        this.basFileName = basFileName == null ? null : basFileName.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
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