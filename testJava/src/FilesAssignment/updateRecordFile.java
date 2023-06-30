package FilesAssignment;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class updateRecordFile {
	public static void main(String[] args) {
		File st1 = new File(
				"C:\\Users\\DELL\\Desktop\\Edubridge Notes\\EduWorkspace\\testJava\\src\\FilesTest\\Student2.txt");

		try {
			Scanner sc = new Scanner(st1);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter id to Update:");
			int id = sc1.nextInt();
			System.out.println("Enter new Name of student:");
			String name = sc1.next();

			StringBuffer buffer = new StringBuffer();

			while (sc.hasNextLine()) {
				String a = sc.nextLine();
				int val = a.charAt(0) - '0';
				if (val == id) {
					buffer.append(id + " - " + name + "" + System.lineSeparator());
				} else {
					buffer.append(a + System.lineSeparator());
				}
			}

			FileWriter myWriter = new FileWriter(st1);
			myWriter.write(buffer.toString());

			sc1.close();
			sc.close();
			myWriter.close();
			System.out.println("Value Updated Succefully.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
