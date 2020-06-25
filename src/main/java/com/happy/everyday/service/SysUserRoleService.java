package com.happy.everyday.service;

import java.util.List;
import java.util.Date;
import com.happy.everyday.reqVo.AddSysUserRoleReq;
import com.happy.everyday.reqVo.UpdateSysUserRoleReq;
import com.happy.everyday.reqVo.ListSysUserRoleReq;
import com.happy.everyday.reqVo.PageSysUserRoleReq;
import com.happy.everyday.entity.SysUserRole;
import com.baomidou.mybatisplus.plugins.Page;

import com.baomidou.mybatisplus.service.IService;
/**
* <p>
* SysUserRole服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/

public interface SysUserRoleService extends IService<SysUserRole>  {
    public List<SysUserRole> list(ListSysUserRoleReq req);
    public Page<SysUserRole> page(PageSysUserRoleReq req);
    public int add(AddSysUserRoleReq req);
    public int modify(UpdateSysUserRoleReq req);
    public int delete(Integer id);
    public SysUserRole get(Integer id);
}