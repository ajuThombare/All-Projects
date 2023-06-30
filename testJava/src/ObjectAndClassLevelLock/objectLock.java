package ObjectAndClassLevelLock;

public class objectLock {
	public static void main(String[] args) {
		objectLock obj = new objectLock();
		objectLock obj1 = new objectLock();
		Thread t1 = new Thread(new Thread1(obj));
		Thread t2 = new Thread(new Thread1(obj1));
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
	}

	public synchronized void m1() {
		System.out.println("this is m1-" + Thread.currentThread().getName());
	}

	public synchronized void m2() {
		System.out.println("this is m2-" + Thread.currentThread().getName());
	}
}

class Thread1 extends Thread {
	objectLock obj = null;

	public Thread1(objectLock obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.m1();
		obj.m2();
	}
}

class Thread2 extends Thread {
	objectLock obj = null;

	public Thread2(objectLock obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.m1();
		obj.m2();
	}
}