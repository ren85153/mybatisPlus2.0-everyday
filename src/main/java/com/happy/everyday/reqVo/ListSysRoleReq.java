package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysRole;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* <p>
* ListSysRoleReq对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "ListSysRole列表请求对象", description = "")
public class ListSysRoleReq extends BaseReq<SysRole> implements Serializable {
    @ApiModelProperty(value = "关键字查询", required = false)
    private String keyword;
}