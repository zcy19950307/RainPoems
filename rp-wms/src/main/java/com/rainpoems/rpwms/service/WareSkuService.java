package com.rainpoems.rpwms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpwms.entity.WareSkuEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 商品库存
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:08:12
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageVo queryPage(QueryCondition params);
}

