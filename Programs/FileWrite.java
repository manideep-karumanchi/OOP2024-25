import java.io.*;
class FileWrite{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Error: Pass File name as command line argument");
			System.out.println("Usage: java FileWrite FileName");
			System.exit(1);			
		}
		try{
			FileOutputStream fout = new FileOutputStream(args[0]);
			for(byte i=1; i<=26; i++){
				fout.write((char)(i+(byte)65));
			}
			fout.close();
		}catch(FileNotFoundException e){}
		catch(IOException e){}
		
	}
}