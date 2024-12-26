class Exception1{
	static void genException(int[] a){
		int res = 0;
		try{
			res = 100/0;
			a[42] = 10;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException: ");
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		int res = 0;
		int a[] = new int[1];
		try{
			res = 10/1;
			genException(a);
		}
		catch(ArithmeticException e){
			System.out.println("DivideByZeroException: ");
			e.printStackTrace();
		}
		catch(Exception e){
			
		}
		System.out.println("Result = "+res);
	}
}