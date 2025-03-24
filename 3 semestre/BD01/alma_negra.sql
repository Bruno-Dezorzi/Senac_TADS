DROP TABLE IF EXISTS Trabalha;
DROP TABLE IF EXISTS Empregado;
DROP TABLE IF EXISTS Usuario;
DROP TABLE IF EXISTS Companhia;
DROP TABLE IF EXISTS Endereco;
DROP TABLE IF EXISTS Cidade;

CREATE TABLE Cidade (
    id_cidade SERIAL NOT NULL,
    nome_cidade VARCHAR(255),
    sigla_estado VARCHAR(2),
    PRIMARY KEY (id_cidade)
);

CREATE TABLE Endereco (
    id_endereco SERIAL NOT NULL,
    id_cidade INT NOT NULL,
    nome_rua VARCHAR(255),
    numero INT,
    logradouro VARCHAR(255),
    PRIMARY KEY (id_endereco),
    FOREIGN KEY (id_cidade) REFERENCES Cidade (id_cidade)
);

CREATE TABLE Usuario (
    id_usuario SERIAL NOT NULL,
    id_endereco INT NOT NULL,
    id_gerente INT,
    nome_usuario VARCHAR(255),
    data_cadastro DATE,
    PRIMARY KEY (id_usuario),
    FOREIGN KEY (id_endereco) REFERENCES Endereco (id_endereco),
    FOREIGN KEY (id_gerente) REFERENCES Usuario (id_usuario)
);

CREATE TABLE Companhia (
    id_companhia SERIAL NOT NULL,
    id_cidade INT NOT NULL,
    nome_companhia VARCHAR(255),
    PRIMARY KEY (id_companhia),
    FOREIGN KEY (id_cidade) REFERENCES Cidade (id_cidade)
);

CREATE TABLE Empregado (
    id_empregado SERIAL NOT NULL,
    id_usuario INT NOT NULL,
    PRIMARY KEY (id_empregado),
    FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario)
);

CREATE TABLE Trabalha (
    id_trabalha SERIAL NOT NULL,
    id_empregado INT NOT NULL,
    id_companhia INT NOT NULL,
    valor_salario NUMERIC(19, 2),
    data_admissao DATE,
    PRIMARY KEY (id_trabalha),
    FOREIGN KEY (id_empregado) REFERENCES Empregado (id_empregado),
    FOREIGN KEY (id_companhia) REFERENCES Companhia (id_companhia)
);

INSERT INTO Cidade (nome_cidade, sigla_estado) VALUES 
('Cascavel', 'PR'),
('Toledo', 'PR'),
('Não-me-toque', 'RS'),
('Frederico Westphalen', 'RP');

INSERT INTO Companhia (id_cidade, nome_companhia) VALUES
(3, 'Janela OS'),
(4, 'Pinguim OS');

INSERT INTO Endereco (id_cidade, nome_rua, numero, logradouro) VALUES
(1, 'Universitária', 300, 'Casa'),
(2, 'Brasil', 568, 'Apartamento'),
(1, 'Carlos Gomes', 654, 'Barraco'),
(1, 'Paraná', 788, 'Chalé');

INSERT INTO Usuario (id_endereco, nome_usuario, id_gerente, data_cadastro) VALUES
(1, 'Juquinha', 5, CURRENT_DATE),
(2, 'Mariazinha', 5, CURRENT_DATE),
(3, 'Renatinho', 6, CURRENT_DATE),
(4, 'Dimas', 6, CURRENT_DATE),
(3, 'Bill', 5, CURRENT_DATE),
(4, 'Torvalds', 6, CURRENT_DATE);

INSERT INTO Empregado (id_usuario) VALUES
(1),
(2),
(3),
(4),
(5),
(6);

INSERT INTO Trabalha (id_empregado, id_companhia, valor_salario, data_admissao) VALUES
(1, 1, 1000, '2023-01-01'),
(2, 1, 2000, '2023-01-01'),
(3, 2, 3000, '2023-01-01'),
(4, 2, 4000, '2023-01-01'),
(5, 1, 10000, '2023-01-01'),
(6, 2, 10000, '2023-01-01');

UPDATE Cidade SET nome_cidade = 'Velho Cascavel' WHERE nome_cidade = '%Cascavel%';

UPDATE Cidade SET nome_cidade = 'Nova Toledo' WHERE nome_cidade = '%Toledo%';

UPDATE Usuario SET nome_usuario = 'Felisberto' WHERE nome_usuario = '%Dimas%';

UPDATE Endereco SET nome_rua = 'Faculdade' WHERE nome_rua = '%Universitária%';

SELECT
    e.id_empregado
FROM Trabalha t
INNER JOIN Companhia c ON t.id_companhia = c.id_companhia
INNER JOIN Empregado e ON t.id_empregado = e.id_empregado
WHERE c.nome_companhia = 'Pinguim OS';

SELECT 
    u.id_gerente
FROM Usuario u
WHERE u.nome_usuario IN ('Juquinha', 'Mariazinha');

SELECT 
    u.nome_usuario, 
    COUNT(g.id_usuario) AS numero_empregados
FROM Usuario u
INNER JOIN Usuario g ON u.id_gerente  = g.id_gerente
WHERE u.id_usuario = g.id_gerente -- O importante é que deu certo  /-_-/
GROUP BY u.nome_usuario;
