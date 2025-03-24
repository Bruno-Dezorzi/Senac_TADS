DROP TABLE IF EXISTS pedidoproduto;
DROP TABLE IF EXISTS pedido;
DROP TABLE IF EXISTS tabelaprecoproduto;
DROP TABLE IF EXISTS endereco;
DROP TABLE IF EXISTS cidade;
DROP TABLE IF EXISTS estado;
DROP TABLE IF EXISTS telefone;
DROP TABLE IF EXISTS tabelapreco;
DROP TABLE IF EXISTS parceiro;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS produto;
DROP TABLE IF EXISTS condicaopagamento;
DROP TABLE IF EXISTS pais;

CREATE TABLE pais (
	idpais serial PRIMARY KEY,
	nome varchar(100),
	sigla varchar(10)
);


CREATE TABLE condicaopagamento(
	idcondicaopagamento serial PRIMARY KEY,
	descricao varchar(255),
	codigo int,
	observacao varchar(255) 
);

CREATE TABLE produto (
	idproduto serial PRIMARY KEY,
	codigo int,
	descricao varchar(255),
	observacao varchar(255),
	peso float
);

CREATE TABLE usuario(
	idusuario serial PRIMARY KEY,
	nome varchar(255),
	email varchar(255),
	observacao varchar(255),
	idnativo int
);

CREATE TABLE parceiro(
	idparceiro serial PRIMARY KEY ,
	documento int,
	nome varchar(255),
	nomefantasia varchar(255),
	observacao varchar(255),
	idnativo int
);

CREATE TABLE tabelapreco(
	idtabelapreco serial PRIMARY KEY,
	descricao varchar(255),
	descontomaximo float,
	codigo int,
	iniciovigencia date,
	fimvigencia date,
	idnativo int
);

CREATE TABLE telefone (
	idtelefone serial PRIMARY KEY,
	numero int,
	idusuario int,
	idparceiro int,
	idnativo int,
	foreign KEY (idusuario) REFERENCES usuario(idusuario),
	foreign KEY (idparceiro) REFERENCES parceiro(idparceiro)
);

CREATE TABLE estado(
	idestado serial PRIMARY KEY,
	nome varchar(255),
	silga varchar(255),
	idpais int,
	FOREIGN KEY (idpais) REFERENCES pais(idpais)
);

CREATE TABLE cidade(
	idcidade serial PRIMARY KEY,
	nome varchar(255),
	inscricaoestadual int,
	idestado int,
	FOREIGN KEY (idestado) REFERENCES estado(idestado)
);

CREATE TABLE endereco(
	idendereco serial PRIMARY KEY,
	logradouro varchar(255),
	numero int,
	cep int,
	complemento varchar(255),
	idnativo int,
	idparceiro int,
	idusuario int,
	idcidade int,
	FOREIGN KEY (idparceiro) REFERENCES parceiro(idparceiro),
	FOREIGN KEY (idusuario) REFERENCES usuario(idusuario),
	FOREIGN KEY (idcidade) REFERENCES cidade(idcidade)
	
);

CREATE TABLE tabelaprecoproduto (
	idtabelaprecoproduto serial PRIMARY KEY ,
	idtabelapreco int,
	idproduto int,
	preco float,
	FOREIGN KEY (idproduto) REFERENCES produto(idproduto),
	FOREIGN KEY (idtabelapreco) REFERENCES tabelapreco(idtabelapreco)
);

CREATE TABLE pedido(
	idpedido serial PRIMARY KEY,
	numero int,
	valortotal float,
	quantidadeprodutos float,
	observacao varchar(255),
	idtabelapreco int,
	idcondicaopagamento int ,
	idparceiro int,
	idusuario int,
	data_pedido timestamp,
	FOREIGN KEY (idtabelapreco) REFERENCES tabelapreco(idtabelapreco),
	FOREIGN KEY (idcondicaopagamento) REFERENCES condicaopagamento(idcondicaopagamento),
	FOREIGN KEY (idparceiro) REFERENCES parceiro(idparceiro),
	FOREIGN KEY (idusuario) REFERENCES usuario(idusuario)
);

CREATE TABLE pedidoproduto(
	idpedidoproduto serial PRIMARY KEY,
	idpedido int,
	idproduto int,
	valor float,
	quantidade float,
	FOREIGN KEY (idpedido) REFERENCES pedido(idpedido),
	FOREIGN KEY (idproduto) REFERENCES produto(idproduto)
);

INSERT INTO pais (nome, sigla) VALUES ('Brasil', 'BR');
INSERT INTO pais (nome, sigla) VALUES ('Estados Unidos', 'US');
INSERT INTO pais (nome, sigla) VALUES ('Argentina', 'AR');
INSERT INTO pais (nome, sigla) VALUES ('Portugal', 'PT');
INSERT INTO pais (nome, sigla) VALUES ('Japão', 'JP');

