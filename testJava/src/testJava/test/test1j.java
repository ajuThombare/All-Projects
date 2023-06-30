package testJava.test;

class testjj {
	public void aju() {
	}

	private void aju1() {
		System.out.println("test0");
	}
}

public class test1j extends testjj {
//	@Override
	public void aju1() {
		System.out.println("test1");
	}

	public static void main(String[] args) {
		test1j w = new test1j();
		w.aju1();
	}
}