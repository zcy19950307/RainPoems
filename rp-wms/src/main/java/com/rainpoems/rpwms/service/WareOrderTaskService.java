package com.rainpoems.rpwms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpwms.entity.WareOrderTaskEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:08:13
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageVo queryPage(QueryCondition params);
}

