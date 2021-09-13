package com.otechsolution.out.entity.integration;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * INVENTORY
 *
 * @author
 */
@Data
public class Inventory implements Serializable {
    private Integer productType;
    private String copGNo;
    private BigDecimal contrItem;
    private Integer stockType;
    private String hsCode;
    private String ciqCode;
    private String gName;
    private String gModel;
    private String whNo;
    private String whLoc;
    private String originCountryCode;
    private BigDecimal qty;
    private String gUnit;
    private BigDecimal qty1;
    private String unit1;
    private BigDecimal qty2;
    private String unit2;
    private String tradeCurr;
    private BigDecimal unitPrice;
    private BigDecimal tradeTotal;
    private BigDecimal netWt;
    private BigDecimal grossWt;
    private String limitDate;
    private String stockDate;
}