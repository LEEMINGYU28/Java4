create table likes_and_hates(
  "id" number generated as identity primary key,
  "likes_or_hates" NUMBER(1),
  "user_id" NUMBER,
  "board_id" NUMBER,
  constraint fk_user_lah FOREIGN KEY ("user_id") REFERENCES users ("id"),
  constraint fk_board_lah FOREIGN KEY ("board_id") REFERENCES boards ("id")
);