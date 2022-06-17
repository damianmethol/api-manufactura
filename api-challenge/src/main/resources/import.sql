-- Creación de base de datos
drop database if exists challenge;
create database challenge;
use challenge;

-- Creación de tablas
drop table if exists users;
create table users (
    id int auto_increment primary key,
    username varchar (10) unique not null,
    pass varchar (16) not null,
    create_at datetime,
    userStatus boolean not null
);

drop table if exists accessLvl;
create table accessLvl (
    id int auto_increment primary key,
    lvl varchar(15) unique not null
);

drop table if exists securityGroups;
create table securityGroups (
    id int auto_increment primary key,
    group_name varchar (20) unique not null,
    group_description tinytext not null
);

drop table if exists userSecurity;
create table userSecurity (
    id int auto_increment primary key,
    userID int not null,
    lvlID int not null,
    groupID int not null
    );
    
-- Constraints
alter table userSecurity
    add constraint FK_userSecurity_userID
    foreign key(userID)
    references users(id);
    
alter table userSecurity
    add constraint FK_userSecurity_lvlID
    foreign key(lvlID)
    references accessLvl(id);
    
alter table userSecurity
    add constraint FK_userSecurity_groupID
    foreign key(groupID)
    references securityGroups(id);
    
-- Poblado de tablas
insert into users (username, pass, create_at, userStatus) values ('damianMet', 'damian1234', NOW(), true);
insert into users (username, pass, create_at, userStatus) values ('manuReq', 'manu1234', NOW(), false);
insert into users (username, pass, create_at, userStatus) values ('javiPoz', 'javi1234', NOW(), 1);
insert into users (username, pass, create_at, userStatus) values ('luisRos', 'luis1234', NOW(), 0);


insert into accessLvl (lvl) value ('Read');
insert into accessLvl (lvl) value ('Write');
insert into accessLvl (lvl) value ('Administrator');
insert into accessLvl (lvl) value ('Owner');


insert into securityGroups (group_name, group_description) values ('Group A', 'Descripcion Grupo A');
insert into securityGroups (group_name, group_description) values ('Group B', 'Descripcion Grupo B');
insert into securityGroups (group_name, group_description) values ('Group C', 'Descripcion Grupo C');
insert into securityGroups (group_name, group_description) values ('Group D', 'Descripcion Grupo D');


insert into userSecurity (userID, lvlID, groupID) values (2,4,4);
insert into userSecurity (userID, lvlID, groupID) values (2,1,4);
insert into userSecurity (userID, lvlID, groupID) values (1,1,1);
insert into userSecurity (userID, lvlID, groupID) values (3,2,3);
insert into userSecurity (userID, lvlID, groupID) values (4,3,1);
insert into userSecurity (userID, lvlID, groupID) values (1,3,2);

-- Consultas
-- Describir tabal userSecurity
DESC userSecurity;

-- Seleccionar id y nombre de usuario de la tabla users
select id, username from users;

-- Seleccionar todo de la tabla accessLvl y ordenar registros por id
select * from accessLvl ORDER BY id;

-- Seleccionar todo de la tabla securityGroups y ordenar registros por id
select * from securityGroups ORDER BY id;

-- Seleccionar todo de la tabla userSecurity
select * from userSecurity;

-- Seleccionar, sin que se repitan, el id y nombre de usuario de la tabla userSecurity y hacer un inner join en los campos id de las tablas userSecurity y users
select distinct u.id, u.username FROM userSecurity us INNER JOIN users u ON u.id=us.userID order by id;

-- Seleccionar de la tabla userSecurity: id y username de usuario; id y nombre de nivel de acceso; id, nombre y descripcion de grupo de seguridad. Realiza un inner join con el id de los usuarios, de los niveles de acceso y de los grupos de seguridad. Ordena por grupo de seguridad.
select u.id, u.username, a.id as lvl_id, a.lvl, s.id as group_id, s.group_name, s.group_description FROM userSecurity us INNER JOIN users u ON u.id=us.userID INNER JOIN accessLvl a ON a.id=us.lvlID INNER JOIN securityGroups s on s.id=us.groupId ORDER BY s.id;

-- Seleccionar de la tabla userSecurity: id y username de usuario; nombre de nivel de acceso; nombre de grupo de seguridad. Realiza un inner join con el id de los usuarios, de los niveles de acceso y de los grupos de seguridad. Ordena por id de usuario.
select u.id AS Id_User, u.username AS User_Username, a.lvl AS Access_Level, s.group_name AS Security_Group FROM userSecurity us INNER JOIN users u ON u.id=us.userID INNER JOIN accessLvl a ON a.id=us.lvlID INNER JOIN securityGroups s ON s.id=us.groupId ORDER BY u.id;
select u.id AS Id_User, u.username AS User_Username, a.lvl AS Access_Level, s.group_name AS Security_Group FROM userSecurity us INNER JOIN users u ON u.id=us.userID INNER JOIN accessLvl a ON a.id=us.lvlID INNER JOIN securityGroups s ON s.id=us.groupId WHERE u.username LIKE '%javi%';
select u.username AS User_Alias, s.group_name AS Security_Group FROM userSecurity us INNER JOIN users u ON u.id=us.userID INNER JOIN securityGroups s ON s.id=us.groupId WHERE u.username LIKE '%luis%';