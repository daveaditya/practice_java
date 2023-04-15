/*
 * This version of the ShowFile program uses a try-with-resources statement
 * to automatically close a file when it is no longer needed.
 * 
 * Note : This code requires JDK 7 or later.
 * 
 */
import java.io.*;

class ShowFileTryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
				
		if(args.length!=1) {
			System.out.println("Usage: ShowFileTryWithResources File");
			return;
		}
		
		try(FileInputStream fin = new FileInputStream(args[0])) {

			do {
				i = fin.read();
				if(i != -1) {
					System.out.print((char)i);
				}
			} while( i != -1);
			
		}
		catch(IOException exc) {
			System.out.println("I/O Error : " + exc);
		}
		
	}

}
