package testJava.test;

public class Ajay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder br = new StringBuilder("Pop");
		System.out.println(br.codePointBefore(3));// Returns the character (Unicode code) before the specified index.
		System.out.println(br.codePointCount(0, 2));// Returns the number of Unicode code points in the specified text
		// range of this sequence.
		br.reverse();// Causes this character sequence to be replaced by the reverse of the sequence.
		System.out.println(br);
		int capacity = br.capacity();// Returns the current capacity.
		System.out.println("capacity :" + capacity);
		br.replace(0, 3, "Old");// Causes this character sequence to be replaced by the reverse of the sequence.
		System.out.println(br);
	}

}
