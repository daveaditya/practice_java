/*
 * A Java identifier consists of one or more characters. The first character must be
 * an upper-case or lower-case letter of the alphabet, an underscore _, or a dollar
 * sign $. Each remaining character must be an upper-case or lower-case letter of 
 * the alphabet, a digit 0-9, an underscore, or a dollar sign. Write a Java program 
 * that reads in a line of characters and prints out whether the line of characters
 * is a legal Java identifier. 
 */
import java.io.IOException;

class LegalIdentifier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean first = true, legal = true;
		while(true) {
			char ch = (char)System.in.read();
			
			if(ch == '\n') {
				break;
			}
			
			if(first) {
				if(Character.isDigit(ch)) {
					System.out.println("\nIllegal identifier.");
					legal = false;
					break;
				}
				first = false;
			}
			
			if(ch == '$' || ch == '_' || Character.isAlphabetic(ch) || Character.isDigit(ch)) {
				legal = true;
			}
			else {
				legal = false;
				break;
			}

		}
		
		if(legal) {
			System.out.println("\nLegal identifier.");
		}
		else {
			System.out.println("\nIllegal identifier.");
		}
		
	}

}
