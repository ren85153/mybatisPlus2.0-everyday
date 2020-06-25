package com.happy.everyday.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.happy.everyday.base.BaseResult;
import com.happy.everyday.reqVo.AddSysLogsReq;
import com.happy.everyday.reqVo.UpdateSysLogsReq;
import com.happy.everyday.reqVo.ListSysLogsReq;
import com.happy.everyday.reqVo.PageSysLogsReq;
import com.happy.everyday.mapper.SysLogsMapper;
import com.happy.everyday.service.SysLogsService;
import com.happy.everyday.entity.SysLogs;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.happy.everyday.base.BasePage;

/**
* <p>
* SysLogs服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Service
public class SysLogsServiceImpl extends ServiceImpl<SysLogsMapper, SysLogs> implements SysLogsService {
    public List<SysLogs> list(ListSysLogsReq req){
        String keyword = req.getKeyword();
        EntityWrapper<SysLogs> queryWrapper = new EntityWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            queryWrapper.like("", req.getKeyword());
        }
        return baseMapper.selectList(queryWrapper);
    }
    public Page page(PageSysLogsReq req){
    	SysLogs t = req.getT();
        Page page = new Page<>(req.getCurrent(), req.getSize());
        EntityWrapper<SysLogs> queryWrapper = new EntityWrapper<>();
		if(null != t){
			//条件
		}
        if(baseMapper.selectPage(page, queryWrapper) != null) {
            page.setRecords(baseMapper.selectPage(page, queryWrapper));
            page.setTotal(baseMapper.selectPage(page, queryWrapper).size());
        }
        return page;
    }
    public int add(AddSysLogsReq req){
        SysLogs data = new  SysLogs();
        BeanUtils.copyProperties(req.getT(), data);
        data.setCreateTime(new Date());
        baseMapper.insert(data);
        return data.getId();
    }
    public int modify(UpdateSysLogsReq req){
        SysLogs data = new  SysLogs();
        BeanUtils.copyProperties(req.getT(), data);
        return baseMapper.updateById(data);
    }
    public int delete(Integer id){
        return baseMapper.deleteById(id);

    }
    public SysLogs get(Integer id){
        return baseMapper.selectById(id);
    }
}