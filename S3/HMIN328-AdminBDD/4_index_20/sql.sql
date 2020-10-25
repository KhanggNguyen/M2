SELECT * from ABC where rownum < 100;

analyze table ABC compute statistics;

select blocks, empty_blocks, avg_row_len, num_rows from user_tables where table_name = 'ABC';

analyze index abc_pk validate structure;

select height, lf_rows, br_rows, lf_blks, br_blks from index_stats;

select user_segments where segment_name like 'ABC%';

col segment_name for a20;
col segment_type for a20;
select segment_name, segment_type, byte/1024/1024 enMo, blocks from user_segments where segment_name like 'ABC%';

desc user_extents;

select segment_name, count(extent_id) from user_segments where segment_name like 'ABC%' group by segment_name;

