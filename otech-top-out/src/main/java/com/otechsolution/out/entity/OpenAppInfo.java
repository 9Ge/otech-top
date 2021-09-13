package com.otechsolution.out.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.otechsolution.web.signer.handler.OpenInfo;
import lombok.Data;

import java.util.Date;

@Data
@TableName(schema = "otech_open",value = "open_app_info")
public class OpenAppInfo extends OpenInfo {
    private Long id;

    private String clientName;

    private String telephone;

    private String mail;

    private String whiteIp;

    private Date startDate;

    private Date endDate;

    private String dbType;

    private String dbName;

    private Integer status;

    private String remark;

    private Date createTime;

    private Date updateTime;
}