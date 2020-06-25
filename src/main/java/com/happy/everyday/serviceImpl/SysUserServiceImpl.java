package com.happy.everyday.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.happy.everyday.base.BaseResult;
import com.happy.everyday.reqVo.AddSysUserReq;
import com.happy.everyday.reqVo.UpdateSysUserReq;
import com.happy.everyday.reqVo.ListSysUserReq;
import com.happy.everyday.reqVo.PageSysUserReq;
import com.happy.everyday.mapper.SysUserMapper;
import com.happy.everyday.service.SysUserService;
import com.happy.everyday.entity.SysUser;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.happy.everyday.base.BasePage;

/**
* <p>
* SysUser服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    public List<SysUser> list(ListSysUserReq req){
        String keyword = req.getKeyword();
        EntityWrapper<SysUser> queryWrapper = new EntityWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            queryWrapper.like("", req.getKeyword());
        }
        return baseMapper.selectList(queryWrapper);
    }
    public Page page(PageSysUserReq req){
    	SysUser t = req.getT();
        Page page = new Page<>(req.getCurrent(), req.getSize());
        EntityWrapper<SysUser> queryWrapper = new EntityWrapper<>();
		if(null != t){
			//条件
		}
        if(baseMapper.selectPage(page, queryWrapper) != null) {
            page.setRecords(baseMapper.selectPage(page, queryWrapper));
            page.setTotal(baseMapper.selectPage(page, queryWrapper).size());
        }
        return page;
    }
    public int add(AddSysUserReq req){
        SysUser data = new  SysUser();
        BeanUtils.copyProperties(req.getT(), data);
        data.setCreateTime(new Date());
        baseMapper.insert(data);
        return data.getId();
    }
    public int modify(UpdateSysUserReq req){
        SysUser data = new  SysUser();
        BeanUtils.copyProperties(req.getT(), data);
        data.setUpdateTime(new Date());
        return baseMapper.updateById(data);
    }
    public int delete(Integer id){
        return baseMapper.deleteById(id);

    }
    public SysUser get(Integer id){
        return baseMapper.selectById(id);
    }
}