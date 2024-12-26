class OuterClass{
	int a = 100;
	InnerClass i = new InnerClass();
	void display(){
		System.out.println("a="+a+" i.b="+i.b);
	}
	class InnerClass{
		int b;
		void innerDisplay(){
			System.out.println("a="+a+" b="+b);
			display();
		}
	}
	public static void main(String[] args){
		OuterClass o = new OuterClass();
		o.display();
		InnerClass i = o.new InnerClass();
		i.innerDisplay();
	}
}