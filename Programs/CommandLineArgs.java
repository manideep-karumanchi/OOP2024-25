class CommandLineArgs{
	public static void main(String[] args){
		System.out.println("Command line arguments passed to main method are:");
		for(String arg : args){
			System.out.println(arg);
		}
	}
}