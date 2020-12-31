--Vous testerez les sequences  suivantes et vous expliquerez les effets obtenus

-- une seule session
-- SEQUENCE 1
set transaction read only;
-- la transaction ne prend en charge que des lectures
select * from cat;
update emp set fonction='commerciale' where fonction='commercial';
--> expliquer
-- maj les fonctions dans la table emp de commercial à commerciale
-- rollback annule ces actions
rollback;

--SEQUENCE 2
select * from emp;
set transaction read only;--ne permettra pas les actions update/delete/insert dans la table 
--> expliquer
rollback;

--SEQUENCE 3
select * from emp for update; --verouille les tuples pour la transaction
set transaction read only;
--> expliquer 
rollback;


--SEQUENCE 4
set transaction read only;
create table PrVoir (valeur integer primary key);
update emp set fonction='commerciale' where fonction='commercial';
rollback;
--> expliquer 
-- pas d'erreur
-- set mode transaction read only
-- create table lever la transaction read only -> transaction devient possible -> update pas erreur
-- rollback annule la transaction update

--SEQUENCE 5
insert into PrVoir values (1);
insert into PrVoir values (2);
insert into PrVoir values (3);
insert into PrVoir values (4);
insert into PrVoir values (5);
create table EncorePrVoir (valeur integer primary key);
rollback;
select * from PrVoir;
--> expliquer 
-- rollback annule la dernière transaction mais c'était une create table (qui implique une commit? après la creation) donc pas de roll back


--SEQUENCE 6
insert into PrVoir values (1);
insert into PrVoir values (2);
insert into PrVoir values (3);
insert into PrVoir values (4);
insert into PrVoir values (5);
create table EncorePrVoir (valeur integer primary key);
rollback;
select * from PrVoir;
--> expliquer

--SEQUENCE 7
delete from PrVoir;
create table CorePrVoir (valeur integer primary key);
insert into PrVoir values (1);
insert into PrVoir values (2);
insert into PrVoir values (3);
insert into PrVoir values (4);
insert into PrVoir values (5);
rollback; 
select * from PrVoir;
--> expliquer
--rollback a annulé les dernières transactions soit insert car ces transactions ne sont pas encore commit

--SEQUENCE 8
insert into PrVoir values (1);
create table CorePrVoir (valeur integer);--create table n'est pas executé
rollback;-- le create table a quand meme provoqué le commit ? pas rollback sur l'insertion possible
select * from PrVoir;
--> expliquer

--SEQUENCE 9
insert into PrVoir values (6);
create table EncorePrVoir (valeur integer primary key);
rollback;
select * from PrVoir;
--> expliquer
--meme explication sequence 8 

--SEQUENCE 10
insert into PrVoir values (7);
insert into PrVoir values (8);
alter table EncorePrVoir add definition varchar(10);--pas d'erreur
rollback;--pas annulation transaction car altertable a commit les insertions
select * from PrVoir;
--> expliquer


--SEQUENCE 11
insert into PrVoir values (9);
insert into PrVoir values (10);
drop table EncorePrVoir ;
rollback;
select * from PrVoir;
--> expliquer
--drop table commit aussi les insertions avant qu'elle 

--SEQUENCE 12
delete from PrVoir where valeur in (6,8);
update PrVoir set valeur=12 where valeur = 10;
insert into PrVoir values (14);
rollback;
select * from PrVoir;
--> expliquer
-- pas de changement car les delete/insert/update ont ete annule car pas de commit

-- deux sessions ouvertes par ex. user1/user1 et user2/user2 sur master (travaillez en binôme)

-- SEQUENCE 13 - visualisation des transactions seulement quand elles sont validees
-- sur user2
donner tous les droits a user1 sur la table emp

--sur user2
insérer un tuple dans la table emp (de user2) d''un nouvel employé de numéro 101

-- sur user1
consulter la table user2.emp 
constatation ?

-- sur user2 
constatation ?
puis valider la transaction par
commit;
-- sur user1
consulter la table user2.emp 

--> constatation ? 

-- sur user2 
-- mettre à jour le tuple de num 101
update emp set salaire =1000 where num=101;

-- sur user1
-- essayer de mettre à jour le même tuple
update user2.emp set salaire =2000 where num=101;
--> constatation ? 

-- user2 
-- sur user2 
valider la transaction
-- sur user1
--> constatation ? 


-- SEQUENCE 14
-- sur user2
donner tous les droits a user1 sur la table emp
-- sur user1
set transaction isolation level serializable;
--sur user2
insérer un tuple de num 102 dans la table emp (de user2)
-- sur user1
consulter la table user2.emp 
constatation ?
-- sur user2 
valider la transaction
-- sur user1
consulter la table user2.emp 
constatation ? quel aurait été le résultat avec un mode transactionnel read committed ?

-- sur user2 
-- mettre à jour un tuple 
update emp set salaire =1000 where num=12;

-- sur user1
-- essayer de mettre à jour le même tuple
update user2.emp set salaire =2000 where num=12;
constatation ? 

-- sur user2 
valider la transaction
-- sur user1
constatation ? quel aurait été le résultat avec un mode transactionnel read committed ?


-- SEQUENCE 15
-- interblocage
-- deux sessions ouvertes en mode read committed
-- sur user2 
-- mettre à jour un tuple 
update emp set salaire =4000 where num=102;

-- sur user1
-- essayer de mettre à jour un autre tuple
update user2.emp set salaire =6000 where num=101;

-- sur user2 
-- mettre à jour le tuple verrouillé par user 1 
update emp set salaire =4000 where num=101;

-- sur user1
-- mettre à jour le tuple verrouillé par user 2
update user2.emp set salaire =6000 where num=102;

constatation ? comment sortir de l''interblocage et quelle est l''information perdue
quel aurait été le résultat avec un mode transactionnel serializable ?

