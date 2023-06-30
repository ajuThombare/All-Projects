package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main1 {
	public static void main(String[] args) {
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		////////////////////////////////////
		// test inputs
//		map1.put(1, 24);
//		map2.put(1, 6000);
//		map1.put(2, 45);
//		map2.put(2, 7000);

		System.out.println("Enter how many emp you want to add:");
		Scanner sc = new Scanner(System.in);
		int numberOfEmp = sc.nextInt(), count = 1;
		do {
			System.out.println("Enter Id for Emp " + count + ":");
			int id = sc.nextInt();
			System.out.println("Enter DOB(dd-mm-yyyy) for Emp " + count + ":");
			int age = 2023 - Integer.parseInt((sc.next()).split("[-]")[2]);
			System.out.println("Enter Salary for Emp " + count + ":");
			int salery = sc.nextInt();
			map1.put(id, age);
			map2.put(id, salery);
			numberOfEmp--;
			count++;
		} while (numberOfEmp > 0);
		for (Map.Entry<Integer, Integer> a : UserMainCode2.calculateRevisedSalary(map1, map2).entrySet()) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		}

	}
}

class UserMainCode2 {
	public static Map<Integer, Integer> calculateRevisedSalary(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
		Map<Integer, Integer> tr = new TreeMap<>();
		for (Map.Entry<Integer, Integer> a : map1.entrySet()) {
			int curSalery = map2.get(a.getKey());
			if (curSalery < 5000) {
				tr.put(a.getKey(), 100);
				continue;
			} else if (a.getValue() > 60 || a.getValue() < 25) {
				tr.put(a.getKey(), 200);
				continue;
			} else {
				if (a.getValue() >= 25 || a.getValue() <= 30) {
					curSalery = curSalery + (int) (curSalery * 0.2);
					tr.put(a.getKey(), curSalery);
					break;
				} else if (a.getValue() >= 31 || a.getValue() <= 60) {
					curSalery = curSalery + (int) (curSalery * 0.3);
					tr.put(a.getKey(), curSalery);
					break;
				}
			}
		}
		return tr;
	}
}
