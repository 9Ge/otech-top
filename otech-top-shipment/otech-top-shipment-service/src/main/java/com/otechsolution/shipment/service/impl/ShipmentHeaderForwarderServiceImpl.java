package com.otechsolution.shipment.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.shipment.entity.ShipmentHeaderForwarder;
import com.otechsolution.shipment.mapper.ShipmentHeaderForwarderMapper;
import com.otechsolution.shipment.service.ShipmentHeaderForwarderService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentHeaderForwarderServiceImpl extends ServiceImpl<ShipmentHeaderForwarderMapper, ShipmentHeaderForwarder> implements ShipmentHeaderForwarderService {
}