INSERT INTO condicaopagamento (descricao, codigo, observacao) VALUES ('À vista', 1, 'Pagamento em uma única parcela');
INSERT INTO condicaopagamento (descricao, codigo, observacao) VALUES ('Cartão de Crédito', 2, 'Pagamento em até 3x sem juros');
INSERT INTO condicaopagamento (descricao, codigo, observacao) VALUES ('Boleto', 3, 'Pagamento via boleto bancário');
INSERT INTO condicaopagamento (descricao, codigo, observacao) VALUES ('Transferência Bancária', 4, 'Pagamento direto em conta');
INSERT INTO condicaopagamento (descricao, codigo, observacao) VALUES ('Pix', 5, 'Pagamento via Pix');

INSERT INTO produto (codigo, descricao, observacao, peso) VALUES (101, 'Produto A', 'Produto de teste A', 1.5);
INSERT INTO produto (codigo, descricao, observacao, peso) VALUES (102, 'Produto B', 'Produto de teste B', 2.0);
INSERT INTO produto (codigo, descricao, observacao, peso) VALUES (103, 'Produto C', 'Produto de teste C', 0.5);
INSERT INTO produto (codigo, descricao, observacao, peso) VALUES (104, 'Produto D', 'Produto de teste D', 3.0);
INSERT INTO produto (codigo, descricao, observacao, peso) VALUES (105, 'Produto E', 'Produto de teste E', 1.2);

INSERT INTO usuario (nome, email, observacao, idnativo) VALUES ('Alice', 'alice@example.com', 'Usuário ativo', '1');
INSERT INTO usuario (nome, email, observacao, idnativo) VALUES ('Bob', 'bob@example.com', 'Usuário ativo', '1');
INSERT INTO usuario (nome, email, observacao, idnativo) VALUES ('Carlos', 'carlos@example.com', 'Usuário inativo', '0');
INSERT INTO usuario (nome, email, observacao, idnativo) VALUES ('Diana', 'diana@example.com', 'Usuário ativo', '1');
INSERT INTO usuario (nome, email, observacao, idnativo) VALUES ('Eve', 'eve@example.com', 'Usuário ativo', '1');

INSERT INTO parceiro (documento, nome, nomefantasia, observacao, idnativo) VALUES (1234567, 'Empresa A', 'Fantasia A', 'Parceiro ativo', '1');
INSERT INTO parceiro (documento, nome, nomefantasia, observacao, idnativo) VALUES (9876543, 'Empresa B', 'Fantasia B', 'Parceiro ativo', '1');
INSERT INTO parceiro (documento, nome, nomefantasia, observacao, idnativo) VALUES (1122334, 'Empresa C', 'Fantasia C', 'Parceiro inativo','0');
INSERT INTO parceiro (documento, nome, nomefantasia, observacao, idnativo) VALUES (2233445, 'Empresa D', 'Fantasia D', 'Parceiro ativo', '1');
INSERT INTO parceiro (documento, nome, nomefantasia, observacao, idnativo) VALUES (3344556, 'Empresa E', 'Fantasia E', 'Parceiro ativo', '1');

INSERT INTO tabelapreco (descricao, descontomaximo, codigo, iniciovigencia, fimvigencia, idnativo) VALUES ('Tabela A', 10.0, 1001, '2024-01-01', '2024-12-31', '1');
INSERT INTO tabelapreco (descricao, descontomaximo, codigo, iniciovigencia, fimvigencia, idnativo) VALUES ('Tabela B', 15.0, 1002, '2024-01-01', '2024-06-30', '1');
INSERT INTO tabelapreco (descricao, descontomaximo, codigo, iniciovigencia, fimvigencia, idnativo) VALUES ('Tabela C', 5.0, 1003, '2024-07-01', '2024-12-31', '1');
INSERT INTO tabelapreco (descricao, descontomaximo, codigo, iniciovigencia, fimvigencia, idnativo) VALUES ('Tabela D', 12.5, 1004, '2024-01-01', '2024-12-31', '1');
INSERT INTO tabelapreco (descricao, descontomaximo, codigo, iniciovigencia, fimvigencia, idnativo) VALUES ('Tabela E', 20.0, 1005, '2024-01-01', '2024-12-31', '1');

INSERT INTO telefone (numero, idusuario, idparceiro, idnativo) VALUES (11987, 1, NULL, '1');
INSERT INTO telefone (numero, idusuario, idparceiro, idnativo) VALUES (21987, 2, NULL, '1');
INSERT INTO telefone (numero, idusuario, idparceiro, idnativo) VALUES (31987, NULL, 3, '0');
INSERT INTO telefone (numero, idusuario, idparceiro, idnativo) VALUES (41987, 4, NULL, '1');
INSERT INTO telefone (numero, idusuario, idparceiro, idnativo) VALUES (51987, NULL, 5, '1');

