package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysLogs;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;
/**
* <p>
* PageSysLogsReq对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "ListSysLogs列表请求对象", description = "")
public class PageSysLogsReq extends Page<SysLogs> implements Serializable {
	private static final long serialVersionUID = 1L;
    private SysLogs t;
}