package com.otechsolution.ccp.entity;

public class CcpHeaderTransport {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String transportMode;

    private String transportName;

    private String voyageNo;

    private String billNo;

    private String tradeCountry;

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

    public Long getCcpHeaderId() {
        return ccpHeaderId;
    }

    public void setCcpHeaderId(Long ccpHeaderId) {
        this.ccpHeaderId = ccpHeaderId;
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

    public String getTradeCountry() {
        return tradeCountry;
    }

    public void setTradeCountry(String tradeCountry) {
        this.tradeCountry = tradeCountry == null ? null : tradeCountry.trim();
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