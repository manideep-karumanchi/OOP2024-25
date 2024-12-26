class argumentPassing{
	int a = 0;
	void incr(argumentPassing ap){
		ap.a++;
	}
	static argumentPassing createObj(){
		return new argumentPassing();
	}
	public static void main(String[] args){
		argumentPassing ap = createObj();
		System.out.println("Before Increment ap.a = "+ap.a);
		ap.incr(ap);
		System.out.println("After Increment ap.a = "+ap.a);
	}
}