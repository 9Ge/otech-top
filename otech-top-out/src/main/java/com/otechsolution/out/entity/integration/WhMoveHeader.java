package com.otechsolution.out.entity.integration;

import lombok.Data;

import java.io.Serializable;

/**
 * WH_MOVE_HEADER
 *
 * @author
 */
@Data
public class WhMoveHeader implements Serializable {
    private String whMoveId;
    private Integer productType;
    private Integer stockBillType;
    private String stockBillNo;
    private Integer stockType;
    private Integer billType;
    private String tradeCode;
    private String tradeName;
    private String ownerName;
    private Integer businessType;
    private String declStockDate;
    private String actrualStockDate;
    private Integer billStatus;
    private String classifyType;
    private String supvMode;
    private String trafMode;
    private String iEPort;
    private String customsCode;
    private String dclcusFlag;
    private String entryNo;
    private String rltEntryNo;
    private String passTime;
    private String rltInvtNo;
    private String transitTime;
}