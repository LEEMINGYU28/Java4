package c231024.main.java.com.classjava.board.service;

import java.util.List;

import c231024.main.java.com.classjava.board.dao.BoardDAO;
import c231024.main.java.com.classjava.board.domain.Board;
import c231024.main.java.com.classjava.user.dao.UserDAO;
import c231024.main.java.com.classjava.user.domain.User;
import c231024.main.java.com.classjava.user.service.UserService;

public class BoardServiceImpl implements BoardService {

	private UserDAO userDAO;
	private BoardDAO boardDAO;
	private UserService userService;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void add(Board board,int userId) {
		if(userService.isLogIn(userId)) boardDAO.add(board);
		else new RuntimeException("로그인 해주세요.");
		}

	public Board get(int id) {
		Board board = boardDAO.get(id);
		User user = userDAO.get(board.getUserId());
		board.setUser(user);

		return board;
	}

	public List<Board> getAll() {
		List<Board> list = boardDAO.getAll();
		for (int i = 0; i < list.size(); i++) {
			int userId = list.get(i).getUserId();
			User user = userDAO.get(userId);
			list.get(i).setUser(user);
		}
		return list;
	}

//	public void update(Board board, User user) throws Exception {
//
//		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
//		try {
//			updateInner
//			transactionManager.commit(status);
//		} catch (Exception e) {
//
//			transactionManager.rollback(status);
//			throw e;
//		}
//	}

	public void update(Board board, User user) {
		User writer = board.getUser();
		if (writer.getId() == user.getId()) {
			boardDAO.update(board);
		} else {
			throw new RuntimeException("wrong user");
		}
	}

	public void updateAllNotTS(User user) throws Exception {
		try {
			List<Board> list = getAll();

			for (int i = 0; i < list.size(); i++) {
				if (i == 2)
					user = new User("김남균", "knk", "1234");

				Board board = list.get(i);
				list.get(i).setContent("삭제된 컨텐츠");
				User writer = board.getUser();
				if (writer.getId() == user.getId()) {
					boardDAO.update(board);
				} else {
					throw new Exception("wrong user");
				}
			}
		} catch (Exception e) {

			throw e;
		}
	}
//
//	public void updateAll(User user) throws Exception {
//
//		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
//		// 트랜젝션을 설정하는 코드 로직적 처리가 들어감
//		try {
//			List<Board> list = getAll();
//
//			for (int i = 0; i < list.size(); i++) {
//			}
//			transactionManager.commit(status);
//		} catch (Exception e) {
//
//			transactionManager.rollback(status);
//			throw e;
//		}
//	}

	public void updateAll(User user) {
		List<Board> list = getAll();

		for (int i = 0; i < list.size(); i++) {
//			if (i == 2)
//				user = new User("김남균", "knk", "1234");

			Board board = list.get(i);
			list.get(i).setContent("삭제된 컨텐츠");
			User writer = board.getUser();
			if (writer.getId() == user.getId()) {
				boardDAO.update(board);
			} else {
				throw new RuntimeException("wrong user");
			}
		}
	}

}