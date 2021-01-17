create table departement as select * from
p00000009432.departement;

create table region as select * from
p00000009432.region;

alter table departement add constraint dept_pk
primary key (numDep);


alter table region add constraint reg_pk
primary key (numRep);


alter table departement add constraint dept_fk
foreign key (numReg) references Region(numReg);


alter table commune add constraint com_fk
foreign key (numDep) references Departement(numDep);

-Exercice 1

explain plan for select nomcommaj, latitude, longitude, numdep from Commune
where nomCommaj like 'M%' and numDep in ('30','34');
select * from table(dbms_xplan.display());


explain plan for
select nomcommaj, latitude, longitude, numdep from Commune
where nomCommaj like 'M%' and (numDep ='30' or numDep ='34');
select * from table(dbms_xplan.display());

explain plan for  select nomcommaj, latitude, longitude, numdep from Commune
where nomCommaj like 'M%' and numDep ='30' 
union
select nomcommaj, latitude, longitude, numdep from Commune
where nomCommaj like 'M%' and numDep ='34';
select * from table(dbms_xplan.display());

-Exercice 2

question 1.
-- SQL 89
explain plan for  select nomcommaj, c.numdep from departement d, commune c 
where c.numdep = d.numdep and nomdepmaj = 'AVEYRON';
select * from table(dbms_xplan.display());

-- SQL 92 écriture plus efficace ? non plan identique (même identifiant)
explain plan for  select nomcommaj, c.numdep from departement d join commune c 
on c.numdep = d.numdep where nomdepmaj = 'AVEYRON';
select * from table(dbms_xplan.display());



-- directive pour avoir commune comme table directrice et boucles imbriquees pour la 
-- jointure
explain plan for  select /*+ leading(c) use_nl(c d) */ nomcommaj, c.numdep from commune c, departement d 
where c.numdep = d.numdep and nomdepmaj = 'AVEYRON';
select * from table(dbms_xplan.display());

select column_name,num_distinct,density,num_nulls from user_tab_col_statistics  
where table_name = 'COMMUNE';

explain plan for  select nomcommaj, d.numdep from commune c, departement d
where c.numdep = d.numdep and nomdepmaj = 'AVEYRON';
select * from table(dbms_xplan.display());

-- question 2 - la question 1 peut être traitée sous forme de semi-jointure puisque
-- seuls des attributs de commune sont retournés
 
explain plan for  select  nomcommaj, numdep from commune where numdep in (select numdep from departement
where nomdepmaj = 'AVEYRON');
select * from table(dbms_xplan.display());

-- on est dans un cas particulier : un seul tuple retourné par la sous-requête
select  nomcommaj, numdep from commune where numdep = (select numdep from departement
where nomdepmaj = 'AVEYRON');

explain plan for  select  nomcommaj, numdep from commune c where exists (select * from departement d
where d.numdep = c.numdep and nomdepmaj = 'AVEYRON');
select * from table(dbms_xplan.display());

-- les opérateurs dédiés à la semi-jointure n'ont pas été choisis par l'optimiseur
-- en raison du plan d'exécution déjà optimisé pour la jointure de la question 1

Exercice 3-
-- Traitement via des semi-jointures
-- test appartenance
explain plan for  select nomcommaj, latitude, longitude from commune where nomcommaj like 'M%' and
numdep in ( select numdep from departement where numreg in (select numreg from region
where nomregmaj = 'OCCITANIE'));
select * from table(dbms_xplan.display());

-- test exists
explain plan for  select nomcommaj, latitude, longitude from commune c where nomcommaj like 'M%' and
exists ( select * from departement d where  d.numdep = c.numdep and exists (select * 
from region r where d.numreg=r.numreg and nomregmaj = 'OCCITANIE'));
select * from table(dbms_xplan.display());

-- traitement avec une jointure

explain plan for  select nomcommaj, latitude, longitude from commune c, departement d, region r 
where nomcommaj like 'M%' and nomregmaj = 'OCCITANIE' and c.numdep = d.numdep and 
r.numreg = d.numreg;
select * from table(dbms_xplan.display());

create index numD_idx on commune(numdep);

create index numR_idx on departement(numreg);


-- pour cette requête (non équivalente avec les précédentes)  on utilise les index unique et non uniques

select nomcommaj, latitude, longitude from commune c, departement d, region r 
where r.numreg = 76 and c.numdep = d.numdep and d.numdep = '34' and 
r.numreg = d.numreg;









