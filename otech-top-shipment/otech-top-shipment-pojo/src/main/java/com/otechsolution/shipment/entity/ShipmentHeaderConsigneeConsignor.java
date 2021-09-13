package com.otechsolution.shipment.entity;

public class ShipmentHeaderConsigneeConsignor {
    private Long id;

    private Long shipmentHeaderId;

    private Long clientId;

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

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
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