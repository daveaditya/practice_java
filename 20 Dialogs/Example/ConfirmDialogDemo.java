// Use a simple confirmation dialog.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ConfirmDialogDemo {
	
	JLabel jlab;
	JButton jbtnShow;
	JFrame jfrm;
	
	ConfirmDialogDemo() {
		
		jfrm = new JFrame("A Confirmation Dialog");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(400,250);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel();
		jbtnShow = new JButton("Show Dialog");
		
		jbtnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int response = JOptionPane.showConfirmDialog(jfrm,"Remove unused files?");
				
				switch(response) {
					case JOptionPane.YES_OPTION:
						jlab.setText("You answere Yes.");
						break;
					case JOptionPane.NO_OPTION:
						jlab.setText("You answere No.");
						break;
					case JOptionPane.CANCEL_OPTION:
						jlab.setText("Cancel pressed.");
						break;
					case JOptionPane.CLOSED_OPTION:
						jlab.setText("Dialog closed without response.");
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
				new ConfirmDialogDemo();
			}
		});
	}

}
