package com.otechsolution.shipment.entity;

public class ShipmentHeaderTransport {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String transportMode;

    private String transportName;

    private String voyageNo;

    private String billNo;

    private String countriesArrival;

    private String departurePortCode;

    private String stopoverPort;

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

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode == null ? null : transportMode.trim();
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName == null ? null : transportName.trim();
    }

    public String getVoyageNo() {
        return voyageNo;
    }

    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo == null ? null : voyageNo.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getCountriesArrival() {
        return countriesArrival;
    }

    public void setCountriesArrival(String countriesArrival) {
        this.countriesArrival = countriesArrival == null ? null : countriesArrival.trim();
    }

    public String getDeparturePortCode() {
        return departurePortCode;
    }

    public void setDeparturePortCode(String departurePortCode) {
        this.departurePortCode = departurePortCode == null ? null : departurePortCode.trim();
    }

    public String getStopoverPort() {
        return stopoverPort;
    }

    public void setStopoverPort(String stopoverPort) {
        this.stopoverPort = stopoverPort == null ? null : stopoverPort.trim();
    }
}