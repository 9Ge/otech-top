package com.otechsolution.inventory.db;

import com.otechsolution.datasource.DatabaseNameHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuandongfei
 */
@Component
public class InventoryDatabaseNameHandler implements DatabaseNameHandler {
    @Override
    public Map<String, String> dynamicDatabaseName() {
        Map<String, String> tableMap = new HashMap<>();
        tableMap.put("inv_detail", "otech_inventory");
        tableMap.put("inv_detail_calculate", "otech_inventory");
        tableMap.put("inv_detail_other", "otech_inventory");
        tableMap.put("inv_header", "otech_inventory");
        tableMap.put("inv_header_company", "otech_inventory");
        tableMap.put("inv_header_consignee_consignor", "otech_inventory");
        tableMap.put("inv_header_declaration_info", "otech_inventory");
        tableMap.put("inv_header_extend", "otech_inventory");
        return tableMap;
    }
}
