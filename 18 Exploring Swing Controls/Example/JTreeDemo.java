// Demonstrate JTree.
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class JTreeDemo {
	
	JTree tree;
	JLabel jlab;
	
	JTreeDemo() {
		JFrame jfrm = new JFrame("JTree Example");
		jfrm.setSize(300,240);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Java Keywords");
		
		DefaultMutableTreeNode types = new DefaultMutableTreeNode("Types");
		root.add(types);
		
		DefaultMutableTreeNode fpTypes = new DefaultMutableTreeNode("Floating Point");
		types.add(fpTypes);
		fpTypes.add(new DefaultMutableTreeNode("float"));
		fpTypes.add(new DefaultMutableTreeNode("double"));
		
		DefaultMutableTreeNode intTypes = new DefaultMutableTreeNode("Integer");
		types.add(intTypes);
		intTypes.add(new DefaultMutableTreeNode("byte"));
		intTypes.add(new DefaultMutableTreeNode("short"));
		intTypes.add(new DefaultMutableTreeNode("int"));
		intTypes.add(new DefaultMutableTreeNode("long"));
		
		types.add(new DefaultMutableTreeNode("char"));
		types.add(new DefaultMutableTreeNode("boolean"));
		
		DefaultMutableTreeNode loops = new DefaultMutableTreeNode("Loops");
		root.add(loops);
		loops.add(new DefaultMutableTreeNode("for"));
		loops.add(new DefaultMutableTreeNode("while"));
		loops.add(new DefaultMutableTreeNode("do"));
		
		tree = new JTree(root);
		
		JScrollPane jsp = new JScrollPane(tree);
		
		jfrm.add(jsp);
		
		jlab = new JLabel("Select from the tree.");
		jfrm.add(jlab,BorderLayout.SOUTH);
		
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent tse) {
				jlab.setText("Selection is " + tse.getPath().getLastPathComponent());
			}
		});
		
		jfrm.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JTreeDemo();
			}
		});
	}

}
