// Write a program that uses a loop to print the powers of 3 from 3^0 upto and including 3^0

import java.io.*;

class PowersOf3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of elements required (0 to 9 only): ");
		char ch = (char)System.in.read();
		int end = Character.getNumericValue(ch);
		
		System.out.print("\nThe progression is : ");
		for(int i=0 ; i<end ; i++) {
			System.out.print((int)Math.pow(3,i) + " ");
		}
		
	}

}
