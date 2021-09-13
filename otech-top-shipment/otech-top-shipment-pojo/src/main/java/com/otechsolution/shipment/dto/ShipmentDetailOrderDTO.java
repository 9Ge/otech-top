package com.otechsolution.shipment.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class ShipmentDetailOrderDTO extends BaseDTO {
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

}
