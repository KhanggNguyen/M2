/*-------------2.1.2-------------*/
set long 40000
set head off echo off


CREATE OR REPLACE PROCEDURE UneTable (
    nomTable IN VARCHAR
)
IS
BEGIN

    dbms_metadata.set_transform_param(dbms_metadata.session_transform,'SQLTERMINATOR',true);
    DBMS_OUTPUT.PUT_LINE(dbms_metadata.get_ddl('TABLE', nomTable));
    EXCEPTION
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Un problème est survenue.');
END;
/
--exec UneTable('POPULATION');

CREATE OR REPLACE FUNCTION ToutesTables(
    nomUtilisateur IN VARCHAR
) 
RETURN CLOB
IS
    res CLOB;

BEGIN

    res := '';
    dbms_metadata.set_transform_param(dbms_metadata.session_transform,'SEGMENT_ATTRIBUTES',true);
    --dbms_metadata.set_transform_param(dbms_metadata.session_transform, 'SQLTERMINATOR', true);
    dbms_metadata.set_transform_param(dbms_metadata.session_transform, 'STORAGE', false);

    FOR c_res IN (
        SELECT DBMS_METADATA.GET_DDL('TABLE', TABLE_NAME, nomUtilisateur) AS v_res 
        FROM DBA_TABLES 
        WHERE OWNER = nomUtilisateur)
    LOOP
    	res := c_res.v_res||res;
    END LOOP;

    RETURN res;

    EXCEPTION
        WHEN NO_DATA_FOUND Then DBMS_OUTPUT.PUT_LINE('Pas de données');
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Un problème est survenue.');
END;
/
--select ToutesTables('E20150004923') FROM dual;

CREATE OR REPLACE FUNCTION ToutesTablesInfos(
    nomUtilisateur IN VARCHAR
)
RETURN CLOB
IS
res CLOB;
BEGIN 
    res := '';

    dbms_metadata.set_transform_param(dbms_metadata.session_transform, 'DEFAULT', true);

    FOR c_res IN (
        SELECT DBMS_METADATA.GET_DDL('TABLE', TABLE_NAME, nomUtilisateur) AS v_res 
        FROM DBA_TABLES 
        WHERE OWNER = nomUtilisateur)
    LOOP
    	res := c_res.v_res||res;
    END LOOP;

    RETURN res;
    
    EXCEPTION
        WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('Pas de données');
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Un problème est survenue.');
END;
/
--select ToutesTablesInfos('E20150004923') FROM dual;

/*-------------2.1.3-------------*/
set long 40000
exec dbms_metadata.set_transform_param(dbms_metadata.session_transform, 'DEFAULT', true);
SELECT DBMS_METADATA.GET_DDL('TABLE', TABLE_NAME, 'E20150004923')
        FROM DBA_TABLES 
        WHERE OWNER = 'E20150004923' AND TABLE_NAME = 'POPULATION';

-- Résultat 
/*
 CREATE TABLE "E20150004923"."POPULATION"
   (    "CODEINSEE" VARCHAR2(6) NOT NULL ENABLE,
        "ANNEE" NUMBER(*,0) NOT NULL ENABLE,
        "VAL_POPULATION" NUMBER(*,0),
         PRIMARY KEY ("CODEINSEE", "ANNEE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS
  STORAGE(
    INITIAL 65536 -- la taille en octets du premier extent
    NEXT 1048576 -- la taille en octets du extent suivant
    MINEXTENTS 1 -- nombre d'extents alloués à la création
    MAXEXTENTS 2147483645 -- nb max d'extents
    PCTINCREASE 0 -- pourcentage d'augmentation entre 2 extents
    FREELISTS 1 
    FREELIST GROUPS 1
    BUFFER_POOL DEFAULT 
    FLASH_CACHE DEFAULT 
    CELL_FLASH_CACHE DEFAULT)
    TABLESPACE "DATA_ETUD"  ENABLE 
   ) SEGMENT CREATION IMMEDIATE
    PCTFREE 10 -- pourcentage d'espace réservé dans chaque bloc pour des mises à jour à venir
    PCTUSED 40 -- pourcentage min d'espace utilisé dans un bloc 
    INITRANS 1 -- nombre initial d'entrées de transactions
    MAXTRANS 255 -- nombre max de transaction concurrentes 
    NOCOMPRESS LOGGING
    STORAGE(
        INITIAL 65536 
        NEXT 1048576 
        MINEXTENTS 1 
        MAXEXTENTS 2147483645
        PCTINCREASE 0 
        FREELISTS 1 
        FREELIST GROUPS 1
        BUFFER_POOL DEFAULT 
        FLASH_CACHE DEFAULT 
        CELL_FLASH_CACHE DEFAULT)
    TABLESPACE "DATA_ETUD"
*/

/*-------------2.1.4-------------*/

SELECT owner, segment_type, segment_name, sum(bytes) octets, sum(blocks) blocs, sum(extents) extensions 
FROM dba_segments 
WHERE owner = 'E20150004923' AND segment_name = 'POPULATION' 
GROUP BY owner, segment_type, segment_name 
ORDER BY octets ASC;

SELECT owner, segment_name, segment_type, sum(bytes) octets, sum(blocks) blocs
FROM dba_extents  
WHERE owner = 'E20150004923' AND segment_name = 'POPULATION' 
GROUP BY owner, segment_type, segment_name 
ORDER BY octets ASC;

select object_id from dba_objects where owner = 'E20150004923' and object_name = 'POPULATION';

/*-------------2.2.1-------------*/
CREATE OR REPLACE FUNCTION TableXML(
    nomTable IN VARCHAR
) 
RETURN CLOB
IS
    res CLOB;
BEGIN 
    res :=  DBMS_METADATA.GET_XML('TABLE', UPPER(nomTable)) ;
    
    RETURN res;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('Pas de données');
        WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Un problème est survenue.');
END;
/

--select dbms_metadata.get_xml('TABLE', 'POPULATION') from dual;--Test appel

CREATE OR REPLACE FUNCTION TableDataXML(
    nomTable IN VARCHAR,
    nomCondition IN VARCHAR,
    valueCondition IN VARCHAR
) 
RETURN CLOB
IS
    res CLOB;
BEGIN 
    
    res := DBMS_XMLGEN.GETXML
        (DBMS_XMLGEN.NEWCONTEXT
            ('SELECT * FROM ' . nomTable . ' WHERE ' nomCondition . '=' . valueCondition ';')
        )
    
    return res;
END;
/