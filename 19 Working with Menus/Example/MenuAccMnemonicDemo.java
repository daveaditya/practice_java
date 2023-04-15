// Create the file menu with mnemonics and accelerators.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuAccMnemonicDemo implements ActionListener {

	JLabel jlab;
	
	MenuAccMnemonicDemo() {
		
		JFrame jfrm = new JFrame("Menu Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(220,200);
		
		jlab = new JLabel();
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu jmFile = new JMenu("File");
		jmFile.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);
		jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jmiClose = new JMenuItem("Close",KeyEvent.VK_C);
		jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jmiSave = new JMenuItem("Save",KeyEvent.VK_S);
		jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jmiExit = new JMenuItem("Exit",KeyEvent.VK_E);
		jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		
		jmFile.add(jmiOpen);
		jmFile.add(jmiClose);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		jmb.add(jmFile);
		
		JMenu jmOptions = new JMenu("Options");
		
		JMenu jmColors = new JMenu("Colors");
		JMenuItem jmiRed = new JMenuItem("Red");
		JMenuItem jmiGreen = new JMenuItem("Green");
		JMenuItem jmiBlue = new JMenuItem("Blue");
		jmColors.add(jmiRed);
		jmColors.add(jmiGreen);
		jmColors.add(jmiBlue);
		jmOptions.add(jmColors);
		
		JMenu jmPriority = new JMenu("Priority");
		JMenuItem jmiHigh= new JMenuItem("High");
		JMenuItem jmiLow = new JMenuItem("Low");
		jmPriority.add(jmiHigh);
		jmPriority.add(jmiLow);
		jmOptions.add(jmPriority);
		
		JMenuItem jmiReset = new JMenuItem("Reset");
		jmOptions.addSeparator();
		jmOptions.add(jmiReset);
		
		jmb.add(jmOptions);
		
		JMenu jmHelp = new JMenu("Help");
		JMenuItem jmiAbout = new JMenuItem("About");
		jmHelp.add(jmiAbout);
		jmb.add(jmHelp);
		
		jmiOpen.addActionListener(this);
		jmiClose.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiRed.addActionListener(this);
		jmiGreen.addActionListener(this);
		jmiBlue.addActionListener(this);
		jmiHigh.addActionListener(this);
		jmiLow.addActionListener(this);
		jmiReset.addActionListener(this);
		jmiAbout.addActionListener(this);
		
		jfrm.add(jlab);
		jfrm.setJMenuBar(jmb);
		jfrm.setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		
		if(comStr.equals("Exit")) {
			System.exit(0);
		}
		jlab.setText(comStr + " Selected");
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MenuAccMnemonicDemo();
			}
		});
	}

}
