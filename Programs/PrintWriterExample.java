import java.io.*;
class PrintWriterExample{
	public static void main(String[] args)throws Exception{
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Hello");
		pw.println("This is");
		pw.println("CSE BEC");
		pw.close();
	}
}