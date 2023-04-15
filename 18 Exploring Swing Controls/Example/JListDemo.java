// Demonstrate a simple JList.
// This program requires JDK 7 or later.
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
//import java.awt.event.*;

class JListDemo {

	JList<String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;
	String[] apples = {
		"Winesap","Cortland","Red Delicious","Golden Delicious",
		"Gala","Fuji","Granny Smith","Jonathan"
	};
	
	JListDemo() {
		JFrame jfrm = new JFrame("JList Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(240,200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlst = new JList<String>(apples);
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		jscrlp = new JScrollPane(jlst);
		jscrlp.setPreferredSize(new Dimension(120,90));
		
		jlab = new JLabel("Please Choose an Apple.");
		
		jlst.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent le) {
				int idx = jlst.getSelectedIndex();
				
				if(idx != -1) {
					jlab.setText("Current selection : " + apples[idx]);
				}
				else {
					jlab.setText("Please Choose an Apple.");
				}
			}
		});
		
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JListDemo();
			}
		});
	}

}
