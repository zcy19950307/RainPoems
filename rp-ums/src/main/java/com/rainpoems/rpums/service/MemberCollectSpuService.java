package com.rainpoems.rpums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpums.entity.MemberCollectSpuEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 会员收藏的商品
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:25:48
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

