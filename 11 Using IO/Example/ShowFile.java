/*
 * Display a text file.
 * 
 * To use this program, specify the name of the file that you want to see.
 * For example, to see a file called TEST.TXT use the following command line.
 * 
 * java ShowFile TEST.TXT
 */
import java.io.*;

class ShowFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin;
		
		if(args.length!=1) {
			System.out.println("Usage: Show File");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException exc) {
			System.out.println(args[0]);
			System.out.println("File Not Found");
			return;
		}
		
		try {
			do {
				i = fin.read();
				if(i != -1) {
					System.out.print((char)i);
				}
			} while( i != -1);
		}
		catch(IOException exc) {
			System.out.println("Error reading file.");
		}
		
		try {
			fin.close();
		}
		catch(IOException exc) {
			System.out.println("Error closing file.");
		}
		
	}

}
