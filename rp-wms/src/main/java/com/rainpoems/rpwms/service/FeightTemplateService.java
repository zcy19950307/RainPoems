package com.rainpoems.rpwms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rpwms.entity.FeightTemplateEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:08:12
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

