import java.util.*;
class PrimeNumber{
	public static void main(String[] args){
		int num, i = 1, count = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = s.nextInt();
		
		while(i <= num){
			if(num % i == 0){
				count++;
			}
			i++;
		}
		if(count == 2)
			System.out.println(num+" is a prime");
		else
			System.out.println(num+" is not a prime");
		System.out.println("Exiting");
	}
}