// Read an array of bytes from the keyboard.
import java.io.*;

class ReadBytes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] data= new byte[10];
		
		System.out.println("Enter some characters : ");
		int numRead = System.in.read(data);
		System.out.print("You entered : ");
		for(int i=0;i<numRead;i++) {
			System.out.print((char)data[i]);
		}
	}

}
