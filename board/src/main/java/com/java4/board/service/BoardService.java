package com.java4.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java4.User.dao.UserDAO;
import com.java4.User.domain.User;
import com.java4.board.dao.BoardDAO;
import com.java4.board.domain.Board;

@Service
public class BoardService {

	@Autowired
	BoardDAO boardDao;
	@Autowired
	UserDAO userDao;
	
	public void add(Board board,int userId) {
		boardDao.add(board);
	}
	public List<Board> getAll(){
		return boardDao.getAll();
	}
}
