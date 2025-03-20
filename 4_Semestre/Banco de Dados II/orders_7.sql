DROP TABLE IF EXISTS orders;

CREATE TABLE orders(
	id serial PRIMARY KEY,
	orders_date date,
	id_customers integer,
	FOREIGN KEY (id_customers) REFERENCES customers(id)
);

INSERT INTO orders(
	orders_date,
	id_customers
)
VALUES
('2016-05-13',3),
('2016-01-12',2),
('2016-04-18',5),
('2016-09-17',4),
('2016-12-13',6),
('2016-08-05',3);


INSERT INTO customers ( name, street, city, state, credit_limit) VALUES
('Nicolas Diogo Cardoso', 'Acesso Um', 'Porto Alegre', 'RS', 475),
('Cecília Olivia Rodrigues', 'Rua Sizuka Usuy', 'Cianorte', 'PR', 3170),
('Augusto Fernando Carlos Eduardo Cardoso', 'Rua Baldomiro Koerich', 'Palhoça', 'SC', 1067),
('Nicolas Diogo Cardoso', 'Acesso Um', 'Porto Alegre', 'RS', 475),
('Sabrina Heloísa Gabriela Barros', 'Rua Engenheiro Tito Marques Fernandes', 'Porto Alegre', 'RS', 4312),
('Joaquim Diego Lorenzo Araújo', 'Rua Vitorino', 'Novo Hamburgo', 'RS', 2314);


SELECT
	name,
	orders.id
FROM customers
INNER JOIN orders ON customers.id = orders.id_customers
WHERE orders_date::date BETWEEN '2016-01-01' AND '2016-06-01'


SELECT
	*
FROM customers
INNER JOIN orders ON customers.id = orders.id_customers
WHERE orders_date::date BETWEEN '2016-01-01' AND '2016-06-01'

