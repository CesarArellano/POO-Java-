-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 30-10-2019 a las 22:30:41
-- Versión del servidor: 8.0.17-0ubuntu2
-- Versión de PHP: 7.3.8-1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Domicilio`
--

CREATE TABLE `Domicilio` (
  `ID_Paciente` int(5) NOT NULL,
  `Calle` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `No_Externo` int(5) NOT NULL,
  `No_Interno` int(5) NOT NULL,
  `Zona` int(5) NOT NULL,
  `Delg_Mcp` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `CP` varchar(5) NOT NULL,
  `AniosViviendo` int(3) NOT NULL,
  `MesesViviendo` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `Domicilio`
--

INSERT INTO `Domicilio` (`ID_Paciente`, `Calle`, `No_Externo`, `No_Interno`, `Zona`, `Delg_Mcp`, `CP`, `AniosViviendo`, `MesesViviendo`) VALUES
(1, 'Andador Estragón, Esq. Acedera, Pueblo de Santa Fe', 8, 1, 2, 'Álvaro Obregón', '01230', 0, 9),
(2, 'Venustiano Carranza', 4, 5, 2, 'Gustavo A. Madero', '55749', 14, 0),
(3, 'Miguel Hidalgo', 19, 20, 7, 'Azcapotzalco', '44321', 2, 1),
(4, 'Huatla de las Salinas', 6, 36, 12, 'Azcapotzalco', '34252', 14, 7),
(5, 'Sor Juana Inés de la Cruz', 42, 2, 4, 'Cuauhtemoc', '55746', 29, 1),
(6, 'San Jerónimo de las Casas', 4, 27, 1, 'Tecolutla', '52421', 32, 7),
(7, 'Gerry Camarena', 3, 13, 1, 'Ecatepec', '11224', 12, 2),
(8, 'Josefa Ortíz de Domínguez', 12, 34, 2, 'Centro', '94824', 54, 6),
(9, 'Céspedes García', 4, 0, 21, 'Xochimilco', '13827', 38, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Medico`
--

CREATE TABLE `Medico` (
  `ID_Medico` int(5) NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `APaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `AMaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `Medico`
--

INSERT INTO `Medico` (`ID_Medico`, `Nombre`, `APaterno`, `AMaterno`) VALUES
(1, 'Raúl', 'González', 'Portillo'),
(2, 'Fernando', 'Ramírez', 'Ortega'),
(3, 'Oscar', 'Hernández', 'Ochoa'),
(4, 'Hector', 'Balbuena', 'Jiménez'),
(5, 'Sergio', 'Sánchez', 'Obregón'),
(6, 'Alberto José', 'Segrera', 'Tapia'),
(7, 'Benjamín', 'Benítez', 'Lara'),
(8, 'Benjamín', 'Benítez', 'Lara'),
(9, 'Sara', 'Rodríguez', 'Fernández');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Paciente`
--

CREATE TABLE `Paciente` (
  `ID_Paciente` int(5) NOT NULL,
  `ID_Medico` int(5) NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `APaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `AMaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Sexo` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `FNacimiento` date NOT NULL,
  `Edad` int(3) NOT NULL,
  `TFijo` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `TMovil` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `EdoOrigen` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `EdoCivil` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `AñosEstudios` int(2) NOT NULL,
  `SabeLeer` varchar(2) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `SabeEscribir` varchar(2) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Ocupacion` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Religion` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `FEvaluacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `Paciente`
--

INSERT INTO `Paciente` (`ID_Paciente`, `ID_Medico`, `Nombre`, `APaterno`, `AMaterno`, `Sexo`, `FNacimiento`, `Edad`, `TFijo`, `TMovil`, `EdoOrigen`, `EdoCivil`, `AñosEstudios`, `SabeLeer`, `SabeEscribir`, `Ocupacion`, `Religion`, `FEvaluacion`) VALUES
(1, 1, 'César Mauricio', 'Arellano', 'Velásquez', 'Hombre', '1958-02-20', 61, '55776183', '5567879498', 'Ciudad de México', 'Soltero', 14, 'Si', 'Si', 'Profesionista independiente', 'Ninguna', '2019-10-30'),
(2, 2, 'Emmanuel Zuriel', 'Bajonero', 'Moreno', 'Hombre', '1957-01-15', 62, '55445832', '5512312312', 'Ciudad de México', 'Soltero', 14, 'Si', 'Si', 'Profesionista independiente', 'Cristiana', '2019-10-12'),
(3, 3, 'Esteban', 'González', 'Sánchez', 'Hombre', '1954-09-10', 65, '55443322', '5567981233', 'Nuevo León', 'Casado', 25, 'Si', 'Si', 'Profesionista independiente', 'Judío', '2019-10-30'),
(4, 4, 'Jaqueline', 'Martínez', 'Mexicano', 'Mujer', '1955-09-23', 64, '55672313', '5569004947', 'Ciudad de México', 'Soltero', 14, 'Si', 'Si', 'Patrón(a), Jefe(a) o empresario(a)', 'Ninguna', '2019-10-30'),
(5, 5, 'Eduardo', 'Zepeda', 'Contreras', 'Hombre', '1931-12-14', 87, '55889977', '5546372819', 'Baja California Sur', 'Unión Libre', 0, 'No', 'No', 'Jubilado sin pensión', 'Católica', '2019-02-02'),
(6, 6, 'Fernanda', 'López', 'Juárez', 'Mujer', '1949-05-18', 69, '55889977', '5546372819', 'Tijuana', 'Unión Libre', 0, 'Si', 'Si', 'Ama de casa', 'Cristiana', '2019-02-02'),
(7, 7, 'Humberto', 'Herrera', 'Guerra', 'Hombre', '1941-12-13', 77, '55332266', '5566778899', 'Tabasco', 'Divorciado', 8, 'Si', 'Si', 'Desempleado', 'Ninguna', '2019-02-12'),
(8, 8, 'Humberto', 'Herrera', 'Guerra', 'Hombre', '1941-12-13', 77, '55332266', '5566778899', 'Aguascalientes', 'Viudo', 11, 'Si', 'Si', 'Patrón(a), Jefe(a) o empresario(a)', 'Judío', '2019-02-12'),
(9, 9, 'Gabriela', 'Cacho', 'Quiroga', 'Mujer', '1941-04-13', 78, '44637797', '5566778899', 'Yucatán', 'No sabe / no responde', 0, 'Si', 'No', 'Ama de casa', 'Ninguna', '2019-10-30');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Domicilio`
--
ALTER TABLE `Domicilio`
  ADD KEY `Domicilio_ibfk_1` (`ID_Paciente`);

--
-- Indices de la tabla `Medico`
--
ALTER TABLE `Medico`
  ADD PRIMARY KEY (`ID_Medico`);

--
-- Indices de la tabla `Paciente`
--
ALTER TABLE `Paciente`
  ADD PRIMARY KEY (`ID_Paciente`),
  ADD KEY `Paciente_ibfk_1` (`ID_Medico`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Medico`
--
ALTER TABLE `Medico`
  MODIFY `ID_Medico` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `Paciente`
--
ALTER TABLE `Paciente`
  MODIFY `ID_Paciente` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Domicilio`
--
ALTER TABLE `Domicilio`
  ADD CONSTRAINT `Domicilio_ibfk_1` FOREIGN KEY (`ID_Paciente`) REFERENCES `Paciente` (`ID_Paciente`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `Paciente`
--
ALTER TABLE `Paciente`
  ADD CONSTRAINT `Paciente_ibfk_1` FOREIGN KEY (`ID_Medico`) REFERENCES `Medico` (`ID_Medico`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
