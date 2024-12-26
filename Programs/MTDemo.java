import java.io.*;
class EvenNumPrinter extends Thread{
	int num;
	EvenNumPrinter(int num){
		this.num = num;
	}
	public void run(){
		for(int i=0; i<num;i++){
			if(i%2 == 0)
				System.out.println("Even Number:"+i);
		}
	}
}
class OddNumPrinter implements Runnable{
	int num;
	OddNumPrinter(int num){
		this.num = num;
	}
	public void run(){
		PrintWriter out = null;
		try{
			out = new PrintWriter("./OddNumbers.txt");
		}catch(Exception e){}
		for(int i=0; i<num;i++){
			if(i%2 != 0)
				out.println("Odd Number:"+i);
		}
		out.close();
	}
	
}
class MTDemo{
	public static void main(String[] args){
		long bse = System.currentTimeMillis();
		int num = 300000; 
		Thread enp = new Thread(new EvenNumPrinter(num),"Even Num Printer Thread");
		Thread onp = new Thread(new OddNumPrinter(num));
		
		enp.start();
		onp.start();
		try{
			enp.join();
			onp.join();
		}catch(InterruptedException e){}
		long ace = System.currentTimeMillis();
		System.out.println("Time Taken to Complete the ERxceution: "+(ace-bse));
		System.out.println(enp+"\n"+onp);
	}
}