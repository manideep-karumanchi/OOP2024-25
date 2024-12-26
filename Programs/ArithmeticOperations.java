class ArithmeticOperations{
	int a, b;
	//[accesspecifier] returntype methodName([arguments]){}
	int add(){
		return a+b;
	}
	int sub(){
		return a-b;
	}
	int mul(){
		return a*b;
	}
	int div(){
		return a/b;
	}
	int moduloDiv(){
		return a%b;
	}
	public static void main(String[] args){
		ArithmeticOperations ao = new ArithmeticOperations();
		ao.a = 100;
		ao.b = 200;
		int result = ao.add();
		System.out.println(ao.a + " + " + ao.b + " = " +result);
		System.out.println(ao.a + " - " + ao.b + " = " +ao.sub());
		System.out.println(ao.a + " * " + ao.b + " = " +ao.mul());
		
		ArithmeticOperations ao1 = new ArithmeticOperations();
		ao1.a = 10;
		ao1.b = 20;
		result = ao1.add();
		System.out.println(ao1.a + " + " + ao1.b + " = " +result);
		System.out.println(ao1.a + " - " + ao1.b + " = " +ao1.sub());
		System.out.println(ao.a + " * " + ao.b + " = " +ao.mul());
	}
}