/*
 * Write a program that uses an array to find the average of 10 double values.
 * Use any 10 values you like.
 */
class ArrayAvgDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = {
			10.11, 10.12, 10.13, 10.14, 10.15, 10.16, 10.17, 10.18, 10.19, 10.20	
		};
		double average = 0.0;
		for(double d : array) {
			average += d;
		}
		average = average / 10.0;
		System.out.println("The average is " + average);
	}

}
