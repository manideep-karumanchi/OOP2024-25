import java.io.*;
class ReadChars{
	public static void main(String[] args)throws Exception{
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Press q to stop reading");
		do{
			ch = (char)br.read();
		}while(ch != 'q');
	}
}