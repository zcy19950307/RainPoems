package com.rainpoems.rpsms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpsms.entity.SpuBoundsEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 商品spu积分设置
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:02:41
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

