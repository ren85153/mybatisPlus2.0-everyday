package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysRole;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.BaseReq;
import io.swagger.annotations.ApiModel;
/**
* <p>
* AddSysRoleReq 请求对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "SysRole新增请求对象", description = "")
public class AddSysRoleReq extends BaseReq<SysRole> implements Serializable {
    private static final long serialVersionUID = 1L;


}