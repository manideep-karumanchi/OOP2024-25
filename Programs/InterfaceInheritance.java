interface ITwoDShape{
	double pi = 3.14;
	double area();
	double perimeter();
	interface IDisplay{
		void display();
	}
}

class ICircle implements ITwoDShape.IDisplay{
	double radius;
	ICircle(double r){
		radius = r;
	}
	public void display(){
		System.out.println("Circle");
	}
	public double area(){
		return pi * radius * radius;
	}
	public double perimeter(){
		return 2 * pi * radius;
	}
}
class InterfaceInheritance{
	public static void main(String[] args){
		ICircle c = new ICircle(10.0);
		c.display();
		System.out.println("Area of Circle: "+c.area());
		System.out.println("Perimeter of Circle: "+c.perimeter());
	}
}