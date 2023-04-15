/*
 * This variation wraps the code that opens and accesses the file within
 * a single try block.
 * This file is close by the finally block.
 */
import java.io.*;

class ShowFileSingleTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin = null;
		
		if(args.length!=1) {
			System.out.println("Usage: Show File");
			return;
		}
		
		try {
			
			fin = new FileInputStream(args[0]);
			
			do {
				i = fin.read();
				if(i != -1) {
					System.out.print((char)i);
				}
			} while( i != -1);
			
		}
		catch(FileNotFoundException exc) {
			System.out.println(args[0]);
			System.out.println("File Not Found");
			return;
		}
		catch(IOException exc) {
			System.out.println("Error reading file.");
		}
		finally {
			try {
				fin.close();
			}
			catch(IOException exc) {
				System.out.println("Error closing file.");
			}
		}
		
	}

}
