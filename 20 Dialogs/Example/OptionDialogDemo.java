// Demonstrate an option dialog.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OptionDialogDemo {
	
	JLabel jlab;
	JButton jbtnShow;
	JFrame jfrm;
	
	OptionDialogDemo() {
		
		jfrm = new JFrame("A Simple Option Dialog");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(400,250);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel();
		
		jbtnShow = new JButton("Show Dialog");
		
		jbtnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String[] connectOpts = {
					"Modem", "Wireless", "Satellite", "Cable"	
				};
				
				int response = JOptionPane.showOptionDialog(jfrm,"Choose Network Connection","Connection Type",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,connectOpts,"Wireless");
				
				switch(response) {
					case 0:
						jlab.setText("Connect via modem.");
						break;
					case 1:
						jlab.setText("Connect via wireless.");
						break;
					case 2:
						jlab.setText("Connect via satellite.");
						break;
					case 3:
						jlab.setText("Connect via cable.");
						break;
					case JOptionPane.CLOSED_OPTION:
						jlab.setText("Dialog cancelled.");
						break;	
				}
			}
		});
		
		jfrm.add(jbtnShow);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new OptionDialogDemo();
			}
		});
	}

}
