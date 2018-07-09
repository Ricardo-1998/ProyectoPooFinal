-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-07-2018 a las 05:50:34
-- Versión del servidor: 10.1.33-MariaDB
-- Versión de PHP: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `poo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arma`
--

CREATE TABLE `arma` (
  `id_arma` int(11) NOT NULL,
  `Nombre` varchar(30) DEFAULT NULL,
  `Costo` int(11) DEFAULT NULL,
  `Atributo` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `arma`
--

INSERT INTO `arma` (`id_arma`, `Nombre`, `Costo`, `Atributo`) VALUES
(1, 'Espada', 80, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `magia`
--

CREATE TABLE `magia` (
  `id_magia` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `costo` int(11) DEFAULT NULL,
  `estadistica` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `magia`
--

INSERT INTO `magia` (`id_magia`, `nombre`, `costo`, `estadistica`) VALUES
(1, 'Polvo de Hadas', 60, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `user` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `gold` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id_user`, `user`, `password`, `level`, `gold`) VALUES
(1, 'karina', 'mina', 1, 1000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `userxarma`
--

CREATE TABLE `userxarma` (
  `id_user` int(11) NOT NULL,
  `id_arma` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `userxarma`
--

INSERT INTO `userxarma` (`id_user`, `id_arma`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `userxmagia`
--

CREATE TABLE `userxmagia` (
  `id_user` int(11) NOT NULL,
  `id_magia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arma`
--
ALTER TABLE `arma`
  ADD PRIMARY KEY (`id_arma`);

--
-- Indices de la tabla `magia`
--
ALTER TABLE `magia`
  ADD PRIMARY KEY (`id_magia`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indices de la tabla `userxarma`
--
ALTER TABLE `userxarma`
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_arma` (`id_arma`);

--
-- Indices de la tabla `userxmagia`
--
ALTER TABLE `userxmagia`
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_magia` (`id_magia`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arma`
--
ALTER TABLE `arma`
  MODIFY `id_arma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `magia`
--
ALTER TABLE `magia`
  MODIFY `id_magia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `userxarma`
--
ALTER TABLE `userxarma`
  ADD CONSTRAINT `userxarma_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
  ADD CONSTRAINT `userxarma_ibfk_2` FOREIGN KEY (`id_arma`) REFERENCES `arma` (`id_arma`);

--
-- Filtros para la tabla `userxmagia`
--
ALTER TABLE `userxmagia`
  ADD CONSTRAINT `userxmagia_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
  ADD CONSTRAINT `userxmagia_ibfk_2` FOREIGN KEY (`id_magia`) REFERENCES `magia` (`id_magia`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
