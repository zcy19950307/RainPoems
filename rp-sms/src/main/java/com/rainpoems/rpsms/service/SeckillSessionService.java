package com.rainpoems.rpsms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpsms.entity.SeckillSessionEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 秒杀活动场次
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:02:41
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageVo queryPage(QueryCondition params);
}

