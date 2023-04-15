// A simple Swing-based applet.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
This HTML can be used to launch the applet:

<object code="MyApplet" width=240 height=100>
</object>

 */
public class MyApplet extends JApplet {

	private static final long serialVersionUID = 1L;
	JButton jbtnOne;
	JButton jbtnTwo;
	
	JLabel jlab;
	
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
	
	private void guiInit() {
		setLayout(new FlowLayout());
		
		jbtnOne = new JButton("One");
		jbtnTwo = new JButton("Two");
		
		jlab = new JLabel("Press a button.");
		
		jbtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Button One pressed.");
			}
		}); 
		
		jbtnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Button Two pressed.");
			}
		});
		
		add(jbtnOne);
		add(jbtnTwo);
		add(jlab);
	}

}
