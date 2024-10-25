create table t1 (
  id bigint primary key,
  c1 text
);

create table t2 (
  if bigint primary key,
  c1 text,
  t1 bigint references t1(id) 
)
