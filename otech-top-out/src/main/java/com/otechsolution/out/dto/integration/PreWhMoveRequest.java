package com.otechsolution.out.dto.integration;

import com.otechsolution.out.entity.integration.PreWhMoveDetail;
import com.otechsolution.out.entity.integration.PreWhMoveHeader;
import lombok.Data;

import java.util.List;

/**
 * 预入库（预增预减）数据接口请求对象
 * @author yuandongfei
 */
@Data
public class PreWhMoveRequest {
    private PreWhMoveHeader header;
    private List<PreWhMoveDetail> detailList;
}
