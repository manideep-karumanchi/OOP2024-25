class BankAccount{
	String accNo, branch, ifsc, address, contactno;
	double bal;
	BankAccount(){
		accNo = "";
		branch = "";
		ifsc = "";
		address = "";
		contactno = "";
		bal = 0.0;
	}
	BankAccount(String accNo, String branch, String ifsc, String address, String contactno, double bal){
		this.accNo = accNo;
		this.branch = branch;
		this.ifsc = ifsc;
		this.address = address;
		this.contactno = contactno;
		this.bal = bal;
	}
	void deposit(double amt){
		bal = bal + amt;
	}
	double checkBal(){
		return bal;
	}
	double withdraw(double amt){
		return 0.0;
	}
}
class SavingsBankAccount extends BankAccount{
	String accHName;
	double minBal;
	SavingsBankAccount(String accNo, String accHName, String branch, String ifsc, String address, String contactno, double bal, double minBal){
		super(accNo, branch, ifsc, address, contactno, bal);
		this.accHName = accHName;
		this.minBal = minBal;
	}
	double withdraw(double amt){
		if(bal - amt >= minBal){
			bal = bal - amt;
			return amt;
		}
		else{
			System.out.println("Insufficient Balance");
			return -1;
		}
	}
}
class CurrentBankAccount extends BankAccount{
	String orgName;
	double odlimit;
	CurrentBankAccount(String accNo, String orgName, String branch, String ifsc, String address, String contactno, double bal, double odlimit){
		super(accNo, branch, ifsc, address, contactno, bal);
		this.orgName = orgName;
		this.odlimit = odlimit;
	}
	double withdraw(double amt){
		if(bal - amt >= odlimit){
			bal = bal - amt;
			return amt;
		}
		else{
			System.out.println("Insufficient Balance");
			return -1;
		}
	}
}
class BankAccountDemo{
	public static void main(String[] args){
		SavingsBankAccount sb = new SavingsBankAccount("20010010000","KMD","SBI, BEC","SBIN0010357","BEC, Bapatla","9999999999",10000.0,1000.0);
		System.out.println("Balance before deposit:"+sb.checkBal());
		sb.deposit(1000.0);
		System.out.println("Balance after deposit:"+sb.checkBal());
		double amt = sb.withdraw(4000.0);
		if(amt != -1){
			System.out.println("Balance after withdraw:"+sb.checkBal());
		}
		amt = sb.withdraw(7000.0);
		if(amt != -1){
			System.out.println("Balance after withdraw:"+sb.checkBal());
		}
		
		
		BankAccount cb = new CurrentBankAccount("20010010000","KMD","SBI, BEC","SBIN0010357","BEC, Bapatla","9999999999",10000.0,-1000.0);
		System.out.println("Balance before deposit:"+cb.checkBal());
		sb.deposit(1000.0);
		System.out.println("Balance after deposit:"+cb.checkBal());
		amt = cb.withdraw(4000.0);
		if(amt != -1){
			System.out.println("Balance after withdraw:"+cb.checkBal());
		}
		amt = cb.withdraw(6000.0);
		if(amt != -1){
			System.out.println("Balance after withdraw:"+cb.checkBal());
		}
	}
}