package com.happy.everyday.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Date;
import com.happy.everyday.base.BaseResult;
import com.happy.everyday.reqVo.AddSysDictReq;
import com.happy.everyday.reqVo.UpdateSysDictReq;
import com.happy.everyday.reqVo.ListSysDictReq;
import com.happy.everyday.reqVo.PageSysDictReq;
import com.happy.everyday.mapper.SysDictMapper;
import com.happy.everyday.service.SysDictService;
import com.happy.everyday.entity.SysDict;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.happy.everyday.base.BasePage;

/**
* <p>
* SysDict服务类
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements SysDictService {
    public List<SysDict> list(ListSysDictReq req){
        SysDict t = req.getT();
        EntityWrapper<SysDict> queryWrapper = new EntityWrapper<>();
        if(null != t){
            //条件
            queryWrapper.eq(!StringUtils.isEmpty(t.getGroupCode()),"group_code",t.getGroupCode())
                    .like(!StringUtils.isEmpty(t.getDictName()),"dict_name",t.getDictName())
                    .eq(!StringUtils.isEmpty(t.getDictCode()),"dict_code",t.getDictCode())
                    .eq(!StringUtils.isEmpty(t.getParentId()),"parent_id",t.getParentId())
                    .like(!StringUtils.isEmpty(t.getGroupName()),"group_name",t.getGroupName())
                    .eq(!StringUtils.isEmpty(t.getStatus()),"status",t.getStatus());
        }
        return baseMapper.selectList(queryWrapper);
    }
    public Page page(PageSysDictReq req){
    	SysDict t = req.getT();
        Page page = new Page<>(req.getCurrent(), req.getSize());
        EntityWrapper<SysDict> queryWrapper = new EntityWrapper<>();
		if(null != t){
			//条件
            queryWrapper.eq(!StringUtils.isEmpty(t.getGroupCode()),"group_code",t.getGroupCode())
                    .like(!StringUtils.isEmpty(t.getDictName()),"dict_name",t.getDictName())
                    .eq(!StringUtils.isEmpty(t.getDictCode()),"dict_code",t.getDictCode())
                    .eq(!StringUtils.isEmpty(t.getParentId()),"parent_id",t.getParentId())
                    .like(!StringUtils.isEmpty(t.getGroupName()),"group_name",t.getGroupName())
                    .eq(!StringUtils.isEmpty(t.getStatus()),"status",t.getStatus());
		}
        List<SysDict> records = baseMapper.selectPage(page, queryWrapper);
        if(records != null) {
            page.setRecords(records);
            page.setTotal(baseMapper.selectCount(queryWrapper));
        }
        return page;
    }
    public int add(AddSysDictReq req){
        SysDict data = new  SysDict();
        BeanUtils.copyProperties(req.getT(), data);
        baseMapper.insert(data);
        return data.getId();
    }
    public int modify(UpdateSysDictReq req){
        SysDict data = new  SysDict();
        BeanUtils.copyProperties(req.getT(), data);
        return baseMapper.updateById(data);
    }
    public int delete(Integer id){
        return baseMapper.deleteById(id);

    }
    public SysDict get(Integer id){
        return baseMapper.selectById(id);
    }
}