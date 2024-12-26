class Triangle{
	public static void main(String[] args){
		int s1 = 5, s2 = 4, s3 = 7;
		if (s1 == s2 && s2 == s3){
			System.out.println("Equi-Lateral");
		}
		else if(s1 == s2 || s2 == s3 || s1 == s3){
			System.out.println("Isosceles");
		}
		else{
			System.out.println("Scalene");
			if(s1 == Math.sqrt((s2*s2)+(s3*s3))||s2 == Math.sqrt((s1*s1)+(s3*s3))||s3 == Math.sqrt((s1*s1)+(s2*s2)))
				System.out.println("Right Angle");
		}
			
	}
}