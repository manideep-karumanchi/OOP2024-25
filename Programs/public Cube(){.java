package geometricalshapes.threedshapes;
public class Cube{
	int l, b, h;
	public Cube(){
		l = 5;
		b = 5;
		h = 5;
	}
	public Cube(int l, int b, int h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public int area(){
		return l * b* h;
	}
	
}