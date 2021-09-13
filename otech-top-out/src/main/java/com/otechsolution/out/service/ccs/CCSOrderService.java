package com.otechsolution.out.service.ccs;

import com.otechsolution.out.dto.ccs.CCSServiceResultVO;
import com.otechsolution.out.entity.ccs.CCSOrder;
import com.otechsolution.out.properties.OtechTopOutProperties;
import com.otechsolution.out.service.ccs.handler.AbstractCCSHeaderBodyHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Date 2021/1/27 15:16
 * @ClassName: CCSLogisticsServiceImpl
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Service
@Slf4j
public class CCSOrderService extends AbstractCCSHeaderBodyHandler<CCSOrder,CCSOrder.OrderDetail> {

    @Autowired
    OtechTopOutProperties properties = null;

    @Override
    public String headerUrl() {
        return properties.getCcs().getTopUrl().getOrderHeader();
    }

    @Override
    public String bodyUrl() {
        return properties.getCcs().getTopUrl().getOrderDetail();
    }

    @Override
    public List<CCSOrder.OrderDetail> bodySetIdKey(CCSOrder order, Integer orderHeaderId) {
        List<CCSOrder.OrderDetail> orderDetails = order.getDetail();
        for (CCSOrder.OrderDetail orderDetail : orderDetails) {
            orderDetail.setOrderHeaderId(orderHeaderId);
        }
        return orderDetails;
    }
    @Override
    public Integer getHeaderId(CCSServiceResultVO headerResult) {
        LinkedHashMap data = headerResult.getData();
        Integer orderHeaderId = Integer.valueOf(String.valueOf(data.get("OrderHeaderId")));
        return orderHeaderId;
    }

}
