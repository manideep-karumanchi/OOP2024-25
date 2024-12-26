class Recursion{
	int factorial(int num){
		if(num > 1)
			return num * factorial(num - 1);
		else
			return 1;
	}
	public static void main(String[] args){
		Recursion r = new Recursion();
		System.out.println("Factorial(6)="+r.factorial(6));
	}
}