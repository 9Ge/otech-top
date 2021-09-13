package com.otechsolution.shipment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.shipment.entity.ShipmentDetail;
import com.otechsolution.shipment.mapper.ShipmentDetailMapper;
import com.otechsolution.shipment.service.ShipmentDetailService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentDetailServiceImpl extends ServiceImpl<ShipmentDetailMapper, ShipmentDetail> implements ShipmentDetailService {

}
