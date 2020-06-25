package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysLogs;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* <p>
* ListSysLogsReq对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "ListSysLogs列表请求对象", description = "")
public class ListSysLogsReq extends BaseReq<SysLogs> implements Serializable {
    @ApiModelProperty(value = "关键字查询", required = false)
    private String keyword;
}