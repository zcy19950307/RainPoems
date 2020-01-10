package com.rainpoems.rporder.controller;

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

import com.rainpoems.rporder.entity.OrderItemEntity;
import com.rainpoems.rporder.service.OrderItemService;




/**
 * 订单项信息
 *
 * @author å°é¨
 * @email xy
 * @date 2020-01-10 09:23:56
 */
@Api(tags = "订单项信息 管理")
@RestController
@RequestMapping("rporder/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('rporder:orderitem:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = orderItemService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('rporder:orderitem:info')")
    public Resp<OrderItemEntity> info(@PathVariable("id") Long id){
		OrderItemEntity orderItem = orderItemService.getById(id);

        return Resp.ok(orderItem);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('rporder:orderitem:save')")
    public Resp<Object> save(@RequestBody OrderItemEntity orderItem){
		orderItemService.save(orderItem);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('rporder:orderitem:update')")
    public Resp<Object> update(@RequestBody OrderItemEntity orderItem){
		orderItemService.updateById(orderItem);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('rporder:orderitem:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		orderItemService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
