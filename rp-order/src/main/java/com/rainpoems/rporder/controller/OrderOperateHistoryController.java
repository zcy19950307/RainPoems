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

import com.rainpoems.rporder.entity.OrderOperateHistoryEntity;
import com.rainpoems.rporder.service.OrderOperateHistoryService;




/**
 * 订单操作历史记录
 *
 * @author å°é¨
 * @email xy
 * @date 2020-01-10 09:23:56
 */
@Api(tags = "订单操作历史记录 管理")
@RestController
@RequestMapping("rporder/orderoperatehistory")
public class OrderOperateHistoryController {
    @Autowired
    private OrderOperateHistoryService orderOperateHistoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('rporder:orderoperatehistory:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = orderOperateHistoryService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('rporder:orderoperatehistory:info')")
    public Resp<OrderOperateHistoryEntity> info(@PathVariable("id") Long id){
		OrderOperateHistoryEntity orderOperateHistory = orderOperateHistoryService.getById(id);

        return Resp.ok(orderOperateHistory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('rporder:orderoperatehistory:save')")
    public Resp<Object> save(@RequestBody OrderOperateHistoryEntity orderOperateHistory){
		orderOperateHistoryService.save(orderOperateHistory);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('rporder:orderoperatehistory:update')")
    public Resp<Object> update(@RequestBody OrderOperateHistoryEntity orderOperateHistory){
		orderOperateHistoryService.updateById(orderOperateHistory);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('rporder:orderoperatehistory:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		orderOperateHistoryService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
