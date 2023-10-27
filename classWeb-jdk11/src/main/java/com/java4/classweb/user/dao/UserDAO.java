package com.java4.classweb.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.java4.classweb.user.domain.User;

@Repository // ¿ÜºÎ IO(input/output)
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<User> mapper = new RowMapper<User>() {
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("Id"));
			user.setName(rs.getString("name"));
			user.setUserId(rs.getString("user_id"));
			user.setPassword(rs.getString("password"));
			return user;

		}
	
	};

	public void add(User user) {
		jdbcTemplate.update("insert into users (\"name\", \"user_id\", \"password\") values (?, ?, ?)", user.getName(),
				user.getUserId(), user.getPassword());
	}

	public User get(int id) {
		return jdbcTemplate.queryForObject("select * from users where \"id\"=?", new Object[] { id }, mapper);
	}

	public User get(String userId) {

		return jdbcTemplate.queryForObject("select * from users where \"user_id\"=?", new Object[] { userId }, mapper);
	}

	public void deleteAll() {
		jdbcTemplate.update("delete from users");
	}
}
