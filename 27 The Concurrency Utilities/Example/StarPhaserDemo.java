// Demonstrate Phaser's onAdvance() method.
import java.util.concurrent.Phaser;

class StarPhaserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phaser phsr = new NewlinePhaser(4,3);
		
		new StarThread(phsr);
		new StarThread(phsr);
		new StarThread(phsr);
		new StarThread(phsr);
	}

}

class NewlinePhaser extends Phaser {
	int numPhases;
	
	public NewlinePhaser(int numParties,int phases) {
		super(numParties);
		numPhases = phases;
	}
	
	public boolean onAdvance(int phase,int numParties) {
		System.out.println();
		return phase == numPhases - 1;
	}
}

class StarThread implements Runnable {
	Phaser phsr;
	
	StarThread(Phaser p) {
		phsr = p;
		new Thread(this).start();
	}
	
	public void run() {
		while(!phsr.isTerminated()) {
			System.out.print('*');
			phsr.arriveAndAwaitAdvance();
		}
	}
}