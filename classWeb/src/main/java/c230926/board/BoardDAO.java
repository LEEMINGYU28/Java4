package c230926.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import c230926.boardSev.Board;

public class BoardDAO {
	private DataSource ds;

	public BoardDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BoardVO> boardList() {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		String query = "SELECT * FROM board ORDER BY bId DESC";

		try (Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				list.add(new BoardVO(bId, bName, bTitle, bContent, null));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public int write(String bName, String bTitle, String bContent) {
		int result = 0;
		String query = "INSERT INTO board (bId, bName, bTitle, bContent) VALUES (board_seq.nextval, ?, ?, ?)";

		try (Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {

			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public BoardVO contentView(String strID) {
		BoardVO vo = null;
		String query = "SELECT * FROM board WHERE bId = ?";

		try (Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {

			pstmt.setInt(1, Integer.parseInt(strID));
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int bId = rs.getInt("bId");
					String bName = rs.getString("bName");
					String bTitle = rs.getString("bTitle");
					String bContent = rs.getString("bContent");
					vo = new BoardVO(bId, bName, bTitle, bContent, null);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}

	public int modify(String strID, String bName, String bTitle, String bContent) {
		int result = 0;
		String query = "UPDATE board SET bName = ?, bTitle = ?, bContent = ? WHERE bId = ?";

		try (Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {

			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			pstmt.setInt(4, Integer.parseInt(strID));

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public int delete(int bId) {
		int result = 0;
		String query = "DELETE FROM board WHERE bId = ?";

		try (Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {

			pstmt.setInt(1, (bId));
			result = pstmt.executeUpdate();

			if (result > 0) {

				ArrayList<BoardVO> list = new ArrayList<BoardVO>();
				for (BoardVO board : list) {
					if (board.getbId() == bId) {
						list.remove(board);
						break; // 삭제를 찾았으므로 루프 종료
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public BoardVO getBoardById(int bId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateBoard(String bId, String bTitle, String bContent) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			String sql = "UPDATE board SET bTitle=?, bContent=? WHERE bId=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bTitle);
			pstmt.setString(2, bContent);
			pstmt.setNString(3, bId);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, null);
		}

		return false;
	}

	private void close(Connection conn, PreparedStatement pstmt, Object object) {
		// TODO Auto-generated method stub

	}

	private Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
