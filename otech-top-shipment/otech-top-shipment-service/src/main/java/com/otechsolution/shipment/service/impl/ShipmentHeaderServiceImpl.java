package com.otechsolution.shipment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.shipment.entity.ShipmentHeader;
import com.otechsolution.shipment.mapper.ShipmentHeaderMapper;
import com.otechsolution.shipment.service.ShipmentHeaderService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentHeaderServiceImpl extends ServiceImpl<ShipmentHeaderMapper,ShipmentHeader> implements  ShipmentHeaderService{

}
