DROP FUNCTION add

CREATE FUNCTION add(NUMERIC,integer) RETURNS integer
 	AS'SELECT $1 + $2'
	LANGUAGE SQL
	IMMUTABLE
	RETURNS NULL ON NULL INPUT;
	
SELECT add(4.4,1)





CREATE OR REPLACE FUNCTION increment(i integer) RETURNS integer
	AS $$
	BEGIN
		RETURN i + 5;
	END;
	$$
	LANGUAGE plpgsql;

SELECT increment(5)

DROP TABLE emp;

CREATE TABLE emp(
	id serial PRIMARY KEY,
	salario numeric
);

	INSERT INTO emp(salario)
	VALUES
	(random()*100),
	(random()*100),
	(random()*100),
	(random()*100),
	(random()*100),
	(random()*100),
	(random()*100),
	(random()*100),
	(random()*100),
	(random()*100)
	
	SELECT avg(salario) FROM emp
	
CREATE FUNCTION clean_emp() RETURNS void 
	AS 'DELETE FROM emp WHERE salario < 60.7328894438045300'
	LANGUAGE SQL;

SELECT clean_emp()
	