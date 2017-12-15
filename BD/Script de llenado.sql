/*  LLENADO DE DATOS DE OCUPACION INICIO  */

INSERT INTO `dbcasacambioforex`.`ocupacion`
(`IdOcupacion`,
`DescripcionOcupacion`)
VALUES
('001','Ama De Casa'),
('002','Desempleado'),
('003','Empleado'),
('004','Empleador(A)'),
('005','Estudiante'),
('006','Jubilado(A)'),
('007','Miembro De Las Fuerzas Armadas / Miembro Del Clero'),
('008','Obrero(A)'),
('009','Trabajador(A) Del Hogar'),
('010','Trabajador(A) Independiente'),
('099','No Declara');

/*  LLENADO DE DATOS DE OCUPACION FIN  */

/*  LLENADO DE DATOS DE PAIS INICIO  */

INSERT INTO `dbcasacambioforex`.`pais`
(`IdPais`,
`NombrePais`)
VALUES
('PE','Peru');

/*  LLENADO DE DATOS DE PAIS FIN  */

/*  LLENADO DE DATOS DE TIPO DOCUMENTO INICIO  */

INSERT INTO `dbcasacambioforex`.`tipodocumento`
(`IdTipoDocumento`,
`DescripcionTipoDocumento`)
VALUES
('001','Otros (Carta de Identidad, Cédula de Identidad, Partida de Nacimiento, etc.)');

/*  LLENADO DE DATOS DE TIPO DOCUMENTO FIN  */

/*  LLENADO DE DATOS DE TIPO USUARIO INICIO  */

INSERT INTO `dbcasacambioforex`.`tipousuario`
(`DescripcionTipoUsuario`)
VALUES
('Propietario');

/*  LLENADO DE DATOS DE TIPO USUARIO FIN  */

/*  LLENADO DE DATOS DE PERSONA INICIO  */

INSERT INTO `dbcasacambioforex`.`persona`
(`TipoDocumento_IdTipoDocumento`,
`NumeroDocumentoPersona`,
`ApellidoPrimeroPersona`,
`ApellidoSegundoPersona`,
`NombresPersona`,
`Pais_idPais`,
`Ocupacion_IdOcupacion`)
VALUES
('001',
'48511647',
'Cespedes',
'Medina',
'Christian Alexander',
'PE',
'005');

/*  LLENADO DE DATOS DE PERSONA FIN  */

/*  LLENADO DE DATOS DE USUARIO INICIO  */

INSERT INTO `dbcasacambioforex`.`usuario`
(`Persona_NumeroDocumentoPersona`,
`NombreUsuario`,
`PasswordUsuario`,
`TipoUsuario_IdTipoUsuario`,
`EstadoUsuario`)
VALUES
('48511647',
'n0thing',
'123456',
'1',
'1');

/*  LLENADO DE DATOS DE USUARIO FIN  */

use dbcasacambioforex;

Select TipoDocumento_IdTipoDocumento,NumeroDocumentoPersona,ApellidoPrimeroPersona,
ApellidoSegundoPersona,NombresPersona,Pais_idPais,Ocupacion_IdOcupacion
 from persona inner join usuario on NumeroDocumentoPersona = Persona_NumeroDocumentoPersona
where NombreUsuario = 'n0thing' AND PasswordUsuario='123456' AND EstadoUsuario = '1';
















