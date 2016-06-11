# Prueba3Programacion2

create database pokedex;

create table usuarios(
usuario_id int(10) primary key not null auto_increment,
nombre varchar(25),
passwd varchar(25),
fecha varchar(25),
estado varchar(25));

create table pokemones(
pokemon_id int(10) primary key not null auto_increment,
nombre varchar(25),
fecha_nacimiento varchar(25),
numero int(10),
tipo_id int(10),
estado varchar(25),
creado_por int(25));

create table tipos(
tipo_id int(10) primary key not null auto_increment,
nombre varchar(25),
estado varchar(25),
habilidad_id int(10));

create table habilidades(
nombre varchar(25),
estado varchar(25));
