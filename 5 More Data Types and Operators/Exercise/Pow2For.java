/*
 * Write a program that creates an integer array of length 30, fills the array with
 * the sequence of values (shown below) using a for loop, and then loops the array
 * printing out the values. Use a for-each style for loop to print out the values.
 * 
 * A. 1, -2, 3, -4, 5, -6, 7, -8, 9, ..., 29. -30
 * B. 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, ... 15, 15
 * C. 1, 2, 4, 8, 16, ...
 * D. 1, 1, 2, 3, 5, 8, 13, ... (Except for the first two values, each value is the
 * sum of the two preceding values)
 */
class Pow2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[30];
		
		for(int i=0 ; i<30 ; i++) {
			array[i] = (int)Math.pow(2, i);
		}
		
		System.out.println("The array contains : ");
		for(int i : array) {
			System.out.print(i + "  ");
		}
	}

}
