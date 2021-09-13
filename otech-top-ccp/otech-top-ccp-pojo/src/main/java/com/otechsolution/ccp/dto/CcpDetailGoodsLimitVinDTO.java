package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CcpDetailGoodsLimitVinDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpDetailId;

    private Integer ccpDetailSeqNo;

    private Integer seqNo;

    private Integer vinLicenceSeqNo;

    private String licenceNo;

    private String licenceTypeCode;

    private String vinSeqNo;

    private Date billDate;

    private String warrantyPeriod;

    private String engineNo;

    private String vehicleIdentificationNo;

    private String chassisNo;

    private BigDecimal invoiceNum;

    private String productName;

    private String productNameEnglish;

    private String modelEn;

    private String price;

    private String invoiceNo;
}
