package MySqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");

		if (!con.isClosed()) {
			Statement statement = con.createStatement();
//			String str = "INSERT INTO `jdbctest`.`test1` (`id`) VALUES ('3')";
//			statement.executeUpdate(str);
			String st = "Select * from `jdbctest`.`test1`";
			ResultSet se = statement.executeQuery(st);
			while (se.next()) {
				System.out.println(se.getInt(1));
			}

		}

		con.close();
	}
}
