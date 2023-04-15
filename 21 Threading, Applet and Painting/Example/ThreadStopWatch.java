/*
 * An improved version of the StopWatch class from Chapter 17.
 * This version uses a separate thread to display the elapsed
 * time when the stopwatch is running.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;

class ThreadStopWatch {
	
	JLabel jlab;
	JButton jbtnStart;
	JButton jbtnStop;
	
	long start;
	
	boolean running = false;
	
	Thread thrd;
	
	ThreadStopWatch() {
		
		JFrame jfrm = new JFrame("Thread-based Stopwatch");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(230,90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel("Press Start to begin timing.");
		
		jbtnStart = new JButton("Start");
		jbtnStop = new JButton("Stop");
		
		jbtnStop.setEnabled(false);
		
		Runnable myThread = new Runnable() {
			public void run() {
				try {
					for(;;) {
						Thread.sleep(100);
						
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								updateTime();
							}
						});
					}
				}
				catch(InterruptedException exc) {
					System.out.println("Call to sleep was interrupted.");
					System.exit(1);
				}
			}
		};
		
		thrd = new Thread(myThread);
		
		thrd.start();
		
		jbtnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				start = Calendar.getInstance().getTimeInMillis();
				
				jbtnStop.setEnabled(true);
				jbtnStart.setEnabled(false);
				
				running = true;
			}
		});
		
		jbtnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				long stop = Calendar.getInstance().getTimeInMillis();
				
				jlab.setText("Elapsed time is " + (double)(stop - start)/1000);
				
				jbtnStart.setEnabled(true);
				jbtnStop.setEnabled(false);
				
				running = false;
			}
		});
		
		jfrm.add(jbtnStart);
		jfrm.add(jbtnStop);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	void updateTime() {
		if(!running) {
			return;
		}
		long temp = Calendar.getInstance().getTimeInMillis();
		jlab.setText("Elapsed time is " + (double)(temp - start)/1000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ThreadStopWatch();
			}
		});
	}

}
