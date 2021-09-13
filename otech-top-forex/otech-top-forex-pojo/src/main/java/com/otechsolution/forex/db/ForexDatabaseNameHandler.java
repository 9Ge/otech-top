package com.otechsolution.forex.db;

import com.otechsolution.datasource.DatabaseNameHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 外汇数据库表名称
 *
 * @author yuandongfei
 */
@Component
public class ForexDatabaseNameHandler implements DatabaseNameHandler {

    @Override
    public Map<String, String> dynamicDatabaseName() {
        Map<String, String> tableMap = new HashMap<>(4);
        tableMap.put("declaration_document", "otech_forex");
        tableMap.put("foreign_exchange", "otech_forex");
        tableMap.put("forex_payment", "otech_forex");
        tableMap.put("payment_document", "otech_forex");
        return tableMap;
    }
}
