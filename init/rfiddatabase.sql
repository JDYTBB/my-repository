/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.27 : Database - rfiddatabase
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rfiddatabase` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `rfiddatabase`;

/*Table structure for table `rfid_data` */

DROP TABLE IF EXISTS `rfid_data`;

CREATE TABLE `rfid_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `rfid_num` varchar(128) DEFAULT NULL COMMENT 'rfid标签编号',
  `year` varchar(128) DEFAULT NULL COMMENT '年',
  `month` varchar(128) DEFAULT NULL COMMENT '月',
  `date` varchar(128) DEFAULT NULL COMMENT '日',
  `hour` varchar(128) DEFAULT NULL COMMENT '时',
  `time` varchar(128) DEFAULT NULL COMMENT '上传时间',
  `person_number` varchar(128) DEFAULT NULL COMMENT '上传人员编号',
  `mileage` varchar(128) DEFAULT NULL COMMENT '里程',
  `track_bed_type` varchar(128) DEFAULT NULL COMMENT '道床类型',
  `fastener_type` varchar(128) DEFAULT NULL COMMENT '扣件类型',
  `L` varchar(128) DEFAULT NULL COMMENT '轨距',
  `I` varchar(128) DEFAULT NULL COMMENT '超高',
  `H` varchar(128) DEFAULT NULL COMMENT '轨面高程',
  `temperature` varchar(128) DEFAULT NULL COMMENT '锁定温度',
  `Q` text COMMENT '问题',
  `expansion1` varchar(128) DEFAULT NULL COMMENT '扩展字段1',
  `expansion2` varchar(128) DEFAULT NULL COMMENT '扩展字段2',
  `expansion3` varchar(128) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `rfid_data` */

insert  into `rfid_data`(`id`,`rfid_num`,`year`,`month`,`date`,`hour`,`time`,`person_number`,`mileage`,`track_bed_type`,`fastener_type`,`L`,`I`,`H`,`temperature`,`Q`,`expansion1`,`expansion2`,`expansion3`) values (1,'0001','2018','1','15','01','2018-1-15-01:23:21','1','50','0','0','0.34','4.9','3.2','32','暂时没有问题',NULL,NULL,NULL),(2,'0001','2018','2','15','01','2018-2-15-01:23:21','1','50','0','0','0.34','4.9','3.1','32','暂时没有问题',NULL,NULL,NULL),(3,'0001','2018','3','15','01','2018-3-15-01:23:21','1','50','0','0','0.35','4.8','3.2','32','数据的读写操作',NULL,NULL,NULL),(4,'0001','2018','4','15','01','2018-4-15-01:23:21','1','50','0','0','0.36','4.5','3.3','32','暂时没有问题',NULL,NULL,NULL),(5,'0001','2018','5','15','01','2018-5-15-01:23:21','1','50','0','0','0.37','4.4','3.4','32','单个标签预计半个月进行一次数据的读写操作',NULL,NULL,NULL),(6,'0001','2018','6','15','01','2018-6-15-01:23:21','1','50','0','0','0.38','4.3','3.5','32','APP数据上传分三种方式1：所有标签数据打包上传；2：上传单个标签数据；3：上传部分标签数据',NULL,NULL,NULL),(7,'0001','2018','7','15','01','2018-7-15-01:23:21','1','50','0','0','0.39','4.2','3.6','32','暂时没有问题',NULL,NULL,NULL),(8,'0001','2018','8','15','01','2018-8-15-01:23:21','1','50','0','0','0.40','4.1','3.7','32','暂时没有问题',NULL,NULL,NULL),(9,'0001','2018','9','15','01','2018-9-15-01:23:21','1','50','0','0','0.41','4.5','3.8','32','APP数据上传分三种方式1：所有标签数据打包上传；2：上传单个标签数据；3：上传部分标签数据',NULL,NULL,NULL),(10,'0001','2018','10','15','01','2018-10-15-01:23:21','1','50','0','0','0.42','4.3','3.9','32','暂时没有问题',NULL,NULL,NULL),(11,'0001','2018','11','15','01','2018-11-15-01:23:21','1','50','0','0','0.32','3.1','3.1','31','暂时没有问题',NULL,NULL,NULL),(12,'0001','2018','12','15','01','2018-12-15-01:23:21','1','50','0','0','0.45','4.3','2.2','30','暂时没有问题',NULL,NULL,NULL),(13,'0002','2018','1','15','02','2018-1-15-02:23:21','1','50','0','0','0.32','5.2','3.7','45','暂时没有问题',NULL,NULL,NULL),(14,'0002','2018','2','15','02','2018-2-15-02:23:21','1','50','0','0','0.87','3.8','4.2','32','暂时没有问题',NULL,NULL,NULL),(15,'0002','2018','3','15','02','2018-3-15-02:23:21','1','50','0','0','0.43','2.9','3.7','31','暂时没有问题',NULL,NULL,NULL),(16,'0002','2018','4','15','02','2018-4-15-02:23:21','1','50','0','0','0.56','1.9','4.4','32','暂时没有问题',NULL,NULL,NULL),(17,'0002','2018','5','15','02','2018-5-15-02:23:21','1','50','0','0','0.67','3.7','5.9','34','暂时没有问题',NULL,NULL,NULL),(18,'0002','2018','6','15','02','2018-6-15-02:23:21','1','50','0','0','0.34','5.1','6.4','35','暂时没有问题',NULL,NULL,NULL),(19,'0002','2018','7','15','02','2018-7-15-02:23:21','1','50','0','0','0.90','3.7','5.3','32','暂时没有问题',NULL,NULL,NULL),(20,'0002','2018','8','15','02','2018-8-15-02:23:21','1','50','0','0','0.65','5.8','6.1','31','暂时没有问题',NULL,NULL,NULL),(21,'0002','2018','9','15','02','2018-9-15-02:23:21','1','50','0','0','0.45','3.6','4.5','34','暂时没有问题',NULL,NULL,NULL),(22,'0002','2018','10','15','02','2018-10-15-02:23:21','1','50','0','0','0.67','7.2','6.5','35','暂时没有问题',NULL,NULL,NULL),(23,'0002','2018','11','15','02','2018-11-15-02:23:21','1','50','0','0','0.87','6.3','2.2','43','暂时没有问题',NULL,NULL,NULL),(24,'0002','2018','12','15','02','2018-12-15-02:23:21','1','50','0','0','0.82','5.1','4.1','21','暂时没有问题',NULL,NULL,NULL);

