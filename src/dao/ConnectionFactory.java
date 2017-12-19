package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e){
			System.out.println(e.getMessage());
			throw new RuntimeException (e);
		}
	}

	public static Connection obterConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/servicedesk?user=root&password=root");
	}
	
	

}
