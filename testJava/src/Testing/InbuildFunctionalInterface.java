package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class InbuildFunctionalInterface {
	public static void main(String[] args) {
		List<student> list = new ArrayList<>();

		list.add(new student(1, 23, 60, "Ajay"));
		list.add(new student(4, 21, 100, "Vrushali"));
		list.add(new student(7, 20, 98, "Rajashri"));
		list.add(new student(12, 25, 55, "Ajay"));

		List<Integer> asa = Arrays.asList(1, 2, 4);
		int adf = asa.stream().map(x -> x * x).reduce((x, y) -> x + y).get();

//		long valu = 
//		Map<String, List<student>> collect =
//		double valu = 
//		boolean anyMatch = 
//		list.stream().mapToInt(a -> a.getMark()).reduce((x, y) -> x + y);
		System.out.println(adf);

		// predicate
		Predicate<student> sts = t -> t.getMark() > 70;

		Stream<student> str = list.stream().filter(sts);

		// Consumer
		Consumer<student> con = InbuildFunctionalInterface::printValue;
//		list.forEach(i -> con.accept(i));

		// Function
		Function<student, Integer> f1 = (c) -> c.getMark() * 2;
		for (student a : list) {
//			System.out.println(f1.apply(a));
		}
		// BiFunction
		BiFunction<student, Integer, Integer> f2 = (x, y) -> x.getMark() * y;
		for (student a : list) {
//			System.out.println(f2.apply(a, 20));
		}
		// Supplier
		Supplier<Integer> size = () -> list.size();
//		System.out.println(size.get());

		// Comparator
		Comparator<student> comp = new Comparator<student>() {
			@Override
			public int compare(student o1, student o2) {
				if (o1.getMark() > o2.getMark())
					return 1;
				else
					return -1;
			}
		};
		list.sort(comp);

		// Runnable
		Runnable s1 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Vlaue " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
//		new Thread(s1).start();
	}

	static void printValue(student std) {
		System.out.println(std);
	}
}

class student {
	private int id, age, mark;
	private String name;

	public student() {

	}

	public student(int id, int age, int mark, String name) {
		this.age = age;
		this.id = id;
		this.mark = mark;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", age=" + age + ", mark=" + mark + ", name=" + name + "]";
	}

}