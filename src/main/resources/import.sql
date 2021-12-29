use remiseria;

INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(1, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'pasajero');
INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(2, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'caja');
INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(3, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'recepcionista');
INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(4, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'admin');
INSERT INTO roles (id_rol, date_created, date_updated, description) VALUES(5, '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'chofer');

INSERT INTO users (id, active, address, date_created, date_updated, email, first_name, id_rol, last_name, `_password`, phone, username) VALUES(1, 1, 'direccion de prueba', '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'maximopeoficiales@gmail.com', 'Maximo Junior', 4, 'Apaza', '$2a$10$TXWlGGGuuyYEYQO.84403eGcYvWig/sbnkKXJT6O2XpmSyP7pkcF2', '928644700', 'maximopeoficiales');
INSERT INTO users (id, active, address, date_created, date_updated, email, first_name, id_rol, last_name, `_password`, phone, username) VALUES(2, 1, 'direccion de prueba2', '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'test@test.com', 'Cristian', 1, 'Quispe', '$2a$10$TXWlGGGuuyYEYQO.84403eGcYvWig/sbnkKXJT6O2XpmSyP7pkcF2', '928644777', 'cristian');
INSERT INTO users (id, active, address, date_created, date_updated, email, first_name, id_rol, last_name, `_password`, phone, username) VALUES(3, 1, 'direccion de prueba2', '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'caja@caja.com', 'Cajero', 2, 'Perez', '$2a$10$TXWlGGGuuyYEYQO.84403eGcYvWig/sbnkKXJT6O2XpmSyP7pkcF2', '928644771', 'gabriel');
INSERT INTO users (id, active, address, date_created, date_updated, email, first_name, id_rol, last_name, `_password`, phone, username) VALUES(5, 1, 'direccion de prueba5', '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'chofer@chofer.com', 'Chofer', 5, 'Gutierrez', '$2a$10$TXWlGGGuuyYEYQO.84403eGcYvWig/sbnkKXJT6O2XpmSyP7pkcF2', '928644773', 'hugo');
INSERT INTO users (id, active, address, date_created, date_updated, email, first_name, id_rol, last_name, `_password`, phone, username) VALUES(4, 1, 'direccion de prueba3', '2021-10-09 10:00:00', '2021-10-09 10:00:00', 'recepcionista@recepcionista.com', 'Recepcionista', 3, 'Fernandez', '$2a$10$TXWlGGGuuyYEYQO.84403eGcYvWig/sbnkKXJT6O2XpmSyP7pkcF2', '928644772', 'jose');

INSERT INTO `state_reservations` (`id_state_reservation`, `date_created`, `date_updated`, `description`) VALUES (1, '2021-12-17 00:00:00.000000', '2021-12-17 00:00:00.000000', 'PENDIENTE');
INSERT INTO `state_reservations` (`id_state_reservation`, `date_created`, `date_updated`, `description`) VALUES (12, '2021-12-17 00:00:00.000000', '2021-12-17 00:00:00.000000', 'ACEPTADO/EN CAMINO');
INSERT INTO `state_reservations` (`id_state_reservation`, `date_created`, `date_updated`, `description`) VALUES (13, '2021-12-17 00:00:00.000000', '2021-12-17 00:00:00.000000', 'ACEPTADO/EN ESPERA');
INSERT INTO `state_reservations` (`id_state_reservation`, `date_created`, `date_updated`, `description`) VALUES (14, '2021-12-17 00:00:00.000000', '2021-12-17 00:00:00.000000', 'EN VIAJE');
INSERT INTO `state_reservations` (`id_state_reservation`, `date_created`, `date_updated`, `description`) VALUES (15, '2021-12-17 00:00:00.000000', '2021-12-17 00:00:00.000000', 'VIAJE REALIZADO');
INSERT INTO `state_reservations` (`id_state_reservation`, `date_created`, `date_updated`, `description`) VALUES (16, '2021-12-17 00:00:00.000000', '2021-12-17 00:00:00.000000', 'CANCELADO');

