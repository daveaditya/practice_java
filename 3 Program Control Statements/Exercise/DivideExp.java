/*
 * If you divide 1 by 2, you get 0.5. If you divide it again by 2, you get 0.25.
 * Write a program that calculates and outputs the number of times you have to 
 * divide 1 by 2 to get a value less than one ten-thousandth (0.0001). 
 */
class DivideExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count  = 0;
		double ans = 1;
		while(!(ans <= 0.0001)) {
			ans /= 2;
			count++;
		}
		System.out.println("To make value less than one-thousandth, you need to divide " + count + " times.");
	}

}
