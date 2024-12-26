import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.io.*;
class JTreeDemo extends JFrame implements TreeSelectionListener{
	JTree jt;
	JTextArea jta;
	DefaultMutableTreeNode root, java, cpp;
	JTreeDemo(String title){
		super(title);
		
		root = new DefaultMutableTreeNode("Root");
		java = new DefaultMutableTreeNode("Java");
		cpp = new DefaultMutableTreeNode("C++");
		
		java.add(new DefaultMutableTreeNode("AppletLifeCycle.java"));
		java.add(new DefaultMutableTreeNode("KeyEventsDemo.java"));
		
		cpp.add(new DefaultMutableTreeNode("JcomboboxDemo.java"));
		cpp.add(new DefaultMutableTreeNode("OuterClass.java"));
		root.add(java);
		root.add(cpp);
		jt = new JTree(root);
		add(jt, BorderLayout.WEST);
		
		jta = new JTextArea(60,80);
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp);
		
		jt.addTreeSelectionListener(this);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(TreeSelectionEvent te){
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)jt.getLastSelectedPathComponent();
		
		if(node.isLeaf()){
			jta.setText("");
			try{
				BufferedReader br = new BufferedReader(new FileReader(node.toString()));
				String line = "";
				while((line = br.readLine()) != null){
					jta.append(line+"\n");
				}
				br.close();
			}catch(Exception e){}
		}
	}
	public static void main(String[] args){
		new JTreeDemo("JTree Demo");
	}
}