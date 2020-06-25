/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.26-log : Database - study
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`study` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `study`;

/*Table structure for table `sys_dict` */

DROP TABLE IF EXISTS `sys_dict`;

CREATE TABLE `sys_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dict_name` varchar(32) DEFAULT NULL COMMENT '字典名称',
  `dict_code` varchar(32) DEFAULT NULL COMMENT '字典编码',
  `dict_type` char(2) DEFAULT NULL COMMENT '字典类型',
  `group_name` varchar(32) DEFAULT NULL COMMENT '组名',
  `group_code` varchar(32) DEFAULT NULL COMMENT '组编码',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级id',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `dict_order` varchar(2) DEFAULT NULL COMMENT '排序',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `create_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人姓名',
  `update_time` date DEFAULT NULL COMMENT '修改时间',
  `update_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `update_name` varchar(32) DEFAULT NULL COMMENT '修改人姓名',
  `reserve` varchar(100) DEFAULT NULL COMMENT '扩展',
  `reserve1` varchar(100) DEFAULT NULL COMMENT '扩展1',
  `reserve2` varchar(200) DEFAULT NULL COMMENT '扩展2',
  `reserve3` varchar(200) DEFAULT NULL COMMENT '扩展3',
  `reserve4` int(11) DEFAULT NULL COMMENT '扩展4',
  `reserve5` date DEFAULT NULL COMMENT '扩展5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Table structure for table `sys_logs` */

DROP TABLE IF EXISTS `sys_logs`;

CREATE TABLE `sys_logs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `oper_type` char(1) DEFAULT NULL COMMENT '操作类型',
  `oper_content` varchar(1000) DEFAULT NULL COMMENT '操作内容',
  `create_time` date DEFAULT NULL COMMENT '操作时间',
  `create_id` int(11) DEFAULT NULL COMMENT '操作人',
  `ip` varchar(32) DEFAULT NULL COMMENT 'IP地址',
  `reserve` varchar(100) DEFAULT NULL COMMENT '扩展',
  `reserve1` varchar(100) DEFAULT NULL COMMENT '扩展1',
  `reserve2` varchar(200) DEFAULT NULL COMMENT '扩展2',
  `reserve3` varchar(200) DEFAULT NULL COMMENT '扩展3',
  `reserve4` int(11) DEFAULT NULL COMMENT '扩展4',
  `reserve5` date DEFAULT NULL COMMENT '扩展5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `sys_menu` */

DROP TABLE IF EXISTS `sys_menu`;

CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(32) DEFAULT NULL COMMENT '菜单名称',
  `menu_type` char(1) DEFAULT NULL COMMENT '菜单类型',
  `menu_level` varchar(2) DEFAULT NULL COMMENT '菜单等级',
  `menu_url` varchar(200) DEFAULT NULL COMMENT '菜单路径',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级id',
  `menu_icon` varchar(100) DEFAULT NULL COMMENT '菜单图标',
  `menu_order` varchar(3) DEFAULT NULL COMMENT '菜单顺序',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `create_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人姓名',
  `update_time` date DEFAULT NULL COMMENT '修改时间',
  `update_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `update_name` varchar(32) DEFAULT NULL COMMENT '修改人姓名',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `reserve` varchar(100) DEFAULT NULL COMMENT '扩展',
  `reserve1` varchar(100) DEFAULT NULL COMMENT '扩展1',
  `reserve2` varchar(200) DEFAULT NULL COMMENT '扩展2',
  `reserve3` varchar(200) DEFAULT NULL COMMENT '扩展3',
  `reserve4` int(11) DEFAULT NULL COMMENT '扩展4',
  `reserve5` date DEFAULT NULL COMMENT '扩展5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(32) DEFAULT NULL COMMENT '角色名称',
  `role_type` char(1) DEFAULT NULL COMMENT '角色类型',
  `role_code` varchar(32) DEFAULT NULL COMMENT '角色编码',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `create_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人姓名',
  `update_time` date DEFAULT NULL COMMENT '修改时间',
  `update_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `update_name` varchar(32) DEFAULT NULL COMMENT '修改人姓名',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `reserve` varchar(100) DEFAULT NULL COMMENT '扩展',
  `reserve1` varchar(100) DEFAULT NULL COMMENT '扩展1',
  `reserve2` varchar(200) DEFAULT NULL COMMENT '扩展2',
  `reserve3` varchar(200) DEFAULT NULL COMMENT '扩展3',
  `reserve4` int(11) DEFAULT NULL COMMENT '扩展4',
  `reserve5` date DEFAULT NULL COMMENT '扩展5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Table structure for table `sys_role_menu` */

DROP TABLE IF EXISTS `sys_role_menu`;

CREATE TABLE `sys_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_name` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `account` varchar(32) DEFAULT NULL COMMENT '账号',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `telephone` varchar(15) DEFAULT NULL COMMENT '手机号',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `cart_type` varchar(2) DEFAULT NULL COMMENT '证件类型',
  `cart_no` varchar(32) DEFAULT NULL COMMENT '证件号码',
  `nationality` varchar(4) DEFAULT NULL COMMENT '国籍',
  `birth` date DEFAULT NULL COMMENT '生日',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `error_count` int(11) DEFAULT NULL COMMENT '登录错误次数',
  `login_ip` varchar(32) DEFAULT NULL COMMENT '登录IP',
  `login_mac` varchar(32) DEFAULT NULL COMMENT '登录mac地址',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `create_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(32) DEFAULT NULL COMMENT '创建人姓名',
  `update_time` date DEFAULT NULL COMMENT '修改时间',
  `update_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `update_name` varchar(32) DEFAULT NULL COMMENT '修改人姓名',
  `account_type` char(1) DEFAULT NULL COMMENT '账号类型',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `reserve` varchar(100) DEFAULT NULL COMMENT '扩展',
  `reserve1` varchar(100) DEFAULT NULL COMMENT '扩展1',
  `reserve2` varchar(200) DEFAULT NULL COMMENT '扩展2',
  `reserve3` varchar(200) DEFAULT NULL COMMENT '扩展3',
  `reserve4` int(11) DEFAULT NULL COMMENT '扩展4',
  `reserve5` date DEFAULT NULL COMMENT '扩展5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_name` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
