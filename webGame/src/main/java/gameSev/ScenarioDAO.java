package gameSev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ScenarioDAO {
	public List<ScenarioVO> getDataByNum(int id) throws Exception {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		List<ScenarioVO> vo_list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query_sql = "select id as 번호";
		query_sql += ", category as 스토리";
		query_sql += ", content as 내용";
		query_sql += "from scenario";
		query_sql += "where id = ?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "gyu", "1234");
			pstmt = conn.prepareStatement(query_sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScenarioVO vo = new ScenarioVO(id, query_sql, query_sql);

				vo.setId(rs.getInt(1));
				vo.setCategory(rs.getString(2));
				vo.setContent(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo_list;
	}
}