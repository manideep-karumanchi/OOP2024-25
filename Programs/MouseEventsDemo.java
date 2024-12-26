/*<applet code=MouseEventsDemo height=400 width=400>
</applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MouseEventsDemo extends Applet implements MouseListener, MouseMotionListener{
	int x, y;
	String event = "";
	public void init(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me){
		x = me.getX();
		y = me.getY();
		event = "Mouse Clicked:";
		repaint();
	}
	public void mouseEntered(MouseEvent me){
		x = me.getX();
		y = me.getY();
		event = "Mouse Entered:";
		repaint();
	}
	public void mouseExited(MouseEvent me){
		x = me.getX();
		y = me.getY();
		event = "Mouse Exited:";
		repaint();
	}
	public void mousePressed(MouseEvent me){
		x = me.getX();
		y = me.getY();
		event = "Mouse Pressed:";
		repaint();
	}
	public void mouseReleased(MouseEvent me){
		x = me.getX();
		y = me.getY();
		event = "Mouse Released:";
		repaint();
	}
	public void mouseMoved(MouseEvent me){
		x = me.getX();
		y = me.getY();
		event = "Mouse moving at:";
		repaint();
	}
	public void mouseDragged(MouseEvent me){
		x = me.getX();
		y = me.getY();
		event = "Mouse dragging at:";
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(event+"("+x+","+y+")", x, y);
	}
}