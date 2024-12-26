import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class JTempConverter extends JFrame implements ActionListener{
	JLabel cl, fl;
	JTextField ctf, ftf;
	JButton c2f, f2c;
	JTempConverter(){
		super("Temp Converter Swings");
		cl = new JLabel(new ImageIcon("./Swings Images/ct.png"));
		ctf = new JTextField(20);
		Panel cpnl = new Panel();
		cpnl.add(cl); cpnl.add(ctf);
		
		fl = new JLabel(new ImageIcon("./Swings Images/ft.png"));
		ftf = new JTextField(20);
		Panel fpnl = new Panel();
		fpnl.add(fl); fpnl.add(ftf);
		
		c2f = new JButton("Celsius to Fahrenheit");
		f2c = new JButton("Fahrenheit to Celsius");
		Panel bpnl = new Panel();
		bpnl.add(c2f); bpnl.add(f2c);
		
		add(cpnl, BorderLayout.NORTH);
		add(fpnl, BorderLayout.CENTER);
		add(bpnl, BorderLayout.SOUTH);
		
		c2f.addActionListener(this);
		f2c.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		JButton src = (JButton)ae.getSource();
		if(src == c2f){
			String ct = ctf.getText();
			if(!ct.equals("")){
				double ctd = Double.parseDouble(ct);
				double ft = ctd * (9.0/5.0) + 32;
				ftf.setText(ft+"");
			}
		}
		else{
			String ft = ftf.getText();
			if(!ft.equals("")){
				double ftd = Double.parseDouble(ft);
				double ct = (ftd - 32) * (5.0/9.0);
				ctf.setText(ct+"");
			}
		}
	}
	public static void main(String[] args){
		new JTempConverter();
		
	}
}