package com.happy.everyday.service;

import java.util.List;
import java.util.Date;
import com.happy.everyday.reqVo.AddSysRoleMenuReq;
import com.happy.everyday.reqVo.UpdateSysRoleMenuReq;
import com.happy.everyday.reqVo.ListSysRoleMenuReq;
import com.happy.everyday.reqVo.PageSysRoleMenuReq;
import com.happy.everyday.entity.SysRoleMenu;
import com.baomidou.mybatisplus.plugins.Page;

import com.baomidou.mybatisplus.service.IService;
/**
* <p>
* SysRoleMenu服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/

public interface SysRoleMenuService extends IService<SysRoleMenu>  {
    public List<SysRoleMenu> list(ListSysRoleMenuReq req);
    public Page<SysRoleMenu> page(PageSysRoleMenuReq req);
    public int add(AddSysRoleMenuReq req);
    public int modify(UpdateSysRoleMenuReq req);
    public int delete(Integer id);
    public SysRoleMenu get(Integer id);
}