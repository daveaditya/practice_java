// Use a JScrollPane to scall a JPanel.
import java.awt.*; 
import javax.swing.*;

class ScrollJPanelDemo {
	
	ScrollJPanelDemo() {
		JFrame jfrm = new JFrame("Scroll a JPanel");
		jfrm.setSize(280,130);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlabOptions  =new JLabel("Select one or more options : ");
		
		JCheckBox jcbOpt1 = new JCheckBox("Option One");
		JCheckBox jcbOpt2 = new JCheckBox("Option Two");
		JCheckBox jcbOpt3 = new JCheckBox("Option Three");
		JCheckBox jcbOpt4 = new JCheckBox("Option Four");
		JCheckBox jcbOpt5 = new JCheckBox("Option Five");
		JCheckBox jcbOpt6 = new JCheckBox("Option Six");
		JCheckBox jcbOpt7 = new JCheckBox("Option Seven");
		JCheckBox jcbOpt8 = new JCheckBox("Option Eight");
		JCheckBox jcbOpt9 = new JCheckBox("Option Nine");
		JCheckBox jcbOpt10 = new JCheckBox("Option Ten");
		
		JPanel jpn1 = new JPanel();
		jpn1.setLayout(new GridLayout(5,3));
		
		jpn1.add(jlabOptions);
		jpn1.add(new JLabel(""));
		jpn1.add(new JLabel(""));
		
		jpn1.add(jcbOpt1);
		jpn1.add(jcbOpt2);
		jpn1.add(jcbOpt3);
		jpn1.add(jcbOpt4);
		jpn1.add(jcbOpt5);
		jpn1.add(jcbOpt6);
		jpn1.add(jcbOpt7);
		jpn1.add(jcbOpt8);
		jpn1.add(jcbOpt9);
		jpn1.add(jcbOpt10);
		
		JScrollPane jscrlp = new JScrollPane(jpn1);
		
		jfrm.add(jscrlp);
		jfrm.setVisible(true);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ScrollJPanelDemo();
			}
		});
	}

}
