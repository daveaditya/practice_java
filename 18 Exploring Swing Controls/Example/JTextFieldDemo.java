// Demonstrate various features of a text field.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.*;

class JTextFieldDemo {
	
	JLabel jlabAll;
	JLabel jlabSelected;
	
	JTextField jtf;
	
	JButton jbtnCut;
	JButton jbtnPaste;
	
	public JTextFieldDemo() {
		
		JFrame jfrm = new JFrame("JTextField Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(200,150);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabAll = new JLabel("All text: ");
		jlabSelected = new JLabel("Selected text: ");
		
		jtf = new JTextField("This is a test.",15);
		
		jtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlabAll.setText("All text: " + jtf.getText());
				
				if(jtf.getSelectedText() != null) {
					jlabSelected.setText("Selected text: " + jtf.getSelectedText());
				}
			}
		});
		
		jbtnCut = new JButton("Cut");
		jbtnPaste = new JButton("Paste");
		
		jbtnCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jtf.cut();
				jlabAll.setText("All text: " + jtf.getText());
				
				if(jtf.getSelectedText() != null) {
					jlabSelected.setText("Selected text: " + jtf.getSelectedText());
				}
			}
		});
		
		jbtnPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jtf.paste();
			}
		});
		
		jfrm.add(jtf);
		jfrm.add(jbtnCut);
		jfrm.add(jbtnPaste);
		jfrm.add(jlabAll);
		jfrm.add(jlabSelected);
		
		jfrm.setVisible(true);
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
