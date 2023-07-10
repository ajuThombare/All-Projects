package lambdaExp;

public class testingLamda {
	public static void main(String[] args) {
		// Implementing the lambda on custom functional interface
//		ITest a = (x, z) -> "hellos " + x + " " + z;
//		String s = a.disp("aju", 8);
		ITest ab = (x) -> {
			StringBuilder br = new StringBuilder();
			for (int i = 0; i < x.length(); i++) {
				br.append(x.charAt(i) + " ");
			}
			return br.toString();
		};
//		System.out.println(s);

		// Implementing the lambda on Runnable functional interface which has only one
		// RUN method
		Runnable s1 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("aju " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(s1);
//		t.start();

		// creating anonymous class
		Thread t2 = new Thread(() -> System.out.println("ajay"));
//		t2.start();

	}
}

@FunctionalInterface
interface ITest {
	public String disp(String a);
}
