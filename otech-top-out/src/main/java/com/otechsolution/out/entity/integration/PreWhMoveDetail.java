package com.otechsolution.out.entity.integration;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * PRE_WH_MOVE_DETAIL
 *
 * @author
 */
@Data
public class PreWhMoveDetail implements Serializable {
    private String preWhMoveId;
    private String preWhMoveDetailSeq;
    private String entryGdsSeqno;
    private String copGNo;
    private String hsCode;
    private String ciqCode;
    private String gName;
    private String gModel;
    private BigDecimal qty;
    private String gUnit;
    private BigDecimal unitPrice;
    private BigDecimal tradeTotal;
    private String tradeCurr;
    private BigDecimal qty1;
    private String unit1;
    private BigDecimal qty2;
    private String unit2;
    private String originCountryCode;
    private BigDecimal netWt;
    private BigDecimal grossWt;
    private String whNo;
    private String whLoc;
    private String capxaction;
}