package com.rainpoems.rpcore.commons.to.mq;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemMqTo {

    private Long id;

    private Long orderId;

    private String orderSn;


    private Long skuId;

    private String skuName;

    private String skuPic;

    private BigDecimal skuPrice;

    private Integer skuQuantity;


}
