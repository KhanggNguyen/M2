/* 
SSH -y huu-khang.nguyen@etu.umontpellier.fr@x2go.umontpellier.fr

sqlplus  e20150004923/1234567@oracle.etu.umontpellier.fr:1523/pmaster 
*/

/* 2 */

CREATE OR REPLACE PROCEDURE supp_trigger (trigger_name in varchar)
IS
BEGIN
EXECUTE IMMEDIATE 'DROP TRIGGER '||trigger_name||' cascade constraints';
DBMS_OUTPUT.PUT_LINE('TRIGGER '||trigger_name|| ' détruite ');
EXCEPTION
WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('PB sur la suppression trigger');
END;
/
execute supp_trigger('logon_db');

/* 3.1.1 */

CREATE OR REPLACE PROCEDURE EmployesDuDepartement (num_dept in NUMBER)
IS 
    CURSOR c_employes
    IS
        SELECT nom 
        FROM EMP
        WHERE n_dept = num_dept;
BEGIN
    FOR n_employe IN c_employes
    LOOP
        DBMS_OUTPUT.PUT_LINE(n_employe.nom);
    END LOOP;
END;
/

execute EmployesDuDepartement(10);

/* DROP PROCEDURE e20150004923.EmployesDuDepartement; */

/* 3.1.2 */

CREATE OR REPLACE FUNCTION CoutSalarialDuDepartement (num_dept in NUMBER)
RETURN NUMBER
IS 
    total_cout NUMBER(5);
BEGIN 
    SELECT SUM(salaire) INTO total_cout FROM EMP WHERE n_dept = num_dept;
    RETURN total_cout;
END;
/

SELECT CoutSalarialDuDepartement(10) FROM dual;

/* DROP FUNCTION e20150004923.CoutSalarialDuDepartement; */

/* 3.2 */

CREATE OR REPLACE PACKAGE Supervision
AS
    FUNCTION tauxUtilisation RETURN NUMBER;
    PROCEDURE utilisateur_connecte;
    PROCEDURE information_usagers;
    PROCEDURE user_role (userName IN VARCHAR);
END Supervision;
/

CREATE OR REPLACE PACKAGE BODY Supervision
AS

    FUNCTION tauxUtilisation
    RETURN NUMBER
    IS
    countSession NUMBER(5);
    countUser NUMBER(5);
    BEGIN
        SELECT COUNT(*) INTO countSession FROM v$session;
        SELECT COUNT(*) INTO countUser FROM dba_users;
        RETURN ((countSession / countUser) * 100);
        
        EXCEPTION 
            WHEN OTHERS THEN RETURN 0;
    END;
    
    PROCEDURE utilisateur_connecte
    IS
    CURSOR c1 IS SELECT OWNER, COUNT(b.table_name) AS NumberTable, SUM(b.num_rows) AS numRow FROM dba_tables b, v$session c WHERE c.USERNAME = b.OWNER GROUP BY OWNER;
    BEGIN
        FOR t IN c1
        LOOP
            dbms_output.put_line(t.OWNER || ',' || t.NumberTable || ',' || t.numRow);
        END LOOP;

        EXCEPTION
            WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur la procedure');
    END;
    
    PROCEDURE information_usagers
    IS
    CURSOR c1 IS SELECT a.USERNAME AS username, a.STATUS AS statut, b.TERMINAL AS terminal, a.CLIENT_INFO AS clientInfo, a.LOGON_TIME AS logIn FROM v$session a, v$process b WHERE a.SID = b.PID;
    BEGIN
        FOR t IN c1
        LOOP
            dbms_output.put_line(t.username || ',' || t.statut || ',' || t.terminal || ',' || t.clientInfo  || ',' || t.logIn);
        END LOOP;

        EXCEPTION
            WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur la procedure');
    END;
    
    PROCEDURE user_role (userName IN VARCHAR)
    IS
        CURSOR c1 IS SELECT * FROM USER_SYS_PRIVS WHERE USERNAME = userName;
        CURSOR c2 IS SELECT * FROM USER_ROLE_PRIVS WHERE USERNAME = userName;
    BEGIN
        FOR t IN c1
        LOOP
            dbms_output.put_line(t.PRIVILEGE || ',' || t.ADMIN_OPTION);
        END LOOP;
        FOR ti IN c2
        LOOP
            dbms_output.put_line(ti.GRANTED_ROLE || ',');
        END LOOP;
        
        EXCEPTION
            WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur la procedure');
    END;
 
END Supervision;
/

SELECT Supervision.tauxUtilisation from dual;
EXECUTE Supervision.utilisateur_connecte();
EXECUTE Supervision.user_role('e20150004923');