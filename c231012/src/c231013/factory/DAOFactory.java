package c231013.factory;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import c231012.connectionMaker.ConnectionMaker;
import c231012.connectionMaker.OracleCM;
import c231013.user.UserDAO;

public class DAOFactory {

	@Bean
	public UserDAO userDAO() {
		return new UserDAO(dataSource());
//		if (USERDAOINSTANCE == null)
//			USERDAOINSTANCE = new UserDAO(connectionMaker());
//		return USERDAOINSTANCE;
	}

	@Bean
	public ConnectionMaker connectionMaker() {
//		if (CONNECTIONMAKERINSTANCE == null)
//			CONNECTIONMAKERINSTANCE = new OracleCM();
		return new OracleCM();
	}
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriverClass(oracle.jdbc.OracleDriver.class);
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		dataSource.setUsername("gyu"); //username
		dataSource.setPassword("1234"); //password
		
		return dataSource;
	}
}
