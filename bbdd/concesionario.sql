-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.30 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para trabajo
CREATE DATABASE IF NOT EXISTS `trabajo` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `trabajo`;

-- Volcando estructura para tabla trabajo.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `dni` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8mb3_spanish_ci NOT NULL,
  `num` int NOT NULL,
  `email` varchar(50) COLLATE utf8mb3_spanish_ci NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

-- Volcando datos para la tabla trabajo.clientes: ~20 rows (aproximadamente)
INSERT INTO `clientes` (`dni`, `nombre`, `num`, `email`) VALUES
	('01234567H', 'Paula Rivas', 12345678, 'paula@gmail.com'),
	('11111111B', 'Bruce', 650345676, 'bruce@gmail.com'),
	('11223344I', 'Andrea Ruiz', 112233445, 'andrea@gmail.com'),
	('12345678Z', 'Ana López', 123456789, 'ana@gmail.com'),
	('22334455J', 'Sergio López', 223344556, 'sergio@gmail.com'),
	('23456789X', 'Juan García', 234567890, 'juan@gmail.com'),
	('33445566K', 'Marina García', 334455667, 'marina@gmail.com'),
	('34567890A', 'María Martínez', 345678901, 'maria@gmail.com'),
	('44556677L', 'David Martínez', 445566778, 'david@gmail.com'),
	('45678901B', 'Pedro Rodríguez', 456789012, 'pedro@gmail.com'),
	('55667788M', 'Elena Sánchez', 556677889, 'elena@gmail.com'),
	('56789012C', 'Laura Fernández', 567890123, 'laura@gmail.com'),
	('66778899N', 'Pablo Gómez', 667788990, 'pablo@gmail.com'),
	('67890123D', 'Sofía Sánchez', 678901234, 'sofia@gmail.com'),
	('71319994e', 'Leo', 640984834, 'guti@gmail.com'),
	('78901234E', 'Diego Pérez', 789012345, 'diego@gmail.com'),
	('89012345F', 'Lucía Gómez', 890123456, 'lucia@gmail.com'),
	('90123456G', 'Javier Díaz', 901234567, 'javier@gmail.com');

