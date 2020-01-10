package com.rainpoems.rporder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rporder.entity.OrderReturnApplyEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 订单退货申请
 *
 * @author å°é¨
 * @email xy
 * @date 2020-01-10 09:23:56
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageVo queryPage(QueryCondition params);
}

