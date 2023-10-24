package c231024.test.java.com.classjava.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class TransactionTest {

	public static void main(String[]args) throws SQLException {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		Connection conn = dataSource.getConnection();
		conn.setAutoCommit(false); // 자등으로 커밋되는것을 취소한다.
		
		try {
			PreparedStatement pstmt1 = conn.prepareStatement("");
			pstmt1.executeQuery(); // 성공
			PreparedStatement pstmt2 = conn.prepareStatement("");
			pstmt2.executeQuery(); // 실패
			conn.commit(); // auto Commit을 안할 경우 필수
		}catch(Exception e) {
			conn.rollback(); // 안될경우 되돌린다.
			throw e;
		}finally {
			conn.close();
		}
	}
}
