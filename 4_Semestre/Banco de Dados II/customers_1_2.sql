DROP TABLE IF EXISTS customers ;

CREATE TABLE customers(
	id serial PRIMARY KEY,
	name varchar(225),
	street varchar(225),
	city varchar(225),
	state char(2),
	credit_limit numeric
);

INSERT INTO customers(
	"name" ,
	street ,
	city ,
	state, 
	credit_limit 
)
VALUES
('Pedro Augusto da Rocha', 'Rua Pedro Carlos Hoffman', 'Porto Alegre', 'RS',700.00),
('Antonio Carlos Mamel', 'Av. Pinheiros', 'Belo Horizonte', 'MG', 3500.50),
('Luíza Augusta Mhor', 'Rua Salto Grande', 'Niteroi', 'RJ', 4000.00),
('Jane Ester', 'Av 7 de Setemebro', 'Erechim', 'RS', 800.00),
('Marcos Antônio dos Santos', 'Av Farrapos', 'Porto Alegre', 'RS', 4250.25);


SELECT
"name"
FROM customers
WHERE state = 'RS'

SELECT 'Pedro Augusto da Rocha' AS "name" UNION ALL 
SELECT'Jane Ester' AS "name" UNION all
SELECT'Marcos Antônio dos Santos' AS "name"


SELECT
"name","street"
FROM customers
WHERE city = 'Porto Alegre'