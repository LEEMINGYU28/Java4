package c231012.connectionMaker;

import java.sql.Connection;

public interface ConnectionMaker {

	public Connection makeConnection() throws Exception;

}
