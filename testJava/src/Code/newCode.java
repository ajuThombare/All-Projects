package Code;

import java.util.ArrayList;
import java.util.List;

public class newCode {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 4, 5, 7 };
//		System.out.println(smallestEqual(a));
//		StringBuilder br = new StringBuilder();
//		br.append(1);
//		br.append(3);
		System.out.println(summaryRanges(a));
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		boolean flag = false;
		int first = nums[0];
		int lastIndex = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (flag) {
				first = nums[i];
				flag = false;
			}
			if ((nums[i] + 1) == nums[i + 1]) {
				lastIndex = i + 1;
			} else {
				String res = first + "->" + nums[lastIndex];
				list.add(res);
				flag = true;
			}
		}

		return null;
	}

	public static int minLength(String s) {
		int ab = 0, cd = 0;
		StringBuilder br = new StringBuilder(s);
		while (ab != -1 || cd != -1) {
			ab = br.indexOf("AB");

			if (ab != -1) {

				br.delete(ab, ab + 2);
			}
			cd = br.indexOf("CD");
			if (cd != -1) {
				br.delete(cd, cd + 2);
			}
		}
		return br.length();
	}

	public static int smallestEqual(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int a = i % 10;
			if (a == nums[i]) {
				return i;
			}
		}
		return -1;
	}
}
