package c231017.test.user;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import c231017.user.UserBean;

public class TestUserDAO {

	private JdbcTemplate jdbcTemplate;

	public TestUserDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void drop() {
		jdbcTemplate.execute("BEGIN\r\n" 
				+ "   EXECUTE IMMEDIATE 'DROP TABLE users';\r\n" 
				+ "EXCEPTION\r\n"
				+ "   WHEN OTHERS THEN\r\n" 
				+ "      IF SQLCODE != -942 THEN\r\n" 
				+ "         RAISE;\r\n"
				+ "      END IF;\r\n" + "END;");
	}

	public void create() throws Exception { // 회피
		int maxCount = 3;
		while(maxCount-- > 0) {
			try { //복구
			jdbcTemplate.execute("create table users (\r\n" 
					+ "	id number generated as identity primary key,\r\n"
					+ "	name varchar2(20),\r\n" 
					+ "	user_id varchar2(50) not null unique,\r\n"
					+ "	password varchar2(64) not null\r\n" 
					+ ")");
			return;
			} catch (Exception e) {
				System.out.println(maxCount + "번 남았다.");
//			e.printStackTrace();
			}
		}
		throw new Exception("table 생성 실패"); //예외전환
	}

}
