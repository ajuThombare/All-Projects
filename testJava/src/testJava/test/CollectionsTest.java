package testJava.test;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class CollectionsTest {
	public static void main(String[] args) {
		emps o = new emps("ax", "b");
		emps o1 = new emps("a", "b2");
		List<Integer> ls = new Vector<>();
		ls.add(1);
		ls.add(1);
		ls.add(null);
		ls.add(null);
		Map<Integer, String> map = new Hashtable<>();

//		ls.sort((x1, x2) -> {
//			if (x1.a().equals(x2.b())) {
//				return 1;
//			} else {
//				return -1;
//			}
//		});
		System.out.println(ls);
	}

}

record emps(String a, String b) {

}