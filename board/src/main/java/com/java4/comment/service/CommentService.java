package com.java4.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java4.comment.dao.CommentDAO;
import com.java4.comment.domain.Comment;

@Service
public class CommentService {

	@Autowired
	CommentDAO commentDao;
	
	public void add(Comment comment) {
		commentDao.add(comment);
	}
	public List<Comment> getComments(int boardId,int start){
		List<Comment> list = commentDao.getParent(boardId, start);
//		for(int i = 0; i<list.size(); ++i) {
//			list.get(i).getId();
//			list.get(i).setChildren(
//					commentDao.getChildren(
//							boardId, list.get(i).getId()));
//		}
		list.forEach((item)->{
			item.setChildren(getChildren(boardId,item));
		});
		return list;
	}
	
	private List<Comment> getChildren(int boardId,Comment comment){
		List<Comment> list = commentDao.getChildren(boardId,comment.getId());
		list.forEach((item)->{
			item.setChildren(getChildren(boardId,item));
		});
		return list;
	}
	public int getCountInBoard(int boardId) {
		return commentDao.getCountInBoard(boardId);
	}
}
