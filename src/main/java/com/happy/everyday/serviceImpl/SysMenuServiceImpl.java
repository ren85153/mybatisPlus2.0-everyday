package com.happy.everyday.serviceImpl;

import com.happy.everyday.entity.SysUser;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.happy.everyday.base.BaseResult;
import com.happy.everyday.reqVo.AddSysMenuReq;
import com.happy.everyday.reqVo.UpdateSysMenuReq;
import com.happy.everyday.reqVo.ListSysMenuReq;
import com.happy.everyday.reqVo.PageSysMenuReq;
import com.happy.everyday.mapper.SysMenuMapper;
import com.happy.everyday.service.SysMenuService;
import com.happy.everyday.entity.SysMenu;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.happy.everyday.base.BasePage;

/**
* <p>
* SysMenu服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {
    public List<SysMenu> list(ListSysMenuReq req){
        SysMenu t = req.getT();
        EntityWrapper<SysMenu> queryWrapper = new EntityWrapper<>();
        if(null != t) {
            //条件
            queryWrapper.like(!StringUtils.isEmpty(t.getMenuName()), "menu_name", t.getMenuName())
                    .eq(!StringUtils.isEmpty(t.getMenuType()), "menu_type", t.getMenuType())
                    .like(!StringUtils.isEmpty(t.getMenuLevel()), "menu_level", t.getMenuLevel())
                    .eq(!StringUtils.isEmpty(t.getStatus()), "status", t.getStatus());
        }
        return baseMapper.selectList(queryWrapper);
    }
    public Page page(PageSysMenuReq req){
    	SysMenu t = req.getT();
        Page page = new Page<>(req.getCurrentPage(), req.getPageSize());
        EntityWrapper<SysMenu> queryWrapper = new EntityWrapper<>();
		if(null != t){
            //条件
            queryWrapper.like(!StringUtils.isEmpty(t.getMenuName()), "menu_name", t.getMenuName())
                    .eq(!StringUtils.isEmpty(t.getMenuType()), "menu_type", t.getMenuType())
                    .like(!StringUtils.isEmpty(t.getMenuLevel()), "menu_level", t.getMenuLevel())
                    .eq(!StringUtils.isEmpty(t.getStatus()), "status", t.getStatus());
		}
        List<SysMenu> records = baseMapper.selectPage(page, queryWrapper);
        if(records != null) {
            page.setRecords(records);
            page.setTotal(baseMapper.selectCount(queryWrapper));
        }
        return page;
    }
    public int add(AddSysMenuReq req){
        SysMenu data = new  SysMenu();
        BeanUtils.copyProperties(req.getT(), data);
        data.setCreateTime(new Date());
        baseMapper.insert(data);
        return data.getId();
    }
    public int modify(UpdateSysMenuReq req){
        SysMenu data = new  SysMenu();
        BeanUtils.copyProperties(req.getT(), data);
        data.setUpdateTime(new Date());
        return baseMapper.updateById(data);
    }
    public int delete(Integer id){
        return baseMapper.deleteById(id);

    }
    public SysMenu get(Integer id){
        return baseMapper.selectById(id);
    }
}