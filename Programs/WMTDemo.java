class WMTDemo{
	public static void main(String[] args){
		int num = 300000;
		long bse = System.currentTimeMillis();
		for(int i=0; i<num;i++){
			if(i%2 == 0)
				System.out.println("Even Number:"+i);
		}
		for(int i=0; i<num;i++){
			if(i%2 != 0)
				System.out.println("Odd Number:"+i);
		}
		long ace = System.currentTimeMillis();
		System.out.println("Time Taken to finish the execution is: "+(ace-bse));
	}
}