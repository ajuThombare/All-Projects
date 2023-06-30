package FilesAssignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileMethods {
	public static void main(String[] args) throws IOException {
		File fl = new File("Xyz.txt");
//	fl.createNewFile();
//	System.out.println(fl.getAbsolutePath());

		FileWriter myWr = new FileWriter(fl);
		myWr.flush();
		myWr.write("THis is testing wirte....j\n");
		myWr.append('a');
		myWr.append("\nWrite in file");

		System.out.println(myWr.getEncoding());

		myWr.close();

		FileReader ft = new FileReader(fl);
		ft.getEncoding();
		System.out.println(ft.read());
		System.out.println(ft.toString());
		ft.markSupported();
//		ft.mark(4);
		System.out.println(ft.ready());
		ft.skip(10);
		int ch;
		while ((ch = ft.read()) != -1)
			System.out.print((char) ch);

		ft.close();
	}
}
