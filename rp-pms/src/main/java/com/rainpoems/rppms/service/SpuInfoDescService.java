package com.rainpoems.rppms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rppms.entity.SpuInfoDescEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * spu信息介绍
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 13:56:24
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);
}

