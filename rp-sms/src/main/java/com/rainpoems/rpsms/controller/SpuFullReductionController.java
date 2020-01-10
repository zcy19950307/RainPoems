package com.rainpoems.rpsms.controller;

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

import com.rainpoems.rpsms.entity.SpuFullReductionEntity;
import com.rainpoems.rpsms.service.SpuFullReductionService;




/**
 * 商品满减信息
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 14:02:41
 */
@Api(tags = "商品满减信息 管理")
@RestController
@RequestMapping("rpsms/spufullreduction")
public class SpuFullReductionController {
    @Autowired
    private SpuFullReductionService spuFullReductionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('rpsms:spufullreduction:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = spuFullReductionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('rpsms:spufullreduction:info')")
    public Resp<SpuFullReductionEntity> info(@PathVariable("id") Long id){
		SpuFullReductionEntity spuFullReduction = spuFullReductionService.getById(id);

        return Resp.ok(spuFullReduction);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('rpsms:spufullreduction:save')")
    public Resp<Object> save(@RequestBody SpuFullReductionEntity spuFullReduction){
		spuFullReductionService.save(spuFullReduction);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('rpsms:spufullreduction:update')")
    public Resp<Object> update(@RequestBody SpuFullReductionEntity spuFullReduction){
		spuFullReductionService.updateById(spuFullReduction);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('rpsms:spufullreduction:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		spuFullReductionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
