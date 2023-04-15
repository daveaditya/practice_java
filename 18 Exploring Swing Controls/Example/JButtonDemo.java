// Demonstrate icon-based JButtons.
// This example displays traffic light icons inside buttons.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButtonDemo implements ActionListener {

	JLabel jlab;
	
	JButtonDemo() {
		JFrame jfrm = new JFrame("JButton Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300,180);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon goIcon = new ImageIcon("Go.gif");
		JButton jbtnGo = new JButton(goIcon);
		jbtnGo.setActionCommand("Go");
		jbtnGo.addActionListener(this);
	
		ImageIcon cautionIcon = new ImageIcon("Caution.gif");
		JButton jbtnCaution = new JButton(cautionIcon);
		jbtnGo.setActionCommand("Caution");
		jbtnGo.addActionListener(this);
		
		ImageIcon stopIcon = new ImageIcon("Stop.gif");
		JButton jbtnStop = new JButton(stopIcon);
		jbtnGo.setActionCommand("Stop");
		jbtnGo.addActionListener(this);
		
		jfrm.add(jbtnGo);
		jfrm.add(jbtnCaution);
		jfrm.add(jbtnStop);
		
		jlab = new JLabel("Select a Traffic Light");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		jlab.setText("You selected " + ae.getActionCommand() + ".");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JButtonDemo();
			}
		});
	}

}
