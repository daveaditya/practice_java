// Demonstrate Timer and TimerTask.
import java.util.*;

class MyTimerTask extends TimerTask {
	public void run() {
		System.out.println("Timer task executed.");
	}
}

class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTimerTask myTask = new MyTimerTask();
		Timer myTimer = new Timer();
		
		myTimer.schedule(myTask,1000,500);
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
		
		myTimer.cancel();
	}

}
