package CollectionAssignment;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (UserMainCode.testOrderVowels(str) == 1)
			System.out.println("valid");
		else
			System.out.println("invalid");
	}

}

class UserMainCode {
	public static int testOrderVowels(String str) {
		if (str.length() > 100)
			return -1;
		LinkedHashSet<Character> hs = new LinkedHashSet<>();

		char oldChar = '0';
		for (int i = 0; i < str.length(); i++) {
			char curChar = str.charAt(i);
			if (curChar == 'a' || curChar == 'e' || curChar == 'i' || curChar == 'o' || curChar == 'u') {
				if (curChar > oldChar) {
					if (!hs.contains(curChar))
						hs.add(curChar);
					oldChar = curChar;
				} else {
					return -1;
				}
			}
		}
		return 1;
	}
}
