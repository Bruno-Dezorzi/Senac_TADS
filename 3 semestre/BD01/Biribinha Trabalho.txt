
DROP TABLE IF EXISTS NotaFiscal;
DROP TABLE IF EXISTS ProdutoPedido;
DROP TABLE IF EXISTS Produto;
DROP TABLE IF EXISTS Pedido;
DROP TABLE IF EXISTS Usuario;
DROP TABLE IF EXISTS Vendedor;
DROP TABLE IF EXISTS Telefone;
DROP TABLE IF EXISTS Endereco;
DROP TABLE IF EXISTS Cliente;


CREATE TABLE Cliente (
    id_cliente SERIAL PRIMARY KEY,
    nome VARCHAR(255) ,
    cpf_cnpj VARCHAR(255) UNIQUE ,
    tipo_cliente VARCHAR(50)  CHECK (tipo_cliente IN ('Física', 'Jurídica')),
    data_nascimento DATE ,
    email VARCHAR(255) ,
    data_cadastro DATE ,
    observacao_cadastro VARCHAR(255)
);

CREATE TABLE Endereco (
    id_endereco SERIAL PRIMARY KEY,
    cep VARCHAR(20) ,
    logradouro VARCHAR(255) ,
    numero INT  CHECK (numero > 0),
    cidade VARCHAR(255) ,
    estado VARCHAR(100) ,
    pais VARCHAR(100) ,
    complemento VARCHAR(255),
    bairro VARCHAR(255),
    referencia VARCHAR(255),
    id_cliente INT ,
    CONSTRAINT id_cliente FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

CREATE TABLE Telefone (
    id_telefone SERIAL PRIMARY KEY,
    numero VARCHAR(20) ,
    id_cliente INT ,
    CONSTRAINT id_cliente_telefone FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

CREATE TABLE Vendedor (
    id_vendedor SERIAL PRIMARY KEY,
    nome VARCHAR(255) ,
    data_admissao DATE 
);

CREATE TABLE Pedido (
    id_pedido SERIAL PRIMARY KEY,
    numero_pedido INT UNIQUE ,
    data_pedido DATE ,
    forma_pagamento VARCHAR(50)  CHECK (forma_pagamento IN ('à vista', 'débito', 'crédito')),
    valor_total NUMERIC(19, 2)  CHECK (valor_total >= 0),
    valor_desconto NUMERIC(19, 2)  CHECK (valor_desconto <= 50),
    observacao VARCHAR(255) , -- Restrição para observação não nula
    prazo_entrega DATE ,
    id_cliente INT ,
    id_endereco INT ,
    id_vendedor INT ,
    CONSTRAINT id_cliente FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente),
    CONSTRAINT id_endereco FOREIGN KEY (id_endereco) REFERENCES Endereco(id_endereco),
    CONSTRAINT id_vendedor FOREIGN KEY (id_vendedor) REFERENCES Vendedor(id_vendedor)
);

CREATE TABLE Produto (
    id_produto SERIAL PRIMARY KEY,
    codigo INT UNIQUE ,
    peso NUMERIC(10, 2)  CHECK (peso > 0),
    descricao VARCHAR(255) ,
    preco_venda NUMERIC(19, 2)  CHECK (preco_venda >= 0)
);

CREATE TABLE ProdutoPedido (
    id_produto_pedido SERIAL PRIMARY KEY,
    id_pedido INT ,
    id_produto INT ,
    quantidade INT  CHECK (quantidade > 0),
    CONSTRAINT id_pedido_produto FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido),
    CONSTRAINT id_produto_pedido FOREIGN KEY (id_produto) REFERENCES Produto(id_produto)
);


CREATE TABLE NotaFiscal (
    id_nota_fiscal SERIAL PRIMARY KEY,
    numero_nota_fiscal INT UNIQUE ,
    data_emissao DATE ,
    id_pedido INT ,
    CONSTRAINT id_pedido_notafiscal FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido)
);

ALTER TABLE Vendedor RENAME TO Usuario;

ALTER TABLE Pedido alter COLUMN  observacao set NOT NULL ;

ALTER TABLE Cliente ADD COLUMN sexo char(1);

INSERT INTO Cliente (nome, cpf_cnpj, tipo_cliente, data_nascimento, email, data_cadastro, observacao_cadastro, sexo) 
VALUES 
('João Silva', '12345678900', 'Física', '1990-01-01', 'joao@silva.com', '2023-01-01', 'Cliente preferencial', 'M'),
('Maria Santos', '98765432100', 'Física', '1985-05-05', 'maria@santos.com', '2023-01-05', 'Cliente com desconto', 'F'),
('Antônio Figueira', '12345678000199', 'Jurídica', '2000-03-15', 'antonio@figueira.com', '2023-01-10', 'Cliente corporativo', 'M');

INSERT INTO Endereco (cep, logradouro, numero, cidade, estado, pais, complemento, bairro, referencia, id_cliente)
VALUES 
('12345-678', 'Rua A', 10, 'São Paulo', 'SP', 'Brasil', 'Apto 101', 'Centro', 'Perto da praça', 1),
('98765-432', 'Avenida B', 100, 'Rio de Janeiro', 'RJ', 'Brasil', NULL, 'Zona Sul', 'Próximo ao parque', 2),
('54321-098', 'Alameda C', 50, 'Curitiba', 'PR', 'Brasil', 'Bloco 2', 'Batel', 'Em frente ao shopping', 3);

INSERT INTO Telefone (numero, id_cliente)
VALUES 
('11987654321', 1),
('21987654321', 2),
('41987654321', 3);

INSERT INTO Usuario  (nome, data_admissao)
VALUES 
('Roberto Deles', '2019-01-23'),
('Morgana Feno', '2022-09-08'),
('Perilho Geles', '2024-03-01');


INSERT INTO Pedido (numero_pedido, data_pedido, forma_pagamento, valor_total, valor_desconto, observacao, prazo_entrega, id_cliente, id_endereco, id_vendedor)
VALUES 
(1, '2023-01-15', 'à vista', 500.00, 10.00, 'Entrega rápida', '2023-01-20', 1, 1, 1),
(2, '2023-02-20', 'débito', 1000.00, 20.00, 'Prazo estendido', '2023-02-25', 2, 2, 2),
(3, '2023-03-25', 'crédito', 750.00, 15.00, 'Pedido urgente', '2023-03-30', 3, 3, 3);

INSERT INTO Produto (codigo, peso, descricao, preco_venda)
VALUES 
(1001, 1.50, 'Produto A', 50.00),
(1002, 0.75, 'Produto B', 30.00),
(1003, 2.00, 'Produto C', 75.00);

INSERT INTO ProdutoPedido (id_pedido, id_produto, quantidade)
VALUES 
(1, 1, 10),
(2, 2, 5),
(3, 3, 20);

INSERT INTO NotaFiscal (numero_nota_fiscal, data_emissao, id_pedido)
VALUES 
(1, '2023-01-16', 1),
(2, '2023-02-21', 2),
(3, '2023-03-26', 3);
