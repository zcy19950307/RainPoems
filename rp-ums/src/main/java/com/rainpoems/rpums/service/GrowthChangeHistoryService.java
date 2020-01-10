package com.rainpoems.rpums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpums.entity.GrowthChangeHistoryEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:25:47
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

