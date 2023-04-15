/*
 * The ASCII lower-case letters are separated from the upper-case letters by 32.
 * Thus, to convert a lower-case to upper-case, subtract 32 from it. Use it to 
 * write a program that reads characters from the keyboard. Have it convert all
 * lower-case letters to upper-case, and all upper-case letters to lower-case,
 * displaying the result. Make no changes to any other character. Have the program stop when the
 * user presses period. At the end, have the program display the number of case changes
 * that have taken place. 
 */
import java.io.*;

class LowerToUpper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		int i = 0;
		boolean flag = true;
		String[] input = new String[10];
		int chngCount = 0;

		while(true) {
			ch = (char)System.in.read();
			if(ch == '.') {
				break;
			}
			else if(ch == '\n') {
				flag = true;
				i++;
				continue;
			}

			if(flag) {
				input[i] = "";
				flag = false;
			}


			if(Character.isAlphabetic(ch)) {
				if(Character.isLowerCase(ch)) {
					input[i] += Character.toUpperCase(ch);
					chngCount++;
				}
				else {
					input[i] += Character.toLowerCase(ch);
					chngCount++;
				}
			}
			else {
				input[i] += ch;
			}
		}

		System.out.println("\nOUTPUT\n");
		for(int j=0 ; j<i ; j++) {
			System.out.println("Converted input of line " + (j+1) + " is : " + input[j]);
		}
		System.out.println("\nChange Count = " + chngCount);

	}

}