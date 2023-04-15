// Demonstrate a JToggleButton.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonDemo {
	
	JLabel jlab;
	JToggleButton jtbn;
	
	JToggleButtonDemo() {
		JFrame jfrm = new JFrame("JToggleButton Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(200,100);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel("Button is off.");
		
		jtbn = new JToggleButton("On/Off");
		jtbn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if(jtbn.isSelected()) {
					jlab.setText("Button is on.");
//					jtbn.setText("OFF");
				}
				else {
					jlab.setText("Button is off.");
//					jtbn.setText("ON");
				}
			}
		});
		
		jfrm.add(jtbn);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JToggleButtonDemo();
			}
		});
	}
}
