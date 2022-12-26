
/**
 * Author:  Fernando Ismael Canul Caballero
 * Created: 13/11/2022
 */
 
SHOW DATABASES;

/*CREAR BASE DE DATOS*/
CREATE DATABASE cinema;

USE cinema;

/*Tabla clientes*/
CREATE TABLE cinema.client_cinema (
  idclient INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  correo_electronico VARCHAR(45) NOT NULL,
  usuario VARCHAR(45) NOT NULL,
  contrasena VARCHAR(45) NOT NULL,
  fecha_nacimiento VARCHAR(45) NOT NULL,
  PRIMARY KEY (idclient));

/*Tabla administradores*/
CREATE TABLE cinema.manager_cinema (
  idManager INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  correo_electronico VARCHAR(45) NOT NULL,
  usuario VARCHAR(45) NOT NULL,
  contrasena VARCHAR(45) NOT NULL,
  fecha_nacimiento VARCHAR(45) NOT NULL,
  clave_administrador INT NOT NULL,
  PRIMARY KEY (idManager));

/*Tabla películas*/
CREATE TABLE cinema.movie_cinema (
  idMovie INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  genero VARCHAR(45) NOT NULL,
  duracion DOUBLE NOT NULL,
  fecha_lanzamiento VARCHAR(45) NOT NULL,
  fecha_creacion VARCHAR(45) NOT NULL,
  PRIMARY KEY (idMovie));

/*Tabla ordenes*/
CREATE TABLE cinema.order_cinema (
  idOrder INT NOT NULL AUTO_INCREMENT,
  nombre_titular VARCHAR(45) NOT NULL,
  numero_tarjeta VARCHAR(45) NOT NULL,
  numero_comprobante INT NOT NULL,
  nombre_pelicula VARCHAR(45) NOT NULL,
  fecha_hora VARCHAR(45) NOT NULL,
  tipo_de_funcion VARCHAR(45) NOT NULL,
  numero_boletos INT NOT NULL,
  asientos VARCHAR(250) NOT NULL,
  costo_total DOUBLE NOT NULL,
  PRIMARY KEY (idOrder));

/*AGREGAR USUARIOS*/
INSERT INTO client_cinema (idclient, nombre, apellido, correo_electronico,usuario,contrasena,fecha_nacimiento) VALUES (1,"Fernando", "Canul","fcanul@walook.com.mx", "fismael21","1234","1999-9-14");
INSERT INTO client_cinema (idclient, nombre, apellido, correo_electronico,usuario,contrasena,fecha_nacimiento) VALUES (2,"Andrés", "Mena","amena@walook.com.mx", "mena18","root","1999-3-12");

/*AGREGAR ADMINISTRADORES*/
INSERT INTO manager_cinema (idManager, nombre, apellido, correo_electronico,usuario,contrasena,fecha_nacimiento, clave_administrador) VALUES (1,"Edwin", "Leon","ELeon@gmail.com.mx", "ELeon21","root", "1979-9-13", 5435);

/*AGREGAR LISTA DE PELÍCULAS A LA TABLA PELÍCULAS ANTES DE CORRER LA APLICACIÓN*/
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (1, "The Matrix", "Acción", 119, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (2, "A Beautiful Mind", "Acción", 129, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (3, "One Piece Film Red", "Acción", 109, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (4, "Hachiko", "Acción", 112, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (5, "The Pianist", "Acción", 121, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (6, "The Net", "Acción", 108, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (7, "Troy", "Acción", 191, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (8, "The Gruge", "Acción", 129, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (9, "Ginger Snaps", "Acción", 139, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (10, "The Silent of the Lamps", "Acción", 142, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (11, "The Intership", "Acción", 132, "1999-8-12", "2000-9-21");
INSERT INTO movie_cinema (idMovie, nombre, genero, duracion, fecha_lanzamiento, fecha_creacion) VALUES (12, "The Social Network", "Acción", 131, "1999-8-12", "2000-9-21");

