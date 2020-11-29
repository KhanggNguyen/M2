--NGUYEN Huu Khang 21506865
--TRAN Thi Tra My 21511002

CREATE OR REPLACE PACKAGE DataCacheMetric 
AS
    FUNCTION blocksNumberInDataCache RETURN INTEGER;
    FUNCTION allocatedBytesInDataCache RETURN INTEGER;
    FUNCTION ratioCachePerUser (username IN VARCHAR) RETURN FLOAT;
    FUNCTION blocksNumberPerTablespace (tsname IN VARCHAR) RETURN INTEGER;
END DataCacheMetric;
/

CREATE OR REPLACE PACKAGE BODY DataCacheMetric
AS

    FUNCTION blocksNumberInDataCache 
    RETURN INTEGER
    IS
    blocks# INTEGER;
    BEGIN
    SELECT count(*) INTO blocks# FROM v$bh;
    RETURN blocks#;
    EXCEPTION WHEN others THEN RETURN -1;
    END;

    --exploite v$bh via blocksNumberInDataCache and v$parameter pour la taille block donnees
    --return octets en cours exploitation
    FUNCTION allocatedBytesInDataCache 
    RETURN INTEGER
    IS
    size_octets# INTEGER;
    total_octets# INTEGER;
    blocks# INTEGER;
    BEGIN 
    SELECT blocksNumberInDataCache INTO blocks# FROM dual;
    SELECT value INTO size_octets# FROM v$parameter WHERE name ='db_block_size';
    total_octets# := blocks# * size_octets#;
    RETURN total_octets#;
    EXCEPTION WHEN others THEN RETURN -1;
    END;--end allocatedBytesInDataCache();

    --return rapport entre total block et block utilisé par utilisateur en param
    FUNCTION ratioCachePerUser (username IN VARCHAR) 
    RETURN FLOAT
    IS
    blocks# INTEGER;
    ratio# FLOAT;
    BEGIN
    SELECT blocksNumberInDataCache INTO blocks# FROM dual;
    SELECT SUM(blocks#/block#) INTO ratio# FROM v$bh, dba_objects WHERE objd = object_id AND owner = username;
    RETURN ratio#;
    EXCEPTION WHEN others THEN RETURN -1;
    END;--end ratioCachePerUser

    FUNCTION blocksNumberPerTablespace (tsname IN VARCHAR) 
    RETURN INTEGER
    IS
    total_blocks# INTEGER;
    BEGIN
    SELECT count(block#) INTO total_blocks# FROM v$bh, v$tablespace WHERE v$bh.TS# = v$tablespace.TS# AND v$tablespace.name = tsname;
    RETURN total_blocks#;
    EXCEPTION WHEN others THEN RETURN -1;
    END;--end blockNumberPerTablespace

END DataCacheMetric;--end package
/




/** Question 2.2 **/

CREATE OR REPLACE PROCEDURE afficheBlocsParTableSpace
IS
    blocks# INTEGER;
    CURSOR c_tablespace
    IS 
    SELECT name
    FROM v$tablespace;
BEGIN
    FOR n_tablespace IN c_tablespace
    LOOP
        SELECT DataCacheMetric.blocksNumberPerTablespace(n_tablespace.name) INTO blocks# from dual;
        DBMS_OUTPUT.PUT_LINE('Nombre de block : ' ||blocks#|| ' pour tablespace ' ||n_tablespace.name );
    END LOOP;
END;--End afficheBlocsParTableSpace
/


-- execute afficheBlocsParTableSpace();
/** ========= resultats ======= **/
/**
Nombre de block : 25307 pour tablespace SYSTEM
Nombre de block : 12079 pour tablespace SYSAUX
Nombre de block : 2202 pour tablespace UNDOTBS1
Nombre de block : 1 pour tablespace TEMP
Nombre de block : 49 pour tablespace USERS
Nombre de block : 34729 pour tablespace DATA_ETUD
**/


/** Question 2.3 **/

/** ========  Appel fonction du package ======== **/
SELECT DataCacheMetric.blocksNumberInDataCache FROM dual;
SELECT DataCacheMetric.allocatedBytesInDataCache FROM dual;
SELECT DataCacheMetric.ratioCachePerUser(user) FROM dual;
SELECT DataCacheMetric.blocksNumberPerTablespace('USERS') FROM dual;


/** Question 3.1 **/

--set linesize 200;
--col osuser for a30;
--select s.sid, s.osuser, substr(a.sql_text,1,60), plan_hash_value from v$session s join v$sqlarea a on a.hash_value = s.prev_hash_value ;

/**

Cette requete permet de montrer les gens connectant en oracle en ce moment et leur derniere requête.
sid est identifiant de la session
osuser est username
substr(a.sql_text,1,60) est leur derniere requete
plan_hash_value represente la valeur du plan d'exécution

**/

/** Question 3.2 **/

select username, to_char(last_login,'DD-MM-YYYY HH-MI-SS'), to_char(created,'DD-MM-YYYY
HH-MI-SS') from
dba_users where username in
((select username from dba_users
minus
select owner from v$bh join dba_objects on objd = object_id)
minus
(select username from dba_users
minus
select owner from dba_objects)) ;

/**
Cette requête permet d'afficher les utilisateurs non actives (ne possèdent pas des buffers).

select username from dba_users
minus
select owner from v$bh join dba_objects on objd = object_id
--Cette bloc permet d'avoir les utilisateurs qui n'ont pas utilisé les blocs de données.

select username from dba_users
minus
select owner from dba_objects
--Cette bloc permet d'avoir tous les utilisateurs

Donc en faisant la division, on peut retrouver tous les utilisateurs retournés par la 1er requete du bloc imbriqué. Ce sont les utilisateurs non actives.

**/