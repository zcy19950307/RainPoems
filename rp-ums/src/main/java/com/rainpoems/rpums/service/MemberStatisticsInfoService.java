package com.rainpoems.rpums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpums.entity.MemberStatisticsInfoEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:25:47
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

