/*
 * Compare two files.
 * 
 * To use this program, specify the names of the files o be compared on the
 * command line.
 * 
 * java CompFiles FIRST.TXT SECOND.TXT
 * 
 * This code requires JDK 7 or later.
 */
import java.io.*;

class CompFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j = 0;
		
		if(args.length != 2) {
			System.out.println("Usage CompFiles f1 f2");
			return;
		}
		
		try (FileInputStream f1 = new FileInputStream(args[0]);FileInputStream f2 = new FileInputStream(args[1])) {
			do {
				i = f1.read();
				j = f2.read();
				
//				System.out.println("i : " + i + " j : " + j);				
				
				if(i != j) {
					break;
				}
			} while(i != -1 && j != -1);
			
			if(i != j) {
				System.out.println("Files differ.");
			}
			else {
				System.out.println("Files are same.");
			}
			
		}
		catch (IOException exc) {
			System.out.println("I/O Error : " + exc);
		}
	}

}
