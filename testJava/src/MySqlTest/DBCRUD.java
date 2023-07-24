package MySqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCRUD {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
		if (!con.isClosed()) {
			Statement statement = con.createStatement();

//			// create table
//			String st = "		CREATE TABLE `jdbctest`.`publishers` (\r\n"
//					+ "				  `Pub_id` VARCHAR(5) NOT NULL,\r\n"
//					+ "				  `Pub_name` VARCHAR(45) NULL,\r\n" + "				  `Phone` INT NULL,\r\n"
//					+ "				  `Address` VARCHAR(45) NULL,\r\n" + "				  `city` VARCHAR(45) NULL,\r\n"
//					+ "				  `zip` VARCHAR(20) NULL,\r\n" + "				  PRIMARY KEY (`Pub_id`))";
//			statement.execute(st);

//			// add record to table
//			String st2 = "INSERT INTO `jdbctest`.`publishers` (`Pub_id`, `Pub_name`, `Phone`, `Address`, `city`, `zip`) VALUES ('1', 'New', '1234567890', 'City', 'New Orleans', '123456');";
//			int executeUpdate = statement.executeUpdate(st2);
//			System.out.println(executeUpdate);

//			// Select and print records from table
			String st3 = "SELECT * FROM `jdbctest`.`publishers`";
			ResultSet rs = statement.executeQuery(st3);
//			System.out.println();
			while (rs.next()) {
				System.out.println(rs.getRow() + ". Pub_id: " + rs.getString(1) + " Pub_name:" + rs.getString(2)
						+ " Phone :" + rs.getInt(3) + " Address :" + rs.getString(4) + " City :" + rs.getString(5)
						+ " ZIP :" + rs.getString(6));
			}

			// update record in db
//			st = "UPDATE `jdbctest`.`publishers` SET `Address` = 'new Updated City ' WHERE (`Pub_id` = '1')";
//			int executedUpdate = statement.executeUpdate(st);
//			System.out.println(executedUpdate);

			// delete form db
//			st = "DELETE FROM `jdbctest`.`publishers` WHERE (`Pub_id` = '1')";
//			int executeUpdated = statement.executeUpdate(st);
//			System.out.println(executeUpdated);
		}

		con.close();

	}

}
