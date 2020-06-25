package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysMenu;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* <p>
* UpdateSysMenuReq 请求对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "SysMenu更新请求对象", description = "")
public class UpdateSysMenuReq extends BaseReq<SysMenu> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "", required = true)
    private Integer id;
}