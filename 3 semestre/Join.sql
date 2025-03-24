-- create a table
CREATE TABLE ator (
  idator serial PRIMARY KEY,
  nome TEXT NOT NULL
);
CREATE TABLE filme (
  idfilme serial PRIMARY KEY,
  nome TEXT NOT NULL
);
CREATE TABLE filme_ator (
  idfilmeator serial PRIMARY KEY,
  idfilme INTEGER,
  idator INTEGER ,
    constraint fk_filme_ foreign key (idfilme) references filme(idfilme),
    constraint fk_ator_ foreign key (idator) references ator(idator)  
);

CREATE TABLE ator_cache (
  idatorcache serial PRIMARY KEY,
  idator INTEGER ,
  cache INTEGER ,
    constraint fk_ator_ foreign key (idator) references ator(idator)  
);

CREATE TABLE ator2 (
  idator serial PRIMARY KEY,
  nome TEXT NOT NULL
);


--delete from filme_ator
--delete from filme
--delete from ator

INSERT INTO ator (nome) VALUES ('Jean Queuri');
INSERT INTO ator (nome) VALUES ('Jean Claudio Andaime');
INSERT INTO ator (nome) VALUES ('Analdo Strogonof');
INSERT INTO ator (nome) VALUES ('Juquinha Snaiders');
INSERT INTO filme (nome) VALUES ('O senho dos pasteis');
INSERT INTO filme (nome) VALUES ('Ary Portas e as reliquias dos chaveiros');
INSERT INTO filme (nome) VALUES ('As paredes do destino');
INSERT INTO filme (nome) VALUES ('Python: a anaconda assassina');
INSERT INTO filme (nome) VALUES ('O mundo sobrio do java');
INSERT INTO filme (nome) VALUES ('Todo mundo programando em C');
INSERT INTO filme_ator (idfilme,idator) VALUES (1,1);
INSERT INTO filme_ator (idfilme,idator) VALUES (1,2);
INSERT INTO filme_ator (idfilme,idator) VALUES (1,3);
INSERT INTO filme_ator (idfilme,idator) VALUES (2,1);
INSERT INTO filme_ator (idfilme,idator) VALUES (2,3);
INSERT INTO filme_ator (idfilme,idator) VALUES (3,3);
INSERT INTO filme_ator (idfilme,idator) VALUES (4,1);
INSERT INTO filme_ator (idfilme,idator) VALUES (4,2);
INSERT INTO filme_ator (idfilme,idator) VALUES (4,3);
INSERT INTO ator_cache (idator,cache) VALUES (1,3000);
INSERT INTO ator_cache (idator,cache) VALUES (2,8000);
INSERT INTO ator2 (nome) VALUES ('Jean Queuri');
INSERT INTO ator2 (nome) VALUES ('Leonardo da Vinti Reais');

--select *from filme_ator
--select *from filme
select * from ator;
select * from ator_cache 

SELECT * FROM ator 
LEFT JOIN ator_cache ON ator.idator = ator_cache.idator 

INSERT INTO ator_cache (idator,cache) VALUES (4,20000);

SELECT * FROM ator a 
INNER JOIN filme_ator fa ON a.idator  = fa.idator 
INNER JOIN filme f ON f.idfilme = fa.idfilme 

SELECT a.nome , c."cache"  FROM ator a 
CROSS JOIN ator_cache c 


SELECT * FROM filme f 
INNER JOIN filme_ator fa ON FA.idfilme = F.idfilme 
INNER JOIN ator a ON A.idator = FA.idator 

SELECT * FROM ator 
LEFT JOIN ator_cache ON ator.idator = ator_cache.idator 

SELECT * FROM filme f 
LEFT JOIN filme_ator fa ON FA.idfilme = F.idfilme 
LEFT JOIN ator a ON A.idator = FA.idator 

SELECT * FROM ator a UNION ALL SELECT * FROM filme f 
