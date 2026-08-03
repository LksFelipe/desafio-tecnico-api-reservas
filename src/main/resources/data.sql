INSERT INTO salas (nome, tipo_sala) VALUES ('Sala 1', 'REUNIAOINDIVIDUAL');
INSERT INTO salas (nome, tipo_sala) VALUES ('Sala 2', 'REUNIAOINDIVIDUAL');
INSERT INTO salas (nome, tipo_sala) VALUES ('Sala 3', 'REUNIAOCOLETIVA');
INSERT INTO salas (nome, tipo_sala) VALUES ('Sala 4', 'REUNIAOCOLETIVA');
INSERT INTO salas (nome, tipo_sala) VALUES ('Sala 5', 'AUDITORIO');
INSERT INTO salas (nome, tipo_sala) VALUES ('Sala 6', 'AUDITORIO');

INSERT INTO reservas (sala_id, data, hora_inicio, hora_fim, status) VALUES (1, '2026-08-10', '09:00:00', '10:00:00', 'ATIVO');
INSERT INTO reservas (sala_id, data, hora_inicio, hora_fim, status) VALUES (2, '2026-08-10', '10:00:00', '11:00:00', 'CANCELADO');
INSERT INTO reservas (sala_id, data, hora_inicio, hora_fim, status) VALUES (3, '2026-08-10', '11:00:00', '12:00:00', 'ATIVO');
INSERT INTO reservas (sala_id, data, hora_inicio, hora_fim, status) VALUES (4, '2026-08-10', '13:00:00', '14:00:00', 'CANCELADO');
INSERT INTO reservas (sala_id, data, hora_inicio, hora_fim, status) VALUES (5, '2026-08-10', '14:00:00', '15:00:00', 'ATIVO');
INSERT INTO reservas (sala_id, data, hora_inicio, hora_fim, status) VALUES (6, '2026-08-10', '15:00:00', '16:00:00', 'ATIVO');
