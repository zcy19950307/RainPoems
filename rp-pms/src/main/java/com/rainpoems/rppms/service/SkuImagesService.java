package com.rainpoems.rppms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rainpoems.rppms.entity.SkuImagesEntity;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;


/**
 * sku图片
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 13:56:24
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

