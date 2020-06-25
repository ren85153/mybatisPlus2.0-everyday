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
import com.happy.everyday.service.SysUserRoleService;
import com.happy.everyday.entity.SysUserRole;
import com.happy.everyday.base.BaseReq;
import com.happy.everyday.reqVo.AddSysUserRoleReq;
import com.happy.everyday.reqVo.UpdateSysUserRoleReq;
import com.happy.everyday.reqVo.ListSysUserRoleReq;
import com.happy.everyday.reqVo.PageSysUserRoleReq;
/**
* @author yanghui
* @since 2020-06-21
*/
@Api(description = "" )
@RestController
@RequestMapping("/sysUserRole" )
@Slf4j
public class SysUserRoleController  {

    @Autowired
    private SysUserRoleService  sysUserRoleService;

    @ApiOperation("列表" )
    @PostMapping("/list" )
    public BaseResult list(@RequestBody ListSysUserRoleReq req) {
        return new BaseResult().success(sysUserRoleService.list(req));
    }

    @ApiOperation("分页" )
    @PostMapping("/page" )
    public BaseResult page(@RequestBody PageSysUserRoleReq req) {
         return new BaseResult().success(sysUserRoleService.page(req));
    }

    @ApiOperation("获取详情" )
    @GetMapping("/get" )
    public BaseResult get(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysUserRoleService.get( id));
    }

    @ApiOperation("添加" )
    @PostMapping("/add" )
    public BaseResult add(@RequestBody AddSysUserRoleReq req) {
        return new BaseResult().success(sysUserRoleService.add(req));
    }

    @ApiOperation("修改" )
    @PostMapping("/modify" )
    public BaseResult modify(@RequestBody UpdateSysUserRoleReq req) {
        return new BaseResult().success(sysUserRoleService.modify(req));
    }

    @ApiOperation("删除" )
    @GetMapping("/delete" )
    public BaseResult delete(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysUserRoleService.delete( id));
    }

}