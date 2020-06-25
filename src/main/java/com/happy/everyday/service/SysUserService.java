package com.happy.everyday.service;

import java.util.List;
import java.util.Date;
import com.happy.everyday.reqVo.AddSysUserReq;
import com.happy.everyday.reqVo.UpdateSysUserReq;
import com.happy.everyday.reqVo.ListSysUserReq;
import com.happy.everyday.reqVo.PageSysUserReq;
import com.happy.everyday.entity.SysUser;
import com.baomidou.mybatisplus.plugins.Page;

import com.baomidou.mybatisplus.service.IService;
/**
* <p>
* SysUser服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/

public interface SysUserService extends IService<SysUser>  {
    public List<SysUser> list(ListSysUserReq req);
    public Page<SysUser> page(PageSysUserReq req);
    public int add(AddSysUserReq req);
    public int modify(UpdateSysUserReq req);
    public int delete(Integer id);
    public SysUser get(Integer id);
}