// Demonstrate a simple main menu.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioCheckBoxMenuItemDemo implements ActionListener {

	JLabel jlab;
	
	RadioCheckBoxMenuItemDemo() {
		
		JFrame jfrm = new JFrame("Menu Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(220,200);
		
		jlab = new JLabel();
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu jmFile = new JMenu("File");
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiClose = new JMenuItem("Close");
		JMenuItem jmiSave = new JMenuItem("Save");
		JMenuItem jmiExit = new JMenuItem("Exit");
		jmFile.add(jmiOpen);
		jmFile.add(jmiClose);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		jmb.add(jmFile);
		
		JMenu jmOptions = new JMenu("Options");
		
		JMenu jmColors = new JMenu("Colors");
		
		JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
		JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
		JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");
		
		jmColors.add(jmiRed);
		jmColors.add(jmiGreen);
		jmColors.add(jmiBlue);
		
		jmOptions.add(jmColors);
		
		JMenu jmPriority = new JMenu("Priority");
		JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High");
		JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");
		
		jmPriority.add(jmiHigh);
		jmPriority.add(jmiLow);
		
		jmOptions.add(jmPriority);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jmiHigh);
		bg.add(jmiLow);
		
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
				new RadioCheckBoxMenuItemDemo();
			}
		});
	}

}
