package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysLogs;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.BaseReq;
import io.swagger.annotations.ApiModel;
/**
* <p>
* AddSysLogsReq 请求对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "SysLogs新增请求对象", description = "")
public class AddSysLogsReq extends BaseReq<SysLogs> implements Serializable {
    private static final long serialVersionUID = 1L;


}