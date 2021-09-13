package com.otechsolution.shipment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.otechsolution.shipment.entity.ShipmentDetail;
import com.otechsolution.shipment.entity.ShipmentHeaderCompany;
import com.otechsolution.shipment.mapper.ShipmentDetailMapper;
import com.otechsolution.shipment.mapper.ShipmentHeaderCompanyMapper;
import com.otechsolution.shipment.service.ShipmentDetailService;
import com.otechsolution.shipment.service.ShipmentHeaderCompanyService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentHeaderCompanyServiceImpl extends ServiceImpl<ShipmentHeaderCompanyMapper, ShipmentHeaderCompany> implements ShipmentHeaderCompanyService {

}
