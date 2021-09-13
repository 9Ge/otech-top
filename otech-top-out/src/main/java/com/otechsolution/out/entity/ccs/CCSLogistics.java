package com.otechsolution.out.entity.ccs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.otechsolution.out.service.ccs.ParameterService;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  @Date 2021/1/27 15:16
 * @ClassName: CSSBillingController
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Data
public class CCSLogistics  extends CssUserEntity {

    // 产品类型
    private String itemType;
    // 料号
    @Valid
    @NotEmpty(message = "料号不能空")
     private String partNumber;

    // 商品编码
    private String codeTS;

    public void setCodeTS(String codeTS) {
        ParameterService param = new ParameterService();
        this.codeTS = param.getCodeTs(codeTS);
    }

    public String getCodeTS() {
        if(codeTS == null){
           ParameterService param = new ParameterService();
           return  param.getCodeTs(codeTS);
        }
        return codeTS;
    }

    //商品名称
    private String partCNName;

    // 检验检疫编码
    private String ciqCode;

    // 检验检疫名称
    private String ciqName;

    // 商品英文名称
    private String partENName;

    // 规格型号
    private String partModel;

    // 法定计量单位
    private String firstUnit;

    // 法定第二计量单位
    private String secondUnit;


    private String gUnit;

    // 成交计量单位
    @JsonProperty("gUnit")
    public void setgUnit(String gUnit) {
        ParameterService param = new ParameterService();
        this.gUnit = param.getUnit(gUnit);
    }

    @JsonProperty("gUnit")
    public String getgUnit() {
        return gUnit;
    }

    // 保税标志
    private String bondedFlag;

    // 参考单价
    private String unitPrice;

    // 币制
    private String currency;

    // 主辅料标志
    private String adjmtrMarkcd;

    // 手/账册规格型号
    private String hbPartModel;

    // 开始有效期
    private String startDate;

    public String getStartDate() {
        if(this.startDate == null || this.startDate.trim().equals("")){
            return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        }else{
           return this.startDate;
        }
    }

    public void setStartDate(String startDate) {
        if(startDate == null || startDate.trim().equals("") ){
           this.startDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        }else{
            this.startDate = startDate;
        }
    }

    // 结束有效期
    private String stopDate;

    // 备注
    private String remark;

    // 自定义证件
    private String licensedCode;

    // 原产国
    private String originCountry;

    public void setOriginCountry(String originCountry) {
        ParameterService param = new ParameterService();
        this.originCountry = param.getCountry(originCountry);
    }

    // 客户
    private String customer;

    // 客户料号
    private String customerItem;

    // 变更原因
    private String changeReason;

    // 净重
    private String netWt;

    private String remark1;
    private String remark2;

    private int bpId;

    // 内包装类型
    private String innerPackage;


    // 产品描述中文
    private String partDescriptionCN;

    // 产品描述英文
    private String partDescriptionEN;


}
