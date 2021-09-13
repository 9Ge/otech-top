package com.otechsolution.out.entity.ccs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 *  @Date 2021/1/27 15:16
 * @ClassName: CSSBilling
 * @Author: YANGCHENG.
 * @Version:1.0
 */
@Data
public class CCSBilling extends CssUserEntity {

    //账单内部编号
    @Valid
    @NotEmpty(message = "账单内部编号不能为空")
    private String billingNumber;

    @JsonProperty("BILLING_NUMBER")
    public String getBillingNumber() {
        return billingNumber;
    }
    @JsonProperty("billingNumber")
    public void setBillingNumber(String billingNumber) {
        this.billingNumber = billingNumber;
    }

    //账单日期
    private String billingDate;

    @JsonProperty("BILLING_Date")
    public String getBillingDate() {
        return billingDate;
    }
    @JsonProperty("billingDate")
    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    private String bpId;
    //服务商类型
    private String bpType;
    //服务商企业名称（中文）
    private String bpCnName;
    //企业18位社会信用代码
    private String bpCodeScc;
    //企业10位海关代码
    private String bpCustomsCode;
    //备注
    private String remark;
    //服务商企业名称（外文）
    private String bpEnName;
    //账单类型
    private String billingType;

    @JsonProperty("BILLING_Type")
    public String getBillingType() {
        return billingType;
    }

    @JsonProperty("billingType")
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    private List<BillingDetail> detail = new ArrayList<>();
    @Data
    public static class BillingDetail extends CssUserEntity {

        private Integer billingId;

        @JsonProperty("BILLING_ID")
        public Integer getBillingId() {
            return billingId;
        }
        @JsonProperty("billingId")
        public void setBillingId(Integer billingId) {
            this.billingId = billingId;
        }

        @JsonProperty("EXPENSE_ELEMENT_ID")
        public String getExpenseElementId() {
            return expenseElementId;
        }

        @JsonProperty("expenseElementId")
        public void setExpenseElementId(String expenseElementId) {
            this.expenseElementId = expenseElementId;
        }
        @JsonProperty("ELEMENT_NAME")
        public String getElementName() {
            if(elementName == null || elementName.trim().equals("")){
                this.elementName = "付汇";
            }
            return elementName;
        }

        @JsonProperty("elementName")
        public void setElementName(String elementName) {
            if(elementName == null || elementName.trim().equals("")){
                this.elementName = "付汇";
            }
            this.elementName = elementName;
        }

        private String expenseElementId="";

        //费用代码
        private String expenseCode;
        //费用名称
        private String elementName;

        //含税金额
        private String amount;
        //币制
        private String currency;
        //发票号
        private String invoiceNo;
        //状态
        private String status;
        //备注
        private String remark;
        //汇率
        private String exchangeRate;
        //含税人民币金额
        private String cnyAmount;
        //发票类型
        private String invoiceType;
        @JsonProperty("INVOICE_TYPE")
        public String getInvoiceType() {
            return invoiceType;
        }
        @JsonProperty("invoiceType")
        public void setInvoiceType(String invoiceType) {
            this.invoiceType = invoiceType;
        }

        //税率
        private String taxRate;
        //税额
        private String tax;
        //开票日期
        private String billingDate;
        //关联单证类型
        private String relatedDocType;
        //关联单证号码
        private String relatedDocNo;
    }
}
