// Write a program that uses a for loop to generate and display the progression:
// ,2,4,8,16,32 and so on.
import java.io.*;

class ForLoopControlDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of elements required (0 to 9 only): ");
		char ch = (char)System.in.read();
		int end = Character.getNumericValue(ch);
		
		System.out.print("\nThe progression is : ");
		for(int i=1 ; i<=end*end ; i*=2) {
			System.out.print(i + " ");
		}
		
	}

}
