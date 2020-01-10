package com.rainpoems.rporder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rporder.entity.OrderItemEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 订单项信息
 *
 * @author å°é¨
 * @email xy
 * @date 2020-01-10 09:23:56
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageVo queryPage(QueryCondition params);
}

