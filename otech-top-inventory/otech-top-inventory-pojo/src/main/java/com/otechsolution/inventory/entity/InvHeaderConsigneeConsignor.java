package com.otechsolution.inventory.entity;

public class InvHeaderConsigneeConsignor {
    private Long id;

    private Long clientId;

    private Long invHeaderId;

    private String overseasConsignorCode;

    private String overseasConsignorNameCn;

    private String overseasConsignorAddress;

    private String overseasConsignorNameEn;

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

    public String getOverseasConsignorCode() {
        return overseasConsignorCode;
    }

    public void setOverseasConsignorCode(String overseasConsignorCode) {
        this.overseasConsignorCode = overseasConsignorCode == null ? null : overseasConsignorCode.trim();
    }

    public String getOverseasConsignorNameCn() {
        return overseasConsignorNameCn;
    }

    public void setOverseasConsignorNameCn(String overseasConsignorNameCn) {
        this.overseasConsignorNameCn = overseasConsignorNameCn == null ? null : overseasConsignorNameCn.trim();
    }

    public String getOverseasConsignorAddress() {
        return overseasConsignorAddress;
    }

    public void setOverseasConsignorAddress(String overseasConsignorAddress) {
        this.overseasConsignorAddress = overseasConsignorAddress == null ? null : overseasConsignorAddress.trim();
    }

    public String getOverseasConsignorNameEn() {
        return overseasConsignorNameEn;
    }

    public void setOverseasConsignorNameEn(String overseasConsignorNameEn) {
        this.overseasConsignorNameEn = overseasConsignorNameEn == null ? null : overseasConsignorNameEn.trim();
    }
}