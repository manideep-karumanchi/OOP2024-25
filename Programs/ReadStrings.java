import java.io.*;
class ReadStrings{
	public static void main(String[] args)throws Exception{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Press 'stop' to stop reading");
		do{
			str = br.readLine();
		}while(!str.equals("stop"));
	}
}