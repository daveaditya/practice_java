// A simple lock example.
import java.util.concurrent.locks.*;

class LockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLock lock = new ReentrantLock();
		new LockThread(lock,"A");
		new LockThread(lock,"B");
	}
}

class Shared {
	static int count = 0;
}

class LockThread implements Runnable {
	String name;
	ReentrantLock lock;
	
	LockThread(ReentrantLock lk,String n) {
		lock = lk;
		name = n;
		new Thread(this).start();
	}
	
	public void run() {
		try {
			System.out.println(name + " is waiting to lock count.");
			lock.lock();
			System.out.println(name + " is locking count.");
			
			Shared.count++;
			System.out.println(name + ": " + Shared.count);
			
			System.out.println(name + " is sleeping.");
			Thread.sleep(1000);
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
		finally {
			System.out.println(name + " is unlocking count.");
			lock.unlock();
		}
	}	
}
