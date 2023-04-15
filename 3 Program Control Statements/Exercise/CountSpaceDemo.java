/*
 * Write a program that reads characters from the keyboard until a period is received.
 * Have the program count the number of spaces. Report the total
 * at the end of the program.
 */
import java.io.*;

class CountSpaceDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		int count = 0;
			
		System.out.println("Enter a string ... enter period(.) to terminate reading: ");
		while(true) {
			ch = (char)System.in.read();
			if(ch == '.') {
				break;
			}
			if(ch == ' ') {
				count++;
			}
		}
		
		System.out.println("Number of spaces = " + count);
	}

}
