package Code;

public class interThreadCommWaitAndNotifyAll {
	public static void main(String[] args) throws InterruptedException {
		display d1 = new display();
		thread1 trd = new thread1(d1, "Ajay");
		trd.start();

		Thread.sleep(4000);
		synchronized (d1) {
			System.out.println("giving the signals");
			d1.notifyAll();
		}
	}
}

class display {
	public synchronized void wish(String name) {
		System.out.println("in the wish ");
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("out of the wish");
	}
}

class thread1 extends Thread {
	display d;
	String name;

	public thread1(display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		d.wish(name);
	}
}
