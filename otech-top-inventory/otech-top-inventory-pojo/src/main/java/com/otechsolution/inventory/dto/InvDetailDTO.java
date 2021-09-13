package com.otechsolution.inventory.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class InvDetailDTO extends BaseDTO {
    private Long invHeaderId;
    private Integer seqNo;
    private String goodsSeqNo;
    private BigDecimal recordNo;
    private String partNumber;
    private String goodsNo;
    private String goodsName;
    private String goodsNameEn;
    private String goodsModel;
    private String exgVersion;
    private String currency;
    private BigDecimal declarePrice;
    private BigDecimal declareTotalPrice;
}