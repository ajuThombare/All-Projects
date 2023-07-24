package MySqlAssignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTransactions {

	public static void view(Connection con, String table) throws SQLException {
		// TODO Auto-generated method stub
		Statement statement = con.createStatement();
//		String st3 = "SELECT * FROM `jdbctest`.`" + table + "`";
		String st3 = "SELECT * FROM `jdbctest`.`student`";

		ResultSet rs = statement.executeQuery(st3);

		while (rs.next()) {
			System.out.println(rs.getRow() + ". id : " + rs.getString(1) + " Name : " + rs.getString(2));
		}
	}

	public static void delete(Connection con, int id) throws SQLException {
		// TODO Auto-generated method stub

		Statement statement = con.createStatement();
		String qr = "delete from `jdbctest`.`student` WHERE (`id` = '" + id + "')";
		try {
			int insert = statement.executeUpdate(qr);
			if (insert > 0) {
				System.out.println(insert + " record(s) Deleted.");
			} else {
				System.out.println("Record not Deleted.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void update(Connection con, String name, int id) throws SQLException {
		// TODO Auto-generated method stub

		Statement statement = con.createStatement();
		String qr = "UPDATE `jdbctest`.`student` SET `name` = '" + name + "' WHERE (`id` = '" + id + "')";
		try {
			int insert = statement.executeUpdate(qr);
			if (insert > 0) {
				System.out.println(insert + " record(s) updated.");
			} else {
				System.out.println("Record not updated.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void insert(Connection con, Student std) throws SQLException {
		// TODO Auto-generated method stub

		Statement statement = con.createStatement();
		String qr = "INSERT INTO `jdbctest`.`student` (`id`, `name`) VALUES ('" + std.getId() + "', '" + std.getName()
				+ "')";
		try {
			int insert = statement.executeUpdate(qr);
			if (insert > 0) {
				System.out.println(insert + " record(s) inserted.");
			} else {
				System.out.println("Record not inserted.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void createMethod(Connection con, String table) throws SQLException {
		// TODO Auto-generated method stub

		Statement statement = con.createStatement();
		String qr = "CREATE TABLE `jdbctest`.`" + table + "` (\r\n" + "  `id` INT NOT NULL,\r\n"
				+ "  `name` VARCHAR(45) NOT NULL,\r\n" + "  PRIMARY KEY (`id`));\r\n";
		try {
			if (!statement.execute(qr)) {
				System.out.println("Tabel is created.");
			} else {
				System.out.println("Tabel is not created.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void dropTabel(Connection con, String table) throws SQLException {
		// TODO Auto-generated method stub
		Statement statement = con.createStatement();
		String qr = "drop table `jdbctest`.`" + table + "`";
		try {
			if (!statement.execute(qr)) {
				System.out.println("Tabel is Deleted.");
			} else {
				System.out.println("Tabel is not Deleted.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
