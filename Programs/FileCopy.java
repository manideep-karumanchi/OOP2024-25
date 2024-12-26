import java.io.*;
class FileCopy{
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Error: Pass Two File names as command line arguments");
			System.out.println("Usage: java FileCopy SourceFileName TargetFileName");
			System.exit(1);			
		}
		try(FileInputStream fin = new FileInputStream(args[0]);FileOutputStream fout = new FileOutputStream(args[1])){
			int ch;
			while((ch = fin.read())!=-1){
				fout.write((char)ch);
			}
		}catch(FileNotFoundException e){
			System.out.println("File Not Found"+e);
		}
		catch(IOException e){
			System.out.println("Unable to Read from/Write to the file"+e);
		}
	}
}