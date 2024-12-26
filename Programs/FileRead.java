import java.io.*;
class FileRead{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Error: Pass File name as command line argument");
			System.out.println("Usage: java FileRead FileName");
			System.exit(1);			
		}
		try{
			FileInputStream fin = new FileInputStream(args[0]);
			int ch;
			while((ch = fin.read())!=-1){
				System.out.print((char)ch);
			}
			fin.close();
		}catch(Exception e){}
	}
}