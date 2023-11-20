create table users(
  "id" number generated as identity primary key,
  "user_id" VARCHAR2(50) not null unique,
  "password" VARCHAR2(64) not null,
  "name" VARCHAR2(15) not null,
  "phone" VARCHAR2(14) not null,  
  "address" VARCHAR2(100),
  "email" VARCHAR2(100) not null unique,
  "git_address" VARCHAR2(100),
  "gender" NUMBER(1),
  "birth" DATE,
  "created_at" TIMESTAMP default current_timestamp
);