import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KeyEventsDemo extends Applet implements KeyListener{
	int x = 250, y = 250, dx, dy;
	String msg = "Key event - ";
	public void init(){
		setFocusable(true);
		this.addKeyListener(this);
	}
	public void paint(Graphics g){
		g.fillOval(x+dx, y+dy, 30, 30);
		g.drawString(msg, 50, 100);
		msg = "Key event - ";
	}
	public void keyTyped(KeyEvent e){
		msg = msg + "Key typed: "+e.getKeyChar();
		repaint();
	}
	public void keyReleased(KeyEvent e){
		showStatus(msg + "Key Released: "+e.getKeyChar());
	}
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			dy += -2;
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			dy += 2;
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			dx += -2;
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			dx += 2;
		}
		repaint();
	}
}