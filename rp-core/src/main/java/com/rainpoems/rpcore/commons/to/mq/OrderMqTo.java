package com.rainpoems.rpcore.commons.to.mq;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderMqTo {


    private String uuid;
    private Long id;

    private Long memberId;

    private String orderSn;


    private Date createTime;

    private String memberUsername;

    private BigDecimal totalAmount;

    private BigDecimal payAmount;

    private List<OrderItemMqTo> orderItems;



}
