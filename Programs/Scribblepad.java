/*
<applet code=Scribblepad height=400 width=400>
</applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Scribblepad extends Applet implements MouseListener, MouseMotionListener{
	int x, y, nx, ny;
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseMoved(MouseEvent me){}
	public void mousePressed(MouseEvent me){
		x = me.getX();
		y = me.getY();
	}
	public void mouseDragged(MouseEvent me){
		nx = me.getX();
		ny = me.getY();
		repaint();
	}
	public void update(Graphics g){
		g.drawLine(x,y,nx,ny);
		x = nx;
		y = ny;
	}
}