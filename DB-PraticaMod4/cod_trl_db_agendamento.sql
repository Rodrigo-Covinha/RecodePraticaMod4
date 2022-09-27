CREATE DATABASE  IF NOT EXISTS `cod_trl_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cod_trl_db`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: cod_trl_db
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendamento`
--

DROP TABLE IF EXISTS `agendamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agendamento` (
  `IdAgenda` int NOT NULL AUTO_INCREMENT,
  `Classe` varchar(20) NOT NULL,
  `dataIda` date NOT NULL,
  `dataVolta` date NOT NULL,
  `qtdCrianca` varchar(2) NOT NULL,
  `qtdAdulto` varchar(2) NOT NULL,
  `Origem` varchar(20) NOT NULL,
  `Destino` varchar(20) NOT NULL,
  `fk_Passagem_CodBilhete` int DEFAULT NULL,
  `fk_Cliente_idCliente` int DEFAULT NULL,
  PRIMARY KEY (`IdAgenda`),
  KEY `FK_Agendamento_2` (`fk_Passagem_CodBilhete`),
  KEY `FK_Agendamento_3` (`fk_Cliente_idCliente`),
  CONSTRAINT `FK_Agendamento_2` FOREIGN KEY (`fk_Passagem_CodBilhete`) REFERENCES `passagem` (`codBilhete`) ON DELETE CASCADE,
  CONSTRAINT `FK_Agendamento_3` FOREIGN KEY (`fk_Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendamento`
--

LOCK TABLES `agendamento` WRITE;
/*!40000 ALTER TABLE `agendamento` DISABLE KEYS */;
INSERT INTO `agendamento` VALUES (1,'Classe Economica','2022-09-28','2022-09-29','2','2','Dubai','Reino Unido',NULL,NULL),(2,'Classe Executiva','2022-09-29','2022-09-30','2','2','Italia','Portugal',NULL,NULL),(3,'Classe Economica','2022-09-29','2022-09-30','0','1','Mother Russia','Ucraine',NULL,NULL),(4,'Classe Executiva','2022-09-29','2022-09-30','1','1','Mother Russia','Australia',NULL,NULL),(7,'Primeira Classe','2022-09-29','2022-09-30','2','2','Brasil','EUA',NULL,NULL),(8,'Primeira Classe','2022-09-29','2022-09-30','0','2','Suiça','Polonia',NULL,NULL);
/*!40000 ALTER TABLE `agendamento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-26 23:36:06
