package com.happy.everyday.entity;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.util.Date;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;
/**
* <p>
* SysDict对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@TableName("sys_dict")
public class SysDict extends Model<SysDict> {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "字典名称")
    @TableField("dict_name")
    private String dictName;
    @ApiModelProperty(value = "字典编码")
    @TableField("dict_code")
    private String dictCode;
    @ApiModelProperty(value = "字典类型")
    @TableField("dict_type")
    private String dictType;
    @ApiModelProperty(value = "组名")
    @TableField("group_name")
    private String groupName;
    @ApiModelProperty(value = "组编码")
    @TableField("group_code")
    private String groupCode;
    @ApiModelProperty(value = "父级id")
    @TableField("parent_id")
    private Integer parentId;
    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "排序")
    @TableField("dict_order")
    private String dictOrder;
    @ApiModelProperty(value = "备注")
    private String remark;
    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;
    @ApiModelProperty(value = "创建人id")
    @TableField("create_id")
    private Integer createId;
    @ApiModelProperty(value = "创建人姓名")
    @TableField("create_name")
    private String createName;
    @ApiModelProperty(value = "修改时间")
    @TableField("update_time")
    private Date updateTime;
    @ApiModelProperty(value = "修改人id")
    @TableField("update_id")
    private Integer updateId;
    @ApiModelProperty(value = "修改人姓名")
    @TableField("update_name")
    private String updateName;
    @ApiModelProperty(value = "扩展")
    private String reserve;
    @ApiModelProperty(value = "扩展1")
    private String reserve1;
    @ApiModelProperty(value = "扩展2")
    private String reserve2;
    @ApiModelProperty(value = "扩展3")
    private String reserve3;
    @ApiModelProperty(value = "扩展4")
    private Integer reserve4;
    @ApiModelProperty(value = "扩展5")
    private Date reserve5;
    @Override
    protected Serializable pkVal() {
         return this.id;
    }
}