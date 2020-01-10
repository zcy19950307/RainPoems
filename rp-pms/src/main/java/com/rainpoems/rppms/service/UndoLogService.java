package com.rainpoems.rppms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rppms.entity.UndoLogEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 13:56:23
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageVo queryPage(QueryCondition params);
}

