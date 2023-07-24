package Code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tes {
	public static void main(String[] args) {
		System.out.println(distinctIntegers(3));
	}

	public static int distinctIntegers(int n) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		set.add(n);
		int pre = Integer.MAX_VALUE;
		boolean flag = true;
		while (flag) {
			if (set.size() == pre) {
				flag = false;
				break;
			}
			list.clear();
			pre = set.size();
			for (int a : set) {
				for (int i = n; i > 1; i--) {
					if (a % i == 1) {
						list.add(i);
					}
				}
			}
			set.addAll(list);

		}
		return set.size();
	}

	public static int maxNumberOfBalloons(String text) {

		int a = 0, b = 0, l = 0, o = 0, n = 0, i = 0;

		for (char c : text.toCharArray()) {
			switch (c) {
			case 'a' -> a++;
			case 'b' -> b++;
			case 'l' -> l++;
			case 'n' -> n++;
			case 'o' -> o++;
			}
			if (a >= 1 && b >= 1 && n >= 1 && l >= 2 && o >= 2) {
				i++;
				a -= 1;
				b -= 1;
				n -= 1;
				l -= 2;
				o -= 2;
			}
		}

		return i;
	}

	public static int countCharacters(String[] words, String chars) {
		int[] freq = new int[26];
		int res = 0;
		List<String> ans = new ArrayList<>();

		for (char c : chars.toCharArray())
			freq[c - 'a']++;

		for (String s : words) {
			int[] count = new int[26];
			boolean flag = true;
			for (char c : s.toCharArray()) {
				count[c - 'a']++;
			}
			for (int i = 0; i < 26; i++) {
				if (freq[i] < count[i]) {
					flag = false;
					break;
				}
			}
			if (flag)
				ans.add(s);
		}

		System.out.print(ans);

		for (int i = 0; i < ans.size(); i++) {
			res += ans.get(i).length();
		}

		return res;
	}

	public static int[] applyOperations(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1] && nums[i] != 0) {
				result[i] = (nums[i] * 2);
				nums[i + 1] = 0;
			} else if (nums[i] != nums[i + 1]) {
				result[i] = (nums[i]);
			}

		}
		result[result.length - 1] = nums[nums.length - 1];
		int count = 0;
		for (int a : result) {
			if (a != 0) {
				result[count] = a;
				count++;
			}
		}

		while (count != nums.length) {
			result[count] = 0;
			count++;
		}

		return result;
	}
}
