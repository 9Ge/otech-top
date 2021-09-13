package com.otechsolution.out.web.controller.ccs;

import com.otechsolution.httplog.LoggerAnnotation;
import com.otechsolution.out.entity.ccs.CCSLogistics;
import com.otechsolution.out.service.ccs.CCSLogisticsService;
import com.otechsolution.out.service.httplog.ccs.CCSLogisticsHttpLogParser;
import com.otechsolution.parameters.biz.QueryParametersTablesBiz;
import com.otechsolution.parameters.constant.ParametersTablesEnum;
import com.otechsolution.parameters.dto.CCPParameterSearchParamDTO;
import com.otechsolution.web.result.ApiResult;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Date 2021/1/27 15:16
 * @ClassName: CSSBillingController
 * @Author: YANGCHENG.
 * @Version:1.0
 */

@RestController
@RequestMapping("/out")
@ResponseBody
@Validated
@Api("国药物流 CCSLogisticsController")
@Slf4j
public class CCSLogisticsController {

    @Autowired
    CCSLogisticsService ccsLogisticsService;

    @PostMapping("/itemmaster")
    @LoggerAnnotation(name = "国药物流接口", method = HttpMethod.POST, url = "/out/itemmaster", parser = CCSLogisticsHttpLogParser.class)
    public ApiResult saveCSSLogistics(@RequestBody @Valid List<CCSLogistics> ccsLogistics){
        return ccsLogisticsService.saveEntity(ccsLogistics);
    }
}
