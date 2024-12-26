class A{
	void display(){
		System.out.println("A");
	}
}
class B extends A{
	void display(){
		System.out.println("B");
	}
}
class C extends B{
	void display(){
		System.out.println("C");
	}
}
class DynamicPolyExample{
	public static void main(String[] args){
		A abc;
		abc = new A();
		abc.display();
		abc = new B();
		abc.display();
		abc = new C();
		abc.display();
		
	}
} 
