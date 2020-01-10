package com.rainpoems.rpcore.commons.to;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
public class SkuInfoVo {



    @Setter
    @Getter
    private Long skuId;//商品的id
    @Setter  @Getter
    private String skuTitle;//商品的标题
    @Setter  @Getter
    private String setmeal;//套餐

    @Setter  @Getter
    private String pics;//商品图片

    @Setter  @Getter
    private BigDecimal price;//单价


}
