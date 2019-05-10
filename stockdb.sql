-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 10-Maio-2019 às 03:55
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.1.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stockdb`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `address`
--

CREATE TABLE `address` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zip` varchar(255) DEFAULT NULL,
  `number` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `address`
--

INSERT INTO `address` (`id`, `address`, `city`, `state`, `zip`, `number`) VALUES
(1, 'Rua 001', 'Rua 001', 'State 001', '123456789', NULL),
(2, 'Rua Paschoal Bruno', 'Uberlândia', 'MINAS GERAIS', '38408714', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `company`
--

CREATE TABLE `company` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `addresses_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `company`
--

INSERT INTO `company` (`id`, `name`, `addresses_id`) VALUES
(1, 'COMPANIA A', NULL),
(2, 'COMPANIA A', NULL),
(3, 'COMPANIA D', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `company_stocks`
--

CREATE TABLE `company_stocks` (
  `company_id` bigint(20) NOT NULL,
  `stocks_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `contact`
--

CREATE TABLE `contact` (
  `id` bigint(20) NOT NULL,
  `cell_phone` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `product`
--

CREATE TABLE `product` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `purchase_price` double DEFAULT NULL,
  `sell_price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `product`
--

INSERT INTO `product` (`id`, `name`, `purchase_price`, `sell_price`) VALUES
(1, 'PRODUTO D', 50, 65),
(2, 'PRODUTO C', 55, 65),
(3, 'PRODUTO B', 52, 61),
(4, 'PRODUTO A', 52, 52.5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `stock`
--

CREATE TABLE `stock` (
  `id` bigint(20) NOT NULL,
  `amount` double DEFAULT NULL,
  `purchase` int(11) DEFAULT NULL,
  `sell` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `stock`
--

INSERT INTO `stock` (`id`, `amount`, `purchase`, `sell`) VALUES
(1, 14234, 0, 0),
(2, 25775, 100, 0),
(3, 30000, 0, 0),
(4, 234, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `stock_products`
--

CREATE TABLE `stock_products` (
  `stock_id` bigint(20) NOT NULL,
  `products_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `supplier`
--

CREATE TABLE `supplier` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `supplier_contacts`
--

CREATE TABLE `supplier_contacts` (
  `supplier_id` bigint(20) NOT NULL,
  `contacts_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjwc07yjowwbj6lhcqvndcx8sp` (`addresses_id`);

--
-- Indexes for table `company_stocks`
--
ALTER TABLE `company_stocks`
  ADD PRIMARY KEY (`company_id`,`stocks_id`),
  ADD UNIQUE KEY `UK_r03fieyoqxxavod1l003er4tr` (`stocks_id`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stock_products`
--
ALTER TABLE `stock_products`
  ADD UNIQUE KEY `UK_i6lm2txe1iulj22coa0it5iys` (`products_id`),
  ADD KEY `FKqwn73jr13scg980poo52uq3by` (`stock_id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `supplier_contacts`
--
ALTER TABLE `supplier_contacts`
  ADD PRIMARY KEY (`supplier_id`,`contacts_id`),
  ADD UNIQUE KEY `UK_ia8oehgkoi9kygyfaw09nbub6` (`contacts_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `company`
--
ALTER TABLE `company`
  ADD CONSTRAINT `FKjwc07yjowwbj6lhcqvndcx8sp` FOREIGN KEY (`addresses_id`) REFERENCES `address` (`id`);

--
-- Limitadores para a tabela `company_stocks`
--
ALTER TABLE `company_stocks`
  ADD CONSTRAINT `FK4x6mtyvjs5n8omq4g7fns1bp3` FOREIGN KEY (`stocks_id`) REFERENCES `stock` (`id`),
  ADD CONSTRAINT `FKocxw3b8aaqmpu9wwtg0g1d27m` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`);

--
-- Limitadores para a tabela `stock_products`
--
ALTER TABLE `stock_products`
  ADD CONSTRAINT `FKhvdc81u7og1ocuaqhl01v6u9q` FOREIGN KEY (`products_id`) REFERENCES `product` (`id`),
  ADD CONSTRAINT `FKqwn73jr13scg980poo52uq3by` FOREIGN KEY (`stock_id`) REFERENCES `stock` (`id`);

--
-- Limitadores para a tabela `supplier_contacts`
--
ALTER TABLE `supplier_contacts`
  ADD CONSTRAINT `FKf54oup7004iwt6w5ah19u9xfi` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`),
  ADD CONSTRAINT `FKgbabl5iaoh55kpthrfjas8g1k` FOREIGN KEY (`contacts_id`) REFERENCES `contact` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
