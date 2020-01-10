package com.rainpoems.rporder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rporder.entity.OrderReturnReasonEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 退货原因
 *
 * @author å°é¨
 * @email xy
 * @date 2020-01-10 09:23:56
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageVo queryPage(QueryCondition params);
}

