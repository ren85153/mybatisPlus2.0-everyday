package com.happy.everyday.serviceImpl;

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
        String keyword = req.getKeyword();
        EntityWrapper<SysMenu> queryWrapper = new EntityWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            queryWrapper.like("", req.getKeyword());
        }
        return baseMapper.selectList(queryWrapper);
    }
    public Page page(PageSysMenuReq req){
    	SysMenu t = req.getT();
        Page page = new Page<>(req.getCurrent(), req.getSize());
        EntityWrapper<SysMenu> queryWrapper = new EntityWrapper<>();
		if(null != t){
			//条件
		}
        if(baseMapper.selectPage(page, queryWrapper) != null) {
            page.setRecords(baseMapper.selectPage(page, queryWrapper));
            page.setTotal(baseMapper.selectPage(page, queryWrapper).size());
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