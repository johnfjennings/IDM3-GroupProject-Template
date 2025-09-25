-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Generation Time: Sep 19, 2024 at 08:38 AM
-- Server version: 8.0.39
-- PHP Version: 8.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `idm3productexample`
--
CREATE DATABASE IF NOT EXISTS `idm3productexample` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `idm3productexample`;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `product_id` bigint NOT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_description` varchar(255) DEFAULT NULL,
  `stock_quantity` bigint DEFAULT NULL,
  `whole_sale_price` double NOT NULL,
  `list_price` double NOT NULL,
  `product_image` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product_id`, `product_name`, `product_description`, `stock_quantity`, `whole_sale_price`, `list_price`, `product_image`) VALUES
(2, 'Bluetooth Headphones', 'Over-ear Bluetooth headphones with noise cancellation.', 75, 89.99, 149.99, 'images/bluetooth_headphones.jpg'),
(3, '4K Monitor', '27-inch 4K Ultra HD monitor with high color accuracy.', 50, 299.99, 499.99, 'images/4k_monitor.jpg'),
(4, 'Smartwatch', 'Fitness smartwatch with heart rate monitoring.', 120, 99.99, 149.99, 'images/smartwatch.jpg'),
(5, 'Keyboard', 'Mechanical keyboard with customizable RGB lighting.', 200, 49.99, 79.99, 'images/keyboard.jpg'),
(6, 'Webcam', 'HD webcam with built-in microphone.', 80, 29.99, 49.99, 'images/webcam.jpg'),
(7, 'External SSD', '1TB external SSD for fast data storage.', 60, 119.99, 199.99, 'images/external_ssd.jpg'),
(8, 'Laptop Stand', 'Adjustable laptop stand for ergonomic workspace.', 90, 24.99, 39.99, 'images/laptop_stand.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `product_id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
