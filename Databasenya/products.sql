-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 31, 2016 at 01:15 AM
-- Server version: 5.5.20
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_bioskop`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE IF NOT EXISTS `products` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `description` text,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=26 ;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`pid`, `name`, `price`, `description`, `created_at`, `updated_at`) VALUES
(1, 'Alien', '100000.00', 'Movie', '2016-08-03 08:10:34', '0000-00-00 00:00:00'),
(2, 'Batman', '1000000.00', 'Movie', '2016-08-03 08:11:03', '0000-00-00 00:00:00'),
(3, 'Castle', '0.00', '', '2016-08-03 08:12:42', '0000-00-00 00:00:00'),
(4, 'Deadpool', '0.00', '', '2016-08-03 08:13:04', '0000-00-00 00:00:00'),
(5, 'Guardian', '0.00', '', '2016-08-03 08:13:17', '0000-00-00 00:00:00'),
(6, 'Ghandi', '0.00', '', '2016-08-03 08:13:30', '0000-00-00 00:00:00'),
(7, 'Grave', '0.00', '', '2016-08-03 08:13:41', '0000-00-00 00:00:00'),
(8, 'Hachi', '0.00', '', '2016-08-03 08:13:51', '0000-00-00 00:00:00'),
(9, 'Annable', '0.00', '', '2016-08-03 08:14:02', '0000-00-00 00:00:00'),
(10, 'Bad Mom', '0.00', '', '2016-08-03 08:14:20', '0000-00-00 00:00:00'),
(11, 'Beyond', '0.00', '', '2016-08-03 08:14:31', '0000-00-00 00:00:00'),
(12, 'Conjuring', '0.00', '', '2016-08-03 08:14:44', '0000-00-00 00:00:00'),
(13, 'Finding Dory', '0.00', '', '2016-08-03 08:15:41', '0000-00-00 00:00:00'),
(14, 'Ghost', '0.00', '', '2016-08-03 08:15:52', '0000-00-00 00:00:00'),
(15, 'Ice Age', '0.00', '', '2016-08-03 08:16:08', '0000-00-00 00:00:00'),
(16, 'Jason', '0.00', '', '2016-08-03 08:17:14', '0000-00-00 00:00:00'),
(17, 'Koala', '0.00', '', '2016-08-03 08:17:29', '0000-00-00 00:00:00'),
(18, 'Light Out', '0.00', '', '2016-08-03 08:17:56', '0000-00-00 00:00:00'),
(19, 'Nerve', '0.00', '', '2016-08-03 08:18:06', '0000-00-00 00:00:00'),
(20, 'Pets', '0.00', '', '2016-08-03 08:18:18', '0000-00-00 00:00:00'),
(21, 'Suicide', '0.00', '', '2016-08-03 08:18:39', '0000-00-00 00:00:00'),
(22, 'Tarzan', '0.00', '', '2016-08-03 08:19:00', '0000-00-00 00:00:00'),
(23, 'Ant Man', '0.00', '', '2016-08-03 08:19:10', '0000-00-00 00:00:00'),
(24, 'Avangers', '0.00', '', '2016-08-03 08:19:24', '0000-00-00 00:00:00'),
(25, 'Spongebob', '0.00', '', '2016-08-03 08:19:41', '0000-00-00 00:00:00');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
