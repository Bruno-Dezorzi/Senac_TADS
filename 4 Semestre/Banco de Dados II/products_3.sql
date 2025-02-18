DROP TABLE IF EXISTS products;

CREATE TABLE products(
	id serial PRIMARY KEY ,
	name varchar(225),
	amount NUMERIC,
	price NUMERIC 
);

INSERT INTO products(
	name,
	amount, 
	price 
)
VALUES
('Two-Door Wardrobe',100,80),
('Dining Table',1000,560),
('Towel Holder',1000,5.50),
('Computer Desk',350,100),
('Chair',3000,210.64),
('Single bed',750,99);

SELECT
	id,
	"name"
FROM products
WHERE id IN (2,3,5)