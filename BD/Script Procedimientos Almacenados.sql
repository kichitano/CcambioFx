 
/* PROCEDIMIENTOS ALMACENADOS */

/* Insertar PERSONA */

DELIMITER @@
CREATE PROCEDURE insertarPersona
(
parTipoDocumento_IdTipoDocumento varchar(5), 
parNumeroDocumentoPersona varchar(25), 
parApellidoPrimeroPersona varchar(100), 
parApellidoSegundoPersona varchar(100), 
parNombresPersona varchar(150), 
parPais_idPais varchar(5),
parOcupacion_IdOcupacion varchar(5)
)
BEGIN
 INSERT INTO persona(
TipoDocumento_IdTipoDocumento,
NumeroDocumentoPersona,
ApellidoPrimeroPersona,
ApellidoSegundoPersona,
NombresPersona,
Pais_idPais,
Ocupacion_IdOcupacion) 
VALUES(parTipoDocumento_IdTipoDocumento,
parNumeroDocumentoPersona,
parApellidoPrimeroPersona,
parApellidoSegundoPersona,
parNombresPersona,
parPais_idPais,
parOcupacion_IdOcupacion);
END @@ 
DELIMITER ;

Call insertarPersona(1,'75689712','VEGA','CALLE','ALBERTO',3,2);

/* Modificar PERSONA */
DELIMITER @@
CREATE PROCEDURE actualizarPersona
(
parTipoDocumento_IdTipoDocumento varchar(5), 
parNumeroDocumentoPersona varchar(25), 
parApellidoPrimeroPersona varchar(100), 
parApellidoSegundoPersona varchar(100), 
parNombresPersona varchar(150), 
parPais_idPais varchar(5),
parOcupacion_IdOcupacion varchar(5)
)
BEGIN
UPDATE persona SET
TipoDocumento_IdTipoDocumento=parTipoDocumento_IdTipoDocumento,
NumeroDocumentoPersona=parNumeroDocumentoPersona,
ApellidoPrimeroPersona=parApellidoPrimeroPersona,
ApellidoSegundoPersona=parApellidoSegundoPersona,
NombresPersona=parNombresPersona,
Pais_idPais=parPais_idPais,
Ocupacion_IdOcupacion=parOcupacion_IdOcupacion
   WHERE NumeroDocumentoPersona=parNumeroDocumentoPersona;
END @@ 
DELIMITER ;

/* Insertar USUARIO */

DELIMITER @@
CREATE PROCEDURE insertarUsuario
(
parPersona_NumeroDocumentoPersona varchar(25), 
parNombreUsuario varchar(25), 
parPasswordUsuario varchar(16), 
parTipoUsuario_IdTipoUsuario int, 
parEstadoUsuario tinyint
)
BEGIN
 INSERT INTO usuario(
Persona_NumeroDocumentoPersona , 
NombreUsuario , 
PasswordUsuario , 
TipoUsuario_IdTipoUsuario , 
EstadoUsuario )
VALUES(
parPersona_NumeroDocumentoPersona,
parNombreUsuario,
parPasswordUsuario,
parEstadoUsuario);
END @@ 
DELIMITER ;

/* Modificar USUARIO */
DELIMITER @@
CREATE PROCEDURE actualizarUsuario
(
parIdUsuario int, 
parPersona_NumeroDocumentoPersona varchar(25), 
parNombreUsuario varchar(25), 
parPasswordUsuario varchar(16), 
parTipoUsuario_IdTipoUsuario int, 
parEstadoUsuario tinyint
)
BEGIN
UPDATE persona SET
Persona_NumeroDocumentoPersona=parPersona_NumeroDocumentoPersona,
NombreUsuario=parNombreUsuario,
PasswordUsuario=parPasswordUsuario,
TipoUsuario_IdTipoUsuario=parTipoUsuario_IdTipoUsuario,
EstadoUsuario=parEstadoUsuario
   WHERE IdUsuario=parIdUsuario;
END @@ 
DELIMITER ;

/* Insertar TIPO DE USUARIO */

DELIMITER @@
CREATE PROCEDURE insertarTipoUsuario
(
parIdTipoUsuario INT, 
parDescripcionTipoUsuario varchar(75)
)
BEGIN
 INSERT INTO usuario(
IdTipoUsuario , 
DescripcionTipoUsuario )
VALUES(
parIdTipoUsuario,
parDescripcionTipoUsuario);
END @@ 
DELIMITER ;

/* Modificar TIPO DE USUARIO */

DELIMITER @@
CREATE PROCEDURE actualizarTipoUsuario
(
parIdTipoUsuario int, 
parDescripcionTipoUsuario varchar(75)
)
BEGIN
UPDATE persona SET
DescripcionTipoUsuario=parDescripcionTipoUsuario
   WHERE IdTipoUsuario=parIdTipoUsuario;
END @@ 
DELIMITER ;