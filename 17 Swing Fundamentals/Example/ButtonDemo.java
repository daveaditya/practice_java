// Demonstrates a button.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {
	
	JLabel jlab;
	
	public ButtonDemo() {
		JFrame jfrm = new JFrame("A Button Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jbtnFirst = new JButton("First");
		JButton jbtnSecond = new JButton("Second");
		
		jbtnFirst.addActionListener(this);
		jbtnSecond.addActionListener(this);;
		
		jfrm.add(jbtnFirst);
		jfrm.add(jbtnSecond);
		
		jlab = new JLabel("Press a button.");
		
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("First")) {
			jlab.setText("First button was pressed.");
		}
		else {
			jlab.setText("Second button was pressed.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new ButtonDemo();
			}
		});
	}

}
