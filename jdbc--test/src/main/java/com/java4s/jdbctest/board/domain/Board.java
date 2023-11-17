package com.java4s.jdbctest.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//POJO
// 특정 규약에 종속되지 않는다. << 확실하게 정해진 규칙이 없다.
// 특정 환경에 종속되지 않는다. 
@Data
//@Getter
//@Setter
@AllArgsConstructor
@RequiredArgsConstructor //nonnull에 있어서 생성자 추가
@NoArgsConstructor // 빈 생성자를 만들때 사용
//@ToString //원하는 해당 내용을 확인 할 수 있다.
//@EqualsAndHashCode(exclude = {"id"}) //id는 빼교 비교해달라 
// 무언가 비교를 할 대 내부에 있는 내용과 비교해줌 메서드 오버라이딩해서 비교하기 쉽게 만들어준다.

public class Board {
//	@EqualsAndHashCode.Exclude id만 특정하게 빼서 비교
	private int id; // final을 해줘도 되지만 충돌이 날 수 있다.
	@NonNull
//	@EqualsAndHashCode.Include 포함시키겠다 user를
	private String user;
	@NonNull
	private String title;
	@NonNull
	private String content;

//	public Board() {
//
//	}
//
//	public Board(String user, String title, String content) {
//		this.user = user;
//		this.title = title;
//		this.content = content;
//	}
//
//	public Board(int id, String user, String title, String content) {
//		this.id = id;
//		this.user = user;
//		this.title = title;
//		this.content = content;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getUser() {
//		return user;
//	}
//
//	public void setUser(String user) {
//		this.user = user;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
}
