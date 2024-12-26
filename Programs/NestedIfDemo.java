class IfElseLadderDemo{
	public static void main(String[] args){
		int num1 = 10, num2 =5, num3 = 4;
		if (num1 > num2 && num1 < num3)
			System.out.println("Num1: "+num1+" is second largest");
		else if(num1 < num2 && num1 > num3)
			System.out.println("Num1: "+num1+" is second largest");
		else if(num2 > num1 && num2 < num3)
			System.out.println("Num2: "+num2+" is second largest");
		else if(num2 < num1 && num2 > num3)
			System.out.println("Num2: "+num2+" is second largest");
		else
			System.out.println("Num3: "+num3+" is second largest");
}