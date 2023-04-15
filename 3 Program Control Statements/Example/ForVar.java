/*
 * Declare loop control variable inside the for.
 */
class ForVar {

	public static void main(String[] args) {
		int sum=0;
		int product=1;
		
		for(int i=1;i<=5;i++) {
			sum+=i;
			product*=i;
		}
		
		System.out.println("Sum is " + sum);
		System.out.println("Product is " + product);

	}

}
