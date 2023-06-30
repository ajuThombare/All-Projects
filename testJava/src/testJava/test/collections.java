package testJava.test;

import java.util.HashMap;
import java.util.Map;

public class collections {
	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<>();
		mp.put(null, 8);
		System.out.println(mp);
	}
}
