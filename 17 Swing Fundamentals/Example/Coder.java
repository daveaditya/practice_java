// A simple code machine.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Coder implements ActionListener {

	JTextField jtfPlaintext;
	JTextField jtfCiphertext;
	
	Coder() {
		JFrame jfrm = new JFrame("A Simple Code Machine");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(340,130);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlabPlaintext = new JLabel("   Plain Text: ");
		JLabel jlabCiphertext = new JLabel("   Cipher Text: ");
		
		jtfPlaintext = new JTextField(20);
		jtfCiphertext = new JTextField(20);
		
		jtfPlaintext.setActionCommand("Encode");
		jtfCiphertext.setActionCommand("Decode");
		
		jtfPlaintext.addActionListener(this);
		jtfCiphertext.addActionListener(this);
		
		jfrm.add(jlabPlaintext);
		jfrm.add(jtfPlaintext);
		jfrm.add(jlabCiphertext);
		jfrm.add(jtfCiphertext);
		
		JButton jbtnEncode = new JButton("Encode");
		JButton jbtnDecode = new JButton("Decode");
		JButton jbtnReset = new JButton("Reset");
		
		jbtnEncode.addActionListener(this);
		jbtnDecode.addActionListener(this);
		jbtnReset.addActionListener(this);
		
		jfrm.add(jbtnEncode);
		jfrm.add(jbtnDecode);
		jfrm.add(jbtnReset);
		
		jfrm.setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Encode")) {
			String encStr = "";
			String str = jtfPlaintext.getText();
			
			for(int i=0;i<str.length();i++) {
				encStr += (char)(str.charAt(i)+1);
			}
			
			jtfCiphertext.setText(encStr.toString());
		}
		else if(ae.getActionCommand().equals("Decode")) {
			String decStr = "";
			String str = jtfCiphertext.getText();
			
			for(int i=0;i<str.length();i++) {
				decStr += (char)(str.charAt(i) - 1);
			}
			
			jtfCiphertext.setText(decStr.toString());
		}
		else {
			jtfPlaintext.setText("");
			jtfCiphertext.setText("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Coder();
			}
		});
	}

}
