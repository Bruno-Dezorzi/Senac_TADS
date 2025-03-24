-- DROP TABLE IF EXISTS ator;
CREATE TABLE ator(
	id_ator serial PRIMARY KEY,
	nome_ator varchar(80),
	sobrenome_ator varchar(80),
	idade integer
);


-- DROP TABLE IF EXISTS filme;
CREATE TABLE filme(
	id_filme serial PRIMARY KEY,
	ano_lancamento integer,
	nome_filme varchar(100),
	duracao_filme int
	
);

-- DROP TABLE IF EXISTS categoria;
CREATE TABLE categoria(
	id_categoria serial PRIMARY KEY,
	genero_categoria varchar(100),
	censura_categoria varchar(50)
);


-- DROP TABLE IF EXISTS filme_ator;
CREATE TABLE filme_ator(
	id_filme_ator serial PRIMARY KEY ,
	id_filme integer,
	id_ator integer,
	FOREIGN KEY (id_filme) REFERENCES filme(id_filme),
	FOREIGN KEY (id_ator) REFERENCES ator(id_ator)
);


-- DROP TABLE IF EXISTS filme_categoria;
CREATE TABLE filme_categoria(
	id_filme_categoria serial PRIMARY KEY ,
	id_filme integer,
	id_categoria integer,
	FOREIGN KEY (id_filme) REFERENCES filme(id_filme),
	FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);


CREATE TABLE cidade(
	id_cidade serial PRIMARY KEY,
	nm_cidade varchar(100),
	inscricao_estadual serial
);

CREATE TABLE endereco(
	id_endereco serial PRIMARY KEY,
	logradouro varchar(100),
	numero varchar(100),
	complemento varchar(100),
	cep int,
	descricao varchar(100),
	id_cidade int,
	FOREIGN KEY (id_cidade) REFERENCES cidade(id_cidade)
);


INSERT INTO cidade
(nm_cidade,inscricao_estadual)
VALUES ('Cascavel',1234568);

INSERT INTO endereco
(logradouro,
	numero ,
	complemento,
	cep ,
	descricao ,
	id_cidade)
VALUES
('R. Sucuri','526','Branco',85805437,'Grande',1),
('R. Recife','2283','Branco e Azul',85810031,'Grande',1),
('Av. Toledo','432','Marrom',85810230,'Grande',1);


-- ------------------------------------------------------------------
TRUNCATE filme_ator ;
TRUNCATE filme_categoria ;
TRUNCATE ator;
TRUNCATE filme; 
TRUNCATE categoria ;

SELECT * FROM ator;
SELECT * FROM filme;
SELECT * FROM categoria;
SELECT * FROM filme_categoria;
SELECT * FROM filme_ator;


INSERT INTO test.ator (nome_ator, sobrenome_ator, idade) VALUES
('Robert', 'Downey Jr.', 55),
('Chris', 'Evans', 40),
('Scarlett', 'Johansson', 36),
('Chris', 'Hemsworth', 38),
('Mark', 'Ruffalo', 54),
('Tom', 'Holland', 25),
('Benedict', 'Cumberbatch', 45),
('Jeremy', 'Renner', 50),
('Elizabeth', 'Olsen', 32),
('Paul', 'Rudd', 52),
('Zoe', 'Saldana', 43),
('Dave', 'Bautista', 52),
('Vin', 'Diesel', 54),
('Bradley', 'Cooper', 46),
('Tom', 'Hiddleston', 40),
('Chadwick', 'Boseman', 43),
('Josh', 'Brolin', 53),
('Samuel', 'Jackson', 72),
('Don', 'Cheadle', 56),
('Anthony', 'Mackie', 42);


INSERT INTO test.categoria (genero_categoria, censura_categoria) VALUES
('Ação', 'PG-13'),
('Aventura', 'PG-13'),
('Drama', 'R'),
('Comédia', 'PG-13'),
('Ficção Científica', 'PG-13'),
('Fantasia', 'PG'),
('Terror', 'R'),
('Suspense', 'R'),
('Romance', 'PG-13'),
('Animação', 'PG'),
('Documentário', 'G'),
('Musical', 'PG'),
('Guerra', 'R'),
('Biografia', 'PG-13'),
('Esporte', 'PG'),
('Western', 'PG-13'),
('Histórico', 'PG'),
('Crime', 'R'),
('Família', 'G'),
('Mistério', 'PG-13');

