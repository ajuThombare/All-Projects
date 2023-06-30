package testJava.test;

public class Rajeshri {
	public static void main(String[] args) {
		StringBuilder br = new StringBuilder("Pop");
		br.setCharAt(0, 'T'); // with this method we replace character at any index with given character
		System.out.println(br);

		br.insert(0, "S"); // we can insert any provided value in specified index * Strings,
		System.out.println(br);// StringBuilders, boolean, char, char[], float, int, long, double, Objects

		br.deleteCharAt(0); // with this method we can delete character any given index

		br.delete(3, 5);// with this method we can delte string or char in any given range
		System.out.println(br);

		System.out.println(br.codePointAt(2)); // Returns the character (Unicode code point) at the specified index.

	}
}
