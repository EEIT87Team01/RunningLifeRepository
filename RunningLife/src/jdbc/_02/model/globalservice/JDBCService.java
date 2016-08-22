package jdbc._02.model.globalservice;

import java.sql.*;

public class JDBCService {
	
	private Connection con = null;
	String conUrl = "jdbc:sqlserver://localhost:1433;databaseName=project_friend;user=sa;password=2486555;";
	
	private void connect() throws ClassNotFoundException, SQLException{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(conUrl);
	}
	
	public PreparedStatement getPStmt(String query) throws ClassNotFoundException, SQLException{
		connect();
		return con.prepareStatement(query);
	}
	
	public void close() throws SQLException{
		con.close();
	}
	
	public Connection getCon(){
		return con;
	}

}
