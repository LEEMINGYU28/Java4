package c231016.factory;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import c231013.user.UserDAO;
import c231016.user.JdbcContextUserDAO;

public class DAOFactory {

	@Bean
	public UserDAO userDAO() {
		return new UserDAO(dataSource());
	}

	@Bean
	public JdbcContextUserDAO jdbcContextUserDAO() {
		return new JdbcContextUserDAO(dataSource());
	}
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

		dataSource.setDriverClass(oracle.jdbc.OracleDriver.class);
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		dataSource.setUsername("gyu"); // username
		dataSource.setPassword("1234"); // password

		return dataSource;
	}
}
