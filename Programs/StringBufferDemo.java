class StringBufferDemo{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Hello");
		
		System.out.println("sb="+sb+"\nsb1="+sb1);
		System.out.println("sb length="+sb.length()+"\tsb1 length="+sb1.length());
		System.out.println("sb Capacity="+sb.capacity()+"\tsb1 capacity="+sb1.capacity());
		
		sb1.ensureCapacity(30);
		sb1.setLength(4);
		System.out.println("sb1 length="+sb1.length()+"\tsb1 capacity="+sb1.capacity());
		
		System.out.println("sb1.charAt(3)="+sb1.charAt(3));
		sb1.setCharAt(3,'o');
		char chars[] = new char[5];
		sb1.getChars(0,4,chars,0);
		System.out.println("Characters extracted from sb1:");
		for(char ch:chars){
			System.out.print(ch+"\t");
		}
		System.out.println();
		sb1.append(", BEC");
		System.out.println("Sb1 after append="+sb1);
		sb1.insert(3,'l');
		System.out.println("Sb1 after insert="+sb1);
		sb1.reverse();
		System.out.println("sb1 after reverse="+sb1);
		sb1.delete(5,10);
		System.out.println("sb1 after Delete="+sb1);
		
	}
}