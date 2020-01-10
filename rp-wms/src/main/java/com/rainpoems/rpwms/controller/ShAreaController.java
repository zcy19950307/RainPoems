package com.rainpoems.rpwms.controller;

import java.util.Arrays;
import java.util.Map;


import com.rainpoems.rpcore.commons.bean.PageVo;
import com.rainpoems.rpcore.commons.bean.QueryCondition;
import com.rainpoems.rpcore.commons.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.rainpoems.rpwms.entity.ShAreaEntity;
import com.rainpoems.rpwms.service.ShAreaService;




/**
 * 全国省市区信息
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:08:12
 */
@Api(tags = "全国省市区信息 管理")
@RestController
@RequestMapping("rpwms/sharea")
public class ShAreaController {
    @Autowired
    private ShAreaService shAreaService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('rpwms:sharea:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = shAreaService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('rpwms:sharea:info')")
    public Resp<ShAreaEntity> info(@PathVariable("id") Integer id){
		ShAreaEntity shArea = shAreaService.getById(id);

        return Resp.ok(shArea);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('rpwms:sharea:save')")
    public Resp<Object> save(@RequestBody ShAreaEntity shArea){
		shAreaService.save(shArea);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('rpwms:sharea:update')")
    public Resp<Object> update(@RequestBody ShAreaEntity shArea){
		shAreaService.updateById(shArea);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('rpwms:sharea:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		shAreaService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
