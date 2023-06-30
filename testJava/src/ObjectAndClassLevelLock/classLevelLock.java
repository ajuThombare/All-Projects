package ObjectAndClassLevelLock;

public class classLevelLock {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Threads1());
		Thread t2 = new Thread(new Threads1());
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
	}

	public static synchronized void m1() {
		System.out.println("this is m1-" + Thread.currentThread().getName());
	}

	public static synchronized void m2() {
		System.out.println("this is m2-" + Thread.currentThread().getName());
	}
}

class Threads1 extends Thread {
	classLevelLock obj = null;

	public Threads1() {

	}

	@Override
	public void run() {
		obj.m1();
		obj.m2();
	}
}

class Threads2 extends Thread {
	classLevelLock obj = null;

	public Threads2() {

	}

	@Override
	public void run() {
		obj.m1();
		obj.m2();
	}
}