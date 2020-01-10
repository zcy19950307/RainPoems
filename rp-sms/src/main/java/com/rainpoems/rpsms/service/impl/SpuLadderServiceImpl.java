package com.rainpoems.rpsms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.Query;
import com.rainpoems.rpcore.commons.bean.QueryCondition;

import com.rainpoems.rpsms.dao.SpuLadderDao;
import com.rainpoems.rpsms.entity.SpuLadderEntity;
import com.rainpoems.rpsms.service.SpuLadderService;


@Service("spuLadderService")
public class SpuLadderServiceImpl extends ServiceImpl<SpuLadderDao, SpuLadderEntity> implements SpuLadderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuLadderEntity> page = this.page(
                new Query<SpuLadderEntity>().getPage(params),
                new QueryWrapper<SpuLadderEntity>()
        );

        return new PageVo(page);
    }

}