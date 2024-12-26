import java.awt.*;
import java.awt.event.*;
class RegistrationForm1 extends Frame implements ActionListener{
	Label nl, rl, gl, al, hl;
	TextField ntf, rtf;
	CheckboxGroup gcbg;
	Checkbox mcb, fcb, hcb1, hcb2, hcb3;
	Button rb, cb;
	TextArea ata;
	RegistrationForm1(String title){
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
		
		ata = new TextArea("", 5, 30, TextArea.SCROLLBARS_BOTH);
		
		hcb1 = new Checkbox("Watching TV");
		hcb2 = new Checkbox("Playing Games");
		hcb3 = new Checkbox("Browsing Internet");
		
		rb = new Button("Register");
		cb = new Button("Clear");
		
		setLayout(new GridLayout(6,2));
		
		rb.addActionListener(this);
		cb.addActionListener(this);
		setVisible(true);
		setSize(600,600);
		add(rb);
	}
	public void actionPerformed(ActionEvent ae){
		Dialog d = new Dialog(this, true);
		TextArea l = new TextArea("Hello\nHi");
		l.setEditable(false);
		d.add(l);
		d.setSize(300,300);
		d.setVisible(true);
		
		
		
	}
	public static void main(String[] args){
		new RegistrationForm1("Ex");
		
	}
}