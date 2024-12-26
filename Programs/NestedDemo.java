class Outer{
	int a = 10;
	void display(){
		System.out.println("a="+a);
	}
	static class Nested{
		Outer o = new Outer();
		int b = 100;
		void nestedDisplay(){
			System.out.println("o.a="+o.a+" b="+b);
		}
	}
}
class NestedDemo{
	public static void main(String[] args){
		Outer.Nested n = new Outer.Nested();
		n.nestedDisplay();
	}
}