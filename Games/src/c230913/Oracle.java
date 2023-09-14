package c230913;

public class Oracle {


create table student(
ids number(10,0) CONSTRAINT pk_ids PRIMARY KEY,
name varchar2(10) NOT NULL,
student_id varchar2(10),
student_password varchar2(10),
age number(10,0),
git_address varchar2(50)
);

insert into student values(1,'김동선','KDS','qwer',29,'https://github.com/KDS01');
insert into student values(2,'이민규','qq752','1234',23,'https://github.com/LEEMINGYU28/Java4.git');
insert into student values(3, '권원준', 'oooonx', 'may', 22,'https://github.com/KWWWJ/just1.git');  
insert into student values(4, '박정완', 'pjw', 'qwer', 27, 'https://github.com/pjw222');
insert into student values(5,'한상윤','hsy','qwer1234',37,'https://github.com/Natseol');
insert into student values(6,'임현규','TLM','486',27,'https://github.com/mabiTLM/Java4');  
insert into student values(7,'김남균','knk','1234',27,'https://github.com/LiamKim-0218/HomeWork2');  
insert into student values(8,'임주한','LJH','3232',32,'https://github.com/Juhan008/java-D');  
 
commit;

이름순으로 출력

select * from student order by name asc ;
 
       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 권원준               oooonx               may
        22
https://github.com/KWWWJ/just1.git

         7 김남균               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         1 김동선               KDS                  qwer
        29
https://github.com/KDS01

         4 박정완               pjw                  qwer
        27

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/pjw222

         2 이민규               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git

         8 임주한               LJH                  3232

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        32
https://github.com/Juhan008/java-D

         6 임현규               TLM                  486
        27
https://github.com/mabiTLM/Java4


       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 한상윤               hsy                  qwer1234
        37
https://github.com/Natseol         
           
나이순 출력

select * from student order by age desc ; 많은순
  

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 한상윤               hsy                  qwer1234
        37
https://github.com/Natseol

         8 임주한               LJH                  3232
        32
https://github.com/Juhan008/java-D

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         1 김동선               KDS                  qwer
        29
https://github.com/KDS01

         4 박정완               pjw                  qwer
        27

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/pjw222

         7 김남균               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

         6 임현규               TLM                  486

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        27
https://github.com/mabiTLM/Java4

         2 이민규               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git


       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 권원준               oooonx               may
        22
https://github.com/KWWWJ/just1.git


나이 어린순 출력 
select * from student order by age asc ;


       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 권원준               oooonx               may
        22
https://github.com/KWWWJ/just1.git

         2 이민규               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         4 박정완               pjw                  qwer
        27
https://github.com/pjw222

         7 김남균               knk                  1234
        27

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/LiamKim-0218/HomeWork2

         6 임현규               TLM                  486
        27
https://github.com/mabiTLM/Java4

         1 김동선               KDS                  qwer

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        29
https://github.com/KDS01

         8 임주한               LJH                  3232
        32
https://github.com/Juhan008/java-D


       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 한상윤               hsy                  qwer1234
        37
https://github.com/Natseol
  
 김씨 출력
 select * from student where name like '김%';
 
        IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         1 김동선               KDS                  qwer
        29
https://github.com/KDS01

         7 김남균               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

       IDS NAME                 STUDENT_ID           STUDENT_PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
 
취미 테이블 생성
 
create table hobby (
hobby_id number(10,0) CONSTRAINT pk_hobby PRIMARY KEY,
name varchar2(10) NOT NULL,
explanation varchar2(50),
time_taken varchar2(50),
location varchar2(50),
created_at timestamp default to_char(sysdate,'yyyy/mm/dd hh24:mi:ss')
);
 
insert into hobby 
(hobby_id,
name,
explanation,
time_taken,
location)
values(1,'게임','컴퓨터게임','2시간','피시방or집');

commit;
 
insert into hobby
(hobby_id,
name,
explanation,
time_taken,
location)
values(2,'운동','헬스','1시간','헬스장');

commit;
 
}
