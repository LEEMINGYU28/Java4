package c230926.board;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;
	
	private BoardDAO() {
		try {
			
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:/comp/env");
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			DataSource dataFactory = (DataSource) 
					envContext.lookup("jdbc/oracle");
			con = dataFactory.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
public ArrayList<BoardVO> boardList(){
		
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		
		String query = "select * from board order by bId DESC";
		// bId를 내림차순으로 정렬
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				
				
				list.add(new BoardVO(bId, bName, bTitle, bContent, bDate));
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			rs.close();
			pstmt.close();
			con.close();
			
		}
		
		
		return list;
	}
// 글 작성 후 데이터를 넣기
public int write(String bName, String bTitle, String bContent) throws Exception {
	int result = 0;
	
	String query = "insert into board(bId, bName, bTitle, bContent) "
			+ "values(board_seq.nextval, ?, ?, ?)";
	
	try {
		
		con = ds.getConnection();
		pstmt = con.prepareStatement(query);
		
		pstmt.setString(1, bName);
		pstmt.setString(2, bTitle);
		pstmt.setString(3, bContent);
		
		result = pstmt.executeUpdate();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		
		pstmt.close();
		con.close();
		
	}
	
	return result;
}
// 제목 클릭 시 해당 내용 보여주기
public BoardVO contentView(String strID) throws Exception {
	BoardVO vo = null;
	
	
	String query = "select * from board where bId = ?";
	
	try {
		
		con = ds.getConnection();
		pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, Integer.parseInt(strID));
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			
			int bId = rs.getInt("bId");
			String bName = rs.getString("bName");
			String bTitle = rs.getString("bTitle");
			String bContent = rs.getString("bContent");
			
			
			vo = new BoardVO(bId, bName, bTitle, bContent, null);
			
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		
		rs.close();
		pstmt.close();
		con.close();
		
	}
	
	return vo;
}
		

}
