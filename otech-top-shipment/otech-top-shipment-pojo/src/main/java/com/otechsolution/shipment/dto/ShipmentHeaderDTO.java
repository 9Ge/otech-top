package com.otechsolution.shipment.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class ShipmentHeaderDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private String jobNo;

    private String importExportPort;

    private String importExportDate;

    private Integer importExportFlag;

    private Integer dataSource;

    private String internalId;

    private String tradeAreaCode;

    private String importPortCode;

    private String storagePlace;

    private String markNo;

    private String remark;
}
