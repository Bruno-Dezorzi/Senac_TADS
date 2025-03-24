DROP TABLE IF EXISTS emprestimo_livro;
DROP TABLE IF EXISTS emprestimo;
DROP TABLE IF EXISTS livro;
DROP TABLE IF EXISTS sessao;
DROP TABLE IF EXISTS usuario_endereco;
DROP TABLE IF EXISTS ilha;
DROP TABLE IF EXISTS endereco;
DROP TABLE IF EXISTS telefone;
DROP TABLE IF EXISTS usuario;


CREATE TABLE usuario (
    id_usuario SERIAL  PRIMARY KEY,
    num_matricula INT ,
    ds_nome VARCHAR(100),
    ds_email VARCHAR(255)
);


CREATE TABLE telefone (
    id_telefone SERIAL  PRIMARY KEY,
    num_ddd INT ,
    num_telefone INT ,
    id_usuario INT ,
    FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario)
);


CREATE TABLE endereco (
    id_endereco SERIAL  PRIMARY KEY,
    ds_rua VARCHAR(50),
    num_endereco INT,
    ds_bairro VARCHAR(50),
    ds_complemento VARCHAR(50)
);


CREATE TABLE ilha (
    id_ilha SERIAL  PRIMARY KEY,
    ds_descricao VARCHAR(100),
    num_latitude INT,
    num_longitude INT
);


CREATE TABLE usuario_endereco (
    id_usuario_endereco SERIAL  PRIMARY KEY,
    id_usuario INT ,
    id_endereco INT,
    id_ilha INT,
    FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
    FOREIGN KEY (id_endereco) REFERENCES endereco (id_endereco),
    FOREIGN KEY (id_ilha) REFERENCES ilha (id_ilha)
);


CREATE TABLE sessao (
    id_sessao SERIAL  PRIMARY KEY,
    cod_sessao INT ,
    ds_descricao VARCHAR(100),
    ds_localizacao VARCHAR(100)
);


CREATE TABLE livro (
    id_livro SERIAL  PRIMARY KEY,
    cod_livro INT ,
    ds_titulo VARCHAR(100),
    ds_autor VARCHAR(100),
    id_sessao INT ,
    FOREIGN KEY (id_sessao) REFERENCES sessao (id_sessao)
);


CREATE TABLE emprestimo (
    id_emprestimo SERIAL  PRIMARY KEY,
    num_emprestimo INT ,
    dt_emprestimo TIMESTAMP,
    dt_devolucao TIMESTAMP,
    id_usuario INT ,
    FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario)
);


CREATE TABLE emprestimo_livro (
    id_emprestimolivro SERIAL  PRIMARY KEY,
    id_emprestimo INT ,
    id_livro INT ,
    FOREIGN KEY (id_emprestimo) REFERENCES emprestimo (id_emprestimo),
    FOREIGN KEY (id_livro) REFERENCES livro (id_livro)
);




INSERT INTO usuario (num_matricula, ds_nome, ds_email)
VALUES 
(1001, 'Jack Sparrow', 'jack.sparrow@blackpearl.com'),
(1002, 'Hector Barbossa', 'hector.barbossa@blackpearl.com'),
(1003, 'Davy Jones', 'davy.jones@flyingdutchman.com'),
(1004, 'Elizabeth Swann', 'elizabeth.swann@portroyal.com'),
(1005, 'Will Turner', 'will.turner@portroyal.com'),
(1006, 'Barba Negra', 'edward.teach@queenannesrevenge.com'),
(1007, 'Anne Bonny', 'anne.bonny@highseas.com'),
(1008, 'Calico Jack', 'calico.jack@highseas.com'),
(1009, 'Capitão Gancho', 'james.hook@neverland.com'),
(1010, 'Long John Silver', 'long.john@treasureisland.com');


INSERT INTO telefone (num_ddd, num_telefone, id_usuario)
VALUES
(21, 987654321, 1),
(21, 987654322, 2),
(11, 982112233, 3),
(31, 988776655, 4),
(31, 981234567, 5),
(21, 987655432, 6),
(21, 987655433, 7),
(22, 987656789, 8),
(31, 987657890, 9),
(32, 987659876, 10);


