DROP FUNCTION IF EXISTS consultar_tabela_com_coluna();


CREATE OR REPLACE FUNCTION consultar_tabela_com_coluna(column_name_ text)
RETURNS TABLE (table_name text, column_name text) AS
$$
BEGIN
    RETURN QUERY
    SELECT DISTINCT c.table_name, c.column_name
    FROM information_schema.columns c
    WHERE c.column_name = column_name_;
END;
$$
LANGUAGE plpgsql;


SELECT  consultar_tabela_com_coluna('id')

DROP FUNCTION calculosMatematicos(x int, y int, OUT soma int, OUT subtracao int,OUT multiplicacao int, OUT divisao real)

CREATE OR REPLACE FUNCTION calculosMatematicos(x real, y real, OUT soma int, OUT subtracao int,OUT multiplicacao int, OUT divisao real)
AS
$$
	begin
		soma = x + y;
		subtracao = x - y; 
		multiplicacao = x * y;
		divisao = x / y;
	end;
$$
LANGUAGE plpgsql;

SELECT calculosMatematicos(2.00,5.00)


CREATE OR REPLACE FUNCTION exemplo_case(parametro integer)
RETURNS TEXT 
AS
$$
	begin
		case
			when parametro < 10 then return 'Menor que 10';
			when parametro = 10 then return 'Igual a 10';
			else return 'Maior que 10';
		end case;
	end;
$$
LANGUAGE plpgsql;

SELECT exemplo_case(10)




CREATE OR REPLACE FUNCTION exemplo_if(parametro integer)
RETURNS TEXT 
AS
$$
	begin
		if parametro < 10 
			then return 'Menor que 10';
		elsif parametro = 10 
			then return 'Igual a 10';
		else 
			return 'Maior que 10';
		end if;
	end;
$$
LANGUAGE plpgsql;

SELECT exemplo_if(13);



CREATE OR REPLACE FUNCTION buscar_ator(nome_ator text)
RETURNS TABLE (ID int, nome TEXT)
AS
$$
	declare id integer;
	begin
		return query 
		with(
			select
				1 AS ID ,'CHURRASCONEGUER'::text AS nome
		) as ator;
		select
		*
		from ator 
		where nome like '%'||nome_ator||'%';
	end;
$$
LANGUAGE plpgsql;



CREATE TABLE Car(
CarID INT,
CarName VARCHAR(100)
);
INSERT INTO Car VALUES (101,'Mercedes-Benz');
INSERT INTO Car VALUES (201,'BMW');
INSERT INTO Car VALUES (301,'Ferrari');
INSERT INTO Car VALUES (401,'Lamborghini');
INSERT INTO Car VALUES (501,'Porsche');
SELECT * FROM Car;


CREATE TABLE CarDescription(
CarID INT,
CarDescription VARCHAR(800)
);
INSERT INTO CarDescription VALUES (101,'Luxury vehicle from the German automotive');
INSERT INTO CarDescription VALUES (201,'Luxury motorcycle from the German automotive');
INSERT INTO CarDescription VALUES (301,'Luxury sports car from the Italian manufacturer');
INSERT INTO CarDescription VALUES (401,'Luxury SUV from the Italian automotive');
INSERT INTO CarDescription VALUES (501,'High-performance sports car from the German manufacturer');
SELECT * FROM CarDescription;



CREATE OR REPLACE FUNCTION GetCarDesc()
RETURNS TABLE (CarID INT, CarName VARCHAR(800), CarDescription VARCHAR(800)) AS $$
BEGIN
    RETURN QUERY
    SELECT C.CarID, C.CarName, CD.CarDescription
    FROM Car C
    INNER JOIN CarDescription CD ON C.CarID = CD.CarID;
END;
$$ LANGUAGE plpgsql;


SELECT  GetCarDesc();

DROP FUNCTION IF EXISTS GetCarDesc();

