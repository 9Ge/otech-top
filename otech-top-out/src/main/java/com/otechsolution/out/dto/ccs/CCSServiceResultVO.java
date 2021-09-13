package com.otechsolution.out.dto.ccs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.LinkedHashMap;

/**
 * @Date 14:30
 * @ClassName: CCSServiceResultDto
 * @Author: YANGCHENG.
 * @Version:1.0 CCS接口对应响应结果类
 * <p>
 * success、code、message、data是返回的对象信息
 * Result 是处理后的接口信息
 * 包含
 * dataObject【对象信息】
 * message【返回报文】
 * success【成功失败】
 */
@Data
public class CCSServiceResultVO {


    @JsonProperty("IsSuccess")
    private boolean success;

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Data")
    private LinkedHashMap data;


    /**
     * 批量提交时，用来记录每一个对象的对象信息 以及保存结果信息
     */
    private CCSServiceResultVO.Result result;

    @Data
    public static class Result<T> {
        private T dataObject;
        private LinkedHashMap message;
        private boolean success;

        public boolean getSuccess() {
            return this.success;
        }

    }

    public boolean getSuccess() {
        return this.success;
    }
}
