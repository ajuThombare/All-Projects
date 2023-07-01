package Code;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class fileReadWrite {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String Path = "Xyz.txt";
		String input = sc.next();
		Thread1 obj1 = new Thread1(Path, input);
		Thread2 obj2 = new Thread2(Path);
		obj1.start();
		Thread.sleep(1000);
		obj2.start();
		sc.close();
	}
}

class Thread1 extends Thread {
	File fl = null;
	String s = "";

	Thread1(String path, String s) {
		fl = new File(path);
		this.s = s;
	}

	@Override
	public void run() {
		try {
			FileWriter myWriter = new FileWriter(fl);

			myWriter.write(s);

			myWriter.close();
			System.out.println("File Written");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Thread2 extends Thread {
	File fl = null;
//	Scanner sc1 = null;
	char[] temp = new char[100];

	Thread2(String path) {
		fl = new File(path);
	}

	@Override
	public void run() {
		try {
			FileReader read1 = new FileReader(fl);
			read1.read(temp);

			for (char a : temp) {
				System.out.print(a);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}