create table boards(
  "id" number generated as identity primary key,
  "user_id" NUMBER,
  "title" VARCHAR2(100) not null,
  "content" Long not null,
  "views" Number DEFAULT(0),
  "created_at" TIMESTAMP default sysdate,
  "is_withdrew" NUMBER(1),
  FOREIGN KEY ("user_id") REFERENCES users ("id")
);