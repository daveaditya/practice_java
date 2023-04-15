// A simple key-to-disk utility that demonstrates  a FileWriter.
// This code requires JDK 7 or later.
import java.io.*;

class KtoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter text ('stop' to quit).");
		
		try (FileWriter fw = new FileWriter("test.txt")) {
			
			do {
				System.out.print(": ");
				str = br.readLine();
				
				if(str.compareTo("stop") == 0) {
					break;
				}
				
				str = str + "\r\n";
				fw.write(str);
				
			} while(str.compareTo("stop") != 0);
			
		}
		catch(IOException exc) {
			System.out.println("I/O Error : " + exc);
		}
	}

}
