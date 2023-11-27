package com.java4.comment.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Comment {

	private int id;
	@NonNull
	private String content;
	private Timestamp createdAt;
	private boolean withdrew = false;
	private final int userId;
	private final int boardId;
	private int commentId;
}
