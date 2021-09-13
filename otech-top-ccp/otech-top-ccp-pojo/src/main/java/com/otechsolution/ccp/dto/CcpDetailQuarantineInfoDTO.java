package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CcpDetailQuarantineInfoDTO extends BaseDTO {
    private Long id;

    private Long ccpDetailId;

    private Long clientId;

    private String useCode;

    private String goodsAttrCode;

    private String ciqGoodsSpec;

    private String classFlag;

    private BigDecimal factor;

    private String goodsNameEn;

    private String productExpirationDate;

    private String productPeriod;

    private String ingredients;

    private String unCode;

    private String dangerousGoodsName;

    private String dangerousPackType;

    private String dangerousPackSpec;

    private String overseasProducerCompanyName;

    private String nonHazardousChemicals;
}
