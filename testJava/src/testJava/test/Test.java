package testJava.test;

public class Test {

	public static void main(String[] args) {
		/*
		 * Constructor and Description StringBuilder() -Constructs a string builder with
		 * no characters in it and an initial capacity of 16 characters.
		 * StringBuilder(CharSequence seq)- Constructs a string builder that contains
		 * the same characters as the specified CharSequence. StringBuilder(int
		 * capacity)- Constructs a string builder with no characters in it and an
		 * initial capacity specified by the capacity argument. StringBuilder(String
		 * str) - Constructs a string builder initialized to the contents of the
		 * specified string.
		 */
//		Set<Integer> s = new LinkedHashSet<>();
//		s.

		StringBuilder br = new StringBuilder("Pop");
		// Vrushali
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

		// Rajshri
		br.setCharAt(0, 'T'); // with this method we replace character at any index with given character
		System.out.println(br);

		br.insert(0, "S"); // we can insert any provided value in specified index * Strings,
		System.out.println(br);// StringBuilders, boolean, char, char[], float, int, long, double, Objects

		br.deleteCharAt(0); // with this method we can delete character any given index

		br.delete(3, 5);// with this method we can delte string or char in any given range
		System.out.println(br);

		System.out.println(br.codePointAt(2)); // Returns the character (Unicode code point) at the specified index.

		// AJay

		System.out.println(br.codePointBefore(3));// Returns the character (Unicode code) before the specified index.
		System.out.println(br.codePointCount(0, 2));// Returns the number of Unicode code points in the specified text
		// range of this sequence.

		int capacity = br.capacity();// Returns the current capacity.

		br.insert(3, "New");
		System.out.println(br);// Inserts the string representation of the Stirng ,boolean,double ,
								// float,long,object ,char argument into this sequence.

		br.insert(3, "Seq");
		System.out.println(br);// Inserts the specified CharSequence into this sequence.

		System.out.println(br.lastIndexOf("S"));// Returns the index within this string of the rightmost occurrence of
												// the specified substring

		System.out.println(br.length());// Returns the length (character count)

		br.setLength(10);// Sets the length of the character sequence.

		System.out.println(br.subSequence(2, br.length())); // Returns a new character sequence that is a subsequence of
															// this sequence.

		System.out.println(br.substring(3));// Returns a new String that contains a subsequence of characters currently
											// contained in this character sequence.

		System.out.println(br.substring(3, 5));// Returns a new String that contains a subsequence of characters
												// currently contained in this sequence.

		System.out.println(br.toString());// Returns a string representing the data in this sequence.

//		br.reverse();// Causes this character sequence to be replaced by the reverse of the sequence.

		System.out.println(br);

		br.replace(6, 9, "Old");// Causes this character sequence to be replaced by the reverse of the sequence.
		System.out.println(br);

	}

}
