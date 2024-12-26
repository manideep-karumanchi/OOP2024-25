import geometricalshapes.Circle;
import geometricalshapes.Rectangle;
import geometricalshapes.threedshapes.Cube;
class GeometricalShapesDemo{
	public static void main(String[] args){
		Circle c = new Circle();
		System.out.println("Area of Circle: "+c.area());
		System.out.println("Circumference of Circle: "+c.circumference());
		Rectangle r = new Rectangle();
		Cube cu = new Cube();
	}
}