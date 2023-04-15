/*
 * Write a program that creates an array of doubles of length 50. It then fills the
 * array with the sequence of values 2^1/2, 2^1/4, 2^1/8, 2^1/16, ... and then loops
 * through the array printing out the values. Use Math.sqrt() function to compute
 * the square roots of the values.
 */
class SqrtTwoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = new double[50];
				
		array[0] = Math.sqrt(2.0);
		for(int i=1 ; i<50 ; i++) {
			array[i] = Math.sqrt(array[i-1]);
		}
		
		System.out.println("The array contains : ");
		
		int count = 0;
		for(double d : array) {
			if(count%5 == 0) {
				System.out.println();
			}
			System.out.print(d + "\t");
			count++;
		}
		
	}

}
