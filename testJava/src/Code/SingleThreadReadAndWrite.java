package Code;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ReadAndWriteThread extends Thread {
	public synchronized static void writeToFile() throws IOException {
		// TODO Auto-generated method stub

		FileWriter myWriter = new FileWriter("Xyz.txt");
		myWriter.write("ABCD");
		System.out.println("File Written");
		myWriter.close();

	}

	public synchronized static void readFromFile() throws IOException {
		// TODO Auto-generated method stub
		char[] temp = new char[5];
		FileReader read1 = new FileReader("Xyz.txt");
		read1.read(temp);

		for (char a : temp) {
			System.out.print(a);
		}
		System.out.println();
	}

	@Override
	public void run() {
		try {
//			synchronized (this) {
			writeToFile();
			readFromFile();
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class SingleThreadReadAndWrite {
	public static void main(String[] args) throws InterruptedException {
		ReadAndWriteThread t1 = new ReadAndWriteThread();
		t1.start();
//		t1.join();
		ReadAndWriteThread t2 = new ReadAndWriteThread();
		t2.start();
//		t2.join();
	}
}
