/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - maven
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

USE `maven`;

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` float(10,0) DEFAULT NULL,
  `pic` varchar(40) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `detail` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `items` */

insert  into `items`(`id`,`name`,`price`,`pic`,`createtime`,`detail`) values (1,'传智播客',1000,NULL,'2018-03-13 09:29:30','带我走上人生巅峰'),(2,'黑马310',NULL,NULL,'2018-03-28 10:05:52','插入测试'),(3,'黑马307',199,NULL,'2018-03-07 10:08:04','插入测试'),(7,'插入测试',NULL,NULL,NULL,NULL),(8,'插入测试',NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
