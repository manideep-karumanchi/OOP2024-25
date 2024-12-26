class Demo{
	int a, b, c;
	Demo(int a, int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void display(){
		System.out.println("a="+a+" b="+b+" c="+c);
	}
	int getA(){
		return a;
	}
	public static void main(String[] args){
		Demo d = new Demo(10, 20, 30);
		d.display();
		int a = d.getA();
		System.out.println("a="+a);
	}
}
