/*
 * Demonstrate block scope.
 */
public class ScopeDemo {

	public static void main(String[] args) {
		int x;
		x=10;
		if(x==10) {
			int y=20;
			
			System.out.println("x and y : " + x + " " + y);
			
			x=y*2;
		}
		// y=100; Y is not Accessible here
		
		System.out.println("x is : " + x );

	}

}
