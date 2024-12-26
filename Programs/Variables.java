class Variables{
	static int a;
	public static void main(String[] args){
		Variables v1 = new Variables();
		v1.a = 100;
		System.out.println(v1.a);
		
		Variables v2 = new Variables();
		v2.a = 200;
		System.out.println(v2.a);
		System.out.println(v1.a);
	}
}