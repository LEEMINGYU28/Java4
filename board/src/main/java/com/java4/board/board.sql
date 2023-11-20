create table boards(
  "id" number generated as identity primary key,
  "title" VARCHAR2(100) not null,
  "content" Long not null,
  "views" Number DEFAULT 0,
  "created_at" TIMESTAMP default current_timestamp,
  "is_withdrew" NUMBER(1),
  "user_id" NUMBER,
  constraint fk_user FOREIGN KEY ("user_id") REFERENCES users ("id") on delete set null
);