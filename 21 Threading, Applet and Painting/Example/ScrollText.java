// A sing-based applet that scrolls
// through a label.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
This HTML can be used to launch the applet:

<object code="ScrollText" width=240 height=100>
</object>

 */

@SuppressWarnings({ "serial", "unused" })
public class ScrollText extends JApplet {

	JLabel jlab;
	
	String msg = " Swing makes the GUI move! ";
	
	ActionListener scroller;
	
	Timer stTimer;
	
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					guiInit();
				}
			});
		}
		catch(Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}
	
	public void start() {
		stTimer.start();
	}
	
	public void stop() {
		stTimer.stop();
	}
	
	public void destroy() {
		stTimer.stop();
	}
	
	private void guiInit() {
		
		jlab = new JLabel(msg);
		jlab.setHorizontalAlignment(SwingConstants.CENTER);
		
		scroller = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				char ch = msg.charAt(0);
				msg = msg.substring(1,msg.length());
				msg += ch;
				jlab.setText(msg);
			}
		};
		
		stTimer = new Timer(200,scroller);
		add(jlab);
	}
	
}
