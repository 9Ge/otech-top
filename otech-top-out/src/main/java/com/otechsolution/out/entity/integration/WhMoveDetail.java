package com.otechsolution.out.entity.integration;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * WH_MOVE_DETAIL
 *
 * @author
 */
@Data
public class WhMoveDetail implements Serializable {
    private String whMoveId;
    private String billDetailSeqno;
    private String copGNo;
    private BigDecimal entryGdsSeqno;
    private String hsCode;
    private String ciqCode;
    private String gName;
    private String gModel;
    private BigDecimal qty;
    private String gUnit;
    private BigDecimal qty1;
    private String unit1;
    private BigDecimal qty2;
    private String unit2;
    private String tradeCurr;
    private BigDecimal unitPrice;
    private BigDecimal tradeTotal;
    private String transMode;
    private String originCountryCode;
    private String destinationCode;
    private String stshipTrsarvCode;
    private String tradeCountryCode;
    private String districtCode;
    private BigDecimal netWt;
    private BigDecimal grossWt;
    private String whNo;
    private String whLoc;
    private String orderNo;
    private String billNo;
    private String limitDate;
}