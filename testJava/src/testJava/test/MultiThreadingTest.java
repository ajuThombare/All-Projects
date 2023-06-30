package testJava.test;

public class MultiThreadingTest extends Thread {
	@Override
	public void run() {
		int i = 10;
		while (i > 0) {
			System.out.println("bye");
			i--;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Thread tr = new Thread(new MultiThreadingTest());
		tr.start();
	}
}

class threaded1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 10;
		while (i > 0) {
			System.out.println("bye");
			i--;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class threaded implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 10;
		while (i > 0) {
			System.out.println("hello");
			i--;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
