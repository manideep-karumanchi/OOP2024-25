import java.awt.*;
import java.awt.event.*;
class RegistrationForm extends Frame implements ActionListener{
	Label nl, rl, gl, al, hl;
	TextField ntf, rtf;
	CheckboxGroup gcbg;
	Checkbox mcb, fcb, hcb1, hcb2, hcb3;
	Button rb, cb;
	TextArea ata;
	RegistrationForm(String title){
		super(title);
		
		nl = new Label("Name");
		rl = new Label("Regd. No.");
		gl = new Label("Gender");
		al = new Label("Address");
		hl = new Label("Hobbies");
		
		ntf = new TextField();
		rtf = new TextField();
		
		gcbg = new CheckboxGroup();
		mcb = new Checkbox("Male", gcbg, false);
		fcb = new Checkbox("Female", gcbg, false);
		Panel gp = new Panel();
		gp.add(mcb); gp.add(fcb);
		
		ata = new TextArea("", 5, 30, TextArea.SCROLLBARS_BOTH);
		
		hcb1 = new Checkbox("Watching TV");
		hcb2 = new Checkbox("Playing Games");
		hcb3 = new Checkbox("Browsing Internet");
		Panel hop = new Panel();
		hop.add(hcb1);hop.add(hcb2);hop.add(hcb3);
		
		rb = new Button("Register");
		cb = new Button("Clear");
		
		setLayout(new GridLayout(6,2));
		
		add(nl); add(ntf);
		add(rl); add(rtf);
		add(gl); add(gp);
		add(al); add(ata);
		add(hl); add(hop);
		add(rb); add(cb);
		
		rb.addActionListener(this);
		cb.addActionListener(this);
		
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent ae){
		Button src = (Button)ae.getSource();
		String op = "";
		if(src == rb){
			op += "Name: "+ntf.getText()+"\n";
			op += "Regd. No.: "+rtf.getText()+"\n";
			op += "gender:"+gcbg.getSelectedCheckbox().getLabel()+"\n";
			op += "Address: "+ata.getText()+"\n";
			op += "Hobbies:\n";
			if(hcb1.getState())
				op += "\t"+hcb1.getLabel()+"\n";
			if(hcb2.getState())
				op += "\t"+hcb2.getLabel()+"\n";
			if(hcb3.getState())
				op += "\t"+hcb3.getLabel()+"\n";
			Dialog d = new Dialog(this, "Registration Details", true);
			TextArea ta = new TextArea("Registration Successfull: Your details are:\n"+op);
			ta.setEditable(false);
			d.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					d.dispose();
				}
			});
			d.add(ta);
			d.setSize(200,200);
			d.setVisible(true);
			System.out.println(op);
		}
		else{
			ntf.setText("");
			rtf.setText("");
			ata.setText("");
			hcb1.setState(false);
			hcb2.setState(false);
			hcb3.setState(false);
		}
		
	}
	public static void main(String[] args){
		new RegistrationForm("Registration Form");
	}
}