INSERT INTO endereco (ds_rua, num_endereco, ds_bairro, ds_complemento)
VALUES
('Rua dos Piratas', 42, 'Port Royal', 'Black Pearl Atracado'),
('Rua do Marujo', 7, 'Ilha da Caveira', NULL),
('Caverna dos Mares', 99, 'Ilha do Medo', 'Perto da Rocha Negra'),
('Beira do Abismo', 13, 'Porto das Estrelas', NULL),
('Rua do Tesouro', 77, 'Ilha Perdida', 'Próximo ao Mastro Quebrado');


INSERT INTO ilha (ds_descricao, num_latitude, num_longitude)
VALUES
('Ilha do Tesouro', -15, 45),
('Triângulo das Bermudas', -30, -75),
('Ilha do Esqueleto', -10, 55),
('Ilha dos Relógios', -20, 65);


INSERT INTO usuario_endereco (id_usuario, id_endereco, id_ilha)
VALUES
(1, 1, NULL),
(3, NULL, 2),
(4, 2, NULL),
(6, 3, 1),
(7, 4, 2),
(8, 5, NULL),
(9, 3, NULL),
(10, NULL, 2);


INSERT INTO sessao (cod_sessao, ds_descricao, ds_localizacao)
VALUES
(101, 'Náutica', 'Estante A - Prateleira 1'),
(102, 'Cartografia', 'Estante B - Prateleira 3'),
(103, 'História de Piratas', 'Estante C - Prateleira 2'),
(104, 'Mistérios do Mar', 'Estante D - Prateleira 4'),
(105, 'Mitologia Pirata', 'Estante E - Prateleira 5');


INSERT INTO livro (cod_livro, ds_titulo, ds_autor, id_sessao)
VALUES
(1001, 'Como Navegar Sem Rumo', 'Capitão Sem Norte', 1),
(1002, 'Mapas para Grandes Tesouros', 'Barba Negra', 2),
(1003, 'Lendas dos Sete Mares', 'Anne Bonny', 3),
(1004, 'História da Pirataria', 'William Kidd', 3),
(1005, 'O Diário do Capitão', 'Henry Morgan', 3),
(1006, 'A Bússola Que Aponta Para O Lugar Desejado', 'MC Sparrow', 2),
(1007, 'Cantos das Sereias', 'Marinheiro Anônimo', 4),
(1008, 'Relíquias Submersas', 'Jacques Tempest', 4),
(1009, 'Os Deuses do Mar', 'Poseidon Jones', 5),
(1010, 'A Lenda do Kraken', 'Nemo', 5),
(1011, 'Os Mistérios do Triângulo das Bermudas', 'Professor Nautilus', 4);


INSERT INTO emprestimo (num_emprestimo, dt_emprestimo, dt_devolucao, id_usuario)
VALUES
(1, now(), NULL, 1),
(2, now(), '2024-11-20 10:00:00', 2),
(3, now(), NULL, 4),
(4, '2024-11-14 15:00:00', NULL, 6),
(5, '2024-11-13 12:30:00', '2024-11-15 17:00:00', 7),
(6, '2024-11-12 09:00:00', NULL, 8),
(7, '2024-11-10 14:45:00', '2024-11-11 11:00:00', 9),
(8, '2024-11-09 16:30:00', NULL, 10);


INSERT INTO emprestimo_livro (id_emprestimo, id_livro)
VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 4),
(3, 5),
(4, 6),
(4, 7),
(5, 8),
(6, 9),
(7, 10),
(8, 11);


SELECT 
    u.ds_nome AS nome_usuario,
    u.num_matricula AS codigo_usuario,
    l.ds_titulo AS titulo_livro,
    l.cod_livro AS codigo_livro,
    s.ds_descricao AS descricao_sessao,
    s.cod_sessao AS codigo_sessao,
    e.dt_emprestimo AS data_emprestimo,
    e.dt_devolucao AS data_devolucao
FROM 
    emprestimo e
LEFT JOIN usuario u ON e.id_usuario = u.id_usuario
LEFT JOIN emprestimo_livro el ON e.id_emprestimo = el.id_emprestimo
LEFT JOIN livro l ON el.id_livro = l.id_livro
LEFT JOIN sessao s ON l.id_sessao = s.id_sessao
ORDER BY 
 e.dt_emprestimo DESC;

