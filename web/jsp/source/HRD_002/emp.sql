create table buseo(
buseo_code varchar2(3) not null,
buseo_name varchar2(20) not null,
primary key(buseo_code)
);

insert into buseo values('100', '인사과');
insert into buseo values('200', '자재과');
insert into buseo values('300', '비서실');
insert into buseo values('900', '임원실');

create sequence emp_seq start with 100001 increment by 1 nocycle;

create table employees(
emp_id number(6) not null,
emp_name varchar2(20) not null,
emp_email varchar2(100) not null,
emp_addr varchar2(100) not null,
buseo_code varchar2(3) not null,
primary key(emp_id),
foreign key(buseo_code) references buseo(buseo_code) 
on delete cascade
);

insert into employees values(emp_seq.nextval, '홍길동', 'email@email.com', '부산광역시 부산진구', '100');

commit;

select B.buseo_name, B.buseo_code, count(emp_id) as cnt from buseo B left join employees E on B.buseo_code = E.buseo_code
group by B.buseo_name, B.buseo_code;
