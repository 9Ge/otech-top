package com.otechsolution.shipment.entity;

import java.util.Date;

public class ShipmentDetailOrder {
    private Long id;

    private Long clientId;

    private Long shipmentDetailId;

    private String salesOrderNo;

    private String salesOrderSeqNo;

    private String containerNo;

    private String deliveryNo;

    private String buyerName;

    private Long consignorUserId;

    private String orderNo;

    private String orderSeqNo;

    private String invoiceSeqNo;

    private String invoiceNo;

    private Date invoiceDate;

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

    public Long getShipmentDetailId() {
        return shipmentDetailId;
    }

    public void setShipmentDetailId(Long shipmentDetailId) {
        this.shipmentDetailId = shipmentDetailId;
    }

    public String getSalesOrderNo() {
        return salesOrderNo;
    }

    public void setSalesOrderNo(String salesOrderNo) {
        this.salesOrderNo = salesOrderNo == null ? null : salesOrderNo.trim();
    }

    public String getSalesOrderSeqNo() {
        return salesOrderSeqNo;
    }

    public void setSalesOrderSeqNo(String salesOrderSeqNo) {
        this.salesOrderSeqNo = salesOrderSeqNo == null ? null : salesOrderSeqNo.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo == null ? null : deliveryNo.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public Long getConsignorUserId() {
        return consignorUserId;
    }

    public void setConsignorUserId(Long consignorUserId) {
        this.consignorUserId = consignorUserId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderSeqNo() {
        return orderSeqNo;
    }

    public void setOrderSeqNo(String orderSeqNo) {
        this.orderSeqNo = orderSeqNo == null ? null : orderSeqNo.trim();
    }

    public String getInvoiceSeqNo() {
        return invoiceSeqNo;
    }

    public void setInvoiceSeqNo(String invoiceSeqNo) {
        this.invoiceSeqNo = invoiceSeqNo == null ? null : invoiceSeqNo.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}