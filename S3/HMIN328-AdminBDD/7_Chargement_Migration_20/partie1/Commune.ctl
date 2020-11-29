LOAD DATA 
CHARACTERSET UTF8
INFILE './tuples.csv'
INTO TABLE Population
FIELDS TERMINATED BY ',' trailing nullcols
(codeinsee  "to_char(:codeinsee)",
annee "to_number(:annee)",
val_population "to_number(:val_population)"
)

