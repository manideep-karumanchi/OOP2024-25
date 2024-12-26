class GC{
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM Memory before object creation: "+ rt.totalMemory()/(1024*1024));
		System.out.println("Free JVM Memory before object creation: "+ rt.freeMemory()/(1024*1024));
		Stack s[] = new Stack[100000];
		for(int i=0; i< 100000; i++){
			s[i] = new Stack();
		}
		System.out.println("Total JVM Memory After object creation: "+ rt.totalMemory()/(1024*1024));
		System.out.println("Free JVM Memory After object creation: "+ rt.freeMemory()/(1024*1024));
		for(int i=0; i< 100000; i++){
			s[i] = null;
		}
		System.gc();
		System.out.println("Total JVM Memory After GC object creation: "+ rt.totalMemory()/(1024*1024));
		System.out.println("Free JVM Memory After GC object creation: "+ rt.freeMemory()/(1024*1024));
	}
}