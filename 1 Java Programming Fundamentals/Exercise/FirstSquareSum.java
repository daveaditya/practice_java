/*
 * Modify program FirstSquare to perform sum of first 20 squares.
 */
public class FirstSquareSum {

	public static void main(String[] args) {
		int i;
		int square;
		int sum=0;
		
		for(i=1;i<=20;i++) {
			square=i*i;
			sum+=square;
			System.out.println("Square of " + i + " is " + square);
		}
		
		System.out.println();
		System.out.println("Sum of first 20 sqaures is : " + sum);
		
	}

}
