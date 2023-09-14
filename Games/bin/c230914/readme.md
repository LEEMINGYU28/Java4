# 오늘의 쿼리문

```sql
alter table student drop constraint fk_hobby_to_student;

drop table student_hobby;
drop table hobby;
drop table student;


create table student(
ids number(10,0) generated as identity CONSTRAINT pk_ids PRIMARY KEY,
name varchar2(10) NOT NULL,
student_id varchar2(10) not null unique,
student_pw varchar2(10) not null,
age number(3),
git_address varchar2(50)
--hobby_id number(10,0)
);

insert into student (name, student_id,student_pw,age,git_address)values('김동선','KDS','qwer',29,'https://github.com/KDS01');
insert into student (name, student_id,student_pw,age,git_address)values('이민규','qq752','1234',23,'https://github.com/LEEMINGYU28/Java4.git');
insert into student (name, student_id,student_pw,age,git_address)values('권원준','oooonx','may',22,'https://github.com/KWWWJ/just1.git');  
insert into student (name, student_id,student_pw,age,git_address)values('박정완','pjw','qwer',27,'https://github.com/pjw222');
insert into student (name, student_id,student_pw,age,git_address)values('한상윤','hsy','qwer1234',37,'https://github.com/Natseol');
insert into student (name, student_id,student_pw,age,git_address)values('임현규','TLM','486',27,'https://github.com/mabiTLM/Java4');  
insert into student (name, student_id,student_pw,age,git_address)values('김남균','knk','1234',27,'https://github.com/LiamKim-0218/HomeWork2');  
insert into student (name, student_id,student_pw,age,git_address)values('임주한','LJH','3232',32,'https://github.com/Juhan008/java-D');


create table hobby (
hobby_id number(10,0) generated as identity CONSTRAINT pk_hobby PRIMARY KEY,
name varchar2(10) NOT NULL,
explanation varchar2(200),
time_taken number(30, 0),
location varchar2(50),
created_at timestamp default to_char(sysdate,'yyyy/mm/dd hh24:mi:ss'),
student_ids number(10,0),
constraint fk_student_to_hobby foreign key (student_ids) references student (ids)
);

insert into hobby (name,explanation,time_taken,location,student_ids)values('게임','컴퓨터게임',7200000,'피시방or집',3);
insert into hobby (name,explanation,time_taken,location,student_ids)values('운동','헬스',3600000,'헬스장',2);
--alter table student add constraint fk_hobby_to_student foreign key (hobby_id) references hobby (hobby_id);

create table student_hobby(
hobby_id number(10,0),
student_ids number(10,0),
constraint fk_student_ids foreign key (student_ids) references student (ids),
constraint fk_hobby_id foreign key (hobby_id) references hobby (hobby_id)
);

insert into student_hobby values(1, 2);
insert into student_hobby values(1, 1);
insert into student_hobby values(1, 5);
insert into student_hobby values(1, 1);
insert into student_hobby values(2, 1);
insert into student_hobby values(2, 3);

select student.name as "학생", student.age as "나이", hobby.name as "취미" from student cross join hobby; --on student.ids = hobby.student_ids;

select student.name as "학생", hobby.name as "취미" from student_hobby
join student on student.ids = student_hobby.student_ids
join hobby on hobby.hobby_id = student_hobby.hobby_id;

-- 패키지.클래스(객체.키) 해당패키지에서 클래스를 가져온다.
-- DB(User).테이블.컬럼

select * from student where rownum <=4 and name like '김%'; --rownum 몇개까지 가져올것인지

```




