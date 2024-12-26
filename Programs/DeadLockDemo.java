class Resources{
	String r1 = new String("Hello");
	String r2 = new String("Hello");
}
class Thread1 implements Runnable{
	Resources r;
	Thread1(Resources r){
		this.r = r;
	}
	public void run(){
		synchronized(r.r1){
			System.out.println("Aquired lock on r1");
			try{
				Thread.sleep(20000);
			}catch(InterruptedException e){
			}
			System.out.println("Trying to acuire Lock on r2");
			synchronized(r.r2){
				System.out.println("Aquired lock on r2");
			}
		}
	}
}
class Thread2 implements Runnable{
	Resources r;
	Thread2(Resources r){
		this.r = r;
	}
	public void run(){
		synchronized(r.r2){
			System.out.println("Aquired lock on r2");
			try{
				Thread.sleep(20000);
			}catch(InterruptedException e){
			}
			System.out.println("Trying to acuire Lock on r1");
			synchronized(r.r1){
				System.out.println("Aquired lock on r1");
			}
		}
	}
}
class DeadLockDemo{
	public static void main(String[] args){
		Resources r = new Resources();
		Thread t1 = new Thread(new Thread1(r));
		Thread t2 = new Thread(new Thread2(r));
		t1.start();
		t2.start();
		
		/*try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){}*/
	}
}