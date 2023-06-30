package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Specify number of records u want to add?\n->");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Key for " + i + " record.");
			int id = sc.nextInt();
			System.out.println("Enter value for " + i + " record.");
			String val = sc.next();
			map.put(id, val);
		}
		System.out.println();
	}

	class UserMainCode3 {
		public static String getMaxKeyValue(Map<Integer, String> map) {
			int count = 0;
			String cur = "";
			for (Map.Entry<Integer, String> a : map.entrySet()) {
				if (a.getKey() > count) {
					cur = a.getValue();
				}
			}
			return cur;
		}
	}
}
