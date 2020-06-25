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
import com.happy.everyday.service.SysRoleService;
import com.happy.everyday.entity.SysRole;
import com.happy.everyday.base.BaseReq;
import com.happy.everyday.reqVo.AddSysRoleReq;
import com.happy.everyday.reqVo.UpdateSysRoleReq;
import com.happy.everyday.reqVo.ListSysRoleReq;
import com.happy.everyday.reqVo.PageSysRoleReq;
/**
* @author yanghui
* @since 2020-06-21
*/
@Api(description = "" )
@RestController
@RequestMapping("/sysRole" )
@Slf4j
public class SysRoleController  {

    @Autowired
    private SysRoleService  sysRoleService;

    @ApiOperation("列表" )
    @PostMapping("/list" )
    public BaseResult list(@RequestBody ListSysRoleReq req) {
        return new BaseResult().success(sysRoleService.list(req));
    }

    @ApiOperation("分页" )
    @PostMapping("/page" )
    public BaseResult page(@RequestBody PageSysRoleReq req) {
         return new BaseResult().success(sysRoleService.page(req));
    }

    @ApiOperation("获取详情" )
    @GetMapping("/get" )
    public BaseResult get(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysRoleService.get( id));
    }

    @ApiOperation("添加" )
    @PostMapping("/add" )
    public BaseResult add(@RequestBody AddSysRoleReq req) {
        return new BaseResult().success(sysRoleService.add(req));
    }

    @ApiOperation("修改" )
    @PostMapping("/modify" )
    public BaseResult modify(@RequestBody UpdateSysRoleReq req) {
        return new BaseResult().success(sysRoleService.modify(req));
    }

    @ApiOperation("删除" )
    @GetMapping("/delete" )
    public BaseResult delete(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysRoleService.delete( id));
    }

}