package testingFile;

import java.util.Scanner;
import java.util.Stack;

public class problem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int a = A.length();
		int b = B.length();

		System.out.println(a + b);
		int ab = A.compareTo(B);
		if (ab > 0)
			System.out.println("Yes");
		else
			System.out.println("No");

		String s1 = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
		String s2 = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());

		System.out.println(s1 + " " + s2);
//		Player p1 = new Player("Aju", 12);
//		printing myPrinter = new printing();
//
//		/* Create Integer and String arrays as test data */
//		Integer[] intArray = { 1, 2, 3 };
//		String[] stringArray = { "Hello", "World" };
//
//		/* Print the arrays using the generic function printArray */
//		myPrinter.printvalues(intArray);
//		myPrinter.printvalues(stringArray);
//		int[][] a = { { 1 } };
//		islandPerimeter(a);
	}

	public static int islandPerimeter(int[][] grid) {
		int perimeter = 0, prevIsland = grid[0][0];
		int[] previous = grid[0];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (i != 0) {
					if (grid[i][j] == 1) {
						perimeter += 4;
						if (prevIsland == grid[i][j]) {
							perimeter -= 2;
						}
						if (grid[i][j] == previous[i]) {
							perimeter -= 2;
						}
					}
				} else if (grid[i][j] == 1) {
					perimeter += 4;
					if (prevIsland == grid[i][j] && j != 0) {
						perimeter -= 2;
					}
				}
				prevIsland = grid[i][j];
			}
		}
		return 0;
	}

	public static String removeDuplicates(String s) {
		Stack<Character> st = new Stack<>();
		st.add(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {
			if (!st.isEmpty() && st.peek().equals(s.charAt(i))) {
				st.pop();
				continue;
			} else {
				st.push(s.charAt(i));
			}
		}
		String ans = "";
		while (!st.isEmpty()) {
			ans = st.pop() + ans;
		}
		return ans;
	}
}

class printing {
	public <inputType> void printvalues(inputType[] input) {
		for (inputType a : input) {
			System.out.println(a);
		}
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}