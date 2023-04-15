// An exmaple of Phaser.
import java.util.concurrent.*;

class PhaserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phaser phsr = new Phaser(1);
		int curPhase;
		
		System.out.println("Starting");
		
		new MyThread(phsr,"A");
		new MyThread(phsr,"B");
		new MyThread(phsr,"C");
		
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " complete");
		
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " complete");
		
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " complete");
		
		phsr.arriveAndDeregister();
		
		if(phsr.isTerminated()) {
			System.out.println("The Phaser is terminated");
		}
	}

}

class MyThread implements Runnable {
	Phaser phsr;
	String name;
	
	MyThread(Phaser p,String n) {
		phsr = p;
		name = n;
		phsr.register();
		new Thread(this).start();
	}
	
	public void run() {
		System.out.println("Thread " + name + " Beginning Phase One");
		phsr.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
		
		System.out.println("Thread " + name + " Beginning Phase Two");
		phsr.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
		
		System.out.println("Thread " + name + " Beginning Phase Three");
		phsr.arriveAndDeregister();
	}
}

