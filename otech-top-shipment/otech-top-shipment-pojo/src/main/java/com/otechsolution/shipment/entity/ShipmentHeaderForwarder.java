package com.otechsolution.shipment.entity;

public class ShipmentHeaderForwarder {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String forwarderName;

    private String forwarderCustomsCode;

    private String forwarderCodeScc;

    private String incoterms;

    private String custommaster;

    private String contractNo;

    private Long customerId;

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

    public String getForwarderName() {
        return forwarderName;
    }

    public void setForwarderName(String forwarderName) {
        this.forwarderName = forwarderName == null ? null : forwarderName.trim();
    }

    public String getForwarderCustomsCode() {
        return forwarderCustomsCode;
    }

    public void setForwarderCustomsCode(String forwarderCustomsCode) {
        this.forwarderCustomsCode = forwarderCustomsCode == null ? null : forwarderCustomsCode.trim();
    }

    public String getForwarderCodeScc() {
        return forwarderCodeScc;
    }

    public void setForwarderCodeScc(String forwarderCodeScc) {
        this.forwarderCodeScc = forwarderCodeScc == null ? null : forwarderCodeScc.trim();
    }

    public String getIncoterms() {
        return incoterms;
    }

    public void setIncoterms(String incoterms) {
        this.incoterms = incoterms == null ? null : incoterms.trim();
    }

    public String getCustommaster() {
        return custommaster;
    }

    public void setCustommaster(String custommaster) {
        this.custommaster = custommaster == null ? null : custommaster.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}