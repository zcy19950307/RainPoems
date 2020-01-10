package com.rainpoems.rpwms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpwms.entity.WareInfoEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:08:13
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

