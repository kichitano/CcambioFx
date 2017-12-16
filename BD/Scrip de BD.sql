-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema DBCasaCambioForex
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DBCasaCambioForex
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DBCasaCambioForex` DEFAULT CHARACTER SET utf8 ;
USE `DBCasaCambioForex` ;

-- -----------------------------------------------------
-- Table `DBCasaCambioForex`.`TipoDocumento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBCasaCambioForex`.`TipoDocumento` (
  `IdTipoDocumento` VARCHAR(5) NOT NULL,
  `DescripcionTipoDocumento` VARCHAR(125) NULL,
  PRIMARY KEY (`IdTipoDocumento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBCasaCambioForex`.`Pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBCasaCambioForex`.`Pais` (
  `IdPais` VARCHAR(5) NOT NULL,
  `NombrePais` VARCHAR(45) NULL,
  PRIMARY KEY (`IdPais`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBCasaCambioForex`.`Ocupacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBCasaCambioForex`.`Ocupacion` (
  `IdOcupacion` VARCHAR(5) NOT NULL,
  `DescripcionOcupacion` VARCHAR(75) NULL,
  PRIMARY KEY (`IdOcupacion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBCasaCambioForex`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBCasaCambioForex`.`Persona` (
  `TipoDocumento_IdTipoDocumento` VARCHAR(5) NOT NULL,
  `NumeroDocumentoPersona` VARCHAR(25) NOT NULL,
  `ApellidoPrimeroPersona` VARCHAR(100) NULL,
  `ApellidoSegundoPersona` VARCHAR(100) NULL,
  `NombresPersona` VARCHAR(150) NULL,
  `Pais_idPais` VARCHAR(5) NOT NULL,
  `Ocupacion_IdOcupacion` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`NumeroDocumentoPersona`),
  INDEX `fk_Persona_TipoDocumento_idx` (`TipoDocumento_IdTipoDocumento` ASC),
  INDEX `fk_Persona_Pais1_idx` (`Pais_idPais` ASC),
  INDEX `fk_Persona_Ocupacion1_idx` (`Ocupacion_IdOcupacion` ASC),
  CONSTRAINT `fk_Persona_TipoDocumento`
    FOREIGN KEY (`TipoDocumento_IdTipoDocumento`)
    REFERENCES `DBCasaCambioForex`.`TipoDocumento` (`IdTipoDocumento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Persona_Pais1`
    FOREIGN KEY (`Pais_idPais`)
    REFERENCES `DBCasaCambioForex`.`Pais` (`IdPais`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Persona_Ocupacion1`
    FOREIGN KEY (`Ocupacion_IdOcupacion`)
    REFERENCES `DBCasaCambioForex`.`Ocupacion` (`IdOcupacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBCasaCambioForex`.`TipoUsuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBCasaCambioForex`.`TipoUsuario` (
  `IdTipoUsuario` INT NOT NULL AUTO_INCREMENT,
  `DescripcionTipoUsuario` VARCHAR(75) NULL,
  PRIMARY KEY (`IdTipoUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBCasaCambioForex`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBCasaCambioForex`.`Usuario` (
  `IdUsuario` INT NOT NULL AUTO_INCREMENT,
  `Persona_NumeroDocumentoPersona` VARCHAR(25) NOT NULL,
  `NombreUsuario` VARCHAR(25) NULL,
  `PasswordUsuario` VARCHAR(16) NULL,
  `TipoUsuario_IdTipoUsuario` INT NOT NULL,
  `EstadoUsuario` TINYINT NULL,
  PRIMARY KEY (`IdUsuario`),
  INDEX `fk_Usuario_TipoUsuario1_idx` (`TipoUsuario_IdTipoUsuario` ASC),
  INDEX `fk_Usuario_Persona1_idx` (`Persona_NumeroDocumentoPersona` ASC),
  UNIQUE INDEX `Persona_NumeroDocumentoPersona_UNIQUE` (`Persona_NumeroDocumentoPersona` ASC),
  CONSTRAINT `fk_Usuario_TipoUsuario1`
    FOREIGN KEY (`TipoUsuario_IdTipoUsuario`)
    REFERENCES `DBCasaCambioForex`.`TipoUsuario` (`IdTipoUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Persona1`
    FOREIGN KEY (`Persona_NumeroDocumentoPersona`)
    REFERENCES `DBCasaCambioForex`.`Persona` (`NumeroDocumentoPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
