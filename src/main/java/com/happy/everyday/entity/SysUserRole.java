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
* SysUserRole对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@TableName("sys_user_role")
public class SysUserRole extends Model<SysUserRole> {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("user_id")
    private Integer userId;
    @TableField("role_id")
    private Integer roleId;
    private String status;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_name")
    private Date updateName;
    @Override
    protected Serializable pkVal() {
         return this.id;
    }
}