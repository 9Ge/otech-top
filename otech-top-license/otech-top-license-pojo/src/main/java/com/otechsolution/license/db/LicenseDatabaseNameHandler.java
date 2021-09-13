package com.otechsolution.license.db;

import com.otechsolution.datasource.DatabaseNameHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 许可证数据库表名称
 *
 * @author yuandongfei
 */
@Component
public class LicenseDatabaseNameHandler implements DatabaseNameHandler {

    @Override
    public Map<String, String> dynamicDatabaseName() {
        Map<String, String> tableMap = new HashMap<>(4);
        // TODO: 2021/1/27 待实现
        return tableMap;
    }
}
