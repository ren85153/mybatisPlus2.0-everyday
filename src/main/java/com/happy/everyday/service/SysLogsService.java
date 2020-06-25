package com.happy.everyday.service;

import java.util.List;
import java.util.Date;
import com.happy.everyday.reqVo.AddSysLogsReq;
import com.happy.everyday.reqVo.UpdateSysLogsReq;
import com.happy.everyday.reqVo.ListSysLogsReq;
import com.happy.everyday.reqVo.PageSysLogsReq;
import com.happy.everyday.entity.SysLogs;
import com.baomidou.mybatisplus.plugins.Page;

import com.baomidou.mybatisplus.service.IService;
/**
* <p>
* SysLogs服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/

public interface SysLogsService extends IService<SysLogs>  {
    public List<SysLogs> list(ListSysLogsReq req);
    public Page<SysLogs> page(PageSysLogsReq req);
    public int add(AddSysLogsReq req);
    public int modify(UpdateSysLogsReq req);
    public int delete(Integer id);
    public SysLogs get(Integer id);
}