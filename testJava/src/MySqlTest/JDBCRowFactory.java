package MySqlTest;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowFactory {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		RowSetFactory rsf = null;
		JdbcRowSet jrs = null;
		Class.forName("com.mysql.cj.jdbc.Driver");// loading driver
		rsf = RowSetProvider.newFactory();
		jrs = rsf.createJdbcRowSet();
		jrs.setUrl("jdbc:mysql://localhost:3306/jdbctest");
		jrs.setUsername("root");
		jrs.setPassword("root");
		jrs.setCommand("SELECT * FROM `jdbctest`.`publishers`");
		jrs.execute();
		while (jrs.next()) {
			System.out.println(jrs.getRow() + ". Pub_id: " + jrs.getString(1) + " Pub_name:" + jrs.getString(2)
					+ " Phone :" + jrs.getInt(3) + " Address :" + jrs.getString(4) + " City :" + jrs.getString(5)
					+ " ZIP :" + jrs.getString(6));
		}
	}
}