/*Table structure for table `rfid_num` */

DROP TABLE IF EXISTS `rfid_num`;

CREATE TABLE `rfid_num` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `rfid_num` varchar(128) DEFAULT NULL COMMENT 'rfid标签编号',
  `expansion1` varchar(128) DEFAULT NULL COMMENT '扩展字段1',
  `expansion2` varchar(128) DEFAULT NULL COMMENT '扩展字段2',
  `expansion3` varchar(128) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `rfid_num` */

insert  into `rfid_num`(`id`,`rfid_num`,`expansion1`,`expansion2`,`expansion3`) values (1,'rfid0001','30','1',NULL),(2,'rfid0002','30','1',NULL),(3,'rfid0003','30','1',NULL),(4,'rfid0004','30','1',NULL),(5,'rfid0005','30','1',NULL),(6,'rfid0006','30','1',NULL),(7,'rfid0007','30','1',NULL),(8,'rfid0008','30','1',NULL),(9,'rfid0009','30','1',NULL),(10,'rfid00010','30','1',NULL),(11,'rfid00011','30','1',NULL),(12,'rfid00012','30','1',NULL),(13,'rfid00013','30','1',NULL),(14,'rfid00014','30','1',NULL),(15,'rfid00015','30','1',NULL),(16,'rfid00016','30','1',NULL),(17,'rfid00017','30','0',NULL),(18,'rfid00018','30','0',NULL),(19,'rfid00019','30','0',NULL),(20,'rfid00020','30','0',NULL);

/*Table structure for table `u_permission` */

DROP TABLE IF EXISTS `u_permission`;

CREATE TABLE `u_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(256) DEFAULT NULL COMMENT 'url地址',
  `name` varchar(64) DEFAULT NULL COMMENT 'url描述',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `u_permission` */

/*Table structure for table `u_role` */

DROP TABLE IF EXISTS `u_role`;

CREATE TABLE `u_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '角色名称',
  `type` varchar(10) DEFAULT NULL COMMENT '角色类型',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `u_role` */

/*Table structure for table `u_role_permission` */

DROP TABLE IF EXISTS `u_role_permission`;

CREATE TABLE `u_role_permission` (
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `pid` bigint(20) DEFAULT NULL COMMENT '权限ID'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `u_role_permission` */

/*Table structure for table `u_user` */

DROP TABLE IF EXISTS `u_user`;

CREATE TABLE `u_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱|登录帐号',
  `pswd` varchar(32) DEFAULT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` bigint(1) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `u_user` */

/*Table structure for table `u_user_role` */

DROP TABLE IF EXISTS `u_user_role`;

CREATE TABLE `u_user_role` (
  `uid` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `u_user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
