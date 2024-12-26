class CallMe{
	synchronized static void call(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		System.out.println("]");
	}
}
class Caller implements Runnable{
	CallMe c;
	String msg;
	Caller(CallMe c, String msg){
		this.c = c;
		this.msg = msg;
	}
	public void run(){
		c.call(msg);
	}
}
class SynchronizationDemo_Static{
	public static void main(String[] args){
		
		Thread t1 = new Thread(new Caller(new CallMe(), "Hello"));
		Thread t2 = new Thread(new Caller(new CallMe(), "This is a Synchronization Example"));
		Thread t3 = new Thread(new Caller(new CallMe(), "End of the program"));
		t1.start();
		t2.start();
		t3.start();
		try{
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e){}
	}
}