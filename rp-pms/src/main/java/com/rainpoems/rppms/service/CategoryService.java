package com.rainpoems.rppms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rppms.entity.CategoryEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 商品三级分类
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 13:59:30
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);
}

