/*<applet code=GraphicsClassMethods height=1300 width=1000>
	<param name=string value="Graphics Class Methods Demo" />
</applet>*/
import java.awt.*;
import java.applet.*;
public class GraphicsClassMethods extends Applet{
	public void init(){
		setBackground(Color.ORANGE);
		setForeground(Color.BLACK);
	}
	public void paint(Graphics g){
		g.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC, 20));
		String str = getParameter("string");
		g.drawString(str,300,30);
		g.drawLine(300,50,700,50);
		g.setColor(Color.RED);
		g.drawRect(10,80, 200, 100);
		g.fillRect(250,80, 200, 100);
		g.drawRoundRect(500, 80, 200, 100, 15, 15);
		g.fillRoundRect(750, 80, 200, 100, 15, 15);
		g.drawOval(10, 220, 200, 100);
		g.fillOval(250, 220, 200, 200);
		
		g.drawArc(10,450,200, 200, 0,90);
		g.fillArc(10,450,200, 200,0, -90);
		
		int[] x = {10, 10, 310, 310, 10, 160, 310};
		int[] y = {830, 1130, 1130, 830, 830, 680, 830};
		g.drawPolygon(x, y, 7);
	}
}