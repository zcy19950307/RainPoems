package com.rainpoems.rporder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rporder.entity.PaymentInfoEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author å°é¨
 * @email xy
 * @date 2020-01-10 09:23:57
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

