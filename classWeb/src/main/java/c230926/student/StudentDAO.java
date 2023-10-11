package c230926.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class StudentDAO {
	private Connection con;

	public List<StudentVO> getList() {
		List<StudentVO> list = new ArrayList<StudentVO>();
		try {
			connect();

			// 요청보내서 데이터를 받아오는 공간
			// 연결해두는건 메서드 호출하면서 끝
			// 쿼리문은 그때그때 따로따로 받아야함.
			// 받아오는 데이터가 다를 수 밖에없음.
			String query = "select * from student";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				StudentVO temp = new StudentVO(rs.getInt("ids"), rs.getString("name"), rs.getString("student_id"),
						rs.getString("student_pw"), rs.getInt("age"), rs.getString("git_address"));
				list.add(temp);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public StudentVO getStudent(String studentId) {
		StudentVO temp = null;
		try {
			connect();

			String query = "select * from student where student_id=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, studentId);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				temp = new StudentVO(rs.getInt("ids"), rs.getString("name"), rs.getString("student_id"),
						rs.getString("student_pw"), rs.getInt("age"), rs.getString("git_address"));

				rs.close();
				pstmt.close();
				con.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;

	}

	public StudentVO getStudent(int Id) {
		StudentVO temp = null;
		try {
			connect();

			String query = "select * from student where ids=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Id);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				temp = new StudentVO(rs.getInt("ids"), rs.getString("name"), rs.getString("student_id"),
						rs.getString("student_pw"), rs.getInt("age"), rs.getString("git_address"));

				rs.close();
				pstmt.close();
				con.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;

	}

	private void connect() throws Exception {
		/*
		 * Class.forName("oracle.jdbc.OracleDriver");
		 * 
		 * con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521/xe",
		 * "system", "1234");
		 */
		// 모듈화 시켜서 바로 쓸 수 있게
		Context ctx = new InitialContext();
		// DriverManeger > DM
		// initialize
		Context envContext = (Context) ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		con = dataFactory.getConnection();
	}

}
