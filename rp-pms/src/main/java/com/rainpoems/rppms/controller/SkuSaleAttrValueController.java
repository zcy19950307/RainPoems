package com.rainpoems.rppms.controller;

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

import com.rainpoems.rppms.entity.SkuSaleAttrValueEntity;
import com.rainpoems.rppms.service.SkuSaleAttrValueService;




/**
 * sku销售属性&值
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 13:56:23
 */
@Api(tags = "sku销售属性&值 管理")
@RestController
@RequestMapping("rppms/skusaleattrvalue")
public class SkuSaleAttrValueController {
    @Autowired
    private SkuSaleAttrValueService skuSaleAttrValueService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('rppms:skusaleattrvalue:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = skuSaleAttrValueService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('rppms:skusaleattrvalue:info')")
    public Resp<SkuSaleAttrValueEntity> info(@PathVariable("id") Long id){
		SkuSaleAttrValueEntity skuSaleAttrValue = skuSaleAttrValueService.getById(id);

        return Resp.ok(skuSaleAttrValue);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('rppms:skusaleattrvalue:save')")
    public Resp<Object> save(@RequestBody SkuSaleAttrValueEntity skuSaleAttrValue){
		skuSaleAttrValueService.save(skuSaleAttrValue);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('rppms:skusaleattrvalue:update')")
    public Resp<Object> update(@RequestBody SkuSaleAttrValueEntity skuSaleAttrValue){
		skuSaleAttrValueService.updateById(skuSaleAttrValue);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('rppms:skusaleattrvalue:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		skuSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
