package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class testProp {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();

		FileReader rd = new FileReader("src/properties/proptest.properties");
//		System.out.println(rd.read());
		prop.load(rd);
		String a = prop.getProperty("test");
		System.out.println(a);

	}
}
