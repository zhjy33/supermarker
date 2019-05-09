/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-05-09 18:39:05
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` bigint(18) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `password` varchar(18) DEFAULT NULL,
  `login_date` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp(),
  `created_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('442026633007873328', 'admin', '123456', '2019-04-25 17:10:23', '2019-04-25');

-- ----------------------------
-- Table structure for `su_employer`
-- ----------------------------
DROP TABLE IF EXISTS `su_employer`;
CREATE TABLE `su_employer` (
  `id` bigint(18) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `educational_background` varchar(40) DEFAULT NULL COMMENT 'PS-小学，MS-初中，SS-高中，CO-本科，JC-专科，MS-硕士，DC-博士，OT-其他',
  `position` varchar(40) DEFAULT NULL,
  `create_by` bigint(18) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `is_delete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of su_employer
-- ----------------------------
INSERT INTO `su_employer` VALUES ('13054672474558905', 'hahah', '0', '56', 'dfsa', '23ef', '442026633007873328', '2019-05-08 19:27:29', '0');
INSERT INTO `su_employer` VALUES ('24374271667740217', '32', '0', '13', '??', '??', '442026633007873328', '2019-05-08 19:22:33', '1');
INSERT INTO `su_employer` VALUES ('28622454355764096', 'hehe', '1', '16', 'dsf2', 'f15ew', '442026633007873328', '2019-05-08 19:26:11', '0');

-- ----------------------------
-- Table structure for `su_goods`
-- ----------------------------
DROP TABLE IF EXISTS `su_goods`;
CREATE TABLE `su_goods` (
  `id` bigint(18) NOT NULL,
  `kind_id` bigint(18) DEFAULT NULL,
  `number` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `uom` varchar(8) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `created_by` bigint(18) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `is_delete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of su_goods
-- ----------------------------
INSERT INTO `su_goods` VALUES ('61172197526109219', '1', '001', '112', 'pice', '?', '442026633007873328', '2019-05-08 09:52:19', '1');
INSERT INTO `su_goods` VALUES ('61635818048704091', '11507603547846099', 'RESS', 'good2', 'fdsa', '22', '442026633007873328', '2019-05-08 12:05:03', '0');
INSERT INTO `su_goods` VALUES ('64842806018211889', '20442796755054420', 'wwe', 'few2', 'ffeesgre', 'gggreee', '442026633007873328', '2019-05-08 10:00:34', '0');

-- ----------------------------
-- Table structure for `su_kind`
-- ----------------------------
DROP TABLE IF EXISTS `su_kind`;
CREATE TABLE `su_kind` (
  `id` bigint(18) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `created_by` bigint(18) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `is_delete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of su_kind
-- ----------------------------
INSERT INTO `su_kind` VALUES ('1', 'fffew', '12', '2019-05-07', '0');
INSERT INTO `su_kind` VALUES ('11507603547846099', 'rejqjwer', '442026633007873328', '2019-05-08', '0');
INSERT INTO `su_kind` VALUES ('19649442693621657', '???', '442026633007873328', '2019-05-07', '1');
INSERT INTO `su_kind` VALUES ('20442796755054420', 'ggregre', '442026633007873328', '2019-05-08', '0');
INSERT INTO `su_kind` VALUES ('92632283008785458', 'ffew', '442026633007873328', '2019-05-07', '0');

-- ----------------------------
-- Table structure for `su_salary`
-- ----------------------------
DROP TABLE IF EXISTS `su_salary`;
CREATE TABLE `su_salary` (
  `id` bigint(18) NOT NULL,
  `employ_id` bigint(18) DEFAULT NULL,
  `salary_date` varchar(10) DEFAULT '',
  `salary` decimal(16,2) DEFAULT NULL,
  `achievement_salary` decimal(16,2) DEFAULT NULL,
  `debit_fee` decimal(16,2) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `create_by` bigint(18) DEFAULT NULL,
  `is_delete` tinyint(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of su_salary
-- ----------------------------
INSERT INTO `su_salary` VALUES ('16895142037181321', '13054672474558905', '3yue', '5000.00', '2000.00', '2000.00', 'well done', '442026633007873328', '0', '2019-05-08 19:44:23');
INSERT INTO `su_salary` VALUES ('43028162628641508', '28622454355764096', '5yue', '10000.00', '10000.00', '10000.00', 'shabi', '442026633007873328', '0', '2019-05-08 19:45:59');
INSERT INTO `su_salary` VALUES ('63886127509947468', '13054672474558905', '4yue', '10000.00', '10000.00', '20000.00', 'fewf', '442026633007873328', '1', '2019-05-08 19:45:41');

-- ----------------------------
-- Table structure for `su_sell`
-- ----------------------------
DROP TABLE IF EXISTS `su_sell`;
CREATE TABLE `su_sell` (
  `id` bigint(18) NOT NULL,
  `goods_id` bigint(18) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `price` decimal(11,2) DEFAULT NULL,
  `sub_total` decimal(11,2) DEFAULT NULL,
  `date` varchar(10) DEFAULT '',
  `remark` varchar(100) DEFAULT NULL,
  `created_by` bigint(18) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `is_delete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of su_sell
-- ----------------------------
INSERT INTO `su_sell` VALUES ('30653228832292781', '61635818048704091', '36', '2.30', '82.80', '1fe5', '12df', '442026633007873328', '2019-05-08 17:34:52', '0');
INSERT INTO `su_sell` VALUES ('65574388553059063', '61635818048704091', '10', '2.36', '23.60', '12fd', 'few', '442026633007873328', '2019-05-08 17:22:44', '0');
INSERT INTO `su_sell` VALUES ('79961911227986137', '64842806018211889', '1', '1.33', '39.90', '12d', '1few', '442026633007873328', '2019-05-08 17:34:37', '0');

-- ----------------------------
-- Table structure for `su_stock`
-- ----------------------------
DROP TABLE IF EXISTS `su_stock`;
CREATE TABLE `su_stock` (
  `id` bigint(18) NOT NULL,
  `number` varchar(20) DEFAULT NULL,
  `goods_id` bigint(18) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `date` varchar(10) DEFAULT '',
  `remark` varchar(100) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` bigint(18) DEFAULT NULL,
  `is_delete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of su_stock
-- ----------------------------
INSERT INTO `su_stock` VALUES ('74209105840280550', 'FEDD22', '61635818048704091', '12', '12', 'fs', '2019-05-08 12:05:17', '442026633007873328', '1');
INSERT INTO `su_stock` VALUES ('74580262414543443', '1123', '61635818048704091', '12', '112', '23', '2019-05-08 12:05:29', '442026633007873328', '0');
INSERT INTO `su_stock` VALUES ('77644416209399699', 'BW123', '64842806018211889', '12', '123', '123', '2019-05-08 12:03:22', '442026633007873328', '0');

-- ----------------------------
-- Table structure for `su_supplier`
-- ----------------------------
DROP TABLE IF EXISTS `su_supplier`;
CREATE TABLE `su_supplier` (
  `id` bigint(18) NOT NULL,
  `company_name` varchar(64) DEFAULT NULL,
  `address` varchar(64) DEFAULT NULL,
  `contact_name` varchar(64) DEFAULT NULL,
  `tel` int(24) DEFAULT NULL,
  `fax` varchar(24) DEFAULT NULL,
  `post_code` varchar(6) DEFAULT '',
  `email` varchar(18) DEFAULT NULL,
  `created_by` bigint(18) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `is_delete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of su_supplier
-- ----------------------------
INSERT INTO `su_supplier` VALUES ('1233092705996193', '456', '123', '456', '123', '123', '456', '465', '442026633007873328', '2019-05-08 11:09:47', '0');
INSERT INTO `su_supplier` VALUES ('16522310729312659', '4459', '456', '789', '45', '7489', '123', '456', '442026633007873328', '2019-05-08 11:30:52', '0');
INSERT INTO `su_supplier` VALUES ('99717011137398204', '789', '456', '123', '456', '456', '789', '123', '442026633007873328', '2019-05-08 11:15:44', '1');
