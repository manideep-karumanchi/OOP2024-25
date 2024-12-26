import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
class JTableDemo extends JFrame implements ActionListener{
	JButton ar, dr;
	JTable jt;
	DefaultTableModel model;
	
	JTableDemo(){
		model = new DefaultTableModel();
		model.addColumn("S. No.");
		model.addColumn("Department");
		model.addColumn("Location");
		
		String[] row1 = {"1", "CSE", "RP"};
		model.addRow(row1);
		
		String[] row2 = {"2", "IT", "RP"};
		model.addRow(row2);
		
		String[] row3 = {"3", "ECE", "MB"};
		model.addRow(row3);
		
		jt = new JTable(model);
		JScrollPane jsp = new JScrollPane(jt);
		add(jsp);
		
		ar = new JButton("Add Row");
		dr = new JButton("Delete Row");
		Panel p = new Panel();
		p.add(ar);p.add(dr);
		add(p, BorderLayout.NORTH);
		
		ar.addActionListener(this);
		dr.addActionListener(this);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae){
		JButton src = (JButton)ae.getSource();
		if(src == ar){
			model.addRow(new String[]{"","",""});
		}
		else{
			model.removeRow(jt.getSelectedRow());
		}
	}
	public static void main(String[] args){
		new JTableDemo();
	}
}