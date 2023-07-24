package MySqlAssignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatmTransactions {

	public static void view(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stm = con.prepareStatement("SELECT * FROM `jdbctest`.`customer`");
		ResultSet rs = stm.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getRow() + ". id : " + rs.getString(1) + " Name : " + rs.getString(2));
		}
	}

	public static void delete(Connection con, int id) throws SQLException {
		// TODO Auto-generated method stub

		try {
			PreparedStatement stm = con.prepareStatement("delete from `jdbctest`.`customer` WHERE (`id` = ?)");
			stm.setInt(1, id);
			int delte = stm.executeUpdate();
			if (delte > 0) {
				System.out.println("Record deleted");
			} else
				System.out.println("Record is not deleted.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void update(Connection con, String name, int id) throws SQLException {
		// TODO Auto-generated method stub

		try {
			PreparedStatement stm = con
					.prepareStatement("UPDATE `jdbctest`.`customer` SET `name` = ? WHERE (`id` = ?)");
			stm.setString(1, name);
			stm.setInt(2, id);
			int executeUpdate = stm.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("record(s) updated.");
			} else {
				System.out.println("Record not updated.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void insert(Connection con, Customer std) throws SQLException {
		// TODO Auto-generated method stub

		try {
			PreparedStatement stm = con
					.prepareStatement("INSERT INTO `jdbctest`.`customer` (`id`, `name`) VALUES (?, ?)");
			stm.setInt(1, std.getId());
			stm.setString(2, std.getName());

			if (!stm.execute())
				System.out.println("Record inserted");
			else
				System.out.println("Record is not inserted.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
