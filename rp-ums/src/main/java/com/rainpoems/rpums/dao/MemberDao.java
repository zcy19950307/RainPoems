package com.rainpoems.rpums.dao;

import com.rainpoems.rpums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:25:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
