package com.happy.everyday.reqVo;

import com.happy.everyday.entity.SysDict;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.happy.everyday.base.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;
/**
* <p>
* PageSysDictReq对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@ApiModel(value = "ListSysDict列表请求对象", description = "")
public class PageSysDictReq implements Serializable {
	private static final long serialVersionUID = 1L;
    private SysDict t;
    private int currentPage;
    private int pageSize;
}