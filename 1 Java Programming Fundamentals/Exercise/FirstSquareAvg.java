/*
 * Modify program FirstSquareSum to find average of first 20 squares.
 */
public class FirstSquareAvg {

	public static void main(String[] args) {
		int i;
		int square;
		int sum=0;
		double average;
		
		for(i=1;i<=20;i++) {
			square=i*i;
			sum+=square;
			System.out.println("Square of " + i + " is " + square);
		}
		
		System.out.println();
		System.out.println("Sum of first 20 sqaures is : " + sum);
		
		average=(double)sum/20;
		System.out.println();
		System.out.println("Average of first 20 sqaures is : " + average);
		
	}

}
