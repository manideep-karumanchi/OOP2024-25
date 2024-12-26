class Exception0{
	public static void main(String[] args){
		int res = 0;
		int a[] = new int[1];
		try{
			res = 10/1;
			a[42] = 10;
		
		}
		catch(ArithmeticException e){
			System.out.println("Exception: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception: "+e);
		}
		catch(Exception e){
			
		}
		
		System.out.println("Result = "+res);
	}
}