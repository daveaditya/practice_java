// Use join().

class MyThread extends Thread {
	Thread thrd;
	
	MyThread(String name) {
		thrd = new Thread(this,name);
		thrd.start();
	}
	
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		
		try {
			for(int count = 0;count < 10;count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + " , count is " + count);
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted");
		}
		System.out.println(thrd.getName() + " terminating");
	}
	
}

class MoreThreads3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starting.");
		
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");
		
		try {
			mt1.thrd.join();
			System.out.println("Child #1 joined.");
			mt2.thrd.join();
			System.out.println("Child #2 joined.");
			mt3.thrd.join();
			System.out.println("Child #3 joined.");
		}
		catch (InterruptedException exc) {
			System.out.println("Main thread interrrupted.");
		}
		System.out.println("Main thread ending.");
		
	}

}
