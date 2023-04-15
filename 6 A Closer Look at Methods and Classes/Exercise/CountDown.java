/*
 * Write a recursive method countDown() that takes an integer n as its parameter. It
 * prints the integers from n to 0, one per line, and then it prints "Blast Off!".
 */
class CountDown {
	
	static void countDown(int n) {
		if(n == 0) {
			System.out.println(n);
			System.out.println("Blast Off!");
		}
		else {
			System.out.println(n);
			countDown(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDown(5);
	}

}
