class Addition{
	int add(int ... nums, char type){
		int sum = 0;
		System.out.println(type);
		for(int num : nums){
			sum += num;
		}
		return sum;
	}
	double add(char type,double ... nums){
		double sum = 0;
		System.out.println(type);
		for (double num : nums){
			sum += num;
		}
		return sum;
	}
	void add(char type, boolean ... values){
		System.out.println(type);
		for (boolean val : values){
			System.out.println(val);
		}
	}
	public static void main(String[] args){
		Addition a = new Addition();
		int[] nums = new int[100];
		
		System.out.println("add (1,2,3):"+a.add(1,2,3,4));
		//System.out.println("add (1,2):"+a.add('i',1,2));
		//System.out.println("add ():"+a.add('d'));
		System.out.println("add (1.0,2.0,3.0):"+a.add('d',1.0,2.0,3.0));
		a.add('b',true, false);
	}
}