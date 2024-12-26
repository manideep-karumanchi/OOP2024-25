class PrintNumbers{
	public static void main(String[] args){
		int n = 10, num = 1;
		for(;num <= n;num++){
			if(num==5)
				break;
			System.out.println(num);
		}
		System.out.println("Exiting the program");
	}
}