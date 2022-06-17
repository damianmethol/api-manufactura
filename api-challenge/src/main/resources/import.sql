-- Poblado de tablas
insert into users (username, pass, create_at, user_status) values ('damianMet', 'damian1234', NOW(), true);
insert into users (username, pass, create_at, user_status) values ('manuReq', 'manu1234', NOW(), false);
insert into users (username, pass, create_at, user_status) values ('javiPoz', 'javi1234', NOW(), 1);
insert into users (username, pass, create_at, user_status) values ('luisRos', 'luis1234', NOW(), 0);


insert into access_lvl (lvl) value ('Read');
insert into access_lvl (lvl) value ('Write');
insert into access_lvl (lvl) value ('Administrator');
insert into access_lvl (lvl) value ('Owner');


insert into security_groups (group_name, group_description) values ('Group A', 'Descripcion Grupo A');
insert into security_groups (group_name, group_description) values ('Group B', 'Descripcion Grupo B');
insert into security_groups (group_name, group_description) values ('Group C', 'Descripcion Grupo C');
insert into security_groups (group_name, group_description) values ('Group D', 'Descripcion Grupo D');


insert into user_security (user_id, lvl_id, group_id) values (2,4,4);
insert into user_security (user_id, lvl_id, group_id) values (2,1,4);
insert into user_security (user_id, lvl_id, group_id) values (1,1,1);
insert into user_security (user_id, lvl_id, group_id) values (3,2,3);
insert into user_security (user_id, lvl_id, group_id) values (4,3,1);
insert into user_security (user_id, lvl_id, group_id) values (1,3,2);

