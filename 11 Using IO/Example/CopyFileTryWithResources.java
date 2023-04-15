/*
 * A version of CopyFile that uses try-with-resources.
 * It demonstrates two resources (in this case files) being managed
 * by a single try statement.
 * 
 * Note: This code requires JDK 7 or later.
 */
import java.io.*;

class CopyFileTryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		if(args.length!=2) {
			System.out.println("Usage : CopyFileTryWithResources from to");
			return;
		}
		
		try(FileInputStream fin = new FileInputStream(args[0]);		FileOutputStream fout = new FileOutputStream(args[1]);) {		
			do {
				i = fin.read();
				if(i != -1) {
					fout.write(i);
				}
			} while(i != -1);
		}
		catch(IOException exc) {
			System.out.println("I/O Error : " + exc);
		}
		
	}

}
