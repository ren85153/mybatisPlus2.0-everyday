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
import com.happy.everyday.service.SysUserService;
import com.happy.everyday.entity.SysUser;
import com.happy.everyday.base.BaseReq;
import com.happy.everyday.reqVo.AddSysUserReq;
import com.happy.everyday.reqVo.UpdateSysUserReq;
import com.happy.everyday.reqVo.ListSysUserReq;
import com.happy.everyday.reqVo.PageSysUserReq;
/**
* @author yanghui
* @since 2020-06-21
*/
@Api(description = "" )
@RestController
@RequestMapping("/sysUser" )
@Slf4j
public class SysUserController  {

    @Autowired
    private SysUserService  sysUserService;

    @ApiOperation("列表" )
    @PostMapping("/list" )
    public BaseResult list(@RequestBody ListSysUserReq req) {
        return new BaseResult().success(sysUserService.list(req));
    }

    @ApiOperation("分页" )
    @PostMapping("/page" )
    public BaseResult page(@RequestBody PageSysUserReq req) {
         return new BaseResult().success(sysUserService.page(req));
    }

    @ApiOperation("获取详情" )
    @GetMapping("/get" )
    public BaseResult get(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysUserService.get( id));
    }

    @ApiOperation("添加" )
    @PostMapping("/add" )
    public BaseResult add(@RequestBody AddSysUserReq req) {
        return new BaseResult().success(sysUserService.add(req));
    }

    @ApiOperation("修改" )
    @PostMapping("/modify" )
    public BaseResult modify(@RequestBody UpdateSysUserReq req) {
        return new BaseResult().success(sysUserService.modify(req));
    }

    @ApiOperation("删除" )
    @GetMapping("/delete" )
    public BaseResult delete(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysUserService.delete( id));
    }

}