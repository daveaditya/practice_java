/*
 * Math.random() is a method in the Java Library that computes a random value
 * between 0 and 1. For example, the statement 		double x=Math.random();
 * assigns to the variable x a random double between 0 and 1.
 * 
 * More, precisely write a program that calls Math.random() 1,000 times to create 1,000
 * values, keeping track of how many of them are greater than 0.5, and then prints out
 * the result.
 * 
 * Your program should theoretically print out a number very close to 500.
 * 
 * 
 */
class RandomNumber {

	public static void main(String[] args) {
		int count=0;
		double x;
		for(int i=0;i<1000;i++) {
			x=Math.random();
			if(x>0.5) {
				count++;
			}
		}
		System.out.println("Count says " + count);

	}

}
