import java.awt.*;
import java.awt.event.*;
class BookStore extends Frame implements ItemListener{
	Label sbl, cvl;
	Checkbox ccb, cppcb, jcb;
	Panel sbpnl;
	double bc;
	BookStore(String title){
		super(title);
		sbl = new Label("Select Books");
		cvl = new Label("Cart Value: ");
		
		ccb = new Checkbox("C");
		cppcb = new Checkbox("C++");
		jcb = new Checkbox("Java");
		
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
		Checkbox src = (Checkbox)ie.getSource();
		if(src == ccb){
			bc += ccb.getState()?200.25:-200.25;
		}
		else if(src == cppcb){
			bc += cppcb.getState()?300.75:-300.75;
		}
		else{
			bc += jcb.getState()?500.25:-500.25; 
		}
		cvl.setText("Cart Value: "+bc);
	}
	public static void main(String[] args){
		BookStore b = new BookStore("Book Store Frame");
		b.setVisible(true);
		b.setSize(300,300);
	}
}