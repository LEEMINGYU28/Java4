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
				+ "      END IF;\r\n"
				+ "END;");
	}
	public void create() {
		jdbcTemplate.execute("create table users (\r\n"
				+ "	id number generated as identity primary key,\r\n"
				+ "	name varchar2(20),\r\n"
				+ "	user_id varchar2(50) not null,\r\n"
				+ "	password varchar2(64) not null\r\n"
				+ ")");
		
	}


}
