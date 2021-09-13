package com.otechsolution.out.service;

import com.otechsolution.common.util.UuidUtil;
import com.otechsolution.out.entity.OpenAppInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OpenAppInfoServiceTest {

    @Autowired
    private OpenAppInfoService openAppInfoService;

    @Test
    public void insert() {
        String appId = UuidUtil.getUUID(true);
        String appSecret = DigestUtils.md5DigestAsHex(UuidUtil.getUUID().getBytes());
        OpenAppInfo record = new OpenAppInfo();
        record.setAppId(appId);
        record.setAppSecret(appSecret);
        record.setClientName("test name");
        openAppInfoService.insert(record);
        log.info("appId:[{}], appSecret:[{}]", appId, appSecret);
    }
}