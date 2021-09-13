package com.otechsolution.forex.dto;

import com.otechsolution.forex.entity.ForeignExchange;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class ForeignExchangeDTO {
    private Long id;

    private Long clientId;

    private String customerName;

    private Long shipmentId;

    private String jobNo;

    private String internalId;

    private String billNo;

    private Integer paymentStatus;

    private Integer needForex;

    private Integer paymentType;

    private String importExportPort;

    private String importExportDate;

    private String overseasConsignorNameEn;

    private Integer status;

    private String remark;

    public ForeignExchange toEntity() {
        ForeignExchange target = new ForeignExchange();
        BeanUtils.copyProperties(this, target);
        return target;
    }
}
