use remiseria;

INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(1, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'pasajero');
INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(2, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'caja');
INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(3, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'recepcionista');
INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(4, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'admin');
INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(5, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'chofer');

INSERT INTO users (id, active, address, date_created, date_updated, email, first_name, id_rol, last_name, `_password`, phone, username) VALUES(1, 1, 'direccion de prueba', '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'maximopeoficiales@gmail.com', 'Maximo Junior', 4, 'Apaza', '$2a$10$TXWlGGGuuyYEYQO.84403eGcYvWig/sbnkKXJT6O2XpmSyP7pkcF2', '928644700', 'maximopeoficiales');
