// Demonstrate a custom file filter.
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

class JavaFileFilter extends FileFilter {

	public boolean accept(File file) {
		if(file.getName().endsWith(".java")) {
			return(true);
		}
		
		if(file.isDirectory()) {
			return(true);
		}
		
		return(false);
	}
	public String getDescription() {
		return "Java Source Code Files";
	}
}

public class FileFilterDemo {

	JLabel jlab;
	JButton jbtnShow;
	JFileChooser jfc;
	
	FileFilterDemo() {
		
		JFrame jfrm = new JFrame("File Filter Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(400,200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel();
		jbtnShow = new JButton("Show File Chooser");
		
		jfc = new JFileChooser();
		
		jfc.setFileFilter(new JavaFileFilter());
		
		jbtnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int result = jfc.showOpenDialog(null);
				
				if(result == JFileChooser.APPROVE_OPTION) {
					jlab.setText("Selected file is: " + jfc.getSelectedFile().getName());
				}
				else {
					jlab.setText("No file selected");
				}
			}
		});
		
		jfrm.add(jbtnShow);
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FileFilterDemo();
			}
		});
	}


}