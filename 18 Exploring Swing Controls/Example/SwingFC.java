/*
 * A swing based file comparison utility.
 * It uses the try-with-resources statement and required JDK 7 or later.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class SwingFC implements ActionListener {

	JTextField jtfFirst;
	JTextField jtfSecond;
	
	JButton jtbnComp;
	
	JLabel jlabFirst,jlabSecond;
	JLabel jlabResult;
	
	JCheckBox jcbLoc;
	
	SwingFC() {
		
		JFrame jfrm = new JFrame("Compare Files");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(200,220);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jtfFirst = new JTextField(14);
		jtfSecond = new JTextField(14);
		
		JButton jbtnComp  =new JButton("Compare");
		jbtnComp.addActionListener(this);
		
		jlabFirst = new JLabel("First file: ");
		jlabSecond = new JLabel("Second file: ");
		jlabResult = new JLabel("");
		
		jcbLoc = new JCheckBox("Show position of mismatch");
		
		jfrm.add(jlabFirst);
		jfrm.add(jtfFirst);
		jfrm.add(jlabSecond);
		jfrm.add(jtfSecond);
		jfrm.add(jcbLoc);
		jfrm.add(jbtnComp);
		jfrm.add(jlabResult);		
		
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		int i = 0, j = 0;
		int count = 0;
		
		if(jtfFirst.getText().equals("")) {
			jlabResult.setText("First file name missing");
			return;
		}
		if(jtfSecond.getText().equals("")) {
			jlabResult.setText("Second file name missing");
			return;
		}
		
		
		try(FileInputStream f1 = new FileInputStream(jtfFirst.getText()) ;
				FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
			
			do {
				i = f1.read();
				j = f2.read();
				if(i != j) {
					break;
				}
				count++;
			} while(i != -1 && j != -1);
			
			if(i != j) {
				if(jcbLoc.isSelected()) {
					jlabResult.setText("Files differ at location " + count);
				}
				else {
					jlabResult.setText("Files are not the same");
				}
			}
			else {
				jlabResult.setText("Files compare equal");
			}
			
		}
		catch(IOException exc) {
			jlabResult.setText("File Error");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingFC();
			}
		});
	}

}
