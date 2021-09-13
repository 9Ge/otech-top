package com.otechsolution.shipment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.shipment.entity.ShipmentHeaderFee;
import com.otechsolution.shipment.mapper.ShipmentHeaderFeeMapper;
import com.otechsolution.shipment.service.ShipmentHeaderFeeService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentHeaderFeeServiceImpl extends ServiceImpl<ShipmentHeaderFeeMapper, ShipmentHeaderFee> implements ShipmentHeaderFeeService {
}
