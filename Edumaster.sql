-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-08-2022 a las 14:48:36
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `edumaster`
--
CREATE DATABASE IF NOT EXISTS `edumaster` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `edumaster`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area`
--

CREATE TABLE `area` (
  `Id` int(4) NOT NULL,
  `Descripcion` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `area`
--

INSERT INTO `area` (`Id`, `Descripcion`) VALUES
(1, 'Administracion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `capacitacion`
--

CREATE TABLE `capacitacion` (
  `ID` int(4) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `Duracion` time NOT NULL,
  `Id_tipo` int(4) NOT NULL,
  `Id_encargado` bigint(10) NOT NULL,
  `Id_tipo_estudio` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `capacitacion`
--

INSERT INTO `capacitacion` (`ID`, `Descripcion`, `Duracion`, `Id_tipo`, `Id_encargado`, `Id_tipo_estudio`) VALUES
(2, 'Riesgos Biologicos', '02:00:00', 1, 8909039388, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE `cargo` (
  `Id` int(4) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `IdArea` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`Id`, `Descripcion`, `IdArea`) VALUES
(1, 'Jefe Recursos Humanos', 1),
(2, 'Técnico Soporte', 1),
(3, 'Asistente administracion', 1),
(4, 'Asistente auditoria', 1),
(5, 'Gerente', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargado`
--

CREATE TABLE `encargado` (
  `Id` bigint(10) NOT NULL,
  `Descripcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `encargado`
--

INSERT INTO `encargado` (`Id`, `Descripcion`) VALUES
(8909039388, 'Codecco');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE `genero` (
  `Id` int(4) NOT NULL,
  `Descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`Id`, `Descripcion`) VALUES
(1, 'Hombre'),
(2, 'Mujer');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `Id_usuario` bigint(10) NOT NULL,
  `Id_capacitacion` int(4) NOT NULL,
  `Fecha` date NOT NULL,
  `HoraInicio` time NOT NULL,
  `HoraFin` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`Id_usuario`, `Id_capacitacion`, `Fecha`, `HoraInicio`, `HoraFin`) VALUES
(1118111222, 2, '2022-08-22', '08:16:54', '10:16:54');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `Id` int(4) NOT NULL,
  `Descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`Id`, `Descripcion`) VALUES
(1, '\r\nAdministrador'),
(2, 'Empleado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipocapacitacion`
--

CREATE TABLE `tipocapacitacion` (
  `Id` int(4) NOT NULL,
  `Descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipocapacitacion`
--

INSERT INTO `tipocapacitacion` (`Id`, `Descripcion`) VALUES
(1, 'Formal');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoestudio`
--

CREATE TABLE `tipoestudio` (
  `Id` int(4) NOT NULL,
  `Descripcion` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipoestudio`
--

INSERT INTO `tipoestudio` (`Id`, `Descripcion`) VALUES
(1, 'Diplomado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `Cedula` bigint(10) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Id_genero` int(4) NOT NULL,
  `Telefono` bigint(10) DEFAULT NULL,
  `Celular` bigint(10) DEFAULT NULL,
  `Correo` varchar(50) NOT NULL,
  `Fecha_creacion` date NOT NULL,
  `Fecha_retiro` date DEFAULT NULL,
  `Id_cargo` int(4) NOT NULL,
  `Id_rol` int(4) NOT NULL,
  `Contraseña` varchar(50) NOT NULL,
  `Activo` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`Cedula`, `Nombre`, `Apellidos`, `Id_genero`, `Telefono`, `Celular`, `Correo`, `Fecha_creacion`, `Fecha_retiro`, `Id_cargo`, `Id_rol`, `Contraseña`, `Activo`) VALUES
(1118111222, 'Carlos', 'Sandoval Ramirez', 1, NULL, NULL, 'carlos@gmail.com', '2022-08-29', NULL, 1, 1, '123456', 'Si');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `area`
--
ALTER TABLE `area`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `capacitacion`
--
ALTER TABLE `capacitacion`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `CapacitacionTipo` (`Id_tipo`) USING BTREE,
  ADD KEY `CapacitacionTipoEstudio` (`Id_tipo_estudio`),
  ADD KEY `CapacitacionEncargado` (`Id_encargado`);

--
-- Indices de la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `CargoArea` (`IdArea`);

--
-- Indices de la tabla `encargado`
--
ALTER TABLE `encargado`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`Id_usuario`,`Id_capacitacion`),
  ADD KEY `RegistroUsu` (`Id_usuario`),
  ADD KEY `RegistroCapacitacion` (`Id_capacitacion`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `tipocapacitacion`
--
ALTER TABLE `tipocapacitacion`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `tipoestudio`
--
ALTER TABLE `tipoestudio`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Cedula`),
  ADD KEY `UsuarioRol` (`Id_rol`),
  ADD KEY `UsuarioCargo` (`Id_cargo`) USING BTREE,
  ADD KEY `UsuarioGenero` (`Id_genero`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `area`
--
ALTER TABLE `area`
  MODIFY `Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `capacitacion`
--
ALTER TABLE `capacitacion`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `cargo`
--
ALTER TABLE `cargo`
  MODIFY `Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `encargado`
--
ALTER TABLE `encargado`
  MODIFY `Id` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8909039389;

--
-- AUTO_INCREMENT de la tabla `genero`
--
ALTER TABLE `genero`
  MODIFY `Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipocapacitacion`
--
ALTER TABLE `tipocapacitacion`
  MODIFY `Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tipoestudio`
--
ALTER TABLE `tipoestudio`
  MODIFY `Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `capacitacion`
--
ALTER TABLE `capacitacion`
  ADD CONSTRAINT `capacitacion_ibfk_1` FOREIGN KEY (`Id_tipo`) REFERENCES `tipocapacitacion` (`Id`),
  ADD CONSTRAINT `capacitacion_ibfk_2` FOREIGN KEY (`Id_tipo_estudio`) REFERENCES `tipoestudio` (`Id`),
  ADD CONSTRAINT `capacitacion_ibfk_3` FOREIGN KEY (`Id_encargado`) REFERENCES `encargado` (`Id`);

--
-- Filtros para la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD CONSTRAINT `cargo_ibfk_1` FOREIGN KEY (`IdArea`) REFERENCES `area` (`Id`);

--
-- Filtros para la tabla `registro`
--
ALTER TABLE `registro`
  ADD CONSTRAINT `registro_ibfk_1` FOREIGN KEY (`Id_capacitacion`) REFERENCES `capacitacion` (`ID`),
  ADD CONSTRAINT `registro_ibfk_2` FOREIGN KEY (`Id_usuario`) REFERENCES `usuario` (`Cedula`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`Id_rol`) REFERENCES `rol` (`Id`),
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`Id_cargo`) REFERENCES `cargo` (`Id`),
  ADD CONSTRAINT `usuario_ibfk_3` FOREIGN KEY (`Id_genero`) REFERENCES `genero` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
