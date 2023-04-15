// This version of the stop watch uses the Timer class.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;

class TimerStopWatch {
	
	JLabel jlab;
	
	JButton jbtnStart;
	JButton jbtnStop;
	
	long start;
	
	Timer swTimer;
	
	TimerStopWatch() {
		
		JFrame jfrm = new JFrame("Timer-based Stopwatch");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(230,90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel("Press Start to begin timing.");
		
		jbtnStart = new JButton("Start");
		jbtnStop = new JButton("Stop");
		jbtnStop.setEnabled(false);
		
		ActionListener timerAL = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				updateTime();
			}
		};
		
		swTimer = new Timer(100,timerAL);
		
		jbtnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				start = Calendar.getInstance().getTimeInMillis();
				
				jbtnStop.setEnabled(true);
				jbtnStart.setEnabled(true);
				
				swTimer.start();
			}
		});
		
		jbtnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				long stop = Calendar.getInstance().getTimeInMillis();
				jlab.setText("Elapsed time is " + (double)(stop - start)/1000);
				
				jbtnStart.setEnabled(true);
				jbtnStop.setEnabled(false);
				
				swTimer.stop();
			}
		});
		
		jfrm.add(jbtnStart);
		jfrm.add(jbtnStop);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	void updateTime() {
		long temp = Calendar.getInstance().getTimeInMillis();
		jlab.setText("Elapsed time is " + (double)(temp - start)/1000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TimerStopWatch();
			}
		});
	}

}
