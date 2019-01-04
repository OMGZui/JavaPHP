/*
 Navicat Premium Data Transfer

 Source Server         : mac
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3307
 Source Schema         : mac

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 04/01/2019 16:50:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for girl
-- ----------------------------
DROP TABLE IF EXISTS `girl`;
CREATE TABLE `girl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `cup_size` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `money` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of girl
-- ----------------------------
BEGIN;
INSERT INTO `girl` VALUES (2, 24, 'D', 1000);
INSERT INTO `girl` VALUES (3, 19, 'C', 1100);
INSERT INTO `girl` VALUES (4, 15, 'B', 900);
INSERT INTO `girl` VALUES (5, 22, 'E', 1200);
INSERT INTO `girl` VALUES (6, 21, 'F', 1400);
INSERT INTO `girl` VALUES (7, 21, 'B', 1400);
INSERT INTO `girl` VALUES (8, 21, 'C', 1400);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
