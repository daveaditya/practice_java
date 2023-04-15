/*
 * Write a program that reads in characters from the keyboard until it reads a line feed
 * character '\n'. Then have it print the number of vowels, the number of consonants,
 * the number of digits and the number of other characters. Include the final line feed
 * character in your count of other characters.
 */
import java.io.IOException;

class CountChars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int countVowel = 0, countConso = 0, countDigi = 0, countOther = 0;
		while(true) {
			char ch = (char)System.in.read();
			
			if(Character.isAlphabetic(ch)) {
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					countVowel++;
				}
				else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					countVowel++;
				}
				else {
					countConso++;
				}
			}
			else if(Character.isDigit(ch)) {
				countDigi++;
			}
			else {
				countOther++;
			}		
			
			if(ch == '\n') {
				break;
			}
		}
		System.out.println("\nVowel count : " + countVowel);
		System.out.println("Consonant count : " + countConso);
		System.out.println("Digit count : " + countDigi);
		System.out.println("Other count : " + countOther);
		System.out.println("Total length(including line feed) : " + (countVowel+countConso+countDigi+countOther));
	}

}
