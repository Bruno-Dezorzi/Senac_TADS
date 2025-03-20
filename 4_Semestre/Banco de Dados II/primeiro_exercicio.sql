DROP TABLE IF EXISTS pessoa;

CREATE TABLE pessoa(
	id serial,
	nome varchar(255),
	idade int,
	data_nascimento timestamp 
);

ALTER TABLE pessoa ADD cnpj varchar(15);

ALTER TABLE pessoa DROP cnpj;

INSERT INTO pessoa (
	nome,
	idade,
	data_nascimento
)
VALUES
('SERJÃO BERRANTEIRO', 40, '1991-05-15'),
('MARIA BONITA', 28, '1996-08-22'),
('JOSÉ DA MARIA', 34, '1989-11-10'),
('ANA JULIANINHA', 26, '1997-02-03'),
('PEDRO ALVES CABRAL', 45, '1978-12-30');

SELECT
*
FROM pessoa
ORDER BY idade DESC;


DELETE FROM pessoa WHERE idade = (SELECT max(idade) FROM pessoa) ;


UPDATE pessoa
SET nome = 'Juquinha Irineu Percival'
WHERE id = 2;

SELECT 
avg(idade),
min(idade),
max(idade)
FROM pessoa;