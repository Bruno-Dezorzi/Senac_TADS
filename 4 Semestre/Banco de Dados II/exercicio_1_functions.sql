DROP TABLE  IF EXISTS  pagamentos;
DROP TABLE  IF EXISTS  produtos;
DROP TABLE  IF EXISTS  fornecedor;
DROP TABLE  IF EXISTS  pedidos;
DROP TABLE  IF EXISTS  clientes;




CREATE TABLE clientes (
	id_cliente serial PRIMARY KEY , 
	nome varchar(225), 
	email varchar(225), 
	telefone varchar(225)
);


CREATE  TABLE  pedidos (
	id_pedido serial PRIMARY KEY ,
	id_cliente int,
	data_pedido date,
	status varchar(225),
	FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

CREATE  TABLE  fornecedor(
	id_fornecedor serial PRIMARY KEY,
	nome varchar(225),
	contato varchar(225)
);

CREATE  TABLE  produtos(
	id_produto serial PRIMARY KEY,
	nome varchar(225),
	preco numeric,
	id_fornecedor int,
	FOREIGN KEY (id_fornecedor) REFERENCES fornecedor(id_fornecedor)
);

CREATE  TABLE  pagamentos(
	id_pagamento serial PRIMARY KEY,
	id_pedido int,
	valor_pago NUMERIC,
	metodo char(1),
	data_pagamento date,
	FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido)
);

INSERT INTO clientes(
	nome , 
	email , 
	telefone 
)
VALUES
('Clemente','Clemente@brasil.com','45999999999' ),
('Rodrigo','Rodrigo@brasil.com','45754621345' ),
('Cleonice','Cleonice@brasil.com','4546851324' ),
('Percival','Percival@brasil.com','4564572130' ),
('Antonio','Antonio@brasil.com','4574312549' );


INSERT INTO pedidos(
	id_cliente ,
	data_pedido ,
	status 
)
VALUES
(1,'2025-05-02','indo' ),
(2,'2025-06-09','voltando' ),
(3,'2025-07-06','pensando em ir' ),
(4,'2025-04-03','esperando dar vontade' ),
(5,'2025-03-01','descansado' );


INSERT INTO fornecedor(
	nome ,
	contato 
)
VALUES
('Nadiar','4579456123' ),
('Severo','4546789421' ),
('Bilu','45130468795' ),
('Clair','45467898132' ),
('Chris','4546878421' );


INSERT INTO produtos(
	nome,
	preco,
	id_fornecedor 
)
VALUES
('Borracha',3.00,1),
('Lápis',1.00,2),
('Caderno',15.00,3),
('Régua',5.00,4),
('Apontador',4.00,5);

	
	
INSERT INTO pagamentos(
	id_pedido ,
	valor_pago ,
	metodo ,
	data_pagamento 
)
VALUES
(1,20.00,'C','2025-05-03'),
(1,20.00,'C','2025-06-20'),
(1,20.00,'C','2025-07-22'),
(1,20.00,'C','2025-05-08'),
(1,20.00,'C','2025-03-08');



CREATE OR REPLACE 
FUNCTION insert_cliente(nome varchar(225),email varchar(225),telefone varchar(225)) 
RETURNS integer
AS 
$$ 
	DECLARE NOVO_ID INT;
	BEGIN
		INSERT INTO clientes(
			nome , 
			email , 
			telefone)
			values
			(nome,email,telefone)
		RETURNING id_cliente into NOVO_ID;
		RETURN NOVO_ID; 
		
	END;
$$

	LANGUAGE PLPGSQL 
;

SELECT * FROM clientes;

SELECT insert_cliente('Claudio','Claudio@brasil.com','45987132465')

DROP FUNCTION update_preco_produto

CREATE OR REPLACE FUNCTION update_preco_produto(id_produto_modificar INT, novo_preco NUMERIC)
RETURNS VOID 
AS
$$
BEGIN
    -- Atualiza o preço do produto
    UPDATE produtos
    SET preco = novo_preco 
    WHERE id_produto = id_produto_modificar;
END;
$$
LANGUAGE PLPGSQL;


SELECT update_preco_produto(1, 300.0);


SELECT * FROM produtos