// Demonstrate JTable.
//import java.awt.*;
import javax.swing.*;

class JTableDemo {
	
	JTableDemo() {
		JFrame jfrm = new JFrame("JTabel Example");
		jfrm.setSize(400,300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] Headings = {
			"Name", "Student ID", "Midterm", "Final"	
		};
		
		String[][] data = {
				{"Tom", " 4-616", " 97", " 87"},
				{"Ken", " 3-786", " 88", " 95"},
				{"Rachel", " 4-674", " 92", " 83"},
				{"Sherry", " 3-235", " 91", " 99"},
				{"Adam", " 2-923", " 76", " 96"},
				{"Jon", " 3-561", " 84", " 80"},
				{"Stuart", " 1-337", " 62", " 74"},
				{"Mary", " 4-731", " 68", " 58"},
				{"Todd", " 2-924", " 82", " 72"},
				{"Shane", " 2-434", " 93", " 91"},
				{"Robert", " 3-769", " 99", " 92"},
		};
		
		JTable table = new JTable(data,Headings);
		
		JScrollPane jsp = new JScrollPane(table);
		
		jfrm.add(jsp);
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JTableDemo();
			}
		});
	}

}
