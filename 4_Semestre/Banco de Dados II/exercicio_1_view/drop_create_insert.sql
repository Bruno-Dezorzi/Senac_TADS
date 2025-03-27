DROP TABLE IF EXISTS pedidoproduto;
DROP TABLE IF EXISTS pedido;
DROP TABLE IF EXISTS tabelaprecoproduto;
DROP TABLE IF EXISTS produto;
DROP TABLE IF EXISTS tabelapreco;
DROP TABLE IF EXISTS condicaopagamento;
DROP TABLE IF EXISTS telefone;
DROP TABLE IF EXISTS endereco;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS parceiro;
DROP TABLE IF EXISTS cidade;
DROP TABLE IF EXISTS estado;
DROP TABLE IF EXISTS pais;


CREATE TABLE pais (
    idpais SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sigla VARCHAR(10) NOT NULL
);

CREATE TABLE estado (
    idestado SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sigla VARCHAR(10) NOT NULL,
    idpais INTEGER NOT NULL REFERENCES pais(idpais)
);

CREATE TABLE cidade (
    idcidade SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    inscricaoestadual VARCHAR(100),
    idestado INTEGER NOT NULL REFERENCES estado(idestado)
);

CREATE TABLE parceiro (
    idparceiro SERIAL PRIMARY KEY,
    documento INTEGER NOT NULL,
    nome VARCHAR(255) NOT NULL,
    nomefantasia VARCHAR(255),
    observacao VARCHAR(255),
    idinativo BOOLEAN NOT NULL
);

CREATE TABLE usuario (
    idusuario SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    observacao VARCHAR(255),
    idinativo BOOLEAN NOT NULL
);

CREATE TABLE endereco (
    idendereco SERIAL PRIMARY KEY,
    logradouro VARCHAR(255) NOT NULL,
    numero INTEGER NOT NULL,
    cep INTEGER NOT NULL,
    complemento VARCHAR(255),
    idparceiro INTEGER REFERENCES parceiro(idparceiro),
    idusuario INTEGER REFERENCES usuario(idusuario),
    idcidade INTEGER NOT NULL REFERENCES cidade(idcidade),
    idinativo BOOLEAN NOT NULL
);

CREATE TABLE telefone (
    idtelefone SERIAL PRIMARY KEY,
    numero VARCHAR(20) NOT NULL,
    idusuario INTEGER REFERENCES usuario(idusuario),
    idparceiro INTEGER REFERENCES parceiro(idparceiro),
    idinativo BOOLEAN NOT NULL
);

CREATE TABLE condicaopagamento (
    idcondicaopagamento SERIAL PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    codigo INTEGER NOT NULL,
    observacao VARCHAR(255)
);

CREATE TABLE tabelapreco (
    idtabelapreco SERIAL PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    descontomaximo DOUBLE PRECISION NOT NULL,
    codigo INTEGER NOT NULL,
    iniciovigencia DATE NOT NULL,
    fimvigencia DATE NOT NULL,
    idinativo BOOLEAN NOT NULL
);

CREATE TABLE produto (
    idproduto SERIAL PRIMARY KEY,
    codigo INTEGER NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    observacao VARCHAR(255),
    peso DOUBLE PRECISION NOT NULL
);

CREATE TABLE tabelaprecoproduto (
    idtabelaprecoproduto SERIAL PRIMARY KEY,
    idtabelapreco INTEGER NOT NULL REFERENCES tabelapreco(idtabelapreco),
    idproduto INTEGER NOT NULL REFERENCES produto(idproduto),
    preco DOUBLE PRECISION NOT NULL
);

CREATE TABLE pedido (
    idpedido SERIAL PRIMARY KEY,
    numero INTEGER NOT NULL,
    valortotal DOUBLE PRECISION NOT NULL,
    quantidadeprodutos DOUBLE PRECISION NOT NULL,
    observacao VARCHAR(255),
    idtabelapreco INTEGER REFERENCES tabelapreco(idtabelapreco),
    idcondicaopagamento INTEGER REFERENCES condicaopagamento(idcondicaopagamento),
    idparceiro INTEGER REFERENCES parceiro(idparceiro),
    idusuario INTEGER REFERENCES usuario(idusuario),
    data TIMESTAMP NOT NULL
);

CREATE TABLE pedidoproduto (
    idpedidoproduto SERIAL PRIMARY KEY,
    idpedido INTEGER NOT NULL REFERENCES pedido(idpedido),
    idproduto INTEGER NOT NULL REFERENCES produto(idproduto),
    valor DOUBLE PRECISION NOT NULL,
    quantidade DOUBLE PRECISION NOT NULL
);


-- -------------------------------------------------------------------------------------



INSERT INTO pais (nome, sigla) VALUES ('Brasil', 'BR');


INSERT INTO estado (nome, sigla, idpais) VALUES 
('São Paulo', 'SP', 1),
('Rio de Janeiro', 'RJ', 1),
('Minas Gerais', 'MG', 1);


INSERT INTO cidade (nome, idestado) VALUES 
('São Paulo', 1),
('Campinas', 1),
('Santos', 1),
('Rio de Janeiro', 2),
('Niterói', 2),
('Belo Horizonte', 3),
('Uberlândia', 3),
('Juiz de Fora', 3),
('Contagem', 3),
('Betim', 3);


INSERT INTO condicaopagamento (descricao, codigo, observacao) VALUES 
('Pagamento à vista com 5% de desconto', 1, 'Cliente paga na hora e ganha desconto'),
('Parcelado em 3x sem juros', 2, 'Dividido em 3 meses, sem taxas'),
('Pagamento para 30 dias', 3, 'Cliente pode pagar até 30 dias após a compra');


