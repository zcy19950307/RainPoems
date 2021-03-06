package com.rainpoems.rpsms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpsms.entity.CouponHistoryEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 优惠券领取历史记录
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:04:36
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

