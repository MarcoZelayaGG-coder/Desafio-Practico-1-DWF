INSERT INTO Profesor (nombre) VALUES ('Marco Aurelio'), ('Armando guerra'), ('Gustabo'), ('Brahim'), ('Robertp');
INSERT INTO Materia (nombre, id_profesor) VALUES ('Frameworks', 1), ('Bases de Datos', 2), ('Programacion', 3), ('Redes', 4), ('Seguridad', 5);
INSERT INTO Alumno (nombre, apellido) VALUES ('Marcelo', 'Augusto'), ('Rafael', 'Najarro'), ('Christian', 'Hernandez'), ('Eduardo', 'Rivas'), ('Miguel', 'Pineda');
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (1,1), (2,2), (3,3), (4,4), (5,5);