INSERT INTO tabelapreco (descricao, descontomaximo, codigo, iniciovigencia, fimvigencia, idinativo) VALUES 
('Tabela Padrão', 10.0, 1, '2024-01-01', '2024-12-31', FALSE),
('Promoção de Inverno', 15.0, 2, '2024-06-01', '2024-08-31', FALSE),
('Clube VIP', 20.0, 3, '2024-01-01', '2024-12-31', FALSE);


INSERT INTO produto (codigo, descricao, observacao, peso) VALUES 
(101, 'Cadeira Gamer ThunderX', 'Confortável e ergonômica', 15.2),
(102, 'Mouse Logitech MX Master 3', 'Precisão e conforto para longas horas', 0.3),
(103, 'Teclado Mecânico HyperX', 'Switches silenciosos e RGB personalizável', 1.1),
(104, 'Monitor Ultrawide LG 34”', 'Perfeito para multitarefa e imersão', 8.5),
(105, 'Notebook Dell XPS 13', 'Ultra fino, leve e poderoso', 1.2),
(106, 'iPhone 15 Pro', 'O mais novo da Apple', 0.5),
(107, 'Smartwatch Garmin Fenix 7', 'Ideal para atletas e aventureiros', 0.4),
(108, 'Echo Dot 5ª Geração', 'Assistente Alexa para casa inteligente', 0.3),
(109, 'Kindle Paperwhite', 'Leitura confortável com iluminação ajustável', 0.2),
(110, 'AirPods Pro 2', 'Cancelamento de ruído ativo', 0.15),
(111, 'Tablet Samsung Galaxy Tab S9', 'Ótimo para produtividade e entretenimento', 0.6),
(112, 'Fone de Ouvido Sony WH-1000XM5', 'Áudio premium e cancelamento de ruído', 0.4),
(113, 'Mochila Antifurto Xiaomi', 'Espaçosa e segura para o dia a dia', 1.0),
(114, 'Câmera GoPro Hero 11', 'Perfeita para aventuras radicais', 0.7),
(115, 'Cadeira de Escritório Ergonômica', 'Ajustável para máximo conforto', 10.0);


INSERT INTO parceiro (documento, nome, nomefantasia, observacao, idinativo) VALUES 
(1234567, 'Maria Silva', 'Loja da Maria', 'Cliente fiel há 3 anos', FALSE),
(9876543, 'João Ferreira', 'Tech Solutions', 'Faz grandes pedidos trimestrais', FALSE),
(1122334, 'Carla Mendes', 'Livraria Cultura Moderna', NULL, FALSE),
(2233445, 'Fernando Rocha', 'Rocha Eletros', 'Prefere pagamento à vista', FALSE),
(3344556, 'Ana Souza', 'Ana Presentes', NULL, FALSE);


INSERT INTO usuario (nome, email, observacao, idinativo) VALUES 
('Gabriel Oliveira', 'gabriel.oliveira@email.com', 'Atende clientes VIP', FALSE),
('Laura Mendes', 'laura.mendes@email.com', NULL, FALSE),
('Ricardo Santos', 'ricardo.santos@email.com', 'Gerente de vendas', FALSE),
('Fernanda Costa', 'fernanda.costa@email.com', NULL, FALSE),
('Carlos Almeida', 'carlos.almeida@email.com', 'Responsável pelo estoque', FALSE);


INSERT INTO endereco (logradouro, numero, cep, complemento, idparceiro, idusuario, idcidade, idinativo) VALUES 
('Av. Paulista', 1000, 01311000, 'Sala 502', 1, NULL, 1, FALSE),
('Rua das Flores', 250, 04567890, NULL, 2, NULL, 2, FALSE),
('Av. Atlântica', 500, 22021010, 'Apto 703', 3, NULL, 4, FALSE),
('Rua da Praia', 80, 11013001, NULL, 4, NULL, 3, FALSE),
('Rua das Palmeiras', 123, 30320310, NULL, 5, NULL, 6, FALSE),
('Rua do Comércio', 45, 30110000, NULL, NULL, 1, 6, FALSE),
('Rua da Liberdade', 77, 32040000, NULL, NULL, 2, 9, FALSE),
('Rua Esperança', 99, 31555000, NULL, NULL, 3, 7, FALSE),
('Av. Central', 321, 01000000, NULL, NULL, 4, 8, FALSE),
('Rua Nova', 50, 07010100, NULL, NULL, 5, 10, FALSE);


INSERT INTO telefone (numero, idusuario, idparceiro, idinativo) VALUES 
('11987654321', NULL, 1, FALSE),
('21987651234', NULL, 2, FALSE),
('31986547890', NULL, 3, FALSE),
('41987456321', NULL, 4, FALSE),
('51986324567', NULL, 5, FALSE),
('11987659000', 1, NULL, FALSE),
('21983214567', 2, NULL, FALSE),
('31987456987', 3, NULL, FALSE),
('41982345678', 4, NULL, FALSE),
('51983214789', 5, NULL, FALSE);


INSERT INTO pedido (numero, valortotal, quantidadeprodutos, observacao, idtabelapreco, idcondicaopagamento, idparceiro, idusuario, data) VALUES 
(10001, 2500.0, 5, 'Pedido para reposição de estoque', 1, 1, 1, 1, '2024-03-01 10:30:00'),
(10002, 1800.0, 4, 'Cliente quer entrega expressa', 2, 2, 2, 2, '2024-03-02 15:45:00'),
(10003, 2200.0, 6, NULL, 3, 3, 3, 3, '2024-03-03 09:15:00'),
(10004, 3100.0, 8, 'Desconto especial aplicado', 1, 1, 4, 4, '2024-03-04 11:00:00'),
(10005, 4200.0, 10, 'Pagamento parcelado em 3x', 2, 2, 5, 5, '2024-03-05 13:30:00');

