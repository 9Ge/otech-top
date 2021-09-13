package com.otechsolution.out.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.otechsolution.common.exception.ApiAssert;
import com.otechsolution.common.util.DateUtil;
import com.otechsolution.out.entity.OpenAppInfo;
import com.otechsolution.out.mapper.OpenAppInfoMapper;
import com.otechsolution.redis.RedisClient;
import com.otechsolution.web.signer.handler.OpenInfoHandler;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author yuandongfei
 */
@Service
public class OpenAppInfoService implements OpenInfoHandler {

    private final OpenAppInfoMapper openAppInfoMapper;

    private final RedisClient redisClient;

    public OpenAppInfoService(OpenAppInfoMapper openAppInfoMapper, RedisClient redisClient) {
        this.openAppInfoMapper = openAppInfoMapper;
        this.redisClient = redisClient;
    }

    /**
     * 根据AppId读取客户端信息
     *
     * @param appId
     * @return
     */
    @Override
    public OpenAppInfo selectByAppId(String appId) {
        String hashKey = buildOpenAPIHashKey();
        OpenAppInfo record = redisClient.hGet(hashKey, appId);
        if (Objects.nonNull(record)) {
            return record;
        }
        LambdaQueryWrapper<OpenAppInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(OpenAppInfo::getAppId, appId);
        record = openAppInfoMapper.selectOne(queryWrapper);
        if (Objects.nonNull(record)) {
            redisClient.hSet(hashKey, record.getAppId(), record);
            return record;
        }
        return null;
    }

    /**
     * 验证客户端是否在有效期内
     *
     * @param record
     * @return
     */
    public boolean verify(OpenAppInfo record) {
        if (Objects.isNull(record)) {
            return false;
        }
        ApiAssert.isFalse("账号被锁定", Objects.equals(record.getStatus(), 1));
        return DateUtil.between(record.getStartDate(), record.getEndDate());
    }

    private String buildOpenAPIHashKey() {
        return "otech:integration:open_app";
    }

    public void insert(OpenAppInfo record) {
        openAppInfoMapper.insert(record);
    }
}
