package FilesAssignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInOtherFile {
	public static void main(String[] args) throws IOException {
		File st1 = new File(
				"C:\\Users\\DELL\\Desktop\\Edubridge Notes\\EduWorkspace\\testJava\\src\\FilesTest\\Student1.txt");
		File st2 = new File(
				"C:\\Users\\DELL\\Desktop\\Edubridge Notes\\EduWorkspace\\testJava\\src\\FilesTest\\Student2.txt");

		Scanner sc = new Scanner(st1);
		FileWriter myWriter = new FileWriter(st2);
		myWriter.flush();
		try {
			while (sc.hasNextLine()) {
				String a = sc.nextLine() + "\n";
				myWriter.write(a);
			}
			myWriter.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
