package c231024.main.java.com.classjava.board.service;

import java.util.List;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import c231024.main.java.com.classjava.board.domain.Board;
import c231024.main.java.com.classjava.user.domain.User;

public class BoardServiceTx implements BoardService {

	private BoardServiceImpl boardService;

	private PlatformTransactionManager transactionManager;

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void setBoardService(BoardServiceImpl boardService) {
		this.boardService = boardService;

	}

	public void add(Board board, int userId) {
		boardService.add(board, userId);
	}

	public Board get(int id) {
		return boardService.get(id);
	}

	public List<Board> getAll() {
		return boardService.getAll();
	}

	public void update(Board board, User user) {

		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
		try {
			boardService.update(board, user);
			transactionManager.commit(status);
		} catch (Exception e) {

			transactionManager.rollback(status);
			throw e;
		}
	}

	public void updateAll(User user) {

		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());

		try {
			boardService.updateAll(user);
			transactionManager.commit(status);
		} catch (Exception e) {

			transactionManager.rollback(status);
			throw e;
		}

	}

}