-- Volcando estructura para tabla trabajo.coches
CREATE TABLE IF NOT EXISTS `coches` (
  `n_bastidor` varchar(20) COLLATE utf8mb3_spanish_ci NOT NULL,
  `precio` int unsigned NOT NULL,
  `estado` set('nuevo','usado','reparado','km0','siniestrado') COLLATE utf8mb3_spanish_ci NOT NULL,
  `km` int unsigned NOT NULL,
  `cv` int unsigned NOT NULL,
  `categoria` set('Ranchera','Sedan','Coupe','Berlina','SuperDeportivo','Todoterreno','hatchback','hothatch') COLLATE utf8mb3_spanish_ci NOT NULL,
  `marca` varchar(30) COLLATE utf8mb3_spanish_ci NOT NULL,
  `modelo` varchar(30) COLLATE utf8mb3_spanish_ci NOT NULL,
  `dni_proveedor` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  `ref` varchar(20) COLLATE utf8mb3_spanish_ci NOT NULL,
  PRIMARY KEY (`n_bastidor`),
  KEY `coches_ibfk_1` (`dni_proveedor`),
  CONSTRAINT `coches_ibfk_1` FOREIGN KEY (`dni_proveedor`) REFERENCES `proveedores` (`dni`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

-- Volcando datos para la tabla trabajo.coches: ~38 rows (aproximadamente)
INSERT INTO `coches` (`n_bastidor`, `precio`, `estado`, `km`, `cv`, `categoria`, `marca`, `modelo`, `dni_proveedor`, `fecha`, `ref`) VALUES
	('00099988877766655544', 6500, 'siniestrado', 140000, 200, 'Todoterreno', 'Land Rover', 'Defender', '56789012D', '2021-05-06', 'defender.jpg'),
	('00112233445566778888', 20000, 'nuevo', 10000, 240, 'Ranchera', 'Abarth', 'punto', '12938575H', '2024-05-06', 'fiat500.jpg'),
	('00112233445566778899', 60000000, 'nuevo', 1000, 1600, 'Ranchera', 'Renault', 'r25', '33445566X', '2007-05-04', 'r25.jpg'),
	('01234567890123456789', 160000, 'usado', 90000, 300, 'Sedan', 'Hyundai', 'Elantra n', '78901234A', '2023-03-20', 'elantra.png'),
	('10987654321098765432', 28000, 'usado', 100000, 550, 'Berlina', 'Mercedes-Benz', 'E55', '67890123E', '2019-11-15', 'e55.jpg'),
	('11100099988877766655', 6000, 'siniestrado', 130000, 550, 'Coupe', 'Porsche', 'gt4rs', '45678901F', '2020-05-06', 'gt4rs.jpg'),
	('11122233344455566677', 3200000, 'km0', 50, 1000, 'SuperDeportivo', 'spania', 'gto', '89012345H', '2024-05-06', 'gto.jpg'),
	('11511511511511511500', 200000, 'usado', 1111, 1150, 'SuperDeportivo', 'Mercedes-AMG', 'amg clk gtr', '78901234A', '1999-12-14', 'clkgtr.jpg'),
	('12345678901234567890', 40000000, 'nuevo', 0, 900, 'SuperDeportivo', 'Ferrari', 'F40', '11223344A', '2002-03-15', 'f40.png'),
	('21098765432109876115', 100000, 'usado', 200, 615, 'Berlina', 'Mercedes-Benz', 'c63 amg black series', '01234567S', '2012-05-09', 'c63amg.jpg'),
	('21098765432109876543', 19000, 'usado', 55000, 500, 'Coupe', 'Audi', 'rs5', '56789012D', '2001-02-20', 'rs5.jpg'),
	('22211100099988877766', 5500, 'siniestrado', 120000, 500, 'Sedan', 'Mercedes-Benz', 'S-Class', '34567890C', '2019-05-06', 'ClaseS.jpg'),
	('22233344455566677788', 23000, 'usado', 65000, 300, 'hothatch', 'Subaru', 'impreza sti', '90123456M', '2016-09-15', 'impreza.jpg'),
	('24512345674578901235', 18000, 'reparado', 60000, 130, 'Coupe', 'Honda', 'Civic', '78901234A', '2020-05-01', 'civicr.jpg'),
	('24798789327098asd876', 50000, 'reparado', 120000, 530, 'hatchback', 'mitsubishi', 'evo X', '90123456M', '2017-05-01', 'evox.jpeg'),
	('32109876543210987654', 22000, 'reparado', 30000, 130, 'Todoterreno', 'Jeep', 'Wrangler', '45678901F', '2012-05-01', 'wrangler.jpg'),
	('33322211100099988877', 5000, 'siniestrado', 110000, 450, 'SuperDeportivo', 'Audi', 'Rs8', '23456789B', '2018-05-06', 'rs8.jpg'),
	('33344455566677788899', 27000, 'nuevo', 0, 610, 'Coupe', 'Chevrolet', 'Camaro ss', '01234567S', '2022-02-28', 'camaro.jpg'),
	('43210987654321098765', 17000, 'usado', 70000, 200, 'Sedan', 'Honda', 'Accord', '34567890C', '2008-09-15', 'accord.jpg'),
	('44433322211100099988', 4500, 'siniestrado', 100000, 400, 'Berlina', 'BMW', 'M5', '12345678A', '2017-05-06', 'm5.jpg'),
	('444333222111000999aa', 200000, 'nuevo', 0, 1200, 'SuperDeportivo', 'Corvette', 'e-ray', '12345678A', '2024-05-20', 'e-ray.jpg'),
	('44455566677788899900', 20000, 'usado', 75000, 400, 'Sedan', 'Mazda', 'rx7', '11223344A', '2010-11-15', 'rx7.jpg'),
	('54321098765432109876', 35000, 'nuevo', 0, 600, 'SuperDeportivo', 'Porsche', '911 gt3rs', '23456789B', '2015-03-20', '911gt3.jpg'),
	('55544433322211100099', 40000, 'reparado', 90000, 350, 'Todoterreno', 'Jeep', 'trackhawk', '12938575H', '2013-05-01', 'trackhawk.jpg'),
	('55566677788899900011', 33000, 'reparado', 40000, 160, 'Todoterreno', 'Land Rover', 'Range Rover Sport', '22334455Y', '2017-05-01', 'ragneroversport.jpg'),
	('56777712345678901234', 15000, 'reparado', 50000, 120, 'Sedan', 'Toyota', 'Corolla', '33445566X', '2022-03-20', 'corolla.jpg'),
	('65432109876543210987', 20000, 'usado', 60000, 1200, 'Ranchera', 'Audi', 'rs6 mtm', '12345678A', '1995-06-12', 'rs6mtm.jpeg'),
	('66655544433322211100', 35000, 'reparado', 80000, 300, 'Ranchera', 'Subaru', 'Outback', '02394850T', '2008-11-15', 'outback.jpg'),
	('66677788899900011122', 24000, 'usado', 70000, 130, 'Berlina', 'Volvo', 'S60', '33445566X', '2014-09-20', 's60.jpg'),
	('76543210987654321098', 25000, 'km0', 100, 600, 'Coupe', 'BMW', 'M4', '12938575H', '2020-02-28', 'm4.jpg'),
	('77788899900011122233', 300000, 'nuevo', 0, 200, 'SuperDeportivo', 'Aston Martin', 'DB11', '44556677Z', '2025-03-15', 'db11.jpg'),
	('87654321098765432109', 15000, 'usado', 80000, 90, 'hothatch', 'Volkswagen', 'Golf r 32', '02394850T', '2005-11-15', 'r32.jpg'),
	('88899900011122233344', 18000, 'usado', 85000, 300, 'Coupe', 'Nissan', '370Z', '55667788Q', '2007-11-15', '370z.jpg'),
	('94253212345678901253', 22000, 'reparado', 80000, 600, 'Coupe', 'mustang', 'gt500', '89012345H', '2024-05-20', 'gt500.jpg'),
	('99988877766655544433', 20000, 'reparado', 50000, 350, 'Sedan', 'Ford', 'Focus rs', '11223344A', '1993-03-20', 'focusrs.jpg'),
	('asdf2309759823749867', 300000, 'nuevo', 0, 2000, 'SuperDeportivo', 'bugatti', 'la voiture noire', '45678901F', '2021-05-01', 'lavoiture.jpg'),
	('df094385093285034115', 40000, 'nuevo', 0, 600, 'Coupe', 'Honda', 's2000', '01234567S', '2003-05-15', 's2000.jpg'),
	('df094385093285034583', 100000, 'reparado', 8000, 1300, 'Coupe', 'Toyota', 'supra mk4', '01234567S', '2023-05-01', 'mk4.jpg'),
	('sdhfg973489572389702', 2000000, 'reparado', 8000, 1300, 'SuperDeportivo', 'pagani', 'zonda r', '23456789B', '2024-05-20', 'zondar.jpg');

-- Volcando estructura para tabla trabajo.mecanicos
CREATE TABLE IF NOT EXISTS `mecanicos` (
  `dni` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8mb3_spanish_ci NOT NULL,
  `num` int unsigned NOT NULL,
  `email` varchar(50) COLLATE utf8mb3_spanish_ci NOT NULL,
  `sueldo` int unsigned NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

-- Volcando datos para la tabla trabajo.mecanicos: ~21 rows (aproximadamente)
INSERT INTO `mecanicos` (`dni`, `nombre`, `num`, `email`, `sueldo`) VALUES
	('00112233R', 'Rogelia Diaz', 204566543, 'marina@example.com', 30000),
	('01234567G', 'JC Guti', 6666666, 'jcgutisoygypsie@gmail.com', 20000),
	('01234567H', 'Elena Díaz', 104567890, 'elena@example.com', 31000),
	('11223344I', 'Diego Pérez', 119283762, 'diego@example.com', 30000),
	('12345678Z', 'Juan Pérez', 123456789, 'juan@example.com', 30000),
	('22334455J', 'Marta García', 123245672, 'marta@example.com', 32000),
	('23456789X', 'María García', 234535453, 'maria@example.com', 32000),
	('33445566K', 'Alejandro Rodríguez', 130998754, 'alejandro@example.com', 28000),
	('34567890A', 'Pedro Rodríguez', 385483258, 'pedro@example.com', 28000),
	('44556677L', 'Lucía Martínez', 149876854, 'lucia@example.com', 31000),
	('45678901B', 'Ana Martínez', 478934589, 'ana@example.com', 31000),
	('55667788M', 'Fernando López', 153457945, 'fernando@example.com', 29000),
	('56789012C', 'Carlos López', 593873422, 'carlos@example.com', 29000),
	('66778899N', 'Paula Fernández', 163473456, 'paula@example.com', 33000),
	('67890123D', 'Laura Fernández', 634095835, 'laura@example.com', 33000),
	('71349998e', 'Javi', 650789845, 'javier@gmail.com', 40000),
	('77889900O', 'Javier Sánchez', 734643589, 'javier@example.com', 30000),
	('78901234E', 'David Sánchez', 734598983, 'david@example.com', 30000),
	('88990011P', 'Andrea Hernández', 184563438, 'andrea@example.com', 32000),
	('89012345F', 'Sofía Hernández', 80982348, 'sofia@example.com', 32000),
	('90123456G', 'Pablo Gómez', 956536789, 'pablo@example.com', 28000),
	('99001122Q', 'Sergio Gómez', 193463427, 'sergio@example.com', 28000);

-- Volcando estructura para tabla trabajo.proveedores
CREATE TABLE IF NOT EXISTS `proveedores` (
  `dni` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(55) COLLATE utf8mb3_spanish_ci NOT NULL,
  `num` int NOT NULL,
  `email` varchar(35) COLLATE utf8mb3_spanish_ci NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

-- Volcando datos para la tabla trabajo.proveedores: ~20 rows (aproximadamente)
INSERT INTO `proveedores` (`dni`, `nombre`, `num`, `email`) VALUES
	('01234567S', 'Dieter Hoffmann', 123456789, 'dieter@example.com'),
	('02394850T', 'Peter', 691935786, 'peter@gmail.com'),
	('11223344A', 'Andreas Schäfer', 234567890, 'andreas@example.com'),
	('12345678A', 'Friedrich Müller', 123456789, 'friedrich@example.com'),
	('12938575H', 'Harry the dirty', 650345676, 'harryRc@gmail.com'),
	('22334455Y', 'Stefan Koch', 345678901, 'stefan@example.com'),
	('23456789B', 'Heinz Schmidt', 234567890, 'heinz@example.com'),
	('33445566X', 'Bernd Bauer', 456789012, 'bernd@example.com'),
	('34567890C', 'Günther Schneider', 345678901, 'guenther@example.com'),
	('44556677Z', 'Jochen Richter', 567890123, 'jochen@example.com'),
	('45678901F', 'Hans Fischer', 456789012, 'hans@example.com'),
	('55667788Q', 'Markus Klein', 678901234, 'markus@example.com'),
	('56789012D', 'Wolfgang Weber', 567890123, 'wolfgang@example.com'),
	('66778899A', 'Thomas Wolf', 789012345, 'thomas@example.com'),
	('67890123E', 'Klaus Meyer', 678901234, 'klaus@example.com'),
	('78901234A', 'Jürgen Wagner', 789012345, 'juergen@example.com'),
	('89012345H', 'Peter Becker', 890123456, 'peter@example.com'),
	('90123456M', 'Helmut Schulz', 901234567, 'helmut@example.com');

-- Volcando estructura para tabla trabajo.reparaciones
CREATE TABLE IF NOT EXISTS `reparaciones` (
  `dni_mecanico` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `n_bastidor` varchar(20) COLLATE utf8mb3_spanish_ci NOT NULL,
  `n_reparacion` int unsigned NOT NULL,
  `fecha_inicio` date NOT NULL,
  `descp` varchar(300) COLLATE utf8mb3_spanish_ci DEFAULT 'Revision general',
  `fecha_final` date NOT NULL,
  PRIMARY KEY (`dni_mecanico`,`n_bastidor`,`n_reparacion`),
  UNIQUE KEY `n_reparacion` (`n_reparacion`),
  KEY `reparaciones_ibfk_1` (`n_bastidor`),
  CONSTRAINT `reparaciones_ibfk_1` FOREIGN KEY (`n_bastidor`) REFERENCES `coches` (`n_bastidor`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `reparaciones_ibfk_2` FOREIGN KEY (`dni_mecanico`) REFERENCES `mecanicos` (`dni`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

-- Volcando datos para la tabla trabajo.reparaciones: ~15 rows (aproximadamente)
INSERT INTO `reparaciones` (`dni_mecanico`, `n_bastidor`, `n_reparacion`, `fecha_inicio`, `descp`, `fecha_final`) VALUES
	('00112233R', '55566677788899900011', 115115, '2024-05-03', 'Cambio de motor', '2024-05-11'),
	('01234567G', '00099988877766655544', 115, '2024-05-12', 'Cambio de motor y \nlado del volante', '2024-05-31'),
	('01234567H', '21098765432109876543', 154, '2024-05-10', 'Reparación de sistema de escape', '2024-06-11'),
	('01234567H', '55544433322211100099', 11115, '2024-05-03', 'cambio de aceite', '2024-05-04'),
	('11223344I', '10987654321098765432', 134, '2024-05-11', 'Cambio de amortiguadores', '2024-09-13'),
	('12345678Z', '12345678901234567890', 1453, '2024-05-01', 'Cambio de aceite y filtro', '2024-05-25'),
	('22334455J', '01234567890123456789', 1, '2024-05-12', 'Reparación de sistema de dirección', '2024-06-11'),
	('33445566K', '11122233344455566677', 16, '2024-05-13', 'Cambio de batería', '2024-05-14'),
	('44556677L', '22233344455566677788', 123452, '2024-05-14', 'Revisión de sistema de inyección', '2024-05-20'),
	('45678901B', '87654321098765432109', 452, '2024-05-04', 'Cambio de bujías', '2024-05-17'),
	('55667788M', '33344455566677788899', 984, '2024-05-15', 'Cambio de filtro de aire', '2024-08-16'),
	('55667788M', '33344455566677788899', 234123, '2024-08-15', 'Cambio de motor', '2024-12-20'),
	('56789012C', '76543210987654321098', 623, '2024-05-05', 'Reparación de suspensión', '2024-07-06'),
	('67890123D', '65432109876543210987', 235, '2024-05-06', 'Cambio de correa de distribución', '2024-08-16'),
	('78901234E', '54321098765432109876', 12, '2024-05-07', 'Reparación de sistema eléctrico', '2024-09-08'),
	('89012345F', '43210987654321098765', 554, '2024-05-08', 'Cambio de neumáticos', '2024-05-09'),
	('90123456G', '32109876543210987654', 1345, '2024-05-09', 'Revisión de sistema de refrigeración', '2025-05-10');

-- Volcando estructura para tabla trabajo.vendedores
CREATE TABLE IF NOT EXISTS `vendedores` (
  `dni` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(55) COLLATE utf8mb3_spanish_ci NOT NULL,
  `num` int NOT NULL,
  `email` varchar(35) COLLATE utf8mb3_spanish_ci NOT NULL,
  `sueldo` int unsigned NOT NULL,
  `passwd` varchar(70) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

-- Volcando datos para la tabla trabajo.vendedores: ~22 rows (aproximadamente)
INSERT INTO `vendedores` (`dni`, `nombre`, `num`, `email`, `sueldo`, `passwd`) VALUES
	('001122334', 'Julius Schmidt', 1122334, 'julius@example.com', 32000, ''),
	('012345678', 'Luca Rossi', 12345678, 'luca@example.com', 31000, '148de9c5a7a44d19e56cd9ae1a554bf67847afb0c58f6e12fa29ac7ddfca9940'),
	('08080808A', 'Anthony', 634568978, 'antony@gmail.com', 25000, '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
	('112233445', 'Ivan Ivanov', 112233445, 'ivan@example.com', 30000, ''),
	('123456789', 'John Smith', 123456789, 'john@example.com', 30000, ''),
	('223344556', 'Sven Andersen', 223344556, 'sven@example.com', 32000, ''),
	('234567890', 'Maria Garcia', 234567890, 'maria@example.com', 32000, ''),
	('334455667', 'Juan Fernandez', 334455667, 'juan@example.com', 28000, ''),
	('345678901', 'Pierre Dubois', 345678901, 'pierre@example.com', 28000, ''),
	('445566778', 'Xia Li', 445566778, 'xia@example.com', 31000, ''),
	('456789012', 'Satoshi Tanaka', 456789012, 'satoshi@example.com', 31000, ''),
	('556677889', 'Katja Müller', 556677889, 'katja@example.com', 29000, ''),
	('567890123', 'Hans Müller', 567890123, 'hans@example.com', 29000, ''),
	('667788990', 'Mohamed Al-Farsi', 667788990, 'mohamed@example.com', 33000, ''),
	('678901234', 'Juan Martinez', 678901234, 'juan@example.com', 33000, ''),
	('72229796K', 'alex', 650345676, 'admin@gmail.com', 50000, '4135aa9dc1b842a653dea846903ddb95bfb8c5a10c504a7fa16e10bc31d1fdf0'),
	('778899001', 'Javier Lopez', 778899001, 'javier@example.com', 30000, ''),
	('789012345', 'Alexander Petrov', 789012345, 'alexander@example.com', 30000, ''),
	('889900112', 'Mohamed Hussein', 889900112, 'mohamed@example.com', 32000, ''),
	('890123456', 'Ali Khan', 890123456, 'ali@example.com', 32000, ''),
	('901234567', 'Mohammed Patel', 901234567, 'mohammed@example.com', 28000, ''),
	('990011223', 'João Silva', 990011223, 'joão@example.com', 28000, '');

-- Volcando estructura para tabla trabajo.ventas
CREATE TABLE IF NOT EXISTS `ventas` (
  `n_bastidor` varchar(20) COLLATE utf8mb3_spanish_ci NOT NULL,
  `dni_empleado` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `dni_cliente` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  `precio_venta` int unsigned NOT NULL,
  PRIMARY KEY (`n_bastidor`,`dni_cliente`),
  UNIQUE KEY `n_bastidor` (`n_bastidor`),
  KEY `dni_cliente` (`dni_cliente`),
  KEY `dni_empleado` (`dni_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

-- Volcando datos para la tabla trabajo.ventas: ~21 rows (aproximadamente)
INSERT INTO `ventas` (`n_bastidor`, `dni_empleado`, `dni_cliente`, `fecha`, `precio_venta`) VALUES
	('00099988877766655544', '72229796K', '01234567H', '2024-05-19', 8645),
	('10987654321098765432', '223344556', '78901234E', '2024-07-17', 28500),
	('11100099988877766655', '112233445', '67890123D', '2024-05-16', 19500),
	('11122233344455566677', '445566778', '90123456G', '2024-05-19', 3250000),
	('22211100099988877766', '012345678', '56789012C', '2021-01-15', 22500),
	('32109876543210987654', '72229796K', '71319994e', '2024-05-24', 29260),
	('33322211100099988877', '901234567', '45678901B', '2023-01-14', 17500),
	('43210987654321098765', '72229796K', '11111111B', '2024-05-24', 22610),
	('54321098765432109876', '789012345', '34567890A', '2016-03-13', 35500),
	('55544433322211100099', '72229796K', '23456789X', '2024-05-23', 53200),
	('55566677788899900011', '889900112', '33445566K', '2019-11-23', 33500),
	('56777712345678901234', '72229796K', '11111111B', '2024-05-21', 300000),
	('66655544433322211100', '72229796K', '71319994e', '2024-05-23', 46550),
	('66677788899900011122', '72229796K', '01234567H', '2024-05-24', 31920),
	('76543210987654321098', '567890123', '12345678Z', '2023-01-11', 25500),
	('77788899900011122233', '72229796K', '78901234E', '2024-05-24', 399000),
	('87654321098765432109', '456789012', '11111111B', '2020-03-10', 15500),
	('94253212345678901253', '345678901', '71317755E', '2024-07-09', 30500),
	('98765432109876543210', '345678901', '71317755E', '2024-07-09', 30500),
	('99988877766655544433', '72229796K', '01234567H', '2024-05-22', 26600),
	('asdf2309759823749867', '72229796K', '71319994e', '2024-05-24', 399000),
	('df094385093285034583', '567890123', '12345678Z', '2024-07-11', 25500);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
