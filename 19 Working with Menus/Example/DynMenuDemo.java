// Add and remove menu items dynamically.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DynMenuDemo implements ActionListener {

	JLabel jlab;
	
	JMenuItem jmiYellow = new JMenuItem("Yellow");
	JMenuItem jmiPurple = new JMenuItem("Purple");
	JMenuItem jmiOrange = new JMenuItem("Orange");
	
	JMenu jmColors;
	
	DynMenuDemo() {
		
		JFrame jfrm = new JFrame("Dynamic Menu Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220,200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		jmColors = new JMenu("Colors");
		JMenuItem jmiRed = new JMenuItem("Red");
		JMenuItem jmiGreen = new JMenuItem("Green");
		JMenuItem jmiBlue = new JMenuItem("Blue");
		jmColors.add(jmiRed);
		jmColors.add(jmiGreen);
		jmColors.add(jmiBlue);
		
		JMenuItem jmiMoreLess = new JMenuItem("More Colors");
		jmColors.add(jmiMoreLess);
		
		jmOptions.add(jmColors);
		
		JMenuItem jmiYellow = new JMenuItem("Yellow");
		JMenuItem jmiPurple = new JMenuItem("Purple");
		JMenuItem jmiOrange = new JMenuItem("Orange");
				
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
		
		jmiMoreLess.addActionListener(this);
		jmiYellow.addActionListener(this);
		jmiPurple.addActionListener(this);
		jmiOrange.addActionListener(this);
		
		jfrm.add(jlab);
		jfrm.setJMenuBar(jmb);
		jfrm.setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		
		if(comStr.equals("Exit")) {
			System.exit(0);
		}
		else if(comStr.equals("More Colors")) {
			jmColors.add(jmiYellow);
			jmColors.add(jmiPurple);
			jmColors.add(jmiOrange);
			JMenuItem mi = (JMenuItem)ae.getSource();
			mi.setText("Fewer Colors");
		}
		else if(comStr.equals("Fewer Colors")) {
			jmColors.remove(jmiYellow);
			jmColors.remove(jmiPurple);
			jmColors.remove(jmiOrange);
			JMenuItem mi = (JMenuItem)ae.getSource();
			mi.setText("More Colors");
		}
		jlab.setText(comStr + " Selected");
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DynMenuDemo();
			}
		});
	}

}
