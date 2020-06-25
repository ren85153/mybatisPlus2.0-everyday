package com.happy.everyday.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.happy.everyday.base.BaseResult;
import com.happy.everyday.reqVo.AddSysRoleMenuReq;
import com.happy.everyday.reqVo.UpdateSysRoleMenuReq;
import com.happy.everyday.reqVo.ListSysRoleMenuReq;
import com.happy.everyday.reqVo.PageSysRoleMenuReq;
import com.happy.everyday.mapper.SysRoleMenuMapper;
import com.happy.everyday.service.SysRoleMenuService;
import com.happy.everyday.entity.SysRoleMenu;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.happy.everyday.base.BasePage;

/**
* <p>
* SysRoleMenu服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {
    public List<SysRoleMenu> list(ListSysRoleMenuReq req){
        String keyword = req.getKeyword();
        EntityWrapper<SysRoleMenu> queryWrapper = new EntityWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            queryWrapper.like("", req.getKeyword());
        }
        return baseMapper.selectList(queryWrapper);
    }
    public Page page(PageSysRoleMenuReq req){
    	SysRoleMenu t = req.getT();
        Page page = new Page<>(req.getCurrent(), req.getSize());
        EntityWrapper<SysRoleMenu> queryWrapper = new EntityWrapper<>();
		if(null != t){
			//条件
		}
        if(baseMapper.selectPage(page, queryWrapper) != null) {
            page.setRecords(baseMapper.selectPage(page, queryWrapper));
            page.setTotal(baseMapper.selectPage(page, queryWrapper).size());
        }
        return page;
    }
    public int add(AddSysRoleMenuReq req){
        SysRoleMenu data = new  SysRoleMenu();
        BeanUtils.copyProperties(req.getT(), data);
        data.setCreateTime(new Date());
        baseMapper.insert(data);
        return data.getId();
    }
    public int modify(UpdateSysRoleMenuReq req){
        SysRoleMenu data = new  SysRoleMenu();
        BeanUtils.copyProperties(req.getT(), data);
        return baseMapper.updateById(data);
    }
    public int delete(Integer id){
        return baseMapper.deleteById(id);

    }
    public SysRoleMenu get(Integer id){
        return baseMapper.selectById(id);
    }
}