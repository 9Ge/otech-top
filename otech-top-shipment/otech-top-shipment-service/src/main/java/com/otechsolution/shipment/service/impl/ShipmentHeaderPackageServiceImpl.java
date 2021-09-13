package com.otechsolution.shipment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.shipment.entity.ShipmentHeaderPackage;
import com.otechsolution.shipment.mapper.ShipmentHeaderPackageMapper;
import com.otechsolution.shipment.service.ShipmentHeaderPackageService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentHeaderPackageServiceImpl extends ServiceImpl<ShipmentHeaderPackageMapper, ShipmentHeaderPackage> implements ShipmentHeaderPackageService {
}
