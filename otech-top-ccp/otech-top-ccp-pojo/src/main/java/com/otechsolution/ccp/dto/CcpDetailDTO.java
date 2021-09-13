package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CcpDetailDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String partNo;

    private String goodsNo;

    private String goodsName;

    private String goodsNameEn;

    private String ciqCode;

    private String quarantineName;

    private String exgVersion;

    private String exgNo;

    private Integer seqNo;

    private String goodsModel;

    private BigDecimal workUsd;

    private String tradeCurrency;

    private BigDecimal declarePrice;

    private BigDecimal declareTotalPrice;

    private String dutyMode;

    private String manufacturer;

    private BigDecimal dutiablePrice;

    private BigDecimal exchangeRate;
}
