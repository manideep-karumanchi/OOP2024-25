import java.awt.*;
import java.awt.event.*;
class BookStore_RB extends Frame implements ItemListener{
	Label sbl, cvl;
	Checkbox ccb, cppcb, jcb;
	Panel sbpnl;
	CheckboxGroup cb;
	double bc;
	BookStore_RB(String title){
		super(title);
		sbl = new Label("Select Books");
		cvl = new Label("Cart Value: ");
		
		cb = new CheckboxGroup();
		ccb = new Checkbox("C", cb, false);
		cppcb = new Checkbox("C++", cb, false);
		jcb = new Checkbox("Java", cb, false);
		
		
		sbpnl = new Panel();
		sbpnl.add(sbl);
		sbpnl.add(ccb); sbpnl.add(cppcb); sbpnl.add(jcb);
		
		add(sbpnl, BorderLayout.CENTER);
		add(cvl, BorderLayout.SOUTH);
		
		ccb.addItemListener(this);
		cppcb.addItemListener(this);
		jcb.addItemListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
	}
	public void itemStateChanged(ItemEvent ie){
		Checkbox src = cb.getSelectedCheckbox();
		if(src == ccb){
			bc = 200.25;
		}
		else if(src == cppcb){
			bc = 300.75;
		}
		else{
			bc = 500.25; 
		}
		cvl.setText("Cart Value: "+bc);
	}
	public static void main(String[] args){
		BookStore_RB b = new BookStore_RB("Book Store Frame");
		b.setVisible(true);
		b.setSize(300,300);
	}
}