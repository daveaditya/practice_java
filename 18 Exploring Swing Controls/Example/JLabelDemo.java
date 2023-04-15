// Demonstrate JLabel and ImageIcon.
// This example displays the three states of a traffic light.
import javax.swing.*;
import java.awt.*;

class JLabelDemo {

	JLabelDemo() {
		JFrame jfrm = new JFrame("JLabel and ImageIcon Example");
		jfrm.setSize(320,280);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon goIcon = new ImageIcon("Go.gif");
		JLabel jlabGo = new JLabel(" Go ",goIcon,SwingConstants.LEFT);
		
		ImageIcon cautionIcon = new ImageIcon("Caution.gif");
		JLabel jlabCaution = new JLabel(" Caution ",cautionIcon,SwingConstants.CENTER);
		
		ImageIcon stopIcon = new ImageIcon("Stop.gif");
		JLabel jlabStop = new JLabel(" Stop ",stopIcon,SwingConstants.RIGHT);
		
		jfrm.add(jlabGo,BorderLayout.NORTH);
		jfrm.add(jlabCaution,BorderLayout.CENTER);
		jfrm.add(jlabStop,BorderLayout.SOUTH);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JLabelDemo();
			}
		});
	}

}
