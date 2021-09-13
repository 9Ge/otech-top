package com.otechsolution.ccp.db;

import com.otechsolution.datasource.DatabaseNameHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CcpDatabaseNameHandler implements DatabaseNameHandler {
    @Override
    public Map<String, String> dynamicDatabaseName() {
        Map<String, String> tableMap = new HashMap<>();
        tableMap.put("ccp_detail", "otech_ccp");
        tableMap.put("ccp_detail_calculate", "otech_ccp");
        tableMap.put("ccp_detail_goods_limit", "otech_ccp");
        tableMap.put("ccp_detail_goods_limit_vin", "otech_ccp");
        tableMap.put("ccp_detail_goods_production", "otech_ccp");
        tableMap.put("ccp_detail_license_relation", "otech_ccp");
        tableMap.put("ccp_detail_quarantine_info", "otech_ccp");
        tableMap.put("ccp_header", "otech_ccp");
        tableMap.put("ccp_header_container", "otech_ccp");
        tableMap.put("ccp_header_cop_limit", "otech_ccp");
        tableMap.put("ccp_header_customs_declaration", "otech_ccp");
        tableMap.put("ccp_header_electron_document", "otech_ccp");
        tableMap.put("ccp_header_extend_info", "otech_ccp");
        tableMap.put("ccp_header_fee", "otech_ccp");
        tableMap.put("ccp_header_input_data", "otech_ccp");
        tableMap.put("ccp_header_license", "otech_ccp");
        tableMap.put("ccp_header_other_package", "otech_ccp");
        tableMap.put("ccp_header_overseas_consignee", "otech_ccp");
        tableMap.put("ccp_header_package", "otech_ccp");
        tableMap.put("ccp_header_quarantine_data", "otech_ccp");
        tableMap.put("ccp_header_request_cert", "otech_ccp");
        tableMap.put("ccp_header_storage", "otech_ccp");
        tableMap.put("ccp_header_tax_header", "otech_ccp");
        tableMap.put("ccp_header_transport", "otech_ccp");
        tableMap.put("ccp_tax_detail", "otech_ccp");
        return tableMap;
    }
}
