package com.otechsolution.out.entity.integration;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * PRE_WH_MOVE_HEADER
 *
 * @author
 */
@Data
public class PreWhMoveHeader implements Serializable {
    private String preWhMoveId;
    private Integer preWhMoveType;
    private String whMoveId;
    private String stockType;
    private String billType;
    private String tradeCode;
    private String tradeName;
    private String tradeSccd;
    private String masterCuscd;
    private String billNo;
    private String shipNameEn;
    private String voyageNo;
    private BigDecimal grossWt;
    private String trafMode;
    private String businessType;
    private String classifyType;
    private String supvMode;
    private String iEPort;
    private String transMode;
    private String stshipTrsarvCode;
    private String tradeCountryCode;
    private String districtCode;
    private String destinationCode;
    private String stockDate;
    private String rltEntryNo;
    private String whNo;
    private String whLoc;
    private String orderNo;
    private String ownerName;
    private String col1;
    private String col2;
    private String col3;
    private String col4;
    private String rmk;
    private String capxaction;
    private String lastupdateddt;
}