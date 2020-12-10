/* Partie 1 */

CREATE TABLE Population (
    codeinsee varchar(6) NOT NULL,
    annee integer NOT NULL,
    val_population integer,
    PRIMARY KEY (codeinsee, annee)
);

-- sqlldr userid=abc/abc@oracle.etu.umontpellier.fr:1523/pmaster control=Commune.ctl

ANALYZE TABLE Population COMPUTE STATISTICS;
SELECT blocks, num_rows FROM user_tables WHERE table_name = 'POPULATION';



/* Partie 2 */

/* 2.1.2 */
CREATE OR REPLACE PROCEDURE UneTable (p_nomTable IN VARCHAR)
IS
BEGIN
    dbms_metadata.set_transform_param(dbms_metadata.session_transform,'SQLTERMINATOR',true);
    DBMS_OUTPUT.PUT_LINE(dbms_metadata.get_ddl('TABLE', p_nomTable));
    EXCEPTION
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur l''affichage');
END;
/
--execute UneTable('POPULATION');

CREATE OR REPLACE FUNCTION ToutesTables(p_username IN VARCHAR) RETURN CLOB
IS
    res CLOB;
BEGIN
    res := '';  
    dbms_metadata.set_transform_param(dbms_metadata.session_transform,'SEGMENT_ATTRIBUTES',true);
    dbms_metadata.set_transform_param(dbms_metadata.session_transform, 'STORAGE', false);
    FOR c_res IN (
        SELECT DBMS_METADATA.GET_DDL('TABLE', TABLE_NAME, p_username) AS v_res 
        FROM DBA_TABLES 
        WHERE OWNER = p_username)
    LOOP
    	res := c_res.v_res||res;
    END LOOP;

    RETURN res;

    EXCEPTION
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur l''affichage');
END;
/
--select ToutesTables('E20150009241') FROM dual;

CREATE OR REPLACE FUNCTION ToutesTablesInfos(p_username IN VARCHAR) RETURN CLOB
IS
    res CLOB;
BEGIN 
    res := '';

    dbms_metadata.set_transform_param(dbms_metadata.session_transform, 'DEFAULT', true);

    FOR c_res IN (
        SELECT DBMS_METADATA.GET_DDL('TABLE', TABLE_NAME, p_username) AS v_res 
        FROM DBA_TABLES 
        WHERE OWNER = p_username
    )
    LOOP
    	res := c_res.v_res||res;
    END LOOP;

    RETURN res;
    
    EXCEPTION
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur l''affichage');
END;
/
--select ToutesTablesInfos('E20150009241') FROM dual;

/* 2.1.3 */

EXECUTE dbms_metadata.set_transform_param(dbms_metadata.session_transform, 'DEFAULT', true);

SELECT DBMS_METADATA.GET_DDL('TABLE', TABLE_NAME, 'E20150009241')
FROM DBA_TABLES 
WHERE OWNER = 'E20150009241' AND TABLE_NAME = 'POPULATION';

/* 2.1.4 */

SELECT owner, segment_type, segment_name, sum(bytes) octets, sum(blocks) blocs, sum(extents) extensions 
FROM dba_segments 
WHERE owner = 'E20150009241' AND segment_name = 'POPULATION' 
GROUP BY owner, segment_type, segment_name 
ORDER BY octets ASC;

SELECT owner, segment_name, segment_type, sum(bytes) octets, sum(blocks) blocs
FROM dba_extents  
WHERE owner = 'E20150009241' AND segment_name = 'POPULATION' 
GROUP BY owner, segment_type, segment_name 
ORDER BY octets ASC;

select object_id from dba_objects where owner = 'E20150009241' and object_name = 'POPULATION';


CREATE OR REPLACE FUNCTION TableXML(p_nomTable IN VARCHAR) RETURN CLOB
IS
    res CLOB;
BEGIN 
    res :=  DBMS_METADATA.GET_XML('TABLE', UPPER(p_nomTable)) ;
    
    RETURN res;

    EXCEPTION
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur l''affichage');
END;
/

--select dbms_metadata.get_xml('TABLE', 'POPULATION') from dual;

CREATE OR REPLACE FUNCTION TableDataXML(p_nomTable IN VARCHAR, p_condition IN VARCHAR DEFAULT '') RETURN CLOB
IS
    v_ctx DBMS_XMLGEN.ctxhandle;
    v_res CLOB;
BEGIN 
    v_ctx := DBMS_XMLGEN.NEWCONTEXT('SELECT * FROM '||upper(p_nomTable)||' WHERE '||p_condition);

    v_res := DBMS_XMLGEN.GETXML(v_ctx);
    DBMS_XMLGEN.closecontext(v_ctx);
    
    RETURN v_res;

    EXCEPTION
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur l''affichage');
END;
/

--SELECT TableDataXML('POPULATION') FROM dual; 

/* Partie 3 */

CREATE OR REPLACE PROCEDURE factory_population
IS
    CURSOR c_pop 
    IS
        SELECT POPULATION.CODEINSEE, NOMCOMMAJ, VAL_POPULATION
        FROM POPULATION, COMMUNE 
        WHERE ANNEE = '2000' OR ANNEE = '2010' 
            AND POPULATION.CODEINSEE = COMMUNE.CODEINSEE;
BEGIN
    FOR v_pop IN c_pop
    LOOP
        DBMS_OUTPUT.PUT_LINE(v_pop.CODEINSEE||chr(9)||v_pop.NOMCOMMAJ||chr(9)||v_pop.VAL_POPULATION||chr(13));
    END LOOP;

    EXCEPTION
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Pb sur l''affichage');
END;
/
/*
--exemple
spool on
spool file_pop
set serveroutput on
execute factory_population;
spool off
*/