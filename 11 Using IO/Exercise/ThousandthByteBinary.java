/*
 * Write a code segment that prints only the thousandth byte of a binary data file named
 * "datafile". Use RandomAccessFile.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class ThousandthByteBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(RandomAccessFile reader = new RandomAccessFile("datafile", "r")) {
			reader.seek(1000);
			System.out.println("The thousandth byte is : " + (char)reader.read());
			
		}
		catch(FileNotFoundException exc) {
			System.out.println("FileNotFoundException : program halted.");
		}
		catch(IOException exc) {
			System.out.println("IOException : program halted");
		}
	}

}
