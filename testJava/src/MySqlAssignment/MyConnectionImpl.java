package MySqlAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionImpl {
	static Connection con = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (con == null || con.isClosed()) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
		}
		return con;
	}
}
