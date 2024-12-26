import java.awt.*;
import java.awt.event.*;
class FirstFrame extends Frame implements WindowListener{
	String msg;
	FirstFrame(String title){
		super(title);
		setVisible(true);
		setSize(300,300);
		addWindowListener(this);
	}
	public void windowActivated(WindowEvent we){
		msg = "windowActivated";
		System.out.println(msg);
	}
	public void windowClosed(WindowEvent we){
		msg = "windowClosed";
		System.out.println(msg);
	}
	public void windowClosing(WindowEvent we){
		msg = "windowClosing";
		System.out.println(msg);
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we){
		msg = "windowDeActivated";
		System.out.println(msg);
	}
	public void windowDeiconified(WindowEvent we){
		msg = "windowDeiconified";
		System.out.println(msg);
	}
	public void windowIconified(WindowEvent we){
		msg = "windowIconified";
		System.out.println(msg);
	}
	public void windowOpened(WindowEvent we){
		msg = "windowOpened";
		System.out.println(msg);
	}
	public static void main(String[] args){
		new FirstFrame("FirstFrame");
	}
}