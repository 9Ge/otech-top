package com.otechsolution.forex.dto;

import com.otechsolution.forex.entity.ForexPayment;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ForexPaymentDTO {
    private Long id;

    private Long forexId;

    private String entryNo;

    private Integer forexType;

    private Date forexDate;

    private BigDecimal amount;

    private Date verificationDate;

    private String transactionCurrency;

    private Integer status;

    private String remark;

    public ForexPayment toEntity() {
        ForexPayment target = new ForexPayment();
        BeanUtils.copyProperties(this, target);
        return target;
    }
}
