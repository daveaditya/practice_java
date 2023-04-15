/*
 * Write a program that copies a text file. In the process, have it convert all spaces
 * into hyphens. Use the byte stream file classes. Use the traditional approach to
 * closing a file by explicitly calling close(). 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch = 0;
		FileInputStream reader = null;
		FileOutputStream writer = null;
		
		try {
			reader = new FileInputStream("/media/aditya/Volume D/Java/Working/src/test.txt");
			writer = new FileOutputStream("/media/aditya/Volume D/Java/Working/src/test2.txt");
			
			do {
				ch = reader.read();
				if(ch != -1 && (char)ch == ' ') {
					ch = (int)'-';
				}
				if(ch != -1) {
					writer.write(ch);	
				}
			} while(ch != -1);
			
		}
		catch(FileNotFoundException exc) {
			System.out.println(exc);
		}
		catch(IOException exc) {
			System.out.println(exc);;
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException exc) {
				System.out.println(exc);
			}

		}
		
		System.out.println("New file created.");
	}

}
