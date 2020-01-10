package com.rainpoems.rppms.dao;

import com.rainpoems.rppms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 13:59:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
