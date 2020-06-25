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
* SysRole对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@TableName("sys_role")
public class SysRole extends Model<SysRole> {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "角色名称")
    @TableField("role_name")
    private String roleName;
    @ApiModelProperty(value = "角色类型")
    @TableField("role_type")
    private String roleType;
    @ApiModelProperty(value = "角色编码")
    @TableField("role_code")
    private String roleCode;
    @ApiModelProperty(value = "状态")
    private String status;
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
    @ApiModelProperty(value = "备注")
    private String remark;
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