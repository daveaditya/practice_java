// Demonstrate a simple combo box.
// This program requires JDK 7 or later.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JComboBoxDemo {
	
	JComboBox<String> jcbb;
	JLabel jlab;
	
	String[] apples = {
		"Winesap","Cortland","Red Delicious","Golden Delicious",
		"Gala","Fuji","Granny Smith","Jonathan"
	};
	
	JComboBoxDemo() {
		JFrame jfrm = new JFrame("JComboBOx Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(380,240);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcbb  =new JComboBox<String>(apples);
		
		jlab = new JLabel("Please choose an Apple.");
		
		jcbb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String item = (String)jcbb.getSelectedItem();
				jlab.setText("Current selection: "  + item);
			}
		});
		
		jfrm.add(jcbb);
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JComboBoxDemo();
			}
		});
	}

}
