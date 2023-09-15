package c230915;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", 
					"system", "1234");
		
//			String query1 ="update student set student_id ='qq752' where id = 1";
//			Statement stmt1 = con.createStatement(); 
//			ResultSet rs1 =stmt1.executeQuery(query1); 
			
//		String insertQuery = "insert into student(name,student_id,student_pw,age,git_address) values (?,?,?,?,?)";
//			PreparedStatement pstmt = con.prepareStatement(insertQuery);
//			pstmt.setString(1,"송성민2");
//			pstmt.setString(2,"system1");
//			pstmt.setString(3,"03282");
//			pstmt.setInt(4,23);
//			pstmt.setString(5,"송성민1");
//			pstmt.executeUpdate();
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println("지우고싶은 번호 입력");
			String deleteQuery = "delete from student where ids ="+number;
			Statement stmt1 = con.createStatement();
			stmt1.executeUpdate(deleteQuery);
			
			
			
			String query ="select * from student";
			Statement stmt = con.createStatement(); //요청후 상태를 체크해주고 정보를 저장해줌
			ResultSet rs =stmt.executeQuery(query); //execute = 실행 Query를 붙여서 확실하게 query를 실행해달라.
//			while(rs.next()) {
//				System.out.println(rs.getString("name")+ " : "+ rs.getInt("age"));
//			}
//			rs.next();
//			System.out.println(rs.getString("name"));
			
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		} 
	}
}