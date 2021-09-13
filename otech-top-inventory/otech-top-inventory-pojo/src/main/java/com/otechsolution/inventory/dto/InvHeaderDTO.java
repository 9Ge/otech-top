package com.otechsolution.inventory.dto;

import com.otechsolution.common.dto.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class InvHeaderDTO extends BaseDTO {
    private String importExportFlag;
    private String invJobNo;
    private Long shipmentHeaderId;
    private Long ccpHeaderId;
    private String listNo;
    private Integer dataSource;
    private String seqNo;
    private Integer handBooksId;
    private String tradeMode;
    private String recordNo;
    private String companyInnerListNo;
    private Date listDeclareTime;
    private String materielPackageEndProductFlag;
    private String countriesArrival;
    private String invInOutCheckState;
    private Long applyId;
    private String applyNo;
    private Integer businessId;
    private String businessStatus;
}