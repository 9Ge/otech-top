package com.otechsolution.out.web.controller.ccs;

import com.otechsolution.httplog.LoggerAnnotation;
import com.otechsolution.out.entity.ccs.CCSBilling;
import com.otechsolution.out.service.ccs.CCSBillingService;
import com.otechsolution.out.service.httplog.ccs.CCSBillingHttpLogParser;
import com.otechsolution.web.result.ApiResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *  @Date 2021/1/27 15:16
 * @ClassName: CSSBillingController
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@RestController
@RequestMapping("/out")
@ResponseBody
@Validated
@Api("国药费用 CCSLogisticsController")
public class CCSBillingController {

    @Autowired
    private CCSBillingService ccsBillingService;

    @PostMapping("/billing")
    @LoggerAnnotation(name = "国药费用接口", method = HttpMethod.POST, url = "/out/billing", parser = CCSBillingHttpLogParser.class)
    public ApiResult saveCSSLogistics(@RequestBody @Valid List<CCSBilling> ccsBillings){
        for(CCSBilling ccsBilling:ccsBillings){
            List<CCSBilling.BillingDetail> details = ccsBilling.getDetail();
            for (CCSBilling.BillingDetail detail :details){
                String status = detail.getStatus();
                if(status!= null && status.equals("5")){
                    return ccsBillingService.cancelEntity(ccsBillings);
                }
            }
        }
        return ccsBillingService.saveHeaderAndBody(ccsBillings);
    }

}
