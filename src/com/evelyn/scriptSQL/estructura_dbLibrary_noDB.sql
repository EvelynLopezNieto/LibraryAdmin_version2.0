CREATE TABLE IF NOT EXISTS `BIBLIOTECA`.`tbl_libro` (
  `ID_libro` VARCHAR(30) NOT NULL,
  `nombre_libro` VARCHAR(150) NOT NULL,
  `autor_libro` VARCHAR(100) NOT NULL,
  `editorial_libro` VARCHAR(50) NOT NULL,
  `anio_publicacion` VARCHAR(4) NOT NULL,
  `ciudad_publicacion` VARCHAR(100) NOT NULL,
  `area_conocimiento` VARCHAR(50) NOT NULL,
  `ejemplares` INT NOT NULL,
  PRIMARY KEY (`ID_libro`));

CREATE TABLE IF NOT EXISTS `BIBLIOTECA`.`tbl_lector` (
  `ID_lector` VARCHAR(100) NOT NULL,
  `nombre_lector` VARCHAR(50) NOT NULL,
  `ape_paterno_lector` VARCHAR(50) NOT NULL,
  `ape_materno_lector` VARCHAR(50) NOT NULL,
  `edad_lector` VARCHAR(5) NULL,
  `telefono_lector` VARCHAR(15) NULL,
  `domicilio_lector` VARCHAR(150) NULL,
  `grado_alumno` VARCHAR(12) NULL,
  `grupo_alumno` VARCHAR(3) NULL,
  PRIMARY KEY (`ID_lector`));
  
  CREATE TABLE IF NOT EXISTS `BIBLIOTECA`.`tbl_prestamo` (
  `ID_prestamo` INT NOT NULL AUTO_INCREMENT,
  `ID_libro` VARCHAR(30) NOT NULL,
  `ID_lector` VARCHAR(100) NOT NULL,
  `fecha_prestamo` DATE NOT NULL,
  `fecha_entrega` DATE NOT NULL,
  `turno` VARCHAR(20) NOT NULL,
  `tipo_prestamo` VARCHAR(20) NOT NULL,
  `status_prestamo` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`ID_prestamo`, `ID_libro`, `ID_lector`),
  CONSTRAINT `ID_libro`
    FOREIGN KEY (`ID_libro`)
    REFERENCES `BIBLIOTECA`.`tbl_libro` (`ID_libro`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `ID_lector`
    FOREIGN KEY (`ID_lector`)
    REFERENCES `BIBLIOTECA`.`tbl_lector` (`ID_lector`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
    
CREATE TABLE IF NOT EXISTS `BIBLIOTECA`.`tbl_usuarioSis` (
  `ID_usuario` INT NOT NULL AUTO_INCREMENT,
  `nombre_usuario` VARCHAR(50) NOT NULL,
  `apePat_usuario` VARCHAR(50) NOT NULL,
  `apeMat_usuario` VARCHAR(50) NOT NULL,
  `telefono_usuario` VARCHAR(15) NOT NULL,
  `turno` VARCHAR(20) NOT NULL,
  `usuario` VARCHAR(50) NOT NULL,
  `pass` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID_usuario`));

CREATE TABLE IF NOT EXISTS `BIBLIOTECA`.`tbl_historial_prestamo` (
  `ID_histPrestamo` INT NOT NULL AUTO_INCREMENT,
  `ID_libroHist` VARCHAR(30) NOT NULL,
  `ID_lectorHist` VARCHAR(100) NOT NULL,
  `fechaPrestamo_hist` DATE NOT NULL,
  `fechaEntrega_hist` DATE NOT NULL,
  `turno_hist` VARCHAR(20) NOT NULL,
  `tipoPrestamo_hist` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`ID_histPrestamo`));
  