/* 1.1 */
SET SIZELINE;

/* q1 */
SELECT * FROM v$instance;

SELECT HOST_NAME FROM v$instance ;

SELECT STARTUP_TIME FROM v$instance;

/* q2 */
SELECT * FROM v$database;

SELECT NAME FROM v$database;

/* pour verifier si c'est un ancien étudiant */
SELECT REMOTE_ARCHIVE FROM v$database;

/* q3 */

SELECT * FROM v$option WHERE VALUE = 'TRUE';

/* q4 */

SELECT * FROM v$version;

/* q5 */

SELECT SERVER FROM v$session;

/* 1.2 */

/* q1 */

SELECT * FROM v$sgastat WHERE POOL = 'shared pool';


SELECT * FROM v$sgainfo WHERE NAME = 'Buffer Cache';

SELECT * FROM v$sga WHERE NAME = 'Redo Buffers';

SELECT * FROM v$sgainfo WHERE NAME = 'Shared Pool Size';

/* q3 */

SELECT * FROM v$sql;

SELECT *
FROM v$sqlarea;

SELECT *
FROM v$sqltext;

SELECT p.pid, bg.name, bg.description, p.program
FROM v$bgprocess bg, v$process p
WHERE bg.paddr = p.addr ORDER BY p.pid;

SELECT name, value
FROM v$parameter;

SELECT *
FROM v$datefile;

SELECT *
FROM v$logfile;

SELECT *
FROM v$controlfile;

SELECT file#, block#, class#, dirty, objd, object_name, owner
FROM v$bh, dba_objects
WHERE dirty = 'Y'
AND objd = object_id;

data buffer cache

--Block en cours d'écriture

--- DioctionaryCache : Si l'objet existe (la table, l'attribut, etc)
--- LibraryCache : Si la requete a deja ete executee

CREATE OR REPLACE package ArchiOracle AS

END ArchiOracle;
/

CREATE OR REPLACE package body ArchiOracle AS

END ArchiOracle;
/

CREATE OR REPLACE PROCEDURE
SELECT to_char(logon_time, 'DD/MM/YYYY HH24:MI:SS') , username, program, sql_text
FROM v$session , v$sqlarea
WHERE v$session.sql_address = v$sqlarea.address
AND username = 'ldaviaud'
ORDER BY username, program;

select sql_id, disk_reads from v$sql where rownum <20 order by disk_reads desc;

SELECT r.sql_id, disk_reads, elapsed_time, username from v$sql r, v$session s where
s.sql_id = r.sql_id and type='USER';

select parsing_schema_name, substr(sql_text,1,20) from v$sqlarea where
parsing_schema_name ='IMOUGENOT';

select sql_FullText,(cpu_time/100000) "Cpu Time (s)"
, (elapsed_time/1000000) "Elapsed time (s)"
, fetches,buffer_gets,disk_reads,executions
FROM v$sqlarea
WHERE
Parsing_Schema_Name ='IMOUGENOT'
AND rownum <50
order by 3 desc;

var fonction varchar2(30);
exec :fonction := 'fonction';

SELECT *
FROM emp
WHERE fonction = :fonction;

SELECT sql_id, child_number, plan_hash_value, parsing_schema_name
FROM v$sql
WHERE parsing_schema_name = 'ldaviaud';

SELECT table_name, num_rows, blocks, empty_blocks, avg_space
FROM dba_tables
WHERE owner = 'LDAVIAUD';

Select 1- (phy.value / ( cons.value + db.value - phy.value))
from v$sysstat phy, v$sysstat cons, v$sysstat db
where phy.name ='physical reads' and cons.name ='consistent gets' and db.name ='db block
gets';