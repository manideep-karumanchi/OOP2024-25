/*<applet code = Banner height=300 width=300>
</applet>*/
import java.applet.*;
import java.awt.*;
public class Banner extends Applet implements Runnable{
	Thread t;
	boolean flag;
	String msg = "A simple Moving Banner";
	public void init(){
		setBackground(Color.red);
		setForeground(Color.white);
	}
	public void start(){
		t = new Thread(this);
		flag = true;
		t.start();
	}
	public void run(){
		for(;;){
			repaint();
			try{
				Thread.sleep(250);
			}catch(InterruptedException e){}
			if(flag == false){
				break;
			}
		}
	}
	public void paint(Graphics g){
		char ch = (char) msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg = msg + ch;
		g.drawString(msg, 50, 50);
	}
	public void stop(){
		flag = false;
		t = null;
	}
}