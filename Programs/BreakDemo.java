class BreakDemo{
	public static void main(String[] args){
		one:{
			two:{
				three:{
					System.out.println("Inside Three");
					if(true)
						break two;
				}
				System.out.println("<This statement will not execute> Inside Two. \tOutside Three");
			}
			System.out.println("Inside One. \tOutside Two");
		}
	}
}