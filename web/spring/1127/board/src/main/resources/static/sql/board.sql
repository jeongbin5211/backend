use koreaitdb;

create table temp(
id int not null auto_increment,
subject varchar(255),
grp int,
seq int,
depth int,
primary key(id)
);

insert into temp values(null, '1번째 게시물', 0, 0, 0);
insert into temp values(null, '2번째 게시물', 0, 0, 0);
insert into temp values(null, '3번째 게시물', 0, 0, 0);

select * from temp order by id desc;

insert into temp values(null, '[답글]2번째 게시물', 0, 0, 0);
select * from temp order by id desc;

insert into temp values(null, '[답글 답글]2번째 게시물', 0, 0, 0);
select * from temp order by id desc;

delete from temp;
select * from temp;

insert into temp values(null, '1번째 게시물', 1, 1, 1);
insert into temp values(null, '2번째 게시물', 2, 1, 1);
insert into temp values(null, '3번째 게시물', 3, 1, 1);

insert into temp values(null, '[철수 답글] 2번째 게시물', 2, 1, 2);

insert into temp values(null, '[영희 답글] 2번째 게시물', 2, 2, 2);

select * from temp order by id desc;

select * from temp order by grp desc;

insert into temp values(null, '[철수 답글에 대한 답글] 2번째 게시물', 2, 1, 3);

select * from temp order by grp desc;

select * from temp order by grp desc, seq asc;

insert into temp values(null, '[홍길동의 1번답글] 1번째 게시물', 1, 1, 2);
insert into temp values(null, '[코리아의 1번답글] 1번째 게시물', 1, 2, 2);

use koreaitdb;

create table board(
id int not null auto_increment,
subject varchar(255) not null,
writer varchar(10) not null,
content text,
visit int,
regdate date,
originalName varchar(255),
savedFileName varchar(255),
savedFilePathName varchar(255),
savedFileSize bigint,
grp int,
seq int,
depth int,
primary key(id)
);

drop table board;

create table board(
id int not null auto_increment,
subject varchar(255) not null,
writer varchar(10) not null,
content text,
visit int,
regdate date,
originalName varchar(255),
savedFileName varchar(255),
savedFilePathName varchar(255),
savedFileSize bigint,
folderName varchar(10),
grp int,
seq int,
depth int,
primary key(id)
);


drop table board;

create table board(
id int not null auto_increment,
subject varchar(255) not null,
writer varchar(10) not null,
content text,
visit int,
regdate date,
originalName varchar(255),
savedFileName varchar(255),
savedFilePathName varchar(255),
savedFileSize bigint,
folderName varchar(10),
ext varchar(20),
grp int,
seq int,
depth int,
primary key(id)
);


-- 검색 : 조건(where)
-- subject
select * from board where subject = '첨부파일 없는 게시물' order by id desc;

select * from board where writer = '관리자' order by id desc;

select * from board where content like '%d%' order by id desc;

-- service sout 이후 오류 확인
select * from board where subject = 'asd';
select * from board where writer = 'qlql';
