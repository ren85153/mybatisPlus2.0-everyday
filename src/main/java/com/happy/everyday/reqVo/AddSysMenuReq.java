package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysMenu;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.BaseReq;
import io.swagger.annotations.ApiModel;
/**
* <p>
* AddSysMenuReq 请求对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "SysMenu新增请求对象", description = "")
public class AddSysMenuReq extends BaseReq<SysMenu> implements Serializable {
    private static final long serialVersionUID = 1L;


}