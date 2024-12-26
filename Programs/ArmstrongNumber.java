class ArmstrongNumber{
	public static void main(String[] args){
		int n = 200, temp, noofdigits = 0, sum = 0;
		
		for(int num = 1; num <= n; num++){
			temp = num;
			noofdigits = 0;
			sum = 0;
			while(temp > 0){
				temp = temp / 10; 
				noofdigits++;
			}
			temp = num;
			do{
				int digit = temp % 10;
				sum += Math.pow(digit,noofdigits);
				temp = temp / 10;
			}while(temp > 0);
			if(num == sum){
				System.out.println(num+" is an armstrong");
			}
			else{
				System.out.println(num+" is not an armstrong");
			}
		}
	}
}