/*
 * Write a program that prints out the first 20 squares, one per line.
 * Use a for loop.
 */
public class FirstSquare {

	public static void main(String[] args) {
		int i;
		int square;
		
		for(i=1;i<=20;i++) {
			square=i*i;
			System.out.println("Square of " + i + " is " + square);
		}

	}

}
