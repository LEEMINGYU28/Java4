create table likes_and_hates(
  "id" number generated as identity primary key,
  "user_id" NUMBER,
  "board_id" NUMBER,
  "likes_or_hates" NUMBER(1),
  "created_at" TIMESTAMP default sysdate,
  FOREIGN KEY ("user_id") REFERENCES users ("id"),
  FOREIGN KEY ("board_id") REFERENCES boards ("id")
);