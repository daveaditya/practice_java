// A simple JScrollPane example.
import javax.swing.*;

class JScrollPaneDemo {
	
	JScrollPaneDemo() {
		
		JFrame jfrm = new JFrame("JScrollPane Example");
		jfrm.setSize(200,75);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlab = new JLabel("<html>JScrollPane simplifies what would <br>" +
		 "otherwise be complicated tasks.<br>" + 
				"component or lightweight container. It is <br>" + 
		 "especisally useful when scrolling tables, lists, <br>" +
				"or images.");
		
		JScrollPane jscrlp = new JScrollPane(jlab);
		
		jfrm.add(jscrlp);
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JScrollPaneDemo();
			}
		});
	}

}
