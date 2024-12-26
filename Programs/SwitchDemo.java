import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] args){
		char section = 'A';
		int regdno;
		System.out.print("Enter Regd. No: ");
		Scanner s = new Scanner(System.in);
		regdno = s.nextInt();
		switch(section){
			case 'A':switch(regdno){
						case 1:
						case 2:
						case 3:System.out.println(regdno+" available in section: "+section);break;
						default: System.out.println(regdno+" is not available in section: "+section);break;
					 }
					 break;
			case 'B':switch(regdno){
						case 4:
						case 5:
						case 6:System.out.println(regdno+" available in section: "+section);break;
						default: System.out.println(regdno+" is not available in section: "+section);break;
					 }
					 break;
			default: System.out.println("Invalid Section");
		}
	}
}