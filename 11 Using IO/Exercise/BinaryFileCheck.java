/*
 * Write a program that takes a file name as its command line argument. It assumes the
 * file is a binary data file and checks the first 4 bytes of the file to see whether
 * they contains the integer -889275714. It outputs "yes" or "no" or an error message
 * if there was an IOException generated. (Trivia question : Why test for that particular
 * value? Hint: Try it on several .class files.)
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class BinaryFileCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1) {
			System.out.println("Usage: BinaryFileCheck filePath");
			return;
		}
		
		try (DataInputStream reader = new DataInputStream(new FileInputStream(args[0]))) {
			int i = reader.readInt();
			if(i == -889275714) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		catch(FileNotFoundException exc) {
			System.out.println("FileNotFoundException : program halted.");
		}
		catch(IOException exc) {
			System.out.println("IOException : program halted.");
		}
	}

}
