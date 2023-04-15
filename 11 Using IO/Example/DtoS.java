// A simple disk-to-access utility that demonstrate a FileReader.
// This code requires JDK 7 or later.
import java.io.*;

class DtoS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		
		try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}
		catch(IOException exc) {
			System.out.println("I/O Error  :" + exc);
		}
	}

}
