class StaticDemo{
	static int a = 1;
	static void display(){
		System.out.println("a="+a);
	}
	static{
		System.out.println("Inside Static Block");
	}
}
class StaticMain{
	public static void main(String[] args){
		StaticDemo.a = 2;
		StaticDemo.display();
	}
}