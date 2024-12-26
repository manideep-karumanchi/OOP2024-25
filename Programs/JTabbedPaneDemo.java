import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JTabbedPaneDemo extends JFrame implements ActionListener, ItemListener{
	JLabel ul, pl, sl, cl, rl;
	JTextField utf, ptf;
	JButton lb, rb;
	JComboBox scb;
	JTabbedPane jtp;
	String[] states = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"};
	String[] capitals = {"Amaravati", "Itanagar", "Dispur", "Patna", "Raipur", "Panaji", "Gandhinagar", "Chandigarh", "Shimla", "Ranchi", "Bengaluru", "Thiruvananthapuram", "Bhopal", "Mumbai", "Imphal", "Shillong", "Aizawl", "Kohima", "Bhubaneswar", "Chandigarh", "Jaipur", "Gangtok", "Chennai", "Hyderabad", "Agartala", "Lucknow", "Dehradun (Winter) Gairsain (Summer)", "Kolkata"};
	JTabbedPaneDemo(){
		super("JTabbedPane Demo");
		jtp = new JTabbedPane();
		
		ul = new JLabel("User Name:");
		utf = new JTextField(20);
		pl = new JLabel("Password:");
		ptf = new JTextField(20);
		lb = new JButton("Login");
		rb = new JButton("Reset");
		
		Panel lp = new Panel();
		lp.add(ul); lp.add(utf);
		lp.add(pl); lp.add(ptf);
		lp.add(lb); lp.add(rb);
		jtp.addTab("Login", lp);
		
		sl = new JLabel("Chhose State:");
		scb = new JComboBox(states);
		cl = new JLabel("Capital city:");
		rl = new JLabel();
		Panel pnl = new Panel();
		pnl.add(sl); pnl.add(scb);
		pnl.add(cl); pnl.add(rl);
		jtp.addTab("States and Capitals",pnl);
		
		lb.addActionListener(this);
		rb.addActionListener(this);
		scb.addItemListener(this);
		
		add(jtp);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae){
		JButton src = (JButton)ae.getSource();
		String res = "";
		if(src == lb){
			res = "Login Successful";
		}
		else{
			res = "Resetted";
		}
		Dialog d = new Dialog(this, "Login Message", true);
		d.add(new JLabel(res));
		JButton b = new JButton("OK");
		b.addActionListener((e) -> d.dispose());
		d.add(b,BorderLayout.SOUTH);
		d.setSize(200,200);
		d.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie){
		int index = scb.getSelectedIndex();
		rl.setText(capitals[index]);
	}
	public static void main(String[] args){
		new JTabbedPaneDemo();
	}
	
}