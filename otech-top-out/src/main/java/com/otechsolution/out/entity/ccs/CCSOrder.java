package com.otechsolution.out.entity.ccs;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 *  @Date 2021/1/27 15:16
 * @ClassName: CSSBillingController
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Data
public class CCSOrder  extends CssUserEntity {
    //
    private String orderClientType;
    //
    private Integer orderHeaderId=0;

    public Integer getOrderHeaderId() {
        return orderHeaderId;
    }

    public void setOrderHeaderId(Integer orderHeaderId) {
        this.orderHeaderId = 0;
    }

    //
    private Integer bpId;
    //订/账单编号
    @Valid
    @NotEmpty(message = "订/账单编号不能为空")
    private String orderNumber;
    //订/账单日期
    private String orderDate;
    //企业类型
    private String enterpriseType;
    //境外收/发货人名称（外文）
    private String bpcnName;
    //境外收/发货人名称（中文）
    private String bpenName;
    //境外收/发货人内部代码
    private String bpInternalID;
    //境外收/发货人AEO代码
    private String bpaeoCode;
    //境外收/发货人18位社会信用代码
    private String bpCodeSCC;
    //境外收/发货人10位海关代码
    private String bpCustomsCode;
    //境外收/发货人地址
    private String address;
    //联系人
    private String contactPeople;
    //联系电话
    private String contactPhone;
    //邮箱
    private String email;
    //付款方式
    private String paymentMode;
    //运输方式
    private String transportMode;
    //订单类型
    @Valid
    @NotEmpty(message = "订/账单类型不能为空")
    private String orderType;
    //成交方式
    private String dealMode;
    //成交地点
    private String transPlace;
    //贸易国别
    private String tradeAreaCode;
    //特殊关系
    private String specialRelationship;
    //
    private String consignorBPID;
    //委托方（外文）
    private String consignorENName;
    //委托方（中文）
    private String consignorCNName;
    //委托方内部代码
    private String consignorInternalID;
    //委托方18位社会信用代码
    private String consignorCodeSCC;
    //备注
    private String remark;
    //境内收发货人ID
    private String rltCusId;
    //境内收发货人
    private String rltCustomer;
    //送货地址
    private String rltCusAddr;
    //联系人
    private String rltCusContacts;
    //联系电话
    private String rltCusTel;
    //贸易国别
    private String rltCusCountry;
    //送货日期
    private String deliveryAddr;
    //备注1
    private String remark1;
    //境内收发货人18位社会信用代码
    private String rltCustomerCodeScc;
    //委托方用户
    private String consignor_USERID;

    private List<OrderDetail> detail = new ArrayList<>();

    @Data
    public static class OrderDetail  extends CssUserEntity {

        private Integer orderHeaderId;
        //料号
        private String partNumber;
        //商品名称
        private String goodsName;
        //商品英文名称
        private String goodsEName;
        //成交数量
        private String gQty;
        //成交计量单位
        private String gunit;
        //单价
        private String price;
        //总价
        private String total;
        //币制
        private String curr;
        //原产国
        private String originCountry;
        //最终目的国
        private String destinationCountry;
        //交货日期
        private String deliveryDate;
        //价格影响确认
        private String promisItemsPriceImpact;
        //特许权使用费
        private String promisItemsRoyalty;
        //备注
        private String remark;
        //公司代码
        private String companyCode;
        //地址
        private String addr;
        //联系人
        private String contacts;
        //联系方式
        private String contractNo;
        //特殊要求
        private String specialRequest;
        //公司名称
        private String companyName;
    }

}
