// Paint lines to a panel.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// This class extends JPanel. It overrides
// the paintComponent() method so that random
// data is plotted in the panel.

@SuppressWarnings("serial")
class PaintPanel extends JPanel {
	Insets ins;
	Random rand;
	
	PaintPanel(int w,int h) {
		setBorder(BorderFactory.createLineBorder(Color.RED,1));
		setPreferredSize(new Dimension(w,h));
		rand = new Random();
	}
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int height = getHeight();
		int width = getHeight();
		
		ins = getInsets();
		
		for(int i=ins.left+5 ; i<=width-ins.right-5 ; i+=4) {
			int h = rand.nextInt(height-ins.bottom);
			
			if(h<=ins.top) {
				h = ins.top + 1;
			}
			
			g.drawLine(i,height-ins.bottom,i,h);
		}
	}
	
	public void changeBorderSize(int size) {
		setBorder(BorderFactory.createLineBorder(Color.RED,size));
	}
}

class PaintDemo {
	
	JButton jbtnMore;
	JButton jbtnSize;
	JLabel jlab;
	PaintPanel pp;
	
	boolean big;
	
	PaintDemo() {
		
		JFrame jfrm = new JFrame("Painting Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(240,260);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pp = new PaintPanel(100,100);
		
		jbtnMore = new JButton("Show More Data");
		jbtnSize = new JButton("Change Border Size");
		
		jlab = new JLabel("Bar Graph of Random Data");
		
		jbtnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				pp.repaint();
			}
		});
		
		jbtnSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!big) {
					pp.changeBorderSize(5);
				}
				else {
					pp.changeBorderSize(1);
				}
				big = !big;
			}
		});
		
		jfrm.add(jlab);
		jfrm.add(pp);
		jfrm.add(jbtnMore);
		jfrm.add(jbtnSize);
		
		big = false;
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new PaintDemo();
			}
		});
	}

}
