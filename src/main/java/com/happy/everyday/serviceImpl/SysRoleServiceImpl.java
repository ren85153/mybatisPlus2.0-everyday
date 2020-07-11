package com.happy.everyday.serviceImpl;

import com.happy.everyday.entity.SysUser;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.happy.everyday.base.BaseResult;
import com.happy.everyday.reqVo.AddSysRoleReq;
import com.happy.everyday.reqVo.UpdateSysRoleReq;
import com.happy.everyday.reqVo.ListSysRoleReq;
import com.happy.everyday.reqVo.PageSysRoleReq;
import com.happy.everyday.mapper.SysRoleMapper;
import com.happy.everyday.service.SysRoleService;
import com.happy.everyday.entity.SysRole;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.happy.everyday.base.BasePage;

/**
* <p>
* SysRole服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    public List<SysRole> list(ListSysRoleReq req){
        SysRole t = req.getT();
        EntityWrapper<SysRole> queryWrapper = new EntityWrapper<>();
        if(null != t) {
            //条件
            queryWrapper.like(!StringUtils.isEmpty(t.getRoleName()), "role_name", t.getRoleName())
                    .like(!StringUtils.isEmpty(t.getRoleCode()), "role_code", t.getRoleCode())
                    .eq(!StringUtils.isEmpty(t.getStatus()), "status", t.getStatus());
        }
        return baseMapper.selectList(queryWrapper);
    }
    public Page page(PageSysRoleReq req){
    	SysRole t = req.getT();
        Page page = new Page<>(req.getCurrent(), req.getSize());
        EntityWrapper<SysRole> queryWrapper = new EntityWrapper<>();
        if(null != t) {
            //条件
            queryWrapper.like(!StringUtils.isEmpty(t.getRoleName()), "role_name", t.getRoleName())
                    .like(!StringUtils.isEmpty(t.getRoleCode()), "role_code", t.getRoleCode())
                    .eq(!StringUtils.isEmpty(t.getStatus()), "status", t.getStatus());
        }
        List<SysRole> records = baseMapper.selectPage(page, queryWrapper);
        if(records != null) {
            page.setRecords(records);
            page.setTotal(baseMapper.selectCount(queryWrapper));
        }
        return page;
    }
    public int add(AddSysRoleReq req){
        SysRole data = new  SysRole();
        BeanUtils.copyProperties(req.getT(), data);
        data.setCreateTime(new Date());
        baseMapper.insert(data);
        return data.getId();
    }
    public int modify(UpdateSysRoleReq req){
        SysRole data = new  SysRole();
        BeanUtils.copyProperties(req.getT(), data);
        data.setUpdateTime(new Date());
        return baseMapper.updateById(data);
    }
    public int delete(Integer id){
        return baseMapper.deleteById(id);

    }
    public SysRole get(Integer id){
        return baseMapper.selectById(id);
    }
}