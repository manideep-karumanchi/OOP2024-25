/*<applet code="AppletLifeCycle" height="300" width="300">
</applet>*/
import java.applet.*;
import java.awt.*;
public class AppletLifeCycle extends Applet{
	String msg = "";
	public void init(){
		msg += "--INIT--";
	}
	public void start(){
		msg += "--Start--";
	}
	public void stop(){
		msg += "--STOP--";
	}
	public void destroy(){
		msg += "--Destroy--";
	}
	public void paint(Graphics g){
		msg += "--Paint--";
		showStatus(msg);
	}
}