/*
 * Implement a method readString() that uses System.in.read() to read in a line of
 * characters. It then combines the characters into a String which it returns. The
 * string that is returns should include the end of line character '\n'.
 */
import java.io.IOException;

class StringReader {
	
	static String readString() throws IOException {
		String input = "";
		char ch;
		
		while(true) {
			ch = (char)System.in.read();
			input += ch;
			if(ch == '\n') {
				break;
			}
		}
		
		return input;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter a string : ");
		String str = readString();
		System.out.println("You entered : " + str);
	}

}
