package com.java4.board.domain;

import java.util.Date;
import java.util.Locale.Category;

import com.java4.User.domain.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Board {

	
	private int id;
	private String title;
	private String content;
	private int views;
	private int likes;
	private int hates;
	private Date createdAt;
	private User writer;
	private Category category;
	private boolean isWithdrew;
	
}
