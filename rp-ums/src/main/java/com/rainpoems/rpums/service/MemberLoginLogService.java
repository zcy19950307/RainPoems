package com.rainpoems.rpums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpums.entity.MemberLoginLogEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 会员登录记录
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:25:47
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageVo queryPage(QueryCondition params);
}

