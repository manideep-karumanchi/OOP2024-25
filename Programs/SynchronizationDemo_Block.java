class CallMe{
	void call(String msg){
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
		synchronized(c){
			c.call(msg);
		}
	}
}
class SynchronizationDemo_Block{
	public static void main(String[] args){
		CallMe c = new CallMe();
		Thread t1 = new Thread(new Caller(c, "Hello"));
		Thread t2 = new Thread(new Caller(c, "This is a Synchronization Example"));
		Thread t3 = new Thread(new Caller(c, "End of the program"));
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