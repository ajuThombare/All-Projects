package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filetest {
	public static void main(String[] args) throws FileNotFoundException {
		File st1 = new File("C:\\Users\\DELL\\Desktop\\Edubridge Notes\\EduWorkspace\\testJava\\Xyz.txt");
		Scanner sc = new Scanner(st1);
		while (sc.hasNext()) {

			int a = sc.nextInt();

			for (int k = 1; k <= a; k++) {
				for (int j = a - k; j > 0; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= k; j++) {
					System.out.print(k + " ");
				}

				System.out.println();
			}

		}

	}
}
