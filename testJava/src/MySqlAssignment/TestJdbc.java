package MySqlAssignment;

//first create 2 tabels customer and student
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = MyConnectionImpl.getConnection();
//		System.out.println(!connection.isClosed());

		boolean mainFlag = true;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Welcome Choose the Option: ");
			System.out.println("1. Use Statement");
			System.out.println("2. Use Preparedstatement");
			System.out.println("3. Exit.");

			int mainOption = sc.nextInt();
			switch (mainOption) {

			case 1:
				boolean createFlag = true;
				do {
					System.out.println("1. Create Table.");
					System.out.println("2. Delete Table.");
					System.out.println("3. Insert into table.");
					System.out.println("4. Update record in table.");
					System.out.println("5. Delete record from table.");
					System.out.println("6. View All record from table.");

					int option1 = sc.nextInt();
					int ids = 0;
					String name = null;
					if (option1 == 1) {
						System.out.println("Enter Table name to Create: ");
						name = sc.next();
					} else if (option1 == 2) {
						System.out.println("Enter Table name to Delete: ");
						name = sc.next();
					} else if (option1 == 3) {
						System.out.println("Enter the Student name: ");
						name = sc.next();
						System.out.println("Enter the Student id: ");
						ids = sc.nextInt();
					} else if (option1 == 4) {
						System.out.println("Enter the Student id to Update: ");
						ids = sc.nextInt();
						System.out.println("Enter the New Student name: ");
						name = sc.next();
					} else if (option1 == 5) {
						System.out.println("Enter the Student id to Delete: ");
						ids = sc.nextInt();
					} else if (option1 == 6) {
//						System.out.println("Enter the table name to get Data: ");
//						name = sc.next();
					}
					switch (option1) {

					case 1:
						StatementTransactions.createMethod(connection, name);
						break;
					case 2:
						StatementTransactions.dropTabel(connection, name);
						break;
					case 3:
						Student std = new Student(ids, name);
						StatementTransactions.insert(connection, std);
						break;
					case 4:
						StatementTransactions.update(connection, name, ids);
						break;
					case 5:
						StatementTransactions.delete(connection, ids);
						break;
					case 6:
						StatementTransactions.view(connection, null);
						break;

					default:
						System.out.println("Please Select valied Option.");
						break;
					}
					System.out.println("You want to Continue? y/n");
					char state = sc.next().charAt(0);
					if (state == 'n' || state == 'N') {
						createFlag = false;
					}
				} while (createFlag);
				break;

			case 2:
				boolean Flag = true;
				do {
					System.out.println("1. Insert record.");
					System.out.println("2. Update record.");
					System.out.println("3. Delete record.");
					System.out.println("4. View records.");

					int option2 = sc.nextInt();
					int id = 0;
					String names = null;
					if (option2 == 1) {
						System.out.println("Enter the Customer name: ");
						names = sc.next();
						System.out.println("Enter the Customer id: ");
						id = sc.nextInt();
					} else if (option2 == 2) {
						System.out.println("Enter the Customer id to Update: ");
						id = sc.nextInt();
						System.out.println("Enter the New Customer name: ");
						names = sc.next();
					} else if (option2 == 3) {
						System.out.println("Enter the Customer id to Delete: ");
						id = sc.nextInt();
					}

					try {
						switch (option2) {
						case 1:
							Customer cust = new Customer(id, names);
							PreparedStatmTransactions.insert(connection, cust);
							break;

						case 2:
							PreparedStatmTransactions.update(connection, names, id);
							break;
						case 3:
							PreparedStatmTransactions.delete(connection, id);
							break;
						case 4:
							PreparedStatmTransactions.view(connection);
							break;

						default:
							System.out.println("Please Select valied Option.");
							break;
						}
					} catch (Exception e) {
						System.out.println("Please Select valied Option.");
					}
					System.out.println("You want to Continue? y/n");
					char state = sc.next().charAt(0);
					if (state == 'n' || state == 'N') {
						Flag = false;
					}
				} while (Flag);
				break;

			case 3:
				System.out.println("Bye");
				connection.close();
				mainFlag = false;
				break;
			default:
				System.out.println("Please Select valied Option.");
				break;
			}

		} while (mainFlag);
	}

}
