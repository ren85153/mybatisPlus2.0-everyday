package com.happy.everyday.service;

import java.util.List;
import java.util.Date;
import com.happy.everyday.reqVo.AddSysRoleReq;
import com.happy.everyday.reqVo.UpdateSysRoleReq;
import com.happy.everyday.reqVo.ListSysRoleReq;
import com.happy.everyday.reqVo.PageSysRoleReq;
import com.happy.everyday.entity.SysRole;
import com.baomidou.mybatisplus.plugins.Page;

import com.baomidou.mybatisplus.service.IService;
/**
* <p>
* SysRole服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/

public interface SysRoleService extends IService<SysRole>  {
    public List<SysRole> list(ListSysRoleReq req);
    public Page<SysRole> page(PageSysRoleReq req);
    public int add(AddSysRoleReq req);
    public int modify(UpdateSysRoleReq req);
    public int delete(Integer id);
    public SysRole get(Integer id);
}