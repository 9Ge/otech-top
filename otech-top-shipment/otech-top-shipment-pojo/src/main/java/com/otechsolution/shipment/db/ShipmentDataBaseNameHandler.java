package com.otechsolution.shipment.db;

import com.otechsolution.datasource.DatabaseNameHandler;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ShipmentDataBaseNameHandler implements DatabaseNameHandler {
    public Map<String, String> dynamicDatabaseName() {
        Map<String,String> paramMap = new ConcurrentHashMap<>();
        paramMap.put("shipment_detail","otech_shipment");
        paramMap.put("shipment_detail_calculate","otech_shipment");
        paramMap.put("shipment_detail_order","otech_shipment");
        paramMap.put("shipment_header","otech_shipment");
        paramMap.put("shipment_header_company","otech_shipment");
        paramMap.put("shipment_header_consignee_consignor","otech_shipment");
        paramMap.put("shipment_header_fee","otech_shipment");
        paramMap.put("shipment_header_forwarder","otech_shipment");
        paramMap.put("shipment_header_package","otech_shipment");
        paramMap.put("shipment_header_transport","otech_shipment");
        paramMap.put("shipment_detail_other","otech_shipment");
        return paramMap;
    }
}
