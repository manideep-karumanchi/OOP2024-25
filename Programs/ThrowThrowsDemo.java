class ThrowThrowsDemo{
	static void genException(int argc)throws ArithmeticException{
		int res = 0;
		try{
			if(argc == 0)
				throw new ArithmeticException();
			res = 100/argc;
		}catch(ArithmeticException e){
			throw e;
		}
		finally{
			System.out.println("Finally Block");
			System.out.println("Res="+res);
		}
		
	}
	public static void main(String[] args){
		try{
			int argc = args.length;
			genException(argc);
		}catch(ArithmeticException e){
			System.out.print("Divide By Zero Exception:");
			e.printStackTrace();
		}
		
	}
}