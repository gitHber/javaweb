/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50022
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2018-08-30 00:04:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `home` varchar(255) NOT NULL,
  `info` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('3', '123', '123', '123', '123', '123');
INSERT INTO `user` VALUES ('4', '123123', '123123', '男', '北京', '123123');
