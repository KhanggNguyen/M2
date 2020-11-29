ANALYZE TABLE Population COMPUTE STATISTICS;

select blocks, num_rows from user_tables where table_name = 'POPULATION';

