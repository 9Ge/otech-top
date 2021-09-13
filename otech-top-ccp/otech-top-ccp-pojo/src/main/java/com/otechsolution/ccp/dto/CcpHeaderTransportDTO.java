package com.otechsolution.ccp.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

@Data
public class CcpHeaderTransportDTO extends BaseDTO {
    private Long id;

    private Long clientId;

    private Long ccpHeaderId;

    private String transportMode;

    private String transportName;

    private String voyageNo;

    private String billNo;

    private String tradeCountry;

    private String departurePortCode;

    private String stopoverPort;

}