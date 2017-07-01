/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : cloud_manager

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-01 20:26:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for d_alarm
-- ----------------------------
DROP TABLE IF EXISTS `d_alarm`;
CREATE TABLE `d_alarm` (
  `id` int(11) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `comment` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_alarm
-- ----------------------------

-- ----------------------------
-- Table structure for d_cpt_node
-- ----------------------------
DROP TABLE IF EXISTS `d_cpt_node`;
CREATE TABLE `d_cpt_node` (
  `id` smallint(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '节点名称',
  `server_tag` varchar(50) NOT NULL COMMENT '服务编号',
  `category` enum('Hadoop','Spark') NOT NULL COMMENT '节点类型',
  `state` enum('睡眠','休眠','待机') NOT NULL COMMENT '节点状态',
  PRIMARY KEY (`id`),
  KEY `fk_computer_node_example` (`server_tag`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_cpt_node
-- ----------------------------
INSERT INTO `d_cpt_node` VALUES ('1', '一楼1号房', 'a1001', 'Hadoop', '待机');
INSERT INTO `d_cpt_node` VALUES ('2', '一楼2号房', 'a1002', 'Spark', '休眠');
INSERT INTO `d_cpt_node` VALUES ('3', '一楼3号房', 'a1003', 'Hadoop', '睡眠');
INSERT INTO `d_cpt_node` VALUES ('6', '测试', 'winxp-sp3-32bit', 'Hadoop', '待机');
INSERT INTO `d_cpt_node` VALUES ('7', '555', 'winxp-sp3-32bit', 'Hadoop', '待机');
INSERT INTO `d_cpt_node` VALUES ('9', 'dsa', 'winxp-sp3-32bit', 'Hadoop', '待机');
INSERT INTO `d_cpt_node` VALUES ('10', 'dsa', 'winxp-sp3-32bit', 'Hadoop', '待机');
INSERT INTO `d_cpt_node` VALUES ('11', 'dsa', 'winxp-sp3-32bit', 'Hadoop', '待机');
INSERT INTO `d_cpt_node` VALUES ('12', 'dsa', 'winxp-sp3-32bit', 'Hadoop', '待机');
INSERT INTO `d_cpt_node` VALUES ('13', 'dsa', 'winxp-sp3-32bit', 'Hadoop', '待机');
INSERT INTO `d_cpt_node` VALUES ('14', 'dsa', 'winxp-sp3-32bit', 'Hadoop', '待机');

-- ----------------------------
-- Table structure for d_example
-- ----------------------------
DROP TABLE IF EXISTS `d_example`;
CREATE TABLE `d_example` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `service_tag` varchar(50) NOT NULL COMMENT '服务编号',
  `intranet` varchar(25) NOT NULL COMMENT '内网',
  `public_ip` varchar(25) NOT NULL COMMENT '公网IP',
  `state` enum('运行中','关闭','故障') NOT NULL COMMENT '状态',
  `specification` varchar(50) NOT NULL COMMENT '规格',
  PRIMARY KEY (`id`),
  KEY `fk_example_server` (`public_ip`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_example
-- ----------------------------
INSERT INTO `d_example` VALUES ('18', 'ceshi-1004', '179.122.3.5', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('19', 'ceshi-10012', '179.122.3.2', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('20', 'ceshi-10013', '179.122.3.4', '1', '关闭', '1G');
INSERT INTO `d_example` VALUES ('21', 'ceshi-10014', '179.122.3.25', '2', '运行中', '2G');
INSERT INTO `d_example` VALUES ('22', 'ceshi-10015', '179.122.3.23', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('23', 'ceshi-10016', '179.122.3.21', '1', '运行中', '5G');
INSERT INTO `d_example` VALUES ('25', 'ceshi-1006', '179.122.3.30', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('26', 'ceshi-1002', '179.122.3.26', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('28', 'ceshi-10026', '179.122.3.29', '1', '运行中', '8G');
INSERT INTO `d_example` VALUES ('29', 'ceshi-1002', '179.122.3.28', '1', '运行中', '7G');
INSERT INTO `d_example` VALUES ('31', 'ceshi-1002', '179.122.3.2', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('32', 'ceshi-1007', '179.122.3.15', '1', '运行中', '9G');
INSERT INTO `d_example` VALUES ('33', 'ceshi-10019', '179.122.3.2', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('34', 'ceshi-1002', '179.122.3.2', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('35', 'ceshi-1008', '179.122.3.8', '1', '故障', '2G');
INSERT INTO `d_example` VALUES ('36', 'ceshi-10025', '179.122.3.10', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('37', 'ceshi-1002', '179.122.3.31', '1', '运行中', '20G');
INSERT INTO `d_example` VALUES ('38', 'ceshi-1002', '179.122.3.2', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('39', 'ceshi-1009', '179.122.3.9', '1', '故障', '2G');
INSERT INTO `d_example` VALUES ('40', 'ceshi-10018', '179.122.3.2', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('41', 'ceshi-1002', '179.122.3.2', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('42', 'ceshi-10010', '179.122.3.11', '1', '运行中', '10G');
INSERT INTO `d_example` VALUES ('43', 'ceshi-1002', '179.122.3.12', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('44', 'ceshi-10020', '179.122.3.13', '1', '关闭', '15G');
INSERT INTO `d_example` VALUES ('45', 'ceshi-10021', '179.122.3.14', '1', '运行中', '2G');
INSERT INTO `d_example` VALUES ('46', 'ceshi-10022', '179.122.3.22', '1', '关闭', '2G');
INSERT INTO `d_example` VALUES ('47', 'ceshi-10023', '179.122.3.2', '1', '运行中', '8G');
INSERT INTO `d_example` VALUES ('54', 'wanshang', '45', '654', '运行中', '12G');
INSERT INTO `d_example` VALUES ('70', 'winxp-sp3-32bit', '46345', '45', '运行中', '12G');

-- ----------------------------
-- Table structure for d_menu
-- ----------------------------
DROP TABLE IF EXISTS `d_menu`;
CREATE TABLE `d_menu` (
  `id` smallint(4) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `level` tinyint(1) unsigned NOT NULL,
  `parent_id` smallint(4) unsigned NOT NULL COMMENT 'At least point to itself',
  `parent_id_list` varchar(255) NOT NULL COMMENT 'At least point to itself',
  `active` tinyint(1) unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_menu
-- ----------------------------
INSERT INTO `d_menu` VALUES ('1001', '用户管理', '1', '1001', '1001', '1');

-- ----------------------------
-- Table structure for d_message
-- ----------------------------
DROP TABLE IF EXISTS `d_message`;
CREATE TABLE `d_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `push_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '推送时间',
  `comment` text NOT NULL COMMENT '推送消息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_message
-- ----------------------------
INSERT INTO `d_message` VALUES ('1', '2017-06-22 15:29:22', '测试1');
INSERT INTO `d_message` VALUES ('2', '2017-06-17 15:30:04', '测试2');
INSERT INTO `d_message` VALUES ('3', '2017-06-22 15:30:48', '测试3');
INSERT INTO `d_message` VALUES ('4', '2017-06-22 15:31:12', '测试3');
INSERT INTO `d_message` VALUES ('5', '2017-06-22 15:31:14', '测试3');
INSERT INTO `d_message` VALUES ('6', '2017-06-22 15:31:16', '测试3');
INSERT INTO `d_message` VALUES ('7', '2017-06-22 15:31:18', '测试3');
INSERT INTO `d_message` VALUES ('8', '2017-06-22 15:31:19', '测试3');
INSERT INTO `d_message` VALUES ('9', '2017-06-22 15:31:21', '测试3');
INSERT INTO `d_message` VALUES ('10', '2017-06-22 15:31:23', '测试3');
INSERT INTO `d_message` VALUES ('11', '2017-06-22 15:31:25', '测试3');
INSERT INTO `d_message` VALUES ('13', '2017-06-22 15:31:28', '测试3');
INSERT INTO `d_message` VALUES ('14', '2017-06-22 15:31:29', '测试3');
INSERT INTO `d_message` VALUES ('15', '2017-06-22 15:31:31', '测试3');
INSERT INTO `d_message` VALUES ('16', '2017-06-22 15:31:32', '测试3');
INSERT INTO `d_message` VALUES ('17', '2017-06-22 15:31:33', '测试3');
INSERT INTO `d_message` VALUES ('18', '2017-06-22 15:31:33', '测试3');
INSERT INTO `d_message` VALUES ('20', '2016-08-08 00:00:00', '测试3');
INSERT INTO `d_message` VALUES ('22', '2017-06-23 15:05:16', '测试3');
INSERT INTO `d_message` VALUES ('23', '2017-06-23 15:08:05', '测试3');
INSERT INTO `d_message` VALUES ('25', '2017-06-23 15:10:45', 'asd13987asd');
INSERT INTO `d_message` VALUES ('26', '2017-06-23 15:07:50', 'ccccc');

-- ----------------------------
-- Table structure for d_mirror
-- ----------------------------
DROP TABLE IF EXISTS `d_mirror`;
CREATE TABLE `d_mirror` (
  `id` smallint(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '镜像名称',
  `mirror_system` varchar(100) NOT NULL COMMENT '镜像系统',
  `iso_file` text NOT NULL COMMENT '镜像 iso 文件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_mirror
-- ----------------------------
INSERT INTO `d_mirror` VALUES ('1', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('2', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('3', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('4', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('5', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('6', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('7', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('8', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('9', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('10', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('11', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('12', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('13', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('14', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('15', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('16', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('17', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('18', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('19', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('20', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('21', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('22', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('23', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');
INSERT INTO `d_mirror` VALUES ('24', 'new_windows', 'Windows7win7sp2.ISO', 'new_bigdataWindowsServer2008R2win2008svrR2.ISO');

-- ----------------------------
-- Table structure for d_network
-- ----------------------------
DROP TABLE IF EXISTS `d_network`;
CREATE TABLE `d_network` (
  `id` smallint(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '网络名称',
  `protocol` varchar(255) NOT NULL COMMENT '网络协议',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_network
-- ----------------------------
INSERT INTO `d_network` VALUES ('1', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('2', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('3', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('4', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('5', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('6', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('7', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('8', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('9', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('10', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('11', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('12', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('13', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('14', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('15', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('16', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('17', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('18', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('19', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('20', 'SSID1', '可以将应用程序的信息转换为网络可以传输的数据包');
INSERT INTO `d_network` VALUES ('21', 'SSID2', '可以将应用程序的信息转换为网络可以传输的数据包');

-- ----------------------------
-- Table structure for d_order
-- ----------------------------
DROP TABLE IF EXISTS `d_order`;
CREATE TABLE `d_order` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_tag` varchar(50) NOT NULL COMMENT '订单编号',
  `username` varchar(25) NOT NULL DEFAULT '10001' COMMENT '购买账号',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '提交时间',
  `pay` enum('T','F') NOT NULL COMMENT '是否支付',
  `comment` text COMMENT '备注',
  `from_date` datetime DEFAULT NULL COMMENT '开始时间',
  `to_date` datetime DEFAULT NULL COMMENT '到期时间',
  `discount` tinyint(3) NOT NULL DEFAULT '0' COMMENT '折扣',
  `amount` int(11) DEFAULT NULL COMMENT '订单金额',
  PRIMARY KEY (`id`),
  KEY `fk_order_user` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_order
-- ----------------------------
INSERT INTO `d_order` VALUES ('1', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('2', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('3', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('4', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('5', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('6', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('7', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('8', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('9', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('10', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('11', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('12', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('13', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('14', '123123', '10001', '2017-06-21 15:46:57', 'T', null, null, null, '0', null);
INSERT INTO `d_order` VALUES ('15', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('16', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('17', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('18', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('19', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('20', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('21', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('22', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('24', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('25', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('26', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '2');
INSERT INTO `d_order` VALUES ('27', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('28', '123123', '10001', '2017-06-21 11:56:24', 'F', 'none', '2017-06-14 11:56:19', '2017-06-30 11:56:26', '0', '250');
INSERT INTO `d_order` VALUES ('31', '5151651654', 'aasdf', '2017-06-22 00:00:00', 'T', 'sadf', '2017-06-22 00:00:00', '2017-06-22 00:00:00', '5', '452');
INSERT INTO `d_order` VALUES ('33', '123121', '1', '2017-06-22 00:00:00', 'T', '13231', '2017-06-22 00:00:00', '2017-06-22 00:00:00', '0', '23');
INSERT INTO `d_order` VALUES ('34', 'aa就', '12', '2017-06-22 00:00:00', 'T', '123', '2017-06-22 00:00:00', '2017-06-22 00:00:00', '55', '123');
INSERT INTO `d_order` VALUES ('35', '123123', '123', '2017-06-23 00:00:00', 'T', '234234423', '2017-06-06 00:00:00', '2017-06-23 00:00:00', '1', '11');

-- ----------------------------
-- Table structure for d_rc_pool
-- ----------------------------
DROP TABLE IF EXISTS `d_rc_pool`;
CREATE TABLE `d_rc_pool` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `category` enum('public','private') NOT NULL DEFAULT 'public' COMMENT '类型',
  `apply` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否申请',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_rc_pool
-- ----------------------------
INSERT INTO `d_rc_pool` VALUES ('2', '共享资源6', 'public', '0');
INSERT INTO `d_rc_pool` VALUES ('3', '共享资源4', 'public', '0');
INSERT INTO `d_rc_pool` VALUES ('4', '共享资源8', 'public', '0');
INSERT INTO `d_rc_pool` VALUES ('5', '共享资源9', 'public', '0');
INSERT INTO `d_rc_pool` VALUES ('7', '共享资源5', 'public', '0');
INSERT INTO `d_rc_pool` VALUES ('8', '共享资源4', 'public', '0');
INSERT INTO `d_rc_pool` VALUES ('9', '共享资源3', 'public', '0');
INSERT INTO `d_rc_pool` VALUES ('10', '联通共享资源池1', 'public', '1');
INSERT INTO `d_rc_pool` VALUES ('11', '私用资源2', 'private', '1');
INSERT INTO `d_rc_pool` VALUES ('12', '私用资源3', 'private', '1');
INSERT INTO `d_rc_pool` VALUES ('13', '私用资源4', 'private', '0');
INSERT INTO `d_rc_pool` VALUES ('14', '私用资源5', 'private', '0');
INSERT INTO `d_rc_pool` VALUES ('15', '私用资源6', 'private', '0');
INSERT INTO `d_rc_pool` VALUES ('16', '联通共享资源池2', 'public', '0');
INSERT INTO `d_rc_pool` VALUES ('18', '联通共享资源池2', 'public', '1');
INSERT INTO `d_rc_pool` VALUES ('19', '联通共享资源池2', 'public', '1');
INSERT INTO `d_rc_pool` VALUES ('20', '联通共享资源池2', 'public', '1');
INSERT INTO `d_rc_pool` VALUES ('21', '联通共享资源池2', 'public', '1');
INSERT INTO `d_rc_pool` VALUES ('22', '联通共享资源池2', 'public', '1');
INSERT INTO `d_rc_pool` VALUES ('23', '联通共享资源池2', 'public', '1');
INSERT INTO `d_rc_pool` VALUES ('24', '联通共享资源池2', 'public', '1');
INSERT INTO `d_rc_pool` VALUES ('25', '电信共享资源池1', 'public', '0');

-- ----------------------------
-- Table structure for d_role
-- ----------------------------
DROP TABLE IF EXISTS `d_role`;
CREATE TABLE `d_role` (
  `id` char(4) NOT NULL,
  `name` varchar(25) NOT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_role
-- ----------------------------
INSERT INTO `d_role` VALUES ('r001', 'Admin', '管理员');
INSERT INTO `d_role` VALUES ('r002', 'Muggle', '普通账号');

-- ----------------------------
-- Table structure for d_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `d_role_menu`;
CREATE TABLE `d_role_menu` (
  `id` int(11) NOT NULL,
  `role_id` char(4) NOT NULL,
  `menu_id` smallint(5) NOT NULL,
  `last_update` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for d_server
-- ----------------------------
DROP TABLE IF EXISTS `d_server`;
CREATE TABLE `d_server` (
  `id` smallint(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '主机名称',
  `public_ip` varchar(50) NOT NULL DEFAULT '' COMMENT '公网 IP',
  `could_category` varchar(25) NOT NULL COMMENT '云账户',
  `area` varchar(50) NOT NULL COMMENT '所在区域',
  `active` tinyint(1) NOT NULL COMMENT '是否可用',
  `used_space` decimal(10,2) NOT NULL COMMENT '已用空间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_server
-- ----------------------------
INSERT INTO `d_server` VALUES ('1', '测试', '123.66.66.3', 'zhanghao123', '2号房', '1', '12.00');
INSERT INTO `d_server` VALUES ('2', '测试2', '198.33.9.8', 'zhanghao987', '3号房', '0', '25.00');
INSERT INTO `d_server` VALUES ('3', '测试3', '172.8.6.9', 'zhanghao111', '1号房', '1', '200.00');

-- ----------------------------
-- Table structure for d_template
-- ----------------------------
DROP TABLE IF EXISTS `d_template`;
CREATE TABLE `d_template` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '服务名称',
  `toll_year` varchar(100) NOT NULL COMMENT '年收费标准',
  `toll_month` varchar(100) NOT NULL COMMENT '月收费标准',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `discount` tinyint(3) NOT NULL DEFAULT '0' COMMENT '折扣率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_template
-- ----------------------------
INSERT INTO `d_template` VALUES ('1', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('2', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('3', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('4', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('5', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('6', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('7', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('8', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('9', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('10', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('11', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('12', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('13', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('14', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('15', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('16', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('17', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('18', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('19', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('20', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('21', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('22', '云端平台', '50,400.00', '4,200.00', '2017-06-23 10:56:30', '7');
INSERT INTO `d_template` VALUES ('23', '云端平台', '50,400.00', '4,200.00', '2017-06-13 11:22:14', '5');
INSERT INTO `d_template` VALUES ('24', 'aaaa', 'adsf', 'sadf', '2017-06-07 00:00:00', '1');
INSERT INTO `d_template` VALUES ('25', 'adsf', 'sadf', 'asdf', '2017-05-31 00:00:00', '55');
INSERT INTO `d_template` VALUES ('26', 'safd', '54', 'fdsa', '2017-06-15 00:00:00', '10');
INSERT INTO `d_template` VALUES ('27', 'adsf', 'adf', 'adfs', '2017-05-29 00:00:00', '21');
INSERT INTO `d_template` VALUES ('28', 'asdf', 'asfd', 'afds1', '2011-05-31 00:00:00', '0');
INSERT INTO `d_template` VALUES ('29', 'asdf', 'safd', 'asf1', '2017-05-30 00:00:00', '0');
INSERT INTO `d_template` VALUES ('30', 'asfd', 'asdf', 'sfda', '2017-06-04 00:00:00', '0');
INSERT INTO `d_template` VALUES ('31', 'sadf', 'asfd', 'asfd', '2017-06-06 00:00:00', '1');
INSERT INTO `d_template` VALUES ('32', 'asdf', '123', 'asdf', '2017-06-13 00:00:00', '1');
INSERT INTO `d_template` VALUES ('33', 'asdf', 'afds', 'asdf', '2017-06-05 00:00:00', '2');
INSERT INTO `d_template` VALUES ('34', 'asdf', 'asdf', 'asfd', '2017-06-07 00:00:00', '0');

-- ----------------------------
-- Table structure for d_user
-- ----------------------------
DROP TABLE IF EXISTS `d_user`;
CREATE TABLE `d_user` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` char(4) DEFAULT '',
  `email` varchar(50) DEFAULT '',
  `phone` varchar(20) NOT NULL,
  `address` varchar(50) DEFAULT '',
  `username` varchar(30) NOT NULL,
  `password` varchar(40) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_user_role` (`role_id`),
  CONSTRAINT `fk_user_role` FOREIGN KEY (`role_id`) REFERENCES `d_role` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10061 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_user
-- ----------------------------
INSERT INTO `d_user` VALUES ('10015', 'r001', 'admin@mail.com', '13000000000', '北京市 海淀区', '张三', 'e10adc3949ba59abbe56e057f20f883e', '2017-06-19 16:25:59');
INSERT INTO `d_user` VALUES ('10016', 'r001', 'admin@mail.com', '13000000000', '北京市 海淀区', '张三', 'e10adc3949ba59abbe56e057f20f883e', '2017-06-19 16:30:51');
INSERT INTO `d_user` VALUES ('10017', 'r001', 'adsfadsfa', 'asdf', 'asdf', 'asdfasd', 'c7d48bbf2b960adc10b0aba11bf336a5', '2017-06-19 16:31:52');
INSERT INTO `d_user` VALUES ('10018', 'r002', 'adfijdd@gmail.com', '170561651565', '捷克 布拉格', 'Mary', '49ad23d1ec9fa4bd8d77d02681df5cfa', '2017-06-19 16:32:51');
INSERT INTO `d_user` VALUES ('10021', 'r002', 'sdf', 'sfd', 'sdf', '啊啊啊啊啊', '39b27480457c9b5a10e24d0cb85aba38', '2017-06-20 06:47:54');
INSERT INTO `d_user` VALUES ('10022', 'r001', 'sf', 'asf', 'sdf', '是是是', '60d31eb37595dd44584be5ef363283e3', '2017-06-20 07:03:54');
INSERT INTO `d_user` VALUES ('10023', 'r001', 'sdf', 'sdf', 'sdf', '不不不', '21ad0bd836b90d08f4cf640b4c298e7c', '2017-06-20 07:23:52');
INSERT INTO `d_user` VALUES ('10024', 'r001', 'asfd', 'asfd', 'adsf', 'asdf', '912ec803b2ce49e4a541068d495ab570', '2017-06-20 07:26:35');
INSERT INTO `d_user` VALUES ('10025', 'r001', 'asdf', 'sfasd', 'sdf', 'sdfa', '7815696ecbf1c96e6894b779456d330e', '2017-06-20 07:27:13');
INSERT INTO `d_user` VALUES ('10026', 'r001', 'dfasd', 'as', 'afasdf', '阿什顿发放', 'c15291784c5c9ff1ffee12d66399ad80', '2017-06-20 07:30:40');
INSERT INTO `d_user` VALUES ('10027', 'r001', 'dsf', 'adfs', 'asdf', 'asfda', 'd9729feb74992cc3482b350163a1a010', '2017-06-20 07:31:09');
INSERT INTO `d_user` VALUES ('10029', 'r001', 'asdf', 'saf', 'adsf', 'asfd', 'd9729feb74992cc3482b350163a1a010', '2017-06-20 07:36:20');
INSERT INTO `d_user` VALUES ('10032', 'r001', 'asdf', 'asdf', 'dafds', 'asdf', 'e8a88bb6f4d420a8517965d25cd54a14', '2017-06-20 07:41:49');
INSERT INTO `d_user` VALUES ('10036', 'r001', 'asdf', 'asdf', 'asd', 'sdf', 'fe6d1fed11fa60277fb6a2f73efb8be2', '2017-06-21 10:47:26');
INSERT INTO `d_user` VALUES ('10039', 'r001', '电子邮箱', '用户账号', '联系信息', 'aaa', 'fe6d1fed11fa60277fb6a2f73efb8be2', '2017-06-22 12:35:16');
INSERT INTO `d_user` VALUES ('10040', 'r001', 'fdsa', 'dsfa', 'dsaf', 'bbb', 'asfd', '2017-06-22 12:49:58');
INSERT INTO `d_user` VALUES ('10041', 'r001', 'fds', 'fds', 's', '是是是', '202868549057782505037926807306707393031', '2017-06-22 14:25:41');
INSERT INTO `d_user` VALUES ('10042', 'r001', 'fdsa', 'fdsa', 'asfd', 'ss', 'ec33504c8ee1d472458394bcacbeb872', '2017-06-22 14:32:10');
INSERT INTO `d_user` VALUES ('10043', 'r001', 'fdsa', 'afds', 'adsf', 'sadf', 'e10adc3949ba59abbe56e057f20f883e', '2017-06-22 14:33:01');
INSERT INTO `d_user` VALUES ('10044', 'r001', 'fdsa', 'fsad', 'dfsa', '111', 'd4b2758da0205c1e0aa9512cd188002a', '2017-06-22 14:39:57');
INSERT INTO `d_user` VALUES ('10045', 'r001', 'DDDD', 'D', 'DDD', 'DSA', '45054f47ac3305a2a33e9bcceadff712', '2017-06-23 09:41:36');
INSERT INTO `d_user` VALUES ('10046', 'r001', 'EQW', 'EWQEWQ', 'EQWE', 'WEQWE', '509b055b1c0c2419863138262eb1f86e', '2017-06-23 09:41:41');
INSERT INTO `d_user` VALUES ('10047', 'r001', 'CXZ', 'CZX', 'DASD', 'EQWE', 'a7db0b6ba5841643bc1a7c269a55534c', '2017-06-23 09:41:47');
INSERT INTO `d_user` VALUES ('10048', 'r001', 'UYTUYT', 'UYTU', 'UTYUY', 'PO', 'b3918665ee674080bf505e1b2d862187', '2017-06-23 09:41:56');
INSERT INTO `d_user` VALUES ('10049', 'r001', 'ETER', 'GDF', 'HFG', 'UYTU', '6848ae6f8e786062f1b23476c9ecd258', '2017-06-23 09:42:02');
INSERT INTO `d_user` VALUES ('10050', 'r001', 'REW', 'WRWE', 'GFDG', 'TERT', '6a8d0a7874ab84b75f5956c1d801b35d', '2017-06-23 09:42:10');
INSERT INTO `d_user` VALUES ('10051', 'r001', 'DSA', 'DSAD', 'DAS', 'DASD', '79707231258a5295b5d08760de461720', '2017-06-23 09:42:33');
INSERT INTO `d_user` VALUES ('10052', 'r001', 'TRE', 'TERT', 'TERT', 'GFDGDF', '9ccbbe15a4c7065e5d07fb344a7a8e46', '2017-06-23 09:49:12');
INSERT INTO `d_user` VALUES ('10053', 'r001', 'EQW', 'EQWE', 'DASDQW', 'XCZC', '33e67d6239aaf19947d86e3dc58833b2', '2017-06-23 09:49:22');
INSERT INTO `d_user` VALUES ('10054', 'r001', 'kjh', 'kjhnm', 'bnmbn', 'mbnm', '41c4e399bf3849cf7f6ab3774a6025e2', '2017-06-23 10:00:14');
INSERT INTO `d_user` VALUES ('10055', 'r001', 'utyuty', 'jhgjty', 'jghjhg', 'khgjgh', 'd9b9bed04b968e67544b74f1121e0615', '2017-06-23 10:01:31');
INSERT INTO `d_user` VALUES ('10056', 'r002', 'cehis@qq.com', 'ceshi19950804', '哈尔冰', 'ceshi人', '123456', '2017-06-23 11:14:22');
INSERT INTO `d_user` VALUES ('10057', 'r001', 'admin@qq.com', '18888', '松北区', 'xxx', '123456', '2017-06-23 14:23:33');
INSERT INTO `d_user` VALUES ('10058', 'r001', 'admin@mail.com', '13000000000', '北京市 海淀区', '张三', 'e10adc3949ba59abbe56e057f20f883e', '2017-06-19 16:25:59');
INSERT INTO `d_user` VALUES ('10059', 'r001', 'admin@mail.com', '13000000000', '北京市 海淀区', '张三', 'e10adc3949ba59abbe56e057f20f883e', '2017-06-19 16:25:59');
INSERT INTO `d_user` VALUES ('10060', 'r002', 'admin@mail.com', '13000000000', '北京市 海淀区', '张三', 'e10adc3949ba59abbe56e057f20f883e', '2017-06-19 16:25:59');

-- ----------------------------
-- Table structure for d_volume
-- ----------------------------
DROP TABLE IF EXISTS `d_volume`;
CREATE TABLE `d_volume` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `physical_volume` varchar(50) NOT NULL COMMENT '逻辑卷',
  `logical_volume` varchar(50) NOT NULL COMMENT '物理卷',
  `file_system` varchar(25) NOT NULL COMMENT '文件系统',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_volume
-- ----------------------------
INSERT INTO `d_volume` VALUES ('1', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('2', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT16');
INSERT INTO `d_volume` VALUES ('3', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('4', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('5', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'Ext4');
INSERT INTO `d_volume` VALUES ('6', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('7', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('8', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('9', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'Ext4');
INSERT INTO `d_volume` VALUES ('10', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('11', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('12', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('13', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('14', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'Ext4');
INSERT INTO `d_volume` VALUES ('15', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
INSERT INTO `d_volume` VALUES ('16', 'Disk/dev/sdb:21.5GB', 'pvcreate/dev/sdb', 'FAT32');
