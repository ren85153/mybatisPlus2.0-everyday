package com.happy.everyday.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.happy.everyday.base.BaseResult;
import com.happy.everyday.reqVo.AddSysUserRoleReq;
import com.happy.everyday.reqVo.UpdateSysUserRoleReq;
import com.happy.everyday.reqVo.ListSysUserRoleReq;
import com.happy.everyday.reqVo.PageSysUserRoleReq;
import com.happy.everyday.mapper.SysUserRoleMapper;
import com.happy.everyday.service.SysUserRoleService;
import com.happy.everyday.entity.SysUserRole;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.happy.everyday.base.BasePage;

/**
* <p>
* SysUserRole服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {
    public List<SysUserRole> list(ListSysUserRoleReq req){
        String keyword = req.getKeyword();
        EntityWrapper<SysUserRole> queryWrapper = new EntityWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            queryWrapper.like("", req.getKeyword());
        }
        return baseMapper.selectList(queryWrapper);
    }
    public Page page(PageSysUserRoleReq req){
    	SysUserRole t = req.getT();
        Page page = new Page<>(req.getCurrent(), req.getSize());
        EntityWrapper<SysUserRole> queryWrapper = new EntityWrapper<>();
		if(null != t){
			//条件
		}
        if(baseMapper.selectPage(page, queryWrapper) != null) {
            page.setRecords(baseMapper.selectPage(page, queryWrapper));
            page.setTotal(baseMapper.selectPage(page, queryWrapper).size());
        }
        return page;
    }
    public int add(AddSysUserRoleReq req){
        SysUserRole data = new  SysUserRole();
        BeanUtils.copyProperties(req.getT(), data);
        data.setCreateTime(new Date());
        baseMapper.insert(data);
        return data.getId();
    }
    public int modify(UpdateSysUserRoleReq req){
        SysUserRole data = new  SysUserRole();
        BeanUtils.copyProperties(req.getT(), data);
        return baseMapper.updateById(data);
    }
    public int delete(Integer id){
        return baseMapper.deleteById(id);

    }
    public SysUserRole get(Integer id){
        return baseMapper.selectById(id);
    }
}