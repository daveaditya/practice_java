// An example of CyclicBarrier.
import java.util.concurrent.*;

class BarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicBarrier cb = new CyclicBarrier(3,new BarAction());
		
		
		System.out.println("Starting");
		
		new MyThread(cb,"A");
		new MyThread(cb,"B");
		new MyThread(cb,"C");
//		new MyThread(cb,"X");
//		new MyThread(cb,"Y");
//		new MyThread(cb,"Z");
	}
}

class MyThread implements Runnable {
	CyclicBarrier cbar;
	String name;
	
	MyThread(CyclicBarrier c,String n) {
		cbar = c;
		name = n;
		new Thread(this).start();
	}
	
	public void run() {
		System.out.println(name);
		
		try {
			cbar.await();
		}
		catch(BrokenBarrierException exc) {
			System.out.println(exc);
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
	}
}

class BarAction implements Runnable {
	public void run() {
		System.out.println("Barrier Reached!");
	}
}