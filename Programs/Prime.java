import java.util.Scanner;
class Prime{
	public static void main(String[] args){
		int num, count = 0;
		System.out.print("Enter an Integer:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		for(int i=1; i<=num; i++){
			if(num%i == 0)
				count++;
		}
		if(count == 2)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
}