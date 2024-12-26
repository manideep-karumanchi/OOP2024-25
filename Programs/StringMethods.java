class StringMethods{
	public String toString(){
		return "String Class Methods Demo";
	}
	public static void main(String[] args){
		String s1 = "BEC";
		String s2 = "BEC";
		String s3 = new String(s1);
		
		System.out.println("s1="+s1+" s2="+s2+" s3="+s3);
		
		System.out.println("s1 == s2: "+(s1==s2));
		System.out.println("s1.equals(s2): "+s1.equals(s2));
		
		System.out.println("s1 == s3: "+(s1==s3));
		System.out.println("s1.equals(s3): "+s1.equals(s3));
		
		System.out.println("length of s1: "+s1.length());
		System.out.println("length of s2: "+s2.length());
		System.out.println("length of s3: "+s3.length());
		
		char ch = s1.charAt(1);
		System.out.println("Character at 1 index in s1="+ch);
		char[] arr = new char[5]; 
		s1.getChars(0,3,arr,0);
		System.out.print("s1.getChars(0,3,arr,0)=");
		for(char c : arr)
			System.out.print(c+"\t");
		
		s1 = "BEC Bapatla";
		System.out.println("s1.regionMatches(0, s2, 0, 3)"+s1.regionMatches(0, s2, 0, 3));
		System.out.println("s1.regionMatches(true,0, s2, 0, 3)"+s1.regionMatches(0, s2, 0, 3));
		System.out.println("s1.compareTo(s2)="+s1.compareTo(s2));
		
		System.out.println("s1.indexOf('a')="+s1.indexOf('a'));
		System.out.println("s1.lastIndexOf('a')="+s1.lastIndexOf('a'));
		System.out.println("s1.lastIndexOf('a',6)="+s1.lastIndexOf('a',6));
		System.out.println("String.join(\"@\",s1,s2,s3)="+String.join("@",s1,s2,s3));
		
		System.out.println("StringMethods.toString()"+new StringMethods().toString());
	}
}