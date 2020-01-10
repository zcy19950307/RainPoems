package com.rainpoems.rpums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpums.entity.MemberEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 会员
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:25:48
 */
public interface MemberService extends IService<MemberEntity> {

    PageVo queryPage(QueryCondition params);
}

