// Demonstrate JCheckBox.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JCheckBoxDemo implements ItemListener {

	JLabel jlabChange;
	JLabel jlabSupported;
	
	JCheckBox cbWin;
	JCheckBox cbLinux;
	JCheckBox cbMac;
	
	JCheckBoxDemo() {
		JFrame jfrm = new JFrame("JCheckBox Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(340,140);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cbWin = new JCheckBox("Windows");
		cbWin.addItemListener(this);
		jfrm.add(cbWin);
		
		cbLinux = new JCheckBox("Linux");
		cbLinux.addItemListener(this);
		jfrm.add(cbLinux);
		
		cbMac = new JCheckBox("Mac OS");
		cbMac.addItemListener(this);
		jfrm.add(cbMac);
		
		jlabChange = new JLabel("Select Supported Operating Systems");
		jfrm.add(jlabChange);
		
		jlabSupported = new JLabel();
		jfrm.add(jlabSupported);
		
		jfrm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie) {
		JCheckBox cb = (JCheckBox)ie.getItem();
		
		if(cb.isSelected()) {
			jlabChange.setText(cb.getText() + " has been selected");
		}
		else {
			jlabChange.setText(cb.getText() + " has been cleared");
		}
		
		String supported = "Supported Operating Systems: ";
		
		if(cbWin.isSelected()) {
			supported += "Windows ";
		}
		if(cbLinux.isSelected()) {
			supported += "Linux ";
		}
		if(cbMac.isSelected()) {
			supported += "Mac OS ";
		}
		
		jlabSupported.setText(supported);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JCheckBoxDemo();
			}
		});
	}

}
