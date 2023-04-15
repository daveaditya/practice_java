// Demonstrate a text field.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JTextFieldDemo implements ActionListener {
	
	JTextField jtf;
	JLabel jlab;
	
	public JTextFieldDemo() {
		JFrame jfrm = new JFrame("A Text Field Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(240, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jtf = new JTextField(10);
		jtf.addActionListener(this);
		jfrm.add(jtf);
		
		jlab = new JLabel("");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		jlab.setText("Current contents: " + jtf.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JTextFieldDemo();
			}
		});
	}

}