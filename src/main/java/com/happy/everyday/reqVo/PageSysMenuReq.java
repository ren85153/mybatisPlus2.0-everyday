package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysMenu;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;
/**
* <p>
* PageSysMenuReq对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "ListSysMenu列表请求对象", description = "")
public class PageSysMenuReq extends Page<SysMenu> implements Serializable {
	private static final long serialVersionUID = 1L;
    private SysMenu t;
}