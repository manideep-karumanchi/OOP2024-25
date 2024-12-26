package geometricalshapes;
public class Circle{
	int radius;
	final double PI = 3.14;
	public Circle(){
		radius = 5;
	}
	public Circle(int radius){
		this.radius = radius;
	}
	public double area(){
		return PI * radius * radius;
	}
	public double circumference(){
		return 2* PI * radius;
	}
}