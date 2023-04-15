// A simple example that uses an Executor.
import java.util.concurrent.*;

class SimpExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch cdl = new CountDownLatch(5);
		CountDownLatch cdl2 = new CountDownLatch(5);
		CountDownLatch cdl3 = new CountDownLatch(5);
		CountDownLatch cdl4 = new CountDownLatch(5);
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		System.out.println("Starting");
		
		es.execute(new MyThread(cdl,"A"));
		es.execute(new MyThread(cdl,"B"));
		es.execute(new MyThread(cdl,"C"));
		es.execute(new MyThread(cdl,"D"));
		
		try {
			cdl.await();
			cdl2.await();
			cdl3.await();
			cdl4.await();
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
		
		es.shutdown();
		System.out.println("Done");
	}
}

class MyThread implements Runnable {
	String name;
	CountDownLatch latch;
	
	MyThread(CountDownLatch c,String n) {
		latch = c;
		name = n;
	}
	
	public void run() {
		for(int i=0 ; i<5 ; i++) {
			System.out.println(name + ": " + i);latch.countDown();
		}
	}
}
