package geometricalshapes;
public class Rectangle{
	int l, b;
	public Rectangle(){
		l = 5;
		b = 5;
	}
	public Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	public int area(){
		return l*b;
	}
	public int perimeter(){
		return 2 * (l + b); 
	}
}