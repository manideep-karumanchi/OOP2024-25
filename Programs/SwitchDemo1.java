import java.util.Scanner;
class SwitchDemo1{
	public static void main(String[] args){
		String ch, ch1;
		int a =100, b=200;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter + = add, - = sub, * = mul, and / = div \n Enter Operator:");
		ch = s.next();
		switch(ch){
			case "+": System.out.println(a + " + " + b + " = " + (a+b)); break;
			case "-": System.out.println(a + " - " + b + " = " + (a-b)); break;
			case "*": System.out.println(a + " * " + b + " = " + (a*b)); break;
			case "/": System.out.print("Enter / = div % = modulo div\n Enter Choice:"); 
						ch1 = s.next();
						switch(ch1){
							case "/": System.out.println(a + " / " + b + " = " + (a/b)); break;
							case "%": System.out.println(a + " % " + b + " = " + (a%b)); break;
							default: System.out.println("Enter / or % only"); break;
						}
						break;
			default: System.out.println("Enter + or - or *  or / only"); break;
			
			
		}
	}
}