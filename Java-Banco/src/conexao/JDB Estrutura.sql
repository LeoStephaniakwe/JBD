DROP DATABASE IF  EXISTS curso;
CREATE DATABASE IF NOT EXISTS curso;
USE curso;

CREATE TABLE alunos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(11),
	codigo_matricula VARCHAR(20),
	nota_1 FLOAT,
	nota_2 FLOAT,
	nota_3 FLOAT,
    frequencia TINYINT);

INSERT INTO alunos (id, nome, codigo_matricula, nota_1, nota_2, nota_3, frequencia)
VALUES('','','','','','','');