ALTER TABLE products ADD COLUMN id_categories integer;


DROP TABLE IF EXISTS categories;

CREATE TABLE categories(
	id serial PRIMARY key,
	name varchar(255)
);


ALTER TABLE products ADD CONSTRAINT fk_categories FOREIGN KEY (id_categories) REFERENCES categories(id);


INSERT INTO categories(
	name
)
VALUES
('old stock'),
('new stock'),
('modern'),
('commercial'),
('recycable'),
('executive'),
('superior'),
('wood'),
('super luxury'),
('vintage');



INSERT INTO products(
	name,
	amount, 
	price,
	id_categories
)
VALUES
('Lampshade',100,800,4),
('Table for paiting',100,560,9),
('Notebook desk',10000,25.50,9),
('Computer Desk',350,320.50,6),
('Chair',3000,210.64,9),
('Home Alarm',750,460,4);


SELECT 
 	id,
 	name
FROM products 
WHERE id_categories = 9

SELECT
min(price),
max(price),
avg(price),
sum(price),
count(name)
FROM products

