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
import com.happy.everyday.service.SysMenuService;
import com.happy.everyday.entity.SysMenu;
import com.happy.everyday.base.BaseReq;
import com.happy.everyday.reqVo.AddSysMenuReq;
import com.happy.everyday.reqVo.UpdateSysMenuReq;
import com.happy.everyday.reqVo.ListSysMenuReq;
import com.happy.everyday.reqVo.PageSysMenuReq;
/**
* @author yanghui
* @since 2020-06-21
*/
@Api(description = "" )
@RestController
@RequestMapping("/sysMenu" )
@Slf4j
public class SysMenuController  {

    @Autowired
    private SysMenuService  sysMenuService;

    @ApiOperation("列表" )
    @PostMapping("/list" )
    public BaseResult list(@RequestBody ListSysMenuReq req) {
        return new BaseResult().success(sysMenuService.list(req));
    }

    @ApiOperation("分页" )
    @PostMapping("/page" )
    public BaseResult page(@RequestBody PageSysMenuReq req) {
         return new BaseResult().success(sysMenuService.page(req));
    }

    @ApiOperation("获取详情" )
    @GetMapping("/get" )
    public BaseResult get(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysMenuService.get( id));
    }

    @ApiOperation("添加" )
    @PostMapping("/add" )
    public BaseResult add(@RequestBody AddSysMenuReq req) {
        return new BaseResult().success(sysMenuService.add(req));
    }

    @ApiOperation("修改" )
    @PostMapping("/modify" )
    public BaseResult modify(@RequestBody UpdateSysMenuReq req) {
        return new BaseResult().success(sysMenuService.modify(req));
    }

    @ApiOperation("删除" )
    @GetMapping("/delete" )
    public BaseResult delete(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysMenuService.delete( id));
    }

}