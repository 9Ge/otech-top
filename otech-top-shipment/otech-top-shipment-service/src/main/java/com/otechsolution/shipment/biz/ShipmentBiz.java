package com.otechsolution.shipment.biz;

import com.otechsolution.shipment.service.*;
import org.springframework.stereotype.Service;

/**
 * 原始单证business
 */
@Service
public class ShipmentBiz {
    private final ShipmentDetailCalculateService shipmentDetailCalculateService;
    private final ShipmentDetailService shipmentDetailService;
    private final ShipmentDetailOrderService shipmentDetailOrderService;
    private final ShipmentDetailOtherService shipmentDetailOtherService;
    private final ShipmentHeaderCompanyService shipmentHeaderCompanyService;
    private final ShipmentHeaderConsigneeConsignorService shipmentHeaderConsigneeConsignorService;
    private final ShipmentHeaderFeeService shipmentHeaderFeeService;
    private final ShipmentHeaderForwarderService shipmentHeaderForwarderService;
    private final ShipmentHeaderService shipmentHeaderService;
    private final ShipmentHeaderPackageService shipmentHeaderPackageService;
    private final ShipmentHeaderTransportService shipmentHeaderTransportService;

    public ShipmentBiz(ShipmentDetailCalculateService shipmentDetailCalculateService,
                       ShipmentDetailService shipmentDetailService,
                       ShipmentDetailOrderService shipmentDetailOrderService,
                       ShipmentDetailOtherService shipmentDetailOtherService,
                       ShipmentHeaderCompanyService shipmentHeaderCompanyService,
                       ShipmentHeaderConsigneeConsignorService shipmentHeaderConsigneeConsignorService,
                       ShipmentHeaderFeeService shipmentHeaderFeeService,
                       ShipmentHeaderForwarderService shipmentHeaderForwarderService,
                       ShipmentHeaderService shipmentHeaderService,
                       ShipmentHeaderPackageService shipmentHeaderPackageService,
                       ShipmentHeaderTransportService shipmentHeaderTransportService){
        this.shipmentDetailCalculateService = shipmentDetailCalculateService;
        this.shipmentDetailService = shipmentDetailService;
        this.shipmentDetailOrderService = shipmentDetailOrderService;
        this.shipmentDetailOtherService = shipmentDetailOtherService;
        this.shipmentHeaderCompanyService = shipmentHeaderCompanyService;
        this.shipmentHeaderConsigneeConsignorService = shipmentHeaderConsigneeConsignorService;
        this.shipmentHeaderFeeService = shipmentHeaderFeeService;
        this.shipmentHeaderForwarderService = shipmentHeaderForwarderService;
        this.shipmentHeaderService = shipmentHeaderService;
        this.shipmentHeaderPackageService  = shipmentHeaderPackageService;
        this.shipmentHeaderTransportService = shipmentHeaderTransportService;
    }
}
