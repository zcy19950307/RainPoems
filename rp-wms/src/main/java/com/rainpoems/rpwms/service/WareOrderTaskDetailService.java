package com.rainpoems.rpwms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpwms.entity.WareOrderTaskDetailEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:08:12
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

