package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysRole;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;
/**
* <p>
* PageSysRoleReq对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "ListSysRole列表请求对象", description = "")
public class PageSysRoleReq extends Page<SysRole> implements Serializable {
	private static final long serialVersionUID = 1L;
    private SysRole t;
}