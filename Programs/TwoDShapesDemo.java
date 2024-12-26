abstract class TwoDShape{
	double pi = 3.14;
	abstract double area();
	abstract double perimeter();
}
class Circle extends TwoDShape{
	double pi = 3.1;
	double radius;
	Circle(double r){
		radius = r;
	}
	void display(){
		System.out.println("PI = "+super.pi);
	}
	double area(){
		return pi * radius * radius;
	}
	double perimeter(){
		return 2 * pi * radius;
	}
}
class TwoDShapesDemo{
	public static void main(String[] args){
		Circle c = new Circle(10.0);
		System.out.println("Area of Circle: "+c.area());
		System.out.println("Perimeter of Circle: "+c.perimeter());
		c.display();
	}
}