package com.rainpoems.rpsms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpsms.entity.CouponEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 优惠券信息
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:04:36
 */
public interface CouponService extends IService<CouponEntity> {

    PageVo queryPage(QueryCondition params);
}

