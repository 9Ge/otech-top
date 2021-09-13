package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class CcpHeaderDTO extends BaseDTO {

    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private Integer documentType;

    private String importExportFlag;

    private String ccpJobNo;

    private Integer declareType;

    private String tradeMode;

    private Integer dataSource;

    private String reductionTaxMode;

    private String licenseNo;

    private String tradeAreaCode;

    private String billType;

    private String entryType;

    private String recordListType;

    private String departurePortCode;

    private String importPortCode;

    private String storagePlace;

    private String dataCenterUnifiedNo;

    private String prerecordedUniformNo;

    private String customsNo;

    private String importExportPort;

    private Integer handBooksId;

    private String recordNo;

    private String contractNo;

    private Date importExportDate;

    private Date declareDate;

}
