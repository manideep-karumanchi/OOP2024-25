import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class JcomboboxDemo extends JFrame implements ItemListener{
	JLabel fl, cl, rl;
	JComboBox scb;
	String[]  countries = {"India", "Australia", "SouthAfrica", "Nepal"};
	JcomboboxDemo(){
		cl = new JLabel("Country:");
		fl = new JLabel("Flag");
		rl = new JLabel("");
		scb = new JComboBox(countries);
		Panel p = new Panel();
		p.add(cl); p.add(scb);
		add(p, BorderLayout.NORTH);
		add(fl);
		add(rl, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		scb.addItemListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie){
		String country = scb.getSelectedItem().toString();
		rl.setIcon(new ImageIcon("./flags/"+country+".png"));
	}
	public static void main(String[] args){
		
		new JcomboboxDemo();
	}
}