// Demonstrate Observable and Observer.
import java.util.*;

class Watcher1 implements Observer {
	public void update(Observable obj,Object arg) {
		System.out.println("update() in Watcher1 called, count is " + ((Integer)arg).intValue());
	}
}

class Watcher2 implements Observer {
	public void update(Observable obj,Object arg) {
		System.out.println("update() in Watcher2 called, count is " + ((Integer)arg).intValue());
		
		if(((Integer)arg).intValue() == 0) {
			System.out.print('\7');
		}
	}
}

class BeingWatched extends Observable {
	void counter(int count) {
		for( ; count >= 0 ; count--) {
			setChanged();
			notifyObservers(count);
			
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException exc) {
				System.out.println("Sleep interrupted");
			}
		}
	}
}

class TwoObservers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeingWatched observed = new BeingWatched();
		
		Watcher1 observing1 = new Watcher1();
		Watcher2 observing2 = new Watcher2();
		
		observed.addObserver(observing1);
		observed.addObserver(observing2);
		
		observed.counter(5);
		
	}

}
