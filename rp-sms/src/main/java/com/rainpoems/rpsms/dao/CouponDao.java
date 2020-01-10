package com.rainpoems.rpsms.dao;

import com.rainpoems.rpsms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:04:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
