interface ITwoDShape{
	double pi = 3.14;
	double area();
	double perimeter();
	default void display(){
		System.out.println("Interface Display");
	}
	static void display2(){
		System.out.println("Interface:Display2");
	}
}
class ICircle implements ITwoDShape{
	double radius;
	ICircle(double r){
		radius = r;
	}
	public void display(){
		System.out.println("Circle");
	}
	public double area(){
		return IDisplay.pi * radius * radius;
	}
	public double perimeter(){
		return 2 * IDisplay.pi * radius;
	}
}
class TwoDShapesInterfaceDemo{
	public static void main(String[] args){
		ITwoDShape c = new ICircle(10.0);
		c.display();
		ITwoDShape.display2();
		System.out.println("Area of Circle: "+c.area());
		System.out.println("Perimeter of Circle: "+c.perimeter());
	}
}