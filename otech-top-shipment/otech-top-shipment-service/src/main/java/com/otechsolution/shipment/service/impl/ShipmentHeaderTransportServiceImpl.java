package com.otechsolution.shipment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.shipment.entity.ShipmentHeaderTransport;
import com.otechsolution.shipment.mapper.ShipmentHeaderTransportMapper;
import com.otechsolution.shipment.service.ShipmentHeaderTransportService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentHeaderTransportServiceImpl extends ServiceImpl<ShipmentHeaderTransportMapper, ShipmentHeaderTransport> implements ShipmentHeaderTransportService {
}
