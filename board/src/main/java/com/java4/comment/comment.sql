create table comments (
"id" number generated as identity primary key,
"content" long not null,
"created_at" TIMESTAMP DEFAULT current_timestamp,
"is_withdrew" number(1) default 0,
"user_id" number not null,
"board_id" number not null,
"comment_id" number,
constraint fk_users_to_comments FOREIGN key ("user_id") REFERENCES users("id"),
constraint fk_boards_to_comments FOREIGN key ("board_id") REFERENCES boards("id"),
constraint fk_comments_to_comments FOREIGN key ("comment_id") REFERENCES comments("id")
);