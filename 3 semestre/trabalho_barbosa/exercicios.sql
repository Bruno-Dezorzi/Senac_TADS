-- EXERCÍCIO 1
SELECT  
	u.nome, 
	u.email, 
	u.observacao, 
	e.logradouro ,
	e.numero ,
	e.cep ,
	e.complemento ,
	t.numero 
FROM public.usuario u
LEFT JOIN endereco e ON e.idusuario = u.idusuario
LEFT JOIN telefone t ON t.idusuario = u.idusuario ;

-- EXERCÍCIO 2

SELECT  
	u.nome, 
	u.nomefantasia ,
	-- u.email, 
	u.observacao, 
	e.logradouro ,
	e.numero ,
	e.cep ,
	e.complemento ,
	t.numero ,
	c.nome ,
	e2.nome ,
	e2.silga ,
	p.nome ,
	p.sigla 
FROM public.parceiro u
LEFT JOIN endereco e ON e.idusuario = u.idparceiro 
LEFT JOIN telefone t ON t.idusuario = u.idparceiro 
LEFT JOIN cidade c ON c.idcidade  = e.idcidade 
LEFT JOIN estado e2 ON e2.idestado = c.idestado 
LEFT JOIN pais p ON p.idpais = e2.idpais ;


/*
3 – Crie uma query para trazer todas as tabelas de preço ativas, que estão vigentes e que possua algum produto 
associado a tal tabela e que este produto tenha um peso maior que X e 
que tenha sido utilizado em um pedido para o parceiro X.
*/

-- o peso vai ser > 1,64


SELECT 
	tp.idtabelapreco, 
	tp.descricao, 
	tp.descontomaximo, 
	tp.codigo, 
	tp.iniciovigencia, 
	tp.fimvigencia, 
	tp.idnativo
FROM public.tabelapreco tp
INNER JOIN tabelaprecoproduto t ON t.idtabelapreco = tp.idtabelapreco 
INNER JOIN produto p ON p.idproduto = t.idproduto 
INNER JOIN pedido p2 ON p2.idtabelapreco  = t.idtabelapreco 
INNER JOIN usuario u ON u.idusuario = p2.idusuario 
WHERE tp.idnativo = 1
AND p.peso > 1.64
AND u.nome LIKE 'Bob';


-- Exercício 4
SELECT 
pe.idpedido, 
pe.numero, 
pe.valortotal, 
pe.quantidadeprodutos,
pe.data_pedido,
pe.observacao, 
p.nome ,
p.nomefantasia ,
u.nome ,
u.email ,
t.descricao ,
c.descricao ,
p2.descricao ,
p2.codigo  ,
t2.preco,
pa.nome ,
e2.silga ,
t3.numero 
FROM public.pedido pe
LEFT JOIN parceiro p ON p.idparceiro = pe.idparceiro 
LEFT JOIN usuario u  ON u.idusuario  = pe.idusuario  
LEFT JOIN tabelapreco t ON t.idtabelapreco = pe.idtabelapreco 
LEFT JOIN condicaopagamento c ON c.idcondicaopagamento  = pe.idcondicaopagamento 
LEFT JOIN pedidoproduto p3 ON p3.idpedido = pe.idpedido 
LEFT JOIN produto p2 ON p2.idproduto = p3.idproduto 
LEFT JOIN tabelaprecoproduto t2 ON t2.idproduto = p2.idproduto 
LEFT JOIN endereco e ON e.idusuario  = u.idusuario 
LEFT JOIN cidade ci ON ci.idcidade  = e.idcidade 
LEFT JOIN estado e2 ON e2.idestado = ci.idestado 
LEFT JOIN pais pa ON pa.idpais = e2.idpais 
LEFT JOIN telefone t3 ON t3.idparceiro = p.idparceiro ;


-- EXERCÍCIO 5

DROP TABLE IF EXISTS nota_fiscal;
DROP TABLE IF EXISTS transportadora;

CREATE TABLE transportadora(
	idtransportadora serial PRIMARY KEY,
	nm_transportadora varchar(100),
	cnpj varchar(20),
	id_telefone integer,
	id_endereco integer,
	FOREIGN KEY (id_telefone) REFERENCES telefone(idtelefone),
	FOREIGN KEY (id_endereco) REFERENCES endereco(idendereco)
);


