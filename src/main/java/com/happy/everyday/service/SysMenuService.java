package com.happy.everyday.service;

import java.util.List;
import java.util.Date;
import com.happy.everyday.reqVo.AddSysMenuReq;
import com.happy.everyday.reqVo.UpdateSysMenuReq;
import com.happy.everyday.reqVo.ListSysMenuReq;
import com.happy.everyday.reqVo.PageSysMenuReq;
import com.happy.everyday.entity.SysMenu;
import com.baomidou.mybatisplus.plugins.Page;

import com.baomidou.mybatisplus.service.IService;
/**
* <p>
* SysMenu服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/

public interface SysMenuService extends IService<SysMenu>  {
    public List<SysMenu> list(ListSysMenuReq req);
    public Page<SysMenu> page(PageSysMenuReq req);
    public int add(AddSysMenuReq req);
    public int modify(UpdateSysMenuReq req);
    public int delete(Integer id);
    public SysMenu get(Integer id);
}