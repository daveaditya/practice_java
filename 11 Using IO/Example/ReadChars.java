// USe a bufferedReader to read characters from the console.
import java.io.*;

class ReadChars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter characters, period to quit. ");
		
		do {
			c = (char)br.read();
			System.out.println(c);
		} while(c != '.');
	}
	
}
