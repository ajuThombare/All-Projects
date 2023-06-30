package testJava.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

	public boolean checkValid(int[][] matrix) {
		for (int r = 0, n = matrix.length; r < n; ++r) {
			Set<Integer> row = new HashSet<>();
			Set<Integer> col = new HashSet<>();
			for (int c = 0; c < n; ++c) {
				if (!row.add(matrix[r][c]) || !col.add(matrix[c][r])) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
//		Map<Integer, String> mp = new HashMap<>();
//		mp.put(null, null);
//		mp.put(null, "o");

//		hashSet.add(4);
//		hashSet.add(3);
//		hashSet.add(2);
//		hashSet.add(1);
//		System.out.println(mp);
		byte a = 1;
		short b = 1;
		int c = 1;
		long d = 1;
		c = (int) d;
	}
//		System.out.println(shortestToChar1("loveleetcode", 'e'));
//		Integer a = new Integer(12);
//		String[] a = { "ad", "bd", "aaab", "baa", "badab" };// b = { "amazing", "leetcode", "is" };
//		String a = "abcd";
//		System.out.println(a.indexOf("ab"));
//		printPattern();
//		int a = Character.MIN_VALUE;
//		System.out.println(a);
//		int[] a = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
//				10 };
//		System.out.println('a' < 'b');
//		String[] a = { "a", "b", "c" };

//		int a = 54;
//		Integer ax = Integer.valueOf(a);
//		System.out.println(ax.hashCode());
//		int r = ax.intValue();
//		System.out.println(r);
//		Emp obj = new Emp("Aju");
//		System.out.println(obj.hashCode());
//		System.out.println(addStrings("9", "99"));
//		int[] a = { 1, 2, 3, 6 }, b = { 2, 3, 4, 5 };
//		System.out.println(getCommon(a, b));

	public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
		boolean incflag = true, decflag = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i <= j) {
					if (nums[i] > nums[j]) {

					}
				}
				if (i >= j) {
					if (nums[i] <= nums[j]) {

					}
				}
			}
		}
		return incflag;
	}

	public static int getCommon(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();

		for (int i : nums1) {
			set1.add(i);
		}

		// Adding elements from array2
		for (int i : nums2) {
			set2.add(i);
		}

		set1.retainAll(set2);
		Optional<Integer> firstElement = set1.stream().findFirst();
		if (firstElement.isEmpty())
			return -1;
		return firstElement.get();
	}

	public static void duplicateZeros(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				if (i != arr.length - 1) {
					boolean flag = false;
					for (int j = arr.length - 1; j >= i + 1; j--) {
						arr[j] = arr[j - 1];
						flag = true;
					}
					if (flag)
						i++;
				}
			}
		}

	}

	public static String addStrings(String num1, String num2) {
		int count1 = num1.length() - 1, count2 = num2.length() - 1;
		int a, b, hash = 0;

		StringBuilder br = new StringBuilder();
		if (count1 == 0 & count2 == 0) {
			a = num1.charAt(count1) - '0';
			b = num2.charAt(count2) - '0';
			int total = a + b;
			br.append(total);
			return br.toString();
		}
		while (count1 >= 0 && count2 >= 0) {
			a = num1.charAt(count1) - '0';
			b = num2.charAt(count2) - '0';
			int total = a + b;
			if (total > 9) {
				br.append(total % 10 + hash);
				hash = 1;
			} else {
				br.append(total + hash);
				hash = 0;
			}
			count1--;
			count2--;
		}
		if (count1 >= 0) {
			while (count1 >= 0) {
				a = num1.charAt(count1) - '0';
				br.append(a + hash);
				hash = 0;
				count1--;
			}
		}
		if (count2 >= 0) {
			while (count2 >= 0) {
				b = num2.charAt(count2) - '0';
				br.append(b + hash);
				hash = 0;
				count2--;
			}
		}
		return br.reverse().toString();
	}

	public static boolean strongPasswordCheckerII(String password) {
		boolean num = false, lowercase = false, uppercase = false, special = false, consec = false;

		char previous = password.charAt(0);
		if (password.length() < 8)
			return false;
		else {
			for (int i = 0; i < password.length(); i++) {
				char cur = password.charAt(i);
				boolean isdigit = Character.isDigit(cur), isspace = Character.isWhitespace(cur),
						isletter = Character.isLetter(cur);
				if (i != 0) {
					if (previous == cur) {
						consec = true;
					} else {
						previous = cur;
					}
				}

				if (isdigit)
					num = true;
				else if (isletter) {
					if (Character.isUpperCase(cur)) {
						uppercase = true;
					} else {
						lowercase = true;
					}
				} else if (!isdigit && !isletter && !isspace) {
					special = true;
				}
			}
		}
		if (num && lowercase && uppercase && special && !consec)
			return true;
		else
			return false;
	}

	public static int numOfStrings(String[] patterns, String word) {
		int count = 0;
		for (int i = 0; i < patterns.length; i++) {
			if (word.contains(patterns[i])) {
				count++;
			}
		}
		return count;
	}

	public static char slowestKey(int[] releaseTimes, String keysPressed) {
		char cur = keysPressed.charAt(0);
		int previous = releaseTimes[0];

		for (int i = 1; i < releaseTimes.length; i++) {
			if ((releaseTimes[i] - releaseTimes[i - 1]) > previous) {
				cur = keysPressed.charAt(i);
				previous = (releaseTimes[i] - releaseTimes[i - 1]);
			} else if ((releaseTimes[i] - releaseTimes[i - 1]) == previous) {
				if (cur < keysPressed.charAt(i)) {
					cur = keysPressed.charAt(i);
				}
			}
		}
		return cur;
	}

	public static int[] numberOfLines(int[] widths, String s) {
		int[] result = new int[2];
		int count = 0, total = 0;
		for (int i = 0; i < widths.length; i++) {
			if (total == 100) {
				count++;
				total = 0;
			} else if (total + widths[i] > 100) {
				count++;
				total = (total + widths[i]) - 100;
			}
			if (i == widths.length - 1) {
				result[1] = total;
				result[0] = count;
			}
			total = total + widths[i];
		}
		return result;
	}

	public static String freqAlphabets(String s) {
//		String[] arr = s.split("[#]");
//		StringBuilder br = new StringBuilder();
		int i = 0;
		while (i != -1) {
			int toIndex = s.indexOf("#");
		}
		return null;
	}

	public static String isPresent(String S, String A) {
		int counter = 0;
		for (int i = 0; i < A.length(); i++) {
			if (i % (S.length()) == 0 && i != 0) {
				counter = 0;
			}
			if (A.charAt(i) != S.charAt(counter)) {
				return "NO";
			} else {
				counter++;
			}
		}
		return "YES";
	}

	public static int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			String cur = words[i];
			boolean flag = true;
			for (Character a : cur.toCharArray()) {
				if (!allowed.contains(Character.toString(a))) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
			}
		}

		return count;

	}

	public static String reversePrefix(String word, char ch) {
		int index = word.indexOf(ch), leng = word.length(), count = 0;
		StringBuilder br = new StringBuilder();
		for (int i = index; i >= 0; i--) {
			br.append(word.charAt(i));
		}
		count = index + 1;
		while (count < leng) {
			br.append(word.charAt(count));
			count++;
		}
		return br.toString();
	}

	public static int countWords(String[] words1, String[] words2) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		int count = 0;
		for (String a : words1) {
			if (map1.containsKey(a)) {
				map1.put(a, map1.get(a) + 1);
			} else {
				map1.put(a, 1);
			}
		}
		for (String a : words2) {
			if (map2.containsKey(a)) {
				map2.put(a, map2.get(a) + 1);
			} else {
				map2.put(a, 1);
			}
		}

		for (String s : map1.keySet()) {
			if (map2.containsKey(s) && map2.get(s) == 1 && map1.get(s) == 1) {
				count++;
			}
		}

		return count;
	}

	public static boolean areNumbersAscending(String s) {
		String[] arr = s.split("[ ]");
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				int an = Integer.valueOf(arr[i]);
				if (an > a) {
					a = an;
				} else {
					return false;
				}
			} catch (Exception e) {

			}

		}
		return true;
	}

	public static int[] shortestToChar1(String s, char c) {
		int[] res = new int[s.length()];
		int index = s.indexOf(c);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				res[i] = 0;
				index = i;
			} else {
				if (i < index) {
					res[i] = Math.abs(index - i);
				} else {
					int second = s.indexOf(c, index + 1);
					int a = Math.abs(index - i), b = Math.abs(second - i);
					res[i] = Math.min(a, b);
				}

			}
		}
		return res;
	}

	public static String toGoatLatin(String sentence) {
		StringBuilder br = new StringBuilder();
		String[] arr = sentence.split(" ");
		for (int i = 0; i < arr.length; i++) {

		}
		return null;
	}

	public static boolean squareIsWhite(String coordinates) {
		int right = (coordinates.charAt(0) - 'a') + 1;
		int up = coordinates.charAt(1) - '0';

		if (right == up) {
			return false;
		} else if (right == 1 || up == 1) {
			if (right == 1) {
				if (up % 2 == 0) {
					return true;
				}
			} else {
				if (right % 2 == 0) {
					return true;
				}
			}
		} else {
			if (right % 2 == 0 && up % 2 != 0) {
				return true;
			} else if (right % 2 != 0 && up % 2 == 0) {
				return true;
			}
		}
		return false;
	}

	public static int countSeniors(String[] details) {
		int count = 0;
		for (int i = 0; i < details.length; i++) {
			int cur = Integer.parseInt((String) details[i].subSequence(11, 13));
			if (cur > 60)
				count++;
		}
		return count;
	}

	public static void printPattern() {
		int[] a = { 1, 2, 3 };
		for (int i = 0; i < 3; i++) {// i=1
			for (int k = 1; k <= a[i]; k++) {
				for (int j = a[i] - k; j > 0; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= k; j++) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
		}
	}
}