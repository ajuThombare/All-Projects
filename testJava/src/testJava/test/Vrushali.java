package testJava.test;

public class Vrushali {
	public static void main(String[] args) {
		StringBuilder br = new StringBuilder("Pop");
		br.append("UP");// This function will attach new value to existing string we can add * Strings,
		// StringBuilders, boolean, char, char[], float, int, long, double, Objects
		System.out.println(br);

		char b = br.charAt(3); // we can find any character any given index
		System.out.println(b);

		int ax = br.indexOf("o");
		System.out.println(ax);// Returns the index within this string of the first occurrence of the
		// specified substring.

		System.out.println(br.indexOf("P", 0));// Returns the index within this string of the first occurrence of the
		// specified substring, starting at the specified index.
		br.setLength(10);// Sets the length of the character sequence.
		System.out.println(br.length());
	}
}
