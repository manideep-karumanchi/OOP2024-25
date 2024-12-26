class Buffer{
	double buf[];
	boolean produced;
	Buffer(){
		buf = new double[1];
		produced = false;
	}
	void produce(double value){
		buf[0] = value;
		System.out.println("Producer:"+value);
	}
	double consume(){
		return buf[0];
	}
}
class Producer implements Runnable{
	Buffer b;
	Producer(Buffer b){
		this.b = b;
	}
	public void run(){
		synchronized(b){
			while(true){
				while(b.produced){
					try{
						b.wait();
					}catch(InterruptedException e){}
				}
				b.produce(Math.random());
				b.produced = true;
				b.notify();
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){}
			}
		}
	}
}
class Consumer implements Runnable{
	Buffer b;
	Consumer(Buffer b){
		this.b = b;
	}
	public void run(){
		synchronized(b){
			while(true){
				while(!b.produced){
					try{
						b.wait();
					}catch(InterruptedException e){}
				}
				System.out.println("Consumer:"+b.consume());
				b.produced = false;
				b.notify();
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){}
			}
		}
	}
}
class PCDemo{
	public static void main(String[] args){
		Buffer b = new Buffer();
		Thread p = new Thread(new Producer(b));
		Thread c = new Thread(new Consumer(b));
		p.start();
		c.start();
		
	}
}