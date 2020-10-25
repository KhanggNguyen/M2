/* 
sqlplus  e20150009241/Honeycat123@oracle.etu.umontpellier.fr:1523/pmaster

@ D:\Master\master-aigle\M2-AIGLE\S3\HMIN328-AdminBDD\PLSQL\Partie1\ScriptCreation.sql

@ /home/e20150004923/Documents/M2/HMIN328/ScriptCreation.sql

sqlplus  e20150004923/1234567@oracle.etu.umontpellier.fr:1523/pmaster
*/
/* 2 */
ALTER TABLE Dept
ADD CONSTRAINT PK_Dept PRIMARY KEY (n_dept);

ALTER TABLE Emp
ADD CONSTRAINT PK_EMP PRIMARY KEY(num);

UPDATE EMP SET n_dept = 10 WHERE NOM = 'CODD'; 

ALTER TABLE Emp 
    ADD CONSTRAINT FK_Emp_Dept 
        FOREIGN KEY (n_dept) 
        REFERENCES Dept(n_dept) 
        ON DELETE CASCADE;

ALTER TABLE Emp 
    ADD CONSTRAINT FK_Emp_Emp 
    FOREIGN KEY (n_sup) 
    REFERENCES Emp(num) 
    ON DELETE CASCADE;

/* 3.1 */

CREATE TRIGGER verify_salary
BEFORE INSERT OR UPDATE OF salaire ON Emp 
FOR EACH ROW /*necessite cette ligne pour utiliser reference :NEW ou :OLD*/
BEGIN 
    IF (:new.salaire < 0) THEN 
        raise_application_error(-20022, 'Le salaire ne doit pas etre negative');
    END IF;
END;
/

/* exemple: */ 
UPDATE EMP set SALAIRE = -1000 WHERE num = '27546' ;

/* 3.2 */

CREATE TRIGGER verify_salary_sup_1000_dept_rennes
BEFORE INSERT OR UPDATE OF salaire ON EMP
FOR EACH ROW 
WHEN (NEW.salaire < 1000)
DECLARE 
    num_dept DEPT.n_dept%type;
BEGIN
    SELECT n_dept INTO num_dept FROM DEPT WHERE DEPT.LIEU = 'Rennes';
    IF  (:NEW.n_dept = num_dept ) THEN
        raise_application_error(-20022, 'Le salaire des employes du departement rennes ne doit pas etre inferieur a 1000');
    END IF;
END;
/
/*exemple*/
UPDATE EMP set SALAIRE = 500 WHERE num = '26834' AND n_dept = '10';

/* 3.3 */
/* Pas possible de modifier les table le weekend */

CREATE OR REPLACE PROCEDURE JoursEtHeuresOuvrables
IS
BEGIN
	IF (to_char(SYSDATE,'DY')='SAT') or (to_char(SYSDATE,'DY')='SUN')
	THEN
		raise_application_error(-20010, 'Modification interdite le '||to_char(SYSDATE,'DAY'));
	END IF ;
END;
/

CREATE OR REPLACE trigger Ouvrable
BEFORE INSERT OR UPDATE ON EMP
BEGIN
	JoursEtHeuresOuvrables();
END;
/

/* 3.4 */
/* Ajout dans table histoire les requetes par utilisateur */
CREATE table historique
(
	dateOperation date,
	nomUsager varchar(30),
	typeOperation varchar(200)
);

CREATE OR REPLACE trigger histo_dept
BEFORE INSERT OR UPDATE OR DELETE ON DEPT
DECLARE
	typeOp varchar(15);
BEGIN
	IF INSERTING THEN
		typeOp := 'Insertion';
	ELSIF UPDATING THEN
		typeOp := 'Modification';
	ELSIF DELETING THEN
		typeOp := 'Suppression';
	END IF;
	INSERT INTO historique VALUES (SYSDATE, USER, typeOp);
END;
/

UPDATE EMP set SALAIRE = 1500 WHERE num = '26834' AND n_dept = '10';

/* 3.5 */

CREATE OR REPLACE TRIGGER cascade_dept
BEFORE DELETE OR UPDATE ON DEPT 
FOR EACH ROW
DECLARE
	OLDDEPT DEPT.n_dept%TYPE;
BEGIN
	OLDDEPT := :OLD.n_dept;
	IF DELETING THEN
		DELETE FROM EMP WHERE n_dept=OLDDEPT;
	ELSIF UPDATING THEN
		UPDATE EMP SET n_dept=OLDDEPT;
	END IF;
END;
/

/* 4 */
CREATE OR REPLACE TRIGGER trigger_table_create_alter
AFTER CREATE ON SCHEMA
BEGIN 
	IF(SYS.DICTIONARY_OBJ_TYPE = 'TABLE') THEN
		dbms_output.put_line('Une table a été créé');
	END IF;
END;
/

DROP TRIGGER e20150004923.trigger_table_create_alter;

/* 5 */

create table QuiSeConnecte
(
	c_user varchar2(30),
	os_user varchar2(30),
	c_date date
);

CREATE OR REPLACE TRIGGER logon_db
AFTER logon ON DATABASE
DECLARE
o_user varchar2(30);
BEGIN
SELECT sys_context('USERENV','OS_USER') INTO o_user FROM dual ;
INSERT INTO QuiSeConnecte VALUES (user, o_user, sysdate);
COMMIT;
END;
/

COMMIT;


