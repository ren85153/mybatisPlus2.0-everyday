package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysUserRole;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* <p>
* UpdateSysUserRoleReq 请求对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "SysUserRole更新请求对象", description = "")
public class UpdateSysUserRoleReq extends BaseReq<SysUserRole> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "", required = true)
    private Integer id;
}