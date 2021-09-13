package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CcpHeaderContainerDTO extends BaseDTO {

    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private Integer seqNo;

    private String containerNo;

    private String containerSpec;

    private String goodsNo;

    private String lclFlag;

    private BigDecimal goodsContainerWeight;

    private BigDecimal deadWeight;
}
