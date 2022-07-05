CREATE DATABASE PRUEBA;
USE PRUEBA;

-- TABLA AIRPORT
create table Airport(
	`id` bigint not null auto_increment,
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

-- TABLA COUNTRY
create table Country(
	`id` bigint not null auto_increment,
    `code` varchar(50),
    `name` varchar(50),
    `idAirport` bigint,
    primary key(`id`),
    foreign key(idAirport) references Airport(id)
);

-- TABLA EMPLOYEE
create table Employee(
	`id` bigint not null auto_increment,
    `surname` varchar(50),
    `firstname` varchar(50),
    `idCountry` bigint,
    `idLanguage` bigint,
    primary key(`id`),
    foreign key(idCountry) references Country(id),
    foreign key(idLanguage) references Languages(id)
);

select * from Airport;
select * from Languages;
select * from Country;
select * from Employee;
    
insert into Airport (name) values
	('Ministro Pistarini'),
    ('Internacional de Sao Paulo'),
    ('Vancuver International'),
    ('Internacional de Santiago'),
    ('Lic. Benito Juarez International');    

insert into Languages (code, name) values
	('LANG001','Armenian'),
    ('LANG002','English'),
    ('LANG003','French'),
    ('LANG004','Italian'),
    ('LANG005','Spanish');
    
insert into Country (code, name, idAirport) values
	('COUN0001','Argentina', 1),
    ('COUN0002','Brasil', 2),
    ('COUN0003','Canada', 3),
    ('COUN0003','Chile', 4),
    ('COUN0004','Mexico', 5);

insert into Employee (surname, firstname, idCountry, idLanguage) values
	('Gervacio','Ernesto', 1, 5),
    ('Perez','Godinez',2, 5),
    ('Rosas','Oscar', 3, 3),
    ('Ventura','Julio', 4, 5),
    ('Tadeo','Braulio', 5, 5);
