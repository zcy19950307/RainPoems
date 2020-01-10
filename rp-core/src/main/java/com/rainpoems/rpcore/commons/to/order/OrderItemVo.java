package com.rainpoems.rpcore.commons.to.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemVo {


    private Long id;

    private Long orderId;

    private String orderSn;
    private Long skuId;

    private String skuName;

    private BigDecimal skuPrice;

    private Integer skuQuantity;


    private Integer giftIntegration;

    private Integer giftGrowth;
}
