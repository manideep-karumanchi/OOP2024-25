class ThreadMethods{
	public static void main(String[] args){
		//static Thread currentThread()
		Thread mt = Thread.currentThread();
		System.out.println("Current Thread:"+mt);
		System.out.println("Name of Current Thread:"+mt.getName());
		System.out.println("Priority of Current Thread:"+mt.getPriority());
		
		mt.setName("MyThread");
		mt.setPriority(Thread.MAX_PRIORITY);
		System.out.println("After Changing Name and Pririty");
		System.out.println("Name of Current Thread:"+mt.getName());
		System.out.println("Priority of Current Thread:"+mt.getPriority());
		
		System.out.println("Current thread isAlive?"+mt.isAlive());
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		System.out.println("Thread Execution Completed. Thread Exiting");
		
	}
}