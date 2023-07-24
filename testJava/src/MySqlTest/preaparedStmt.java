package MySqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preaparedStmt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
		PreparedStatement stm = con.prepareStatement("SELECT * FROM `jdbctest`.`publishers` where pub_id = ? ");
		stm.setString(1, "1");
		ResultSet rs = stm.executeQuery();
//		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getRow() + ". Pub_id: " + rs.getString(1) + " Pub_name:" + rs.getString(2)
					+ " Phone :" + rs.getInt(3) + " Address :" + rs.getString(4) + " City :" + rs.getString(5)
					+ " ZIP :" + rs.getString(6));
		}
		con.close();
	}
}
