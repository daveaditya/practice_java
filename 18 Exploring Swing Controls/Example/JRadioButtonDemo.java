// Demonstrate JRadioButton.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JRadioButtonDemo implements ActionListener {
	
	JLabel jlab;

	JRadioButtonDemo() {
		JFrame jfrm = new JFrame("JRadioButton Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(350,100);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JRadioButton b1 = new JRadioButton("Debug");
		b1.addActionListener(this);
		jfrm.add(b1);
		
		JRadioButton b2 = new JRadioButton("Maximize Speed");
		b2.addActionListener(this);
		jfrm.add(b2);
		
		JRadioButton b3 = new JRadioButton("Minimize Size");
		b3.addActionListener(this);
		jfrm.add(b3);
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		jlab = new JLabel("Select One");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		jlab.setText("You selected : " + ae.getActionCommand());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JRadioButtonDemo();
			}
		});
	}

}