CREATE TABLE nota_fiscal(
	idnota serial PRIMARY KEY,
	num_nf integer,
	chave_acesso integer,
	data_emissao date,
	vl_total float,
	vl_icms float,
	base_calculo_icms float,
	vl_pis float,
	vl_confins float,
	id_transportadora integer,
	id_pedido integer,
	id_parceiro integer,
	id_endereco integer,
	FOREIGN KEY (id_transportadora) REFERENCES transportadora(idtransportadora),
	FOREIGN KEY (id_pedido) REFERENCES pedido(idpedido),
	FOREIGN KEY (id_parceiro) REFERENCES parceiro(idparceiro),
	FOREIGN KEY (id_endereco) REFERENCES endereco(idendereco)
	
);




INSERT INTO transportadora (nm_transportadora, cnpj, id_telefone, id_endereco) VALUES ('GUEI D++', '451561651564', 1,5);
INSERT INTO transportadora (nm_transportadora, cnpj, id_telefone, id_endereco) VALUES ('ABURAMB', '12312315454', 2,4);
INSERT INTO transportadora (nm_transportadora, cnpj, id_telefone, id_endereco) VALUES ('DOQUEI', '5698756', 3,2);
INSERT INTO transportadora (nm_transportadora, cnpj, id_telefone, id_endereco) VALUES ('SEVERINO', '988911544', 5,2);
INSERT INTO transportadora (nm_transportadora, cnpj, id_telefone, id_endereco) VALUES ('ATONIO', '74123132', 3,1);


INSERT INTO nota_fiscal
(num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES(10,2345,CURRENT_DATE,2000,3000,4000,6000,10000,1,2,3,4);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (11, 3456, CURRENT_DATE, 2500, 1500, 3200, 5100, 9200, 3, 4, 5, 1);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (12, 4567, CURRENT_DATE, 3000, 1600, 3500, 4800, 8900, 2, 1, 4, 3);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (13, 5678, CURRENT_DATE, 2800, 1400, 3100, 5200, 9500, 5, 2, 3, 2);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (14, 6789, CURRENT_DATE, 2600, 1800, 3400, 5300, 9100, 4, 5, 2, 4);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (15, 7890, CURRENT_DATE, 3200, 1700, 3600, 5400, 9400, 1, 3, 1, 5);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (16, 8901, CURRENT_DATE, 2200, 1300, 3000, 4900, 8700, 2, 4, 5, 3);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (17, 9012, CURRENT_DATE, 2400, 1450, 3150, 5000, 8600, 3, 1, 4, 1);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (18, 1013, CURRENT_DATE, 3300, 1650, 3750, 5600, 9000, 5, 3, 2, 5);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (19, 1114, CURRENT_DATE, 3400, 1500, 3200, 4700, 8900, 4, 2, 3, 2);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (20, 1215, CURRENT_DATE, 2900, 1750, 3550, 5200, 9400, 1, 5, 4, 4);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (21, 1316, CURRENT_DATE, 3100, 1350, 3050, 4800, 8600, 2, 1, 1, 3);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (22, 1417, CURRENT_DATE, 3500, 1850, 3700, 5700, 9300, 3, 4, 2, 5);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (23, 1518, CURRENT_DATE, 2700, 1200, 2950, 4500, 8400, 5, 3, 3, 2);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (24, 1619, CURRENT_DATE, 2800, 1400, 3250, 5100, 8800, 4, 2, 5, 1);

INSERT INTO nota_fiscal (num_nf, chave_acesso, data_emissao, vl_total, vl_icms, base_calculo_icms, vl_pis, vl_confins, id_transportadora, id_pedido, id_parceiro, id_endereco)
VALUES (25, 1720, CURRENT_DATE, 3600, 1900, 3800, 5800, 9700, 1, 5, 1, 4);

SELECT 
	nf.idnota, 
	nf.num_nf, 
	nf.chave_acesso, 
	nf.data_emissao, 
	nf.vl_total, 
	nf.vl_icms, 
	nf.base_calculo_icms, 
	nf.vl_pis, 
	nf.vl_confins, 
	nf.id_transportadora, 
	t.nm_transportadora ,
	t.cnpj ,
	nf.id_pedido, 
	nf.id_parceiro, 
	nf.id_endereco
FROM public.nota_fiscal nf
INNER JOIN transportadora t ON t.idtransportadora = nf.id_transportadora 