/*
 * Write a program that uses a loop to print a list of 100 numbers consisting of
 * alternating 1's and -1's , starting with 1.
 */

import java.io.*;

class Alternates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("\nThe numbers are is : \n");
		for(int i=1 ; i<=100 ; i++) {
			System.out.print((i%2) == 0 ? "-1  " : "1  ");
			if(i%5 == 0) {
				System.out.println();
			}
		}
		
	}

}
