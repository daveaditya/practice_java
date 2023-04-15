/*
 * Write a recursive method add1toN() that takes an integer n as its parameter.
 * It returns the sum 1+2+3+...+n.
 */
class AddNumbers {

	static int add1toN(int n) {
		if(n == 1) {
			return 1;
		}
		return (n + add1toN(n-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of 1 to 10 is " + add1toN(10));
	}

}
