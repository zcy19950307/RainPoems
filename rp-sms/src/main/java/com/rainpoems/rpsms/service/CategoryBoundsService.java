package com.rainpoems.rpsms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpsms.entity.CategoryBoundsEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 商品分类积分设置
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:02:41
 */
public interface CategoryBoundsService extends IService<CategoryBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

