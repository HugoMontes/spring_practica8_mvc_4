CREATE SEQUENCE id_estudiante_seq;
CREATE SEQUENCE id_profesor_seq;
CREATE TABLE estudiantes(
   id   INT NOT NULL PRIMARY KEY DEFAULT NEXTVAL('id_estudiante_seq'),
   nombre VARCHAR(20) NOT NULL,
   edad  INT NOT NULL
);
INSERT INTO estudiantes(nombre, edad)
values ('Juan',23);
INSERT INTO estudiantes(nombre, edad)
values ('Ana',48);
INSERT INTO estudiantes(nombre, edad)
values ('Marcos',16);
INSERT INTO estudiantes(nombre, edad)
values ('Jesus',39);
CREATE TABLE profesores(
   id   INT NOT NULL PRIMARY KEY DEFAULT NEXTVAL('id_profesor_seq'),
   ci VARCHAR(20) NOT NULL,
   nombre VARCHAR(20) NOT NULL,
   apellido VARCHAR(20) NOT NULL,
   sueldo  NUMERIC NOT NULL
);
INSERT INTO profesores(ci, nombre, apellido, sueldo)
values ('5878585','Mario','Molina',2300.95);
INSERT INTO profesores(ci, nombre, apellido, sueldo)
values ('6958525','Pedro','Fernandez',4000.00);
INSERT INTO profesores(ci, nombre, apellido, sueldo)
values ('8596585','Graciela','Montero',5200.50);
INSERT INTO profesores(ci, nombre, apellido, sueldo)
values ('7858522','Raul','Salmon',2800.30);