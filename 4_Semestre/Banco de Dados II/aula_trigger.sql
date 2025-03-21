DROP IF EXISTS ator;

CREATE TABLE ator(
	id serial PRIMARY KEY ,
	nome varchar(100)
);

INSERT INTO ator (
	nome
)
VALUES
('João'),
('Juquinha'),
('Maria'),
('Anastasia'),
('Gilberto')


SELECT * FROM ator 

ALTER TABLE ator ADD COLUMN ultima_atualizacao timestamp WITH Time ZONE

DROP FUNCTION log_ator();

CREATE OR REPLACE FUNCTION log_ator()
RETURNS TRIGGER 
AS
$$
	begin
		update ator
		set ultima_atualizacao = now()
		where id = new.id;
		return new;
	end;
$$
LANGUAGE plpgsql;

DROP IF EXISTS TRIGGER log_ator()

CREATE TRIGGER log_ator AFTER INSERT ON ator 
	FOR EACH ROW EXECUTE PROCEDURE log_ator();

INSERT INTO ator (
	nome
)
VALUES
('DIDI')


SELECT * FROM ator 



DROP TABLE IF EXISTS emp
DROP TABLE IF EXISTS  emp_audit
CREATE TABLE emp (
empname text,
salary integer,
last_date timestamp,
last_user text
);

CREATE TABLE emp_audit(
operation char(1) NOT NULL,
userid text NOT NULL,
empname text NOT NULL,
salary integer,
stamp timestamp NOT NULL
);


CREATE OR REPLACE FUNCTION emp_stamp() RETURNS trigger AS $emp_stamp$
BEGIN
-- Check that empname and salary are given
IF NEW.empname IS NULL THEN
RAISE EXCEPTION 'empname cannot be null';
END IF;
IF NEW.salary IS NULL THEN
RAISE EXCEPTION '% cannot have null salary', NEW.empname;
END IF;
-- Who works for us when they must pay for it?
IF NEW.salary <= 0 THEN
RAISE EXCEPTION '% cannot have a negative or null salary', NEW.empname;
END IF;
-- Remember who changed the payroll when
NEW.last_date := current_timestamp;
NEW.last_user := current_user;
RETURN NEW;
END;
$emp_stamp$ LANGUAGE plpgsql;

	
	
CREATE TRIGGER emp_stamp BEFORE INSERT OR UPDATE ON emp 
FOR EACH ROW EXECUTE PROCEDURE emp_stamp();


insert into emp (empname, salary) values ('Juquinha', 10000);
select *from emp;
insert into emp (empname) values ('Juquinha2');
insert into emp ( salary) values ( 20000);
insert into emp (empname, salary) values ('Juquinha2', -20000);

END


CREATE OR REPLACE FUNCTION process_emp_audit() 
RETURNS TRIGGER 
AS 
$emp_audit$
BEGIN
	IF (TG_OP = 'DELETE') THEN
	INSERT INTO emp_audit SELECT 'D', user, OLD.EMPNAME, OLD.SALARY, now();
	RETURN OLD;
	ELSIF (TG_OP = 'UPDATE') THEN
	INSERT INTO emp_audit SELECT 'U', user, NEW.EMPNAME, NEW.SALARY, now();
	RETURN NEW;
	ELSIF (TG_OP = 'INSERT') THEN
	INSERT INTO emp_audit SELECT 'I', user, NEW.EMPNAME, NEW.SALARY, now();
	RETURN NEW;
	END IF;
	RETURN NULL; -- result is ignored since this is an AFTER trigger
END;
$emp_audit$ 
LANGUAGE plpgsql;

CREATE TRIGGER emp_audit
AFTER INSERT OR UPDATE OR DELETE 
ON emp FOR EACH ROW EXECUTE PROCEDURE process_emp_audit();


insert into emp (empname, salary) values ('Juquinha Segundo', 20000)
select * from emp
update emp set empname='Juquinha Snaidis' where empname='Juquinha Segundo'
select * from emp_audit
delete from emp where empname='Juquinha Snaidis'
select * from emp_audit


CREATE OR REPLACE FUNCTION verificar_salario()
returns trigger
AS
	$emp$
		BEGIN
			IF NEW.salary is null then RAISE EXCEPTION 'salary cannot be null'; END IF;
		END;
	$emp$ LANGUAGE plpgsql;

CREATE Trigger verificar_salario_trigger BEFORE INSERT or UPDATE on emp
for EACH row EXECUTE PROCEDURE verificar_salario();


