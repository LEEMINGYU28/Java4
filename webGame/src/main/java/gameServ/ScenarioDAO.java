package gameServ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ScenarioDAO {
	
	
	public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521/xe";
        String user = "gyu"; 
        String password = "1234"; 

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            
            return null;
        }
    }
}