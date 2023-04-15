/*
 * Write a program that creates three random double variables a, b and c and
 * assigns them values between 0 and 1 using the Math.random() method.
 * It then does all the following :
 * 
 * 1. It prints out the three values.
 * 2. It prints "All are tiny" if all three values are less than 0.2.
 * 3. It prints out "one is tiny" if exactly one of the three value is less than 0.2.
 * 
 */
class UseRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		a=Math.random();
		b=Math.random();
		c=Math.random();
		
		System.out.println("a is : " + a);
		System.out.println("b is : " + b);
		System.out.println("c is : " + c);
		
		System.out.println();
		
		if(a<0.2 & b<0.2 & c<0.2) {
			System.out.println("All are tiny");
		}
		
		if(a<0.2) {
			System.out.println("One is tiny");
		}
		else if(b<0.2) {
			System.out.println("One is tiny");
		}
		else if(c<0.2) {
			System.out.println("One is tiny");
		}
		
		
	}

}
