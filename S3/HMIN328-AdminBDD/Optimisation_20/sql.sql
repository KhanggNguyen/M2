/* ex 2.1 */
set autotrace traceonly

create table departement as select * from p00000009432.departement;

create table region as select * from p00000009432.region;

alter table departement add constraint dept_pk primary key (numDep);

alter table region add constraint reg_pk primary key (numReg);

alter table departement add constraint dept_fk foreign key (numReg) references Region(numReg);

alter table commune add constraint com_fk foreign key (numDep) references Departement(numDep);

select nomcommaj, latitude, longitude, numdep from Commune where nomCommaj like 'M%' and numDep in ('30', '34');

explain plan for select nomCommaj, latitude, longitude, numdep from Commune where nomCommaj like 'M%' and numDep in ('30', '34');

select * from table (dbms_xplan.display());

/* ex 2.2a */

select Commune.numdep, nomcommaj from Commune, Departement where Commune.numdep = Departement.numdep AND nomdepmaj = 'AVEYRON' ;

explain plan for select Commune.numdep, nomcommaj from Commune, Departement where Commune.numdep = Departement.numdep AND nomdepmaj = 'AVEYRON' ;

select * from table (dbms_xplan.display());

/* ex 2.2b */

/* avec in */
select numdep, nomcommaj from Commune where numdep IN (select numdep from departement where nomdepmaj = 'AVEYRON');

explain plan for select numdep, nomcommaj from Commune where numdep IN (select numdep from departement where nomdepmaj = 'AVEYRON');

select * from table (dbms_xplan.display());

/* avec = */
select numdep, nomcommaj from Commune where numdep = (select numdep from departement where nomdepmaj = 'AVEYRON');

explain plan for select numdep, nomcommaj from Commune where numdep = (select numdep from departement where nomdepmaj = 'AVEYRON');

select * from table (dbms_xplan.display());

/* avec exists*/
select numdep, nomcommaj from Commune where EXISTS (select * from departement where nomdepmaj = 'AVEYRON');

explain plan for select numdep, nomcommaj from Commune where EXISTS (select * from departement where nomdepmaj = 'AVEYRON');

select * from table (dbms_xplan.display());

/* ex 2.3a */

select nomcommaj, longitude, latitude from Commune, Region, Departement where nomCommaj like 'M%' AND Commune.numDep = Departement.numDep AND departement.numReg = Region.numReg AND nomRegMaj = 'OCCITANIE';

explain plan for select nomcommaj, longitude, latitude from Commune, Region, Departement where nomCommaj like 'M%' AND Commune.numDep = Departement.numDep AND departement.numReg = Region.numReg AND nomRegMaj = 'OCCITANIE';

select * from table (dbms_xplan.display());

/* ex 2.3b */

/* avec in */
select nomcommaj, longitude, latitude from Commune where nomCommaj like 'M%' AND numdep IN (select numdep from departement where numreg in (select numreg from region where nomregmaj = 'OCCITANIE'));

explain plan for select nomcommaj, longitude, latitude from Commune where nomCommaj like 'M%' AND numdep IN (select numdep from departement where numreg in (select numreg from region where nomregmaj = 'OCCITANIE'));

select * from table (dbms_xplan.display());

/* avec exists */
select nomcommaj, longitude, latitude 
from Commune 
where nomCommaj like 'M%' AND EXISTS 
    (select * 
    from departement 
    where EXISTS 
        (select * 
        from region 
        where nomregmaj = 'OCCITANIE'));

explain plan for select nomcommaj, longitude, latitude from Commune where nomCommaj like 'M%' AND EXISTS (select * from departement where EXISTS (select * from region where nomregmaj = 'OCCITANIE'));

select * from table (dbms_xplan.display());

/* avec inner join */
select nomcommaj, longitude, latitude from Commune inner join departement ON commune.numdep = departement.numdep inner join region ON departement.numreg = region.numreg WHERE commune.nomCommaj like 'M%' AND nomregmaj = 'OCCITANIE';

explain plan for select nomcommaj, longitude, latitude from Commune inner join departement ON commune.numdep = departement.numdep inner join region ON departement.numreg = region.numreg WHERE commune.nomCommaj like 'M%' AND nomregmaj = 'OCCITANIE';

select * from table (dbms_xplan.display());

/* 2.4 */

select nomcommaj, codeinsee from commune, departement, region where commune.numdep = departement.numdep AND departement.numreg = region.numreg AND commune.codeinsee = departement.cheflieu AND commune.codeinsee = region.cheflieu; 