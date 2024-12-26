/*
<applet code=ScribblepadAdapter height=400 width=400>
</applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ScribblepadAdapter extends Applet{
	int x, y, nx, ny;
	public void init(){
		addMouseListener(new MouseEventsHandler(this));
		addMouseMotionListener(new MouseMotionEventsHandler(this));
	}
	public void update(Graphics g){
		g.drawLine(x,y,nx,ny);
		x = nx;
		y = ny;
	}
}
class MouseEventsHandler extends MouseAdapter{
	ScribblepadAdapter s;
	MouseEventsHandler(ScribblepadAdapter s){
		this.s = s;
	}
	public void mousePressed(MouseEvent me){
		s.x = me.getX();
		s.y = me.getY();
	}
}
class MouseMotionEventsHandler extends MouseAdapter{
	ScribblepadAdapter s;
	MouseMotionEventsHandler(ScribblepadAdapter s){
		this.s = s;
	}
	public void mouseDragged(MouseEvent me){
		s.nx = me.getX();
		s.ny = me.getY();
		s.repaint();
	}
}
