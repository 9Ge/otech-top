package com.otechsolution.ccp.biz;

import com.otechsolution.ccp.entity.CcpDetail;
import com.otechsolution.ccp.entity.CcpDetailCalculate;
import com.otechsolution.ccp.entity.CcpHeader;
import com.otechsolution.ccp.entity.CcpHeaderPackage;
import com.otechsolution.ccp.service.CcpDetailCalculateService;
import com.otechsolution.ccp.service.CcpDetailService;
import com.otechsolution.ccp.service.CcpHeaderPackageService;
import com.otechsolution.ccp.service.CcpHeaderService;
import org.springframework.stereotype.Service;

/**
 * 报关单business
 */
@Service
public class CCPBiz {

    private final CcpHeaderService  ccpHeaderService;
    private final CcpHeaderPackageService ccpHeaderPackageService;
    private final CcpDetailService ccpDetailService;
    private final CcpDetailCalculateService ccpDetailCalculateService;

    public CCPBiz(CcpHeaderService  ccpHeaderService,
                  CcpDetailService ccpDetailService,
                  CcpHeaderPackageService ccpHeaderPackageService,
                  CcpDetailCalculateService ccpDetailCalculateService){  //待加入需要用到的Service
        this.ccpHeaderService = ccpHeaderService;
        this.ccpDetailService = ccpDetailService;
        this.ccpHeaderPackageService = ccpHeaderPackageService;
        this.ccpDetailCalculateService = ccpDetailCalculateService;
    }
}
