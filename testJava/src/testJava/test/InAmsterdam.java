package testJava.test;

public class InAmsterdam {
	public static void main(String[] args) {
		System.out.println(countAm("I Am in Amsterdam am I?"));
	}

	public static int countAm(String str) {
		String[] arr = str.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase("am")) {
				count++;
			}
		}
		return count;
	}
}