class InSufficientBalException extends Exception{
	InSufficientBalException(String desc){
		super(desc);
	}
}
class BankAccountWEH{
	String accNo, accHName;
	double bal;
	BankAccountWEH(String accNo, String accHName, double bal){
		this.accNo = accNo;
		this.accHName = accHName;
		this.bal = bal;
	}
	void deposit(double amt){
		bal += amt;
		System.out.println(amt+" Credited Successfully, Current Balance:"+getBal());
	}
	double getBal(){
		return bal;
	}
	double withdraw(double amt)throws InSufficientBalException{
		if(amt<bal){
			bal -= amt;
		}
		else{
			amt = -1;
			throw new InSufficientBalException("There is no sufficient balance in the Account, Current Account Balnace:"+getBal());
		}
		return amt;
	}
}
class UserDefinedExceptionDemo{
	static void genException(String[] args)throws ArithmeticException, ArrayIndexOutOfBoundsException{
		try{
			int res = 100/args.length;
			args[100] = "Hello";
		}catch(Exception e){
			throw e;
		}
	}
	public static void main(String[] args){
		BankAccountWEH b = new BankAccountWEH("999999999","KMD",10000.0);
		try{
			double amt = b.withdraw(1000.0);
			if(amt != -1)
				System.out.println("Balance after withdraw of "+amt+" is:"+b.getBal());
			amt = b.withdraw(10000.0);
			if(amt != -1)
				System.out.println("Balance after withdraw of "+amt+" is:"+b.getBal());
		}catch(InSufficientBalException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try{
			genException(args);
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage()+""+e);
			
		}
	}
}