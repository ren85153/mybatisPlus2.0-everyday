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
* SysUser对象
* </p>
*
* @author yanghui
* @since 2020-06-21
*/
@Data
@TableName("sys_user")
public class SysUser extends Model<SysUser> {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "姓名")
    @TableField("user_name")
    private String userName;
    @ApiModelProperty(value = "账号")
    private String account;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "手机号")
    private String telephone;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "证件类型")
    @TableField("cart_type")
    private String cartType;
    @ApiModelProperty(value = "证件号码")
    @TableField("cart_no")
    private String cartNo;
    @ApiModelProperty(value = "国籍")
    private String nationality;
    @ApiModelProperty(value = "生日")
    private Date birth;
    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "登录错误次数")
    @TableField("error_count")
    private Integer errorCount;
    @ApiModelProperty(value = "登录IP")
    @TableField("login_ip")
    private String loginIp;
    @ApiModelProperty(value = "登录mac地址")
    @TableField("login_mac")
    private String loginMac;
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
    @ApiModelProperty(value = "账号类型")
    @TableField("account_type")
    private String accountType;
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