ALTER TABLE filme ADD COLUMN ano_lancamento integer;




INSERT INTO test.filme (nome_filme , ano_lancamento, duracao_filme) VALUES
('Avengers: Endgame', 2019, 181),
('Spider-Man: No Way Home', 2021, 148),
('Black Widow', 2021, 134),
('Thor: Ragnarok', 2017, 130),
('Guardians of the Galaxy', 2014, 121),
('Doctor Strange', 2016, 115),
('Ant-Man', 2015, 117),
('Captain Marvel', 2019, 123),
('Iron Man', 2008, 126),
('The Incredible Hulk', 2008, 112),
('Captain America: The First Avenger', 2011, 124),
('Iron Man 2', 2010, 124),
('Iron Man 3', 2013, 130),
('Avengers: Infinity War', 2018, 149),
('Guardians of the Galaxy Vol. 2', 2017, 136),
('Thor: The Dark World', 2013, 112),
('Avengers: Age of Ultron', 2015, 141),
('Captain America: The Winter Soldier', 2014, 136),
('Captain America: Civil War', 2016, 147),
('Spider-Man: Homecoming', 2017, 133);





INSERT INTO test.filme_ator (id_filme, id_ator) VALUES
(1, 1),  -- Avengers: Endgame com Robert Downey Jr.
(1, 2),  -- Avengers: Endgame com Chris Evans
(1, 3),  -- Avengers: Endgame com Scarlett Johansson
(1, 4),  -- Avengers: Endgame com Chris Hemsworth
(1, 5),  -- Avengers: Endgame com Mark Ruffalo
(2, 6),  -- Spider-Man: No Way Home com Tom Holland
(2, 7),  -- Spider-Man: No Way Home com Benedict Cumberbatch
(3, 3),  -- Black Widow com Scarlett Johansson
(4, 4),  -- Thor: Ragnarok com Chris Hemsworth
(5, 12), -- Guardians of the Galaxy com Vin Diesel
(5, 11), -- Guardians of the Galaxy com Zoe Saldana
(5, 13), -- Guardians of the Galaxy com Dave Bautista
(5, 14), -- Guardians of the Galaxy com Bradley Cooper
(6, 7),  -- Doctor Strange com Benedict Cumberbatch
(7, 10), -- Ant-Man com Paul Rudd
(8, 16), -- Captain Marvel com Samuel Jackson
(9, 1),  -- Iron Man com Robert Downey Jr.
(10, 5), -- The Incredible Hulk com Mark Ruffalo
(11, 2), -- Captain America: The First Avenger com Chris Evans
(12, 1); -- Iron Man 2 com Robert Downey Jr.


INSERT INTO test.filme_categoria (id_filme, id_categoria) VALUES
(1, 1),  -- Avengers: Endgame é Ação
(1, 2),  -- Avengers: Endgame é Aventura
(2, 1),  -- Spider-Man: No Way Home é Ação
(2, 2),  -- Spider-Man: No Way Home é Aventura
(3, 1),  -- Black Widow é Ação
(4, 1),  -- Thor: Ragnarok é Ação
(4, 5),  -- Thor: Ragnarok é Ficção Científica
(5, 1),  -- Guardians of the Galaxy é Ação
(5, 5),  -- Guardians of the Galaxy é Ficção Científica
(6, 1),  -- Doctor Strange é Ação
(6, 5),  -- Doctor Strange é Ficção Científica
(7, 1),  -- Ant-Man é Ação
(8, 1),  -- Captain Marvel é Ação
(8, 5),  -- Captain Marvel é Ficção Científica
(9, 1),  -- Iron Man é Ação
(9, 5),  -- Iron Man é Ficção Científica
(10, 1), -- The Incredible Hulk é Ação
(10, 5), -- The Incredible Hulk é Ficção Científica
(11, 1), -- Captain America: The First Avenger é Ação
(11, 2); -- Captain America: The First Avenger é Aventura



INSERT INTO endereco
(logradouro,
	numero ,
	complemento,
	cep ,
	descricao ,
	id_cidade)
VALUES
('R. Pernambuco','1843','Centro',85810021,'Grande',1);


SELECT * FROM endereco


DELETE FROM endereco WHERE id_endereco = 2;

TRUNCATE ator;
