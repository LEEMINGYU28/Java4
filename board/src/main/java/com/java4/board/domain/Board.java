package com.java4.board.domain;

import java.sql.Timestamp;

import org.springframework.stereotype.Controller;

import com.java4.User.domain.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Controller
public class Board {
	
	private int id;
	private User user;
	@NonNull
	private String title;
	@NonNull
	private String content;
	private int views = 0;
	private int likes = 0;
	private int hates = 0;
	private Timestamp createdAt;
	private boolean isWithdrew = false;
	@NonNull
	private int userId;
//	private Category category;
	
	public Board() {
		
	}
	public Board(User user, String title, String content) {
		this.user = user;
		this.title = title;
		this.content = content;
	}
}
