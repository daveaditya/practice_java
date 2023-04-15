// Demonstrate a simple JDialog.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JDialogModelessDemo {
	
	JLabel jlab;
	JButton jbtnShow;
	JButton jbtnReset;
	JButton jbtnUp;
	JButton jbtnDown;
	JDialog jdlg;
	
	JDialogModelessDemo() {
		
		JFrame jfrm = new JFrame("JDialog Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(400,200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel("Direction is pending.");
		jbtnShow = new JButton("Show Dialog");
		jbtnReset = new JButton("Reset Direction");
		
		jdlg = new JDialog(jfrm,"Direction");
		jdlg.setSize(200,100);
		jdlg.setLayout(new FlowLayout());
		
		jbtnUp = new JButton("Up");
		jbtnDown = new JButton("Down");
		
		jdlg.add(jbtnUp);
		jdlg.add(jbtnDown);
		
		jdlg.add(new JLabel("Press a button."));
		
		jbtnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jdlg.setVisible(true);
			}
		});
		
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Direction is pending.");
			}
		});
		
		jbtnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Direction is Up");
			}
		});
		
		jbtnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Direction is Down");
			}
		});
		
		jfrm.add(jbtnShow);
		jfrm.add(jbtnReset);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JDialogModelessDemo();
			}
		});
	}

}
