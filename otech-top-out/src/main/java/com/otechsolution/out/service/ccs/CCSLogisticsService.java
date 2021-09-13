package com.otechsolution.out.service.ccs;

import com.otechsolution.out.entity.ccs.CCSLogistics;
import com.otechsolution.web.result.ApiResult;

import java.util.List;

/**
  * @Date 2021/1/27 15:16
 * @ClassName: CCSLogisticsService
 * @Author: YANGCHENG.
 * @Version:1.0
 */
public interface CCSLogisticsService {

    ApiResult saveEntity(List<CCSLogistics> ccsLogistics);

}
