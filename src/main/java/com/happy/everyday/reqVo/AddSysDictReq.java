package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysDict;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.BaseReq;
import io.swagger.annotations.ApiModel;
/**
* <p>
* AddSysDictReq 请求对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "SysDict新增请求对象", description = "")
public class AddSysDictReq extends BaseReq<SysDict> implements Serializable {
    private static final long serialVersionUID = 1L;


}