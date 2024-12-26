import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JComboBoxExample extends JFrame implements ItemListener{
	JLabel cl, fl, rl;
	JComboBox cjcb;
	
	JComboBoxExample(String title){
		super(title);
		cl = new JLabel("Choose Country:");
		String[] countries = {"India", "Australia", "SouthAfrica", "Nepal", "Pakistan"};
		cjcb = new JComboBox(countries);
		Panel p = new Panel();
		p.add(cl); p.add(cjcb);
		
		fl = new JLabel("Flag");
		rl = new JLabel();
		
		add(p, BorderLayout.NORTH);
		add(fl);
		add(rl, BorderLayout.SOUTH);
		
		cjcb.addItemListener(this);
		setVisible(true);
		setSize(350,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie){
		String country = cjcb.getSelectedItem().toString();
		rl.setIcon(new ImageIcon("./flags/"+country+".png"));
	}
	public static void main(String[] args){
		new JComboBoxExample("JComboBox");
	}
}