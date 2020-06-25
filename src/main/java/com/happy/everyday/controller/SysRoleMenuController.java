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
import com.happy.everyday.service.SysRoleMenuService;
import com.happy.everyday.entity.SysRoleMenu;
import com.happy.everyday.base.BaseReq;
import com.happy.everyday.reqVo.AddSysRoleMenuReq;
import com.happy.everyday.reqVo.UpdateSysRoleMenuReq;
import com.happy.everyday.reqVo.ListSysRoleMenuReq;
import com.happy.everyday.reqVo.PageSysRoleMenuReq;
/**
* @author yanghui
* @since 2020-06-21
*/
@Api(description = "" )
@RestController
@RequestMapping("/sysRoleMenu" )
@Slf4j
public class SysRoleMenuController  {

    @Autowired
    private SysRoleMenuService  sysRoleMenuService;

    @ApiOperation("列表" )
    @PostMapping("/list" )
    public BaseResult list(@RequestBody ListSysRoleMenuReq req) {
        return new BaseResult().success(sysRoleMenuService.list(req));
    }

    @ApiOperation("分页" )
    @PostMapping("/page" )
    public BaseResult page(@RequestBody PageSysRoleMenuReq req) {
         return new BaseResult().success(sysRoleMenuService.page(req));
    }

    @ApiOperation("获取详情" )
    @GetMapping("/get" )
    public BaseResult get(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysRoleMenuService.get( id));
    }

    @ApiOperation("添加" )
    @PostMapping("/add" )
    public BaseResult add(@RequestBody AddSysRoleMenuReq req) {
        return new BaseResult().success(sysRoleMenuService.add(req));
    }

    @ApiOperation("修改" )
    @PostMapping("/modify" )
    public BaseResult modify(@RequestBody UpdateSysRoleMenuReq req) {
        return new BaseResult().success(sysRoleMenuService.modify(req));
    }

    @ApiOperation("删除" )
    @GetMapping("/delete" )
    public BaseResult delete(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysRoleMenuService.delete( id));
    }

}