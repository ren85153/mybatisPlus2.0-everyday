package com.happy.everyday.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.happy.everyday.base.BaseResult;
import com.happy.everyday.service.SysDictService;
import com.happy.everyday.entity.SysDict;
import com.happy.everyday.base.BaseReq;
import com.happy.everyday.reqVo.AddSysDictReq;
import com.happy.everyday.reqVo.UpdateSysDictReq;
import com.happy.everyday.reqVo.ListSysDictReq;
import com.happy.everyday.reqVo.PageSysDictReq;
/**
* @author yanghui
* @since 2020-06-21
*/
@Api(description = "" )
@RestController
@RequestMapping("/sysDict" )
@Slf4j
public class SysDictController  {

    @Autowired
    private SysDictService  sysDictService;

    @ApiOperation("列表" )
    @PostMapping("/list" )
    public BaseResult list(@RequestBody ListSysDictReq req) {
        return new BaseResult().success(sysDictService.list(req));
    }

    @ApiOperation("分页" )
    @PostMapping("/page" )
    public BaseResult page(@RequestBody PageSysDictReq req) {
         return new BaseResult().success(sysDictService.page(req));
    }

    @ApiOperation("获取详情" )
    @GetMapping("/get" )
    public BaseResult get(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysDictService.get( id));
    }

    @ApiOperation("添加" )
    @PostMapping("/add" )
    public BaseResult add(@RequestBody AddSysDictReq req) {
        return new BaseResult().success(sysDictService.add(req));
    }

    @ApiOperation("修改" )
    @PostMapping("/modify" )
    public BaseResult modify(@RequestBody UpdateSysDictReq req) {
        return new BaseResult().success(sysDictService.modify(req));
    }

    @ApiOperation("删除" )
    @GetMapping("/delete" )
    public BaseResult delete(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysDictService.delete( id));
    }

}