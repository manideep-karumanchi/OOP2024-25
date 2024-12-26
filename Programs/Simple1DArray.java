class Simple1DArray{
	public static void main(String[] args){
		System.out.println("===========Technique 1===========");
		int[] nums;
		nums = new int[3];
		nums[0]= 1; nums[1] = 2; nums[2] = 3;
		System.out.println("nums[0] = "+nums[0]);
		System.out.println("nums[0] = "+nums[1]);
		System.out.println("nums[0] = "+nums[2]);
		
		System.out.println("===========Technique 2===========");
		char[] chars = {'a', 'b'};
		System.out.println("chars[0] = "+chars[0]);
		System.out.println("chars[1] = "+chars[1]);
		
		
		System.out.println("===========Technique 3===========");
		char[] chars1 = new char[3];
		for(int i = 0; i < chars1.length; i++){
			chars1[i] = (char)(65+i);
		}
		for(char ch: chars1){
			System.out.println("ch = "+ch);
		}
		
	}
}