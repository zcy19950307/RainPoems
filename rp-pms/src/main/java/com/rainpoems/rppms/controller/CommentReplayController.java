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

import com.rainpoems.rppms.entity.CommentReplayEntity;
import com.rainpoems.rppms.service.CommentReplayService;




/**
 * 商品评价回复关系
 *
 * @author xiaoyu
 * @email xy
 * @date 2020-01-10 13:56:24
 */
@Api(tags = "商品评价回复关系 管理")
@RestController
@RequestMapping("rppms/commentreplay")
public class CommentReplayController {
    @Autowired
    private CommentReplayService commentReplayService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('rppms:commentreplay:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = commentReplayService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('rppms:commentreplay:info')")
    public Resp<CommentReplayEntity> info(@PathVariable("id") Long id){
		CommentReplayEntity commentReplay = commentReplayService.getById(id);

        return Resp.ok(commentReplay);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('rppms:commentreplay:save')")
    public Resp<Object> save(@RequestBody CommentReplayEntity commentReplay){
		commentReplayService.save(commentReplay);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('rppms:commentreplay:update')")
    public Resp<Object> update(@RequestBody CommentReplayEntity commentReplay){
		commentReplayService.updateById(commentReplay);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('rppms:commentreplay:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		commentReplayService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
