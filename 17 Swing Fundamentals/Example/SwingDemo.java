// A simple Swing program.
import javax.swing.*;

class SwingDemo {
	public SwingDemo() {
		JFrame jfrm = new JFrame("A Simple Swing Application");
		jfrm.setSize(275, 100);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlab = new JLabel("Swing define the modern Java GUI.");
		jfrm.add(jlab);
		jfrm.setVisible(true);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}

}
