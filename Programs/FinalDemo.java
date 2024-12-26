final class FinalExample{
	final int fv = 10;
	FinalExample(){
		fv = 10;
	}
	final void display(){
		System.out.println("Parent Class: Final Example");
	}
}
class ChildClass extends FinalExample{
	void display(){
		System.out.println("Parent Class: Final Example");
	}
}
class FinalDemo{
	public static void main(String[] args){
		FinalExample fe = new FinalExample();
		fe.display();
	}
}