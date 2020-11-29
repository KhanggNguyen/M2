CREATE TABLE Population (
    codeinsee varchar(6) NOT NULL,
    annee integer NOT NULL,
    val_population integer,
    PRIMARY KEY (codeinsee, annee)
);