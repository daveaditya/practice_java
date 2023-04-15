// A very simple JOptionPane demonstration.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MsgDialogDemo {
	
	JLabel jlab;
	JButton jbtnShow;
	JFrame jfrm;
	
	MsgDialogDemo() {
		
		JFrame jfrm = new JFrame("Simple Message Dialog");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(400,250);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel();
		
		jbtnShow = new JButton("Show Dialog");
		
		jbtnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Dialog Opened");
				JOptionPane.showMessageDialog(jfrm,"Disk space is low.");
				jlab.setText("Dialog Closed");
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
				new MsgDialogDemo();
			}
		});
	}

}
