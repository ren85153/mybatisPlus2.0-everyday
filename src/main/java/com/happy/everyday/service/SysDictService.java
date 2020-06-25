package com.happy.everyday.service;

import java.util.List;
import java.util.Date;
import com.happy.everyday.reqVo.AddSysDictReq;
import com.happy.everyday.reqVo.UpdateSysDictReq;
import com.happy.everyday.reqVo.ListSysDictReq;
import com.happy.everyday.reqVo.PageSysDictReq;
import com.happy.everyday.entity.SysDict;
import com.baomidou.mybatisplus.plugins.Page;

import com.baomidou.mybatisplus.service.IService;
/**
* <p>
* SysDict服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/

public interface SysDictService extends IService<SysDict>  {
    public List<SysDict> list(ListSysDictReq req);
    public Page<SysDict> page(PageSysDictReq req);
    public int add(AddSysDictReq req);
    public int modify(UpdateSysDictReq req);
    public int delete(Integer id);
    public SysDict get(Integer id);
}