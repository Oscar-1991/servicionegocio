CREATE DATABASE PRUEBA;
USE PRUEBA;

-- TABLA EMPLOYEE
create table Employee(
	`id` bigint not null auto_increment,
    `surname` varchar(50),
    `firstname` varchar(50),
    primary key(`id`)
);

-- TABLA COUNTRY
create table Country(
	`id` bigint not null auto_increment,
    `code` varchar(50),
    `name` varchar(50),
    primary key(`id`)
);

-- TABLA LANGUAGE
create table Languages(
	`id` bigint not null auto_increment,
    `code` varchar(50),
    `name` varchar(50),
    primary key(`id`)
);


-- TABLA AIRPORT
create table Airport(
	`id` bigint not null auto_increment,
    `name` varchar(50),
    primary key(`id`)
);