INSERT INTO estado (nome, silga, idpais) VALUES ('São Paulo', 'SP', 1);
INSERT INTO estado (nome, silga, idpais) VALUES ('Rio de Janeiro', 'RJ', 1);
INSERT INTO estado (nome, silga, idpais) VALUES ('California', 'CA', 2);
INSERT INTO estado (nome, silga, idpais) VALUES ('Buenos Aires', 'BA', 3);
INSERT INTO estado (nome, silga, idpais) VALUES ('Lisboa', 'LX', 4);

INSERT INTO cidade (nome, inscricaoestadual, idestado) VALUES ('São Paulo', 12345, 1);
INSERT INTO cidade (nome, inscricaoestadual, idestado) VALUES ('Rio de Janeiro', 23456, 2);
INSERT INTO cidade (nome, inscricaoestadual, idestado) VALUES ('Los Angeles', 34567, 3);
INSERT INTO cidade (nome, inscricaoestadual, idestado) VALUES ('Buenos Aires', 45678, 4);
INSERT INTO cidade (nome, inscricaoestadual, idestado) VALUES ('Lisboa', 56789, 5);

INSERT INTO endereco (logradouro, numero, cep, complemento, idnativo, idparceiro, idusuario, idcidade) VALUES ('Rua A', 100, 12345678, 'Apto 1', 1, NULL, 1, 1);
INSERT INTO endereco (logradouro, numero, cep, complemento, idnativo, idparceiro, idusuario, idcidade) VALUES ('Rua B', 200, 87654321, 'Casa', 1, NULL, 2, 2);
INSERT INTO endereco (logradouro, numero, cep, complemento, idnativo, idparceiro, idusuario, idcidade) VALUES ('Rua C', 300, 12348765, 'Apto 3', 0, 3, NULL, 3);
INSERT INTO endereco (logradouro, numero, cep, complemento, idnativo, idparceiro, idusuario, idcidade) VALUES ('Rua D', 400, 56781234, 'Comercial', 1, NULL, 4, 4);
INSERT INTO endereco (logradouro, numero, cep, complemento, idnativo, idparceiro, idusuario, idcidade) VALUES ('Rua E', 500, 87651234, 'Loja', 1, 5, NULL, 5);

INSERT INTO tabelaprecoproduto (idtabelapreco, idproduto, preco) VALUES (1, 1, 50.0);
INSERT INTO tabelaprecoproduto (idtabelapreco, idproduto, preco) VALUES (2, 2, 75.0);
INSERT INTO tabelaprecoproduto (idtabelapreco, idproduto, preco) VALUES (3, 3, 100.0);
INSERT INTO tabelaprecoproduto (idtabelapreco, idproduto, preco) VALUES (4, 4, 125.0);
INSERT INTO tabelaprecoproduto (idtabelapreco, idproduto, preco) VALUES (5, 5, 150.0);

INSERT INTO pedido (numero, valortotal, quantidadeprodutos, observacao, idtabelapreco, idcondicaopagamento, idparceiro, idusuario, data_pedido) VALUES (101, 100.0, 2, 'Pedido A', 1, 1, 1, 1, '2024-10-01');
INSERT INTO pedido (numero, valortotal, quantidadeprodutos, observacao, idtabelapreco, idcondicaopagamento, idparceiro, idusuario, data_pedido) VALUES (102, 150.0, 3, 'Pedido B', 2, 2, 2, 2, '2024-10-02');
INSERT INTO pedido (numero, valortotal, quantidadeprodutos, observacao, idtabelapreco, idcondicaopagamento, idparceiro, idusuario, data_pedido) VALUES (103, 200.0, 4, 'Pedido C', 3, 3, 3, 3, '2024-10-03');
INSERT INTO pedido (numero, valortotal, quantidadeprodutos, observacao, idtabelapreco, idcondicaopagamento, idparceiro, idusuario, data_pedido) VALUES (104, 250.0, 5, 'Pedido D', 4, 4, 4, 4, '2024-10-04');
INSERT INTO pedido (numero, valortotal, quantidadeprodutos, observacao, idtabelapreco, idcondicaopagamento, idparceiro, idusuario, data_pedido) VALUES (105, 300.0, 6, 'Pedido E', 5, 5, 5, 5, '2024-10-05');

INSERT INTO pedidoproduto (idpedido, idproduto, quantidade) VALUES (1, 1, 2);
INSERT INTO pedidoproduto (idpedido, idproduto, quantidade) VALUES (2, 2, 3);
INSERT INTO pedidoproduto (idpedido, idproduto, quantidade) VALUES (3, 3, 4);
INSERT INTO pedidoproduto (idpedido, idproduto, quantidade) VALUES (4, 4, 5);
INSERT INTO pedidoproduto (idpedido, idproduto, quantidade) VALUES (5, 5, 6);



