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
import com.happy.everyday.service.SysLogsService;
import com.happy.everyday.entity.SysLogs;
import com.happy.everyday.base.BaseReq;
import com.happy.everyday.reqVo.AddSysLogsReq;
import com.happy.everyday.reqVo.UpdateSysLogsReq;
import com.happy.everyday.reqVo.ListSysLogsReq;
import com.happy.everyday.reqVo.PageSysLogsReq;
/**
* @author yanghui
* @since 2020-06-21
*/
@Api(description = "" )
@RestController
@RequestMapping("/sysLogs" )
@Slf4j
public class SysLogsController  {

    @Autowired
    private SysLogsService  sysLogsService;

    @ApiOperation("列表" )
    @PostMapping("/list" )
    public BaseResult list(@RequestBody ListSysLogsReq req) {
        return new BaseResult().success(sysLogsService.list(req));
    }

    @ApiOperation("分页" )
    @PostMapping("/page" )
    public BaseResult page(@RequestBody PageSysLogsReq req) {
         return new BaseResult().success(sysLogsService.page(req));
    }

    @ApiOperation("获取详情" )
    @GetMapping("/get" )
    public BaseResult get(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysLogsService.get( id));
    }

    @ApiOperation("添加" )
    @PostMapping("/add" )
    public BaseResult add(@RequestBody AddSysLogsReq req) {
        return new BaseResult().success(sysLogsService.add(req));
    }

    @ApiOperation("修改" )
    @PostMapping("/modify" )
    public BaseResult modify(@RequestBody UpdateSysLogsReq req) {
        return new BaseResult().success(sysLogsService.modify(req));
    }

    @ApiOperation("删除" )
    @GetMapping("/delete" )
    public BaseResult delete(@RequestParam("id")Integer id) {
        return new BaseResult().success(sysLogsService.delete( id));
    }

}