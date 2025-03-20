-- 1

DROP TABLE  IF EXISTS  pagamentos;
DROP TABLE  IF EXISTS  pedidos;
DROP TABLE  IF EXISTS  produtos;
DROP TABLE  IF EXISTS  fornecedor;
DROP TABLE  IF EXISTS  clientes;




CREATE TABLE clientes (
	id_cliente serial PRIMARY KEY , 
	nome varchar(225), 
	email varchar(225), 
	telefone varchar(225)
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



CREATE  TABLE  pedidos (
	id_pedido serial PRIMARY KEY ,
	id_cliente int,
	id_produto int,
	data_pedido date,
	status varchar(225),
	FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
	FOREIGN KEY (id_produto) REFERENCES produtos(id_produto)
);




CREATE  TABLE  pagamentos(
	id_pagamento serial PRIMARY KEY,
	id_pedido int,
	valor_pago NUMERIC,
	metodo char(1),
	data_pagamento date,
	FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido)
);


--2

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


INSERT INTO pedidos(
	id_cliente ,
	id_produto,
	data_pedido ,
	status 
)
VALUES
(1,5,'2025-05-02','indo' ),
(2,4,'2025-06-09','voltando' ),
(3,3,'2025-07-06','pensando em ir' ),
(4,2,'2025-04-03','esperando dar vontade' ),
(5,1,'2025-03-01','descansado'),
(5,1,'2025-05-02','indo'),
(4,2,'2025-06-09','voltando' ),
(3,3,'2025-07-06','pensando em ir' ),
(2,4,'2025-04-03','esperando dar vontade' ),
(1,5,'2025-03-01','descansado' );

	
	
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


--3

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

--4

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


SELECT * FROM produtos;

SELECT * FROM pedidos;

--5

DROP FUNCTION buscar_pedidos_cliente

CREATE OR REPLACE FUNCTION buscar_pedidos_cliente(id_cliente_analise int)
RETURNS TABLE (id_pedido int, id_cliente int, data_pedido date, status varchar(225)) 
AS
$$
BEGIN
	RETURN QUERY 
	SELECT pedidos.id_pedido, pedidos.id_cliente, pedidos.data_pedido, pedidos.status 
	FROM pedidos 
	WHERE pedidos.id_cliente = id_cliente_analise;
END;
$$
LANGUAGE plpgsql;


SELECT * FROM buscar_pedidos_cliente(2);

--6

DROP FUNCTION calcular_total_pedido(integer)

CREATE OR REPLACE FUNCTION calcular_total_pedido(id_pedido_ int)
RETURNS TABLE (soma numeric)
AS 
$$
	
	begin
		return query
		select
			sum(produtos.preco) as soma
		from pedidos
		inner join produtos on pedidos.id_produto = produtos.id_produto 
		where pedidos.id_pedido = id_pedido_;
	end ;
$$
LANGUAGE plpgsql;

SELECT calcular_total_pedido(1)

--7

DROP FUNCTION IF EXISTS remover_pedido(integer);
DROP FUNCTION IF EXISTS null_produto_pedido(integer);


CREATE OR REPLACE FUNCTION null_produto_pedido(id_pedido_ int)
RETURNS void 
AS
$$
	begin
		update pedidos
		set id_produto = null
		where pedidos.id_pedido = id_pedido_;
	end;

$$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION remover_pedido(id_pedido_ int)
RETURNS void 
AS
$$
	begin
		perform null_produto_pedido(id_pedido_);
		delete from pedidos
		where pedidos.id_pedido = id_pedido_;
	end;
$$
LANGUAGE plpgsql;

-- SELECT * FROM pedidos

SELECT remover_pedido(1)

-- 8 

DROP FUNCTION IF EXISTS registrar_pagamento(int4,NUMERIC,bpchar(1));

CREATE OR REPLACE FUNCTION registrar_pagamento(id_pedido_ INT4, valor_pago_ NUMERIC, metodo_ BPCHAR(1),data_pagamento_ date)
RETURNS VOID
AS
$$
BEGIN
    -- Inserindo o pagamento corretamente usando os parâmetros da função
    INSERT INTO pagamentos (id_pedido, valor_pago, metodo,data_pagamento)
    VALUES (id_pedido_, valor_pago_, metodo_,data_pagamento_);

    -- Atualizando o status do pedido para "pago"
    UPDATE pedidos
    SET status = 'pago'
    WHERE id_pedido = id_pedido_;
END;
$$
LANGUAGE plpgsql;


SELECT * FROM pedidos p 

SELECT * FROM pagamentos

SELECT registrar_pagamento(1,200.00,'D',current_date::date)

-- 9 

DROP FUNCTION IF EXISTS listar_produtos_fornecedor(INT);

CREATE OR REPLACE FUNCTION listar_produtos_fornecedor(id_fornecedor_ INT)
RETURNS TABLE (nome varchar(225), preco numeric)
as
$$
	begin
	return query
		select
			produtos.nome,
			produtos.preco
		from produtos
		where produtos.id_fornecedor = id_fornecedor_;
	end;
$$
LANGUAGE plpgsql;

SELECT * FROM listar_produtos_fornecedor(3)

-- 10


DROP FUNCTION IF EXISTS calcular_receita_total();

CREATE OR REPLACE FUNCTION calcular_receita_total() 
RETURNS TABLE (soma numeric)
as
$$
	begin
	return query
		select
			sum(valor_pago) as soma
		from pagamentos;
	end;
$$
LANGUAGE plpgsql;

SELECT * FROM calcular_receita_total();