class ChainedExceptionDemo{
	static void generateException()throws NullPointerException{
		NullPointerException e = new NullPointerException("Original Exception: NullPointerException");
		e.initCause(new ArithmeticException());
		throw e;
	} 
	public static void main(String[] args){
		try{
			generateException();
		}catch(NullPointerException e){
			System.out.println("Original Exception"+e.getMessage());
			System.out.println("Cause Exception"+e.getCause());
		}
	